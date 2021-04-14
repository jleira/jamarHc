package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * The persistent class for the DAT_LOCALIZACION database table.
 *
 */
@Entity
@Table(name = "DAT_LOCALIZACION")
@NamedQuery(name = "DatLocalizacion.findAll", query = "SELECT d FROM DatLocalizacion d")
@XmlRootElement
public class DatLocalizacion implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_LOCALIZACION_ID_GENERATOR", sequenceName = "SQ_DAT_LOCALIZACION")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_LOCALIZACION_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    @Column(name = "FECHA_CONSULTA")
    private BigDecimal fechaConsulta;

    private String respuesta;

    //bi-directional many-to-one association to DatCelular
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datLocalizacion")
    private List<DatCelular> datCelulars;

    //bi-directional many-to-one association to DatDireccione
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datLocalizacion")
    private List<DatDireccione> datDirecciones;

    //bi-directional many-to-one association to DatEmail
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datLocalizacion")
    private List<DatEmail> datEmails;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatJuridica
    @ManyToOne
    @JoinColumn(name = "ID_JURIDICA")
    private DatJuridica datJuridica;

    //bi-directional many-to-one association to DatNaturale
    @ManyToOne
    @JoinColumn(name = "ID_NATURAL")
    private DatNaturale datNaturale;

    //bi-directional many-to-one association to DatTelefono
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datLocalizacion")
    private List<DatTelefono> datTelefonos;

    public DatLocalizacion() {
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

    public BigDecimal getFechaConsulta() {
        return this.fechaConsulta;
    }

    public void setFechaConsulta(BigDecimal fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public String getRespuesta() {
        return this.respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    @XmlTransient
    public List<DatCelular> getDatCelulars() {
        return this.datCelulars;
    }

    public void setDatCelulars(List<DatCelular> datCelulars) {
        this.datCelulars = datCelulars;
    }

    public DatCelular addDatCelular(DatCelular datCelular) {
        getDatCelulars().add(datCelular);
        datCelular.setDatLocalizacion(this);

        return datCelular;
    }

    public DatCelular removeDatCelular(DatCelular datCelular) {
        getDatCelulars().remove(datCelular);
        datCelular.setDatLocalizacion(null);

        return datCelular;
    }

    @XmlTransient
    public List<DatDireccione> getDatDirecciones() {
        return this.datDirecciones;
    }

    public void setDatDirecciones(List<DatDireccione> datDirecciones) {
        this.datDirecciones = datDirecciones;
    }

    public DatDireccione addDatDireccione(DatDireccione datDireccione) {
        getDatDirecciones().add(datDireccione);
        datDireccione.setDatLocalizacion(this);

        return datDireccione;
    }

    public DatDireccione removeDatDireccione(DatDireccione datDireccione) {
        getDatDirecciones().remove(datDireccione);
        datDireccione.setDatLocalizacion(null);

        return datDireccione;
    }

    @XmlTransient
    public List<DatEmail> getDatEmails() {
        return this.datEmails;
    }

    public void setDatEmails(List<DatEmail> datEmails) {
        this.datEmails = datEmails;
    }

    public DatEmail addDatEmail(DatEmail datEmail) {
        getDatEmails().add(datEmail);
        datEmail.setDatLocalizacion(this);

        return datEmail;
    }

    public DatEmail removeDatEmail(DatEmail datEmail) {
        getDatEmails().remove(datEmail);
        datEmail.setDatLocalizacion(null);

        return datEmail;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

    public DatJuridica getDatJuridica() {
        return this.datJuridica;
    }

    public void setDatJuridica(DatJuridica datJuridica) {
        this.datJuridica = datJuridica;
    }

    public DatNaturale getDatNaturale() {
        return this.datNaturale;
    }

    public void setDatNaturale(DatNaturale datNaturale) {
        this.datNaturale = datNaturale;
    }

    @XmlTransient
    public List<DatTelefono> getDatTelefonos() {
        return this.datTelefonos;
    }

    public void setDatTelefonos(List<DatTelefono> datTelefonos) {
        this.datTelefonos = datTelefonos;
    }

    public DatTelefono addDatTelefono(DatTelefono datTelefono) {
        getDatTelefonos().add(datTelefono);
        datTelefono.setDatLocalizacion(this);

        return datTelefono;
    }

    public DatTelefono removeDatTelefono(DatTelefono datTelefono) {
        getDatTelefonos().remove(datTelefono);
        datTelefono.setDatLocalizacion(null);

        return datTelefono;
    }

}
