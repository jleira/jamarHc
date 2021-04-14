package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the DAT_OPER_INTERNACIONALES database table.
 *
 */
@Entity
@Table(name = "DAT_OPER_INTERNACIONALES")
@NamedQuery(name = "DatOperInternacionale.findAll", query = "SELECT d FROM DatOperInternacionale d")
@XmlRootElement
public class DatOperInternacionale implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_OPER_INTERNACIONALES_ID_GENERATOR", sequenceName = "SQ_DAT_OPER_INTERNACIONALES")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_OPER_INTERNACIONALES_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    @Column(name = "ID_REGISTRO")
    private String idRegistro;

    @Column(name = "NIT_REPORTA")
    private String nitReporta;

    @Column(name = "OPERA_INT")
    private String operaInt;

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

    public DatOperInternacionale() {
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

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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

    public String getOperaInt() {
        return this.operaInt;
    }

    public void setOperaInt(String operaInt) {
        this.operaInt = operaInt;
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
