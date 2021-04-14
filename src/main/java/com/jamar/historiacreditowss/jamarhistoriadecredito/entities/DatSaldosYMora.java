package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the DAT_SALDOS_Y_MORAS database table.
 *
 */
@Entity
@Table(name = "DAT_SALDOS_Y_MORAS")
@NamedQuery(name = "DatSaldosYMora.findAll", query = "SELECT d FROM DatSaldosYMora d")
@XmlRootElement
public class DatSaldosYMora implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_SALDOS_Y_MORAS_ID_GENERATOR", sequenceName = "SQ_DAT_SALDOS_Y_MORAS")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_SALDOS_Y_MORAS_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    @Column(name = "MORAS_MAX_SECTOR_COOPERATIVO")
    private String morasMaxSectorCooperativo;

    @Column(name = "MORAS_MAX_SECTOR_FINANCIERO")
    private String morasMaxSectorFinanciero;

    @Column(name = "MORAS_MAX_SECTOR_REAL")
    private String morasMaxSectorReal;

    @Column(name = "MORAS_MAX_SECTOR_TELCOS")
    private String morasMaxSectorTelcos;

    @Column(name = "MORAS_MAXIMAS")
    private String morasMaximas;

    @Column(name = "NUM_CREDITOS_30")
    private BigDecimal numCreditos30;

    @Column(name = "NUM_CREDITOS_MAYOR_IGUAL_60")
    private BigDecimal numCreditosMayorIgual60;

    @Column(name = "SALDO_DEUDA_TOTAL")
    private BigDecimal saldoDeudaTotal;

    @Column(name = "SALDO_DEUDA_TOTAL_MORA")
    private BigDecimal saldoDeudaTotalMora;

    @Column(name = "TOTAL_CUENTAS_MORA")
    private BigDecimal totalCuentasMora;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatInfoAgregadaMicrocred
    @ManyToOne
    @JoinColumn(name = "ID_INFO_AGREGADA_MICROCREDITO")
    private DatInfoAgregadaMicrocred datInfoAgregadaMicrocred;

    public DatSaldosYMora() {
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

    public String getMorasMaxSectorCooperativo() {
        return this.morasMaxSectorCooperativo;
    }

    public void setMorasMaxSectorCooperativo(String morasMaxSectorCooperativo) {
        this.morasMaxSectorCooperativo = morasMaxSectorCooperativo;
    }

    public String getMorasMaxSectorFinanciero() {
        return this.morasMaxSectorFinanciero;
    }

    public void setMorasMaxSectorFinanciero(String morasMaxSectorFinanciero) {
        this.morasMaxSectorFinanciero = morasMaxSectorFinanciero;
    }

    public String getMorasMaxSectorReal() {
        return this.morasMaxSectorReal;
    }

    public void setMorasMaxSectorReal(String morasMaxSectorReal) {
        this.morasMaxSectorReal = morasMaxSectorReal;
    }

    public String getMorasMaxSectorTelcos() {
        return this.morasMaxSectorTelcos;
    }

    public void setMorasMaxSectorTelcos(String morasMaxSectorTelcos) {
        this.morasMaxSectorTelcos = morasMaxSectorTelcos;
    }

    public String getMorasMaximas() {
        return this.morasMaximas;
    }

    public void setMorasMaximas(String morasMaximas) {
        this.morasMaximas = morasMaximas;
    }

    public BigDecimal getNumCreditos30() {
        return this.numCreditos30;
    }

    public void setNumCreditos30(BigDecimal numCreditos30) {
        this.numCreditos30 = numCreditos30;
    }

    public BigDecimal getNumCreditosMayorIgual60() {
        return this.numCreditosMayorIgual60;
    }

    public void setNumCreditosMayorIgual60(BigDecimal numCreditosMayorIgual60) {
        this.numCreditosMayorIgual60 = numCreditosMayorIgual60;
    }

    public BigDecimal getSaldoDeudaTotal() {
        return this.saldoDeudaTotal;
    }

    public void setSaldoDeudaTotal(BigDecimal saldoDeudaTotal) {
        this.saldoDeudaTotal = saldoDeudaTotal;
    }

    public BigDecimal getSaldoDeudaTotalMora() {
        return this.saldoDeudaTotalMora;
    }

    public void setSaldoDeudaTotalMora(BigDecimal saldoDeudaTotalMora) {
        this.saldoDeudaTotalMora = saldoDeudaTotalMora;
    }

    public BigDecimal getTotalCuentasMora() {
        return this.totalCuentasMora;
    }

    public void setTotalCuentasMora(BigDecimal totalCuentasMora) {
        this.totalCuentasMora = totalCuentasMora;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

    public DatInfoAgregadaMicrocred getDatInfoAgregadaMicrocred() {
        return this.datInfoAgregadaMicrocred;
    }

    public void setDatInfoAgregadaMicrocred(DatInfoAgregadaMicrocred datInfoAgregadaMicrocred) {
        this.datInfoAgregadaMicrocred = datInfoAgregadaMicrocred;
    }

}
