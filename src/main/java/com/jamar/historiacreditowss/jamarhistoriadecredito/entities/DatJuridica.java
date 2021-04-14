package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * The persistent class for the DAT_JURIDICAS database table.
 *
 */
@Entity
@Table(name = "DAT_JURIDICAS")
@NamedQuery(name = "DatJuridica.findAll", query = "SELECT d FROM DatJuridica d")
@XmlRootElement
public class DatJuridica implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_JURIDICAS_ID_GENERATOR", sequenceName = "SQ_DAT_JURIDICAS")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_JURIDICAS_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    private String identificacion;

    private String llave;

    @Column(name = "RAZON_SOCIAL")
    private String razonSocial;

    @Column(name = "TIPO_PERSONA_JURIDICA")
    private String tipoPersonaJuridica;

    private String validada;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatLocalizacion
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datJuridica")
    private List<DatLocalizacion> datLocalizacions;

    public DatJuridica() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCEmp() {
        return this.cEmp;
    }

    public void setCEmp(String cEmp) {
        this.cEmp = cEmp;
    }

    public String getIdentificacion() {
        return this.identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getLlave() {
        return this.llave;
    }

    public void setLlave(String llave) {
        this.llave = llave;
    }

    public String getRazonSocial() {
        return this.razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getTipoPersonaJuridica() {
        return this.tipoPersonaJuridica;
    }

    public void setTipoPersonaJuridica(String tipoPersonaJuridica) {
        this.tipoPersonaJuridica = tipoPersonaJuridica;
    }

    public String getValidada() {
        return this.validada;
    }

    public void setValidada(String validada) {
        this.validada = validada;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

    @XmlTransient
    public List<DatLocalizacion> getDatLocalizacions() {
        return this.datLocalizacions;
    }

    public void setDatLocalizacions(List<DatLocalizacion> datLocalizacions) {
        this.datLocalizacions = datLocalizacions;
    }

    public DatLocalizacion addDatLocalizacion(DatLocalizacion datLocalizacion) {
        getDatLocalizacions().add(datLocalizacion);
        datLocalizacion.setDatJuridica(this);

        return datLocalizacion;
    }

    public DatLocalizacion removeDatLocalizacion(DatLocalizacion datLocalizacion) {
        getDatLocalizacions().remove(datLocalizacion);
        datLocalizacion.setDatJuridica(null);

        return datLocalizacion;
    }

}
