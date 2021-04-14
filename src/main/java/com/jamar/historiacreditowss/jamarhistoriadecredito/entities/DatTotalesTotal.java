package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the DAT_TOTALES_TOTAL database table.
 *
 */
@Entity
@Table(name = "DAT_TOTALES_TOTAL")
@NamedQuery(name = "DatTotalesTotal.findAll", query = "SELECT d FROM DatTotalesTotal d")
@XmlRootElement
public class DatTotalesTotal implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_TOTALES_TOTAL_ID_GENERATOR", sequenceName = "SQ_DAT_TOTALES_TOTAL")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_TOTALES_TOTAL_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    @Column(name = "CALIDAD_DEUDOR")
    private String calidadDeudor;

    private BigDecimal cuota;

    private BigDecimal cupo;

    private BigDecimal participacion;

    private BigDecimal saldo;

    @Column(name = "SALDO_MORA")
    private BigDecimal saldoMora;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatInfoAgregada
    @ManyToOne
    @JoinColumn(name = "ID_INFO_AGREGADA")
    private DatInfoAgregada datInfoAgregada;

    public DatTotalesTotal() {
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

    public String getCalidadDeudor() {
        return this.calidadDeudor;
    }

    public void setCalidadDeudor(String calidadDeudor) {
        this.calidadDeudor = calidadDeudor;
    }

    public BigDecimal getCuota() {
        return this.cuota;
    }

    public void setCuota(BigDecimal cuota) {
        this.cuota = cuota;
    }

    public BigDecimal getCupo() {
        return this.cupo;
    }

    public void setCupo(BigDecimal cupo) {
        this.cupo = cupo;
    }

    public BigDecimal getParticipacion() {
        return this.participacion;
    }

    public void setParticipacion(BigDecimal participacion) {
        this.participacion = participacion;
    }

    public BigDecimal getSaldo() {
        return this.saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getSaldoMora() {
        return this.saldoMora;
    }

    public void setSaldoMora(BigDecimal saldoMora) {
        this.saldoMora = saldoMora;
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
