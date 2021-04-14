package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the DAT_EMAIL database table.
 *
 */
@Entity
@Table(name = "DAT_EMAIL")
@NamedQuery(name = "DatEmail.findAll", query = "SELECT d FROM DatEmail d")
@XmlRootElement
public class DatEmail implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_EMAIL_ID_GENERATOR", sequenceName = "SQ_DAT_EMAIL")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_EMAIL_ID_GENERATOR")
    private long id;

    private BigDecimal actualizacion;

    @Column(name = "C_EMP")
    private String cEmp;

    private BigDecimal creacion;

    @Column(name = "DATO_EMAIL")
    private String datoEmail;

    @Column(name = "ENT_LOCAL_CODIGO_SUBSCRIPTOR")
    private String entLocalCodigoSubscriptor;

    @Column(name = "ENT_LOCAL_CONTRATO")
    private BigDecimal entLocalContrato;

    @Column(name = "ENT_LOCAL_NIT")
    private String entLocalNit;

    @Column(name = "ENT_LOCAL_NOMBRE_NIT")
    private String entLocalNombreNit;

    @Column(name = "ENT_LOCAL_NOMBRE_SUSCRIPTOR")
    private String entLocalNombreSuscriptor;

    private String fuente;

    private String llave;

    @Column(name = "NUM_REPORTES")
    private BigDecimal numReportes;

    @Column(name = "NUMERO_ENTIDADES")
    private String numeroEntidades;

    private String reportado;

    @Column(name = "ULTIMA_CONFIRMACION")
    private String ultimaConfirmacion;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatLocalizacion
    @ManyToOne
    @JoinColumn(name = "ID_LOCALIZACION")
    private DatLocalizacion datLocalizacion;

    public DatEmail() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigDecimal getActualizacion() {
        return this.actualizacion;
    }

    public void setActualizacion(BigDecimal actualizacion) {
        this.actualizacion = actualizacion;
    }

    public String getCEmp() {
        return this.cEmp;
    }

    public void setCEmp(String cEmp) {
        this.cEmp = cEmp;
    }

    public BigDecimal getCreacion() {
        return this.creacion;
    }

    public void setCreacion(BigDecimal creacion) {
        this.creacion = creacion;
    }

    public String getDatoEmail() {
        return this.datoEmail;
    }

    public void setDatoEmail(String datoEmail) {
        this.datoEmail = datoEmail;
    }

    public String getEntLocalCodigoSubscriptor() {
        return this.entLocalCodigoSubscriptor;
    }

    public void setEntLocalCodigoSubscriptor(String entLocalCodigoSubscriptor) {
        this.entLocalCodigoSubscriptor = entLocalCodigoSubscriptor;
    }

    public BigDecimal getEntLocalContrato() {
        return this.entLocalContrato;
    }

    public void setEntLocalContrato(BigDecimal entLocalContrato) {
        this.entLocalContrato = entLocalContrato;
    }

    public String getEntLocalNit() {
        return this.entLocalNit;
    }

    public void setEntLocalNit(String entLocalNit) {
        this.entLocalNit = entLocalNit;
    }

    public String getEntLocalNombreNit() {
        return this.entLocalNombreNit;
    }

    public void setEntLocalNombreNit(String entLocalNombreNit) {
        this.entLocalNombreNit = entLocalNombreNit;
    }

    public String getEntLocalNombreSuscriptor() {
        return this.entLocalNombreSuscriptor;
    }

    public void setEntLocalNombreSuscriptor(String entLocalNombreSuscriptor) {
        this.entLocalNombreSuscriptor = entLocalNombreSuscriptor;
    }

    public String getFuente() {
        return this.fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public String getLlave() {
        return this.llave;
    }

    public void setLlave(String llave) {
        this.llave = llave;
    }

    public BigDecimal getNumReportes() {
        return this.numReportes;
    }

    public void setNumReportes(BigDecimal numReportes) {
        this.numReportes = numReportes;
    }

    public String getNumeroEntidades() {
        return this.numeroEntidades;
    }

    public void setNumeroEntidades(String numeroEntidades) {
        this.numeroEntidades = numeroEntidades;
    }

    public String getReportado() {
        return this.reportado;
    }

    public void setReportado(String reportado) {
        this.reportado = reportado;
    }

    public String getUltimaConfirmacion() {
        return this.ultimaConfirmacion;
    }

    public void setUltimaConfirmacion(String ultimaConfirmacion) {
        this.ultimaConfirmacion = ultimaConfirmacion;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

    public DatLocalizacion getDatLocalizacion() {
        return this.datLocalizacion;
    }

    public void setDatLocalizacion(DatLocalizacion datLocalizacion) {
        this.datLocalizacion = datLocalizacion;
    }

}
