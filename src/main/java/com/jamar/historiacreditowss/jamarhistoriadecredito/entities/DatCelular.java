package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the DAT_CELULAR database table.
 *
 */
@Entity
@Table(name = "DAT_CELULAR")
@NamedQuery(name = "DatCelular.findAll", query = "SELECT d FROM DatCelular d")
@XmlRootElement
public class DatCelular implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_CELULAR_ID_GENERATOR", sequenceName = "SQ_DAT_CELULAR")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_CELULAR_ID_GENERATOR")
    private long id;

    private BigDecimal actualizacion;

    @Column(name = "C_EMP")
    private String cEmp;

    private BigDecimal creacion;

    @Column(name = "DATO_CODIGO_AREA")
    private BigDecimal datoCodigoArea;

    @Column(name = "DATO_CODIGO_PAIS")
    private BigDecimal datoCodigoPais;

    @Column(name = "DATO_NOMBRE_CIUDAD")
    private String datoNombreCiudad;

    @Column(name = "DATO_NUMERO")
    private BigDecimal datoNumero;

    @Column(name = "ENT_LOCAL_CODIGO_SUBS")
    private String entLocalCodigoSubs;

    @Column(name = "ENT_LOCAL_CONTRATO")
    private BigDecimal entLocalContrato;

    @Column(name = "ENT_LOCAL_NIT")
    private String entLocalNit;

    @Column(name = "ENT_LOCAL_NOMBRE_NIT")
    private String entLocalNombreNit;

    @Column(name = "ENT_LOCAL_NOMBRE_SUBSCRIPTOR")
    private String entLocalNombreSubscriptor;

    private String fuente;

    private String llave;

    @Column(name = "NUM_REPORTES")
    private BigDecimal numReportes;

    @Column(name = "NUMERO_ENTIDADES")
    private String numeroEntidades;

    private String reportado;

    private String tipo;

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

    public DatCelular() {
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

    public BigDecimal getDatoCodigoArea() {
        return this.datoCodigoArea;
    }

    public void setDatoCodigoArea(BigDecimal datoCodigoArea) {
        this.datoCodigoArea = datoCodigoArea;
    }

    public BigDecimal getDatoCodigoPais() {
        return this.datoCodigoPais;
    }

    public void setDatoCodigoPais(BigDecimal datoCodigoPais) {
        this.datoCodigoPais = datoCodigoPais;
    }

    public String getDatoNombreCiudad() {
        return this.datoNombreCiudad;
    }

    public void setDatoNombreCiudad(String datoNombreCiudad) {
        this.datoNombreCiudad = datoNombreCiudad;
    }

    public BigDecimal getDatoNumero() {
        return this.datoNumero;
    }

    public void setDatoNumero(BigDecimal datoNumero) {
        this.datoNumero = datoNumero;
    }

    public String getEntLocalCodigoSubs() {
        return this.entLocalCodigoSubs;
    }

    public void setEntLocalCodigoSubs(String entLocalCodigoSubs) {
        this.entLocalCodigoSubs = entLocalCodigoSubs;
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

    public String getEntLocalNombreSubscriptor() {
        return this.entLocalNombreSubscriptor;
    }

    public void setEntLocalNombreSubscriptor(String entLocalNombreSubscriptor) {
        this.entLocalNombreSubscriptor = entLocalNombreSubscriptor;
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

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
