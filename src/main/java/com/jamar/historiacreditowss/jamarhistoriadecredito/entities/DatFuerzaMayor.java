package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the DAT_FUERZA_MAYOR database table.
 *
 */
@Entity
@Table(name = "DAT_FUERZA_MAYOR")
@NamedQuery(name = "DatFuerzaMayor.findAll", query = "SELECT d FROM DatFuerzaMayor d")
@XmlRootElement
public class DatFuerzaMayor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_FUERZA_MAYOR_ID_GENERATOR", sequenceName = "SQ_DAT_FUERZA_MAYOR")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_FUERZA_MAYOR_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_FUERZA_MAYOR")
    private Date fechaFuerzaMayor;

    @Column(name = "FUERZA_MAYOR")
    private String fuerzaMayor;

    @Column(name = "ID_REGISTRO")
    private String idRegistro;

    @Column(name = "NIT_REPORTA")
    private String nitReporta;

    @Column(name = "RAZON_SOCIAL")
    private String razonSocial;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatNaturale
    @ManyToOne
    @JoinColumn(name = "ID_NATURAL")
    private DatNaturale datNaturale;

    public DatFuerzaMayor() {
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

    public Date getFechaFuerzaMayor() {
        return this.fechaFuerzaMayor;
    }

    public void setFechaFuerzaMayor(Date fechaFuerzaMayor) {
        this.fechaFuerzaMayor = fechaFuerzaMayor;
    }

    public String getFuerzaMayor() {
        return this.fuerzaMayor;
    }

    public void setFuerzaMayor(String fuerzaMayor) {
        this.fuerzaMayor = fuerzaMayor;
    }

    public String getIdRegistro() {
        return this.idRegistro;
    }

    public void setIdRegistro(String idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getNitReporta() {
        return this.nitReporta;
    }

    public void setNitReporta(String nitReporta) {
        this.nitReporta = nitReporta;
    }

    public String getRazonSocial() {
        return this.razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

    public DatNaturale getDatNaturale() {
        return this.datNaturale;
    }

    public void setDatNaturale(DatNaturale datNaturale) {
        this.datNaturale = datNaturale;
    }

}
