package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the DAT_SALDOS_MES database table.
 *
 */
@Entity
@Table(name = "DAT_SALDOS_MES")
@NamedQuery(name = "DatSaldosMe.findAll", query = "SELECT d FROM DatSaldosMe d")
@XmlRootElement
public class DatSaldosMe implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_SALDOS_MES_ID_GENERATOR", sequenceName = "SQ_DAT_SALDOS_MES")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_SALDOS_MES_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    @Column(name = "SALDO_TOTAL")
    private BigDecimal saldoTotal;

    @Column(name = "SALDO_TOTAL_MORA")
    private BigDecimal saldoTotalMora;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatInfoAgregada
    @ManyToOne
    @JoinColumn(name = "ID_INFO_AGREGADA")
    private DatInfoAgregada datInfoAgregada;

    public DatSaldosMe() {
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

    public BigDecimal getSaldoTotal() {
        return this.saldoTotal;
    }

    public void setSaldoTotal(BigDecimal saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public BigDecimal getSaldoTotalMora() {
        return this.saldoTotalMora;
    }

    public void setSaldoTotalMora(BigDecimal saldoTotalMora) {
        this.saldoTotalMora = saldoTotalMora;
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
