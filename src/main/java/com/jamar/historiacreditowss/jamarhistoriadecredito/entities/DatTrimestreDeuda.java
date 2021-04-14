package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the DAT_TRIMESTRE_DEUDA database table.
 *
 */
@Entity
@Table(name = "DAT_TRIMESTRE_DEUDA")
@NamedQuery(name = "DatTrimestreDeuda.findAll", query = "SELECT d FROM DatTrimestreDeuda d")
@XmlRootElement
public class DatTrimestreDeuda implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_TRIMESTRE_DEUDA_ID_GENERATOR", sequenceName = "SQ_DAT_TRIMESTRE_DEUDA")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_TRIMESTRE_DEUDA_ID_GENERATOR")
    private long id;

    @Column(name = "APERTURA_CUENTAS")
    private BigDecimal aperturaCuentas;

    @Column(name = "C_EMP")
    private String cEmp;

    private String calificacion;

    @Column(name = "CIERRE_CUENTAS")
    private BigDecimal cierreCuentas;

    private BigDecimal cuota;

    @Column(name = "CUPO_TOTAL")
    private BigDecimal cupoTotal;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    @Column(name = "MESES_MORA_MAXIMA")
    private BigDecimal mesesMoraMaxima;

    @Column(name = "MORA_MAXIMA")
    private String moraMaxima;

    @Column(name = "PORCENTAJE_USO")
    private BigDecimal porcentajeUso;

    private BigDecimal saldo;

    private BigDecimal score;

    @Column(name = "TOTAL_ABIERTAS")
    private BigDecimal totalAbiertas;

    @Column(name = "TOTAL_CERRADAS")
    private BigDecimal totalCerradas;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatInfoAgregada
    @ManyToOne
    @JoinColumn(name = "ID_INFO_AGREGADA")
    private DatInfoAgregada datInfoAgregada;

    public DatTrimestreDeuda() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigDecimal getAperturaCuentas() {
        return this.aperturaCuentas;
    }

    public void setAperturaCuentas(BigDecimal aperturaCuentas) {
        this.aperturaCuentas = aperturaCuentas;
    }

    public String getCEmp() {
        return this.cEmp;
    }

    public void setCEmp(String cEmp) {
        this.cEmp = cEmp;
    }

    public String getCalificacion() {
        return this.calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public BigDecimal getCierreCuentas() {
        return this.cierreCuentas;
    }

    public void setCierreCuentas(BigDecimal cierreCuentas) {
        this.cierreCuentas = cierreCuentas;
    }

    public BigDecimal getCuota() {
        return this.cuota;
    }

    public void setCuota(BigDecimal cuota) {
        this.cuota = cuota;
    }

    public BigDecimal getCupoTotal() {
        return this.cupoTotal;
    }

    public void setCupoTotal(BigDecimal cupoTotal) {
        this.cupoTotal = cupoTotal;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getMesesMoraMaxima() {
        return this.mesesMoraMaxima;
    }

    public void setMesesMoraMaxima(BigDecimal mesesMoraMaxima) {
        this.mesesMoraMaxima = mesesMoraMaxima;
    }

    public String getMoraMaxima() {
        return this.moraMaxima;
    }

    public void setMoraMaxima(String moraMaxima) {
        this.moraMaxima = moraMaxima;
    }

    public BigDecimal getPorcentajeUso() {
        return this.porcentajeUso;
    }

    public void setPorcentajeUso(BigDecimal porcentajeUso) {
        this.porcentajeUso = porcentajeUso;
    }

    public BigDecimal getSaldo() {
        return this.saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getScore() {
        return this.score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public BigDecimal getTotalAbiertas() {
        return this.totalAbiertas;
    }

    public void setTotalAbiertas(BigDecimal totalAbiertas) {
        this.totalAbiertas = totalAbiertas;
    }

    public BigDecimal getTotalCerradas() {
        return this.totalCerradas;
    }

    public void setTotalCerradas(BigDecimal totalCerradas) {
        this.totalCerradas = totalCerradas;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

    public DatInfoAgregada getDatInfoAgregada() {
        return this.datInfoAgregada;
    }

    public void setDatInfoAgregada(DatInfoAgregada datInfoAgregada) {
        this.datInfoAgregada = datInfoAgregada;
    }

}
