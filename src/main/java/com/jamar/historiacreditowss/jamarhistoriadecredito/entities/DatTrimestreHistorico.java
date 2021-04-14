package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the DAT_TRIMESTRE_HISTORICO database table.
 *
 */
@Entity
@Table(name = "DAT_TRIMESTRE_HISTORICO")
@NamedQuery(name = "DatTrimestreHistorico.findAll", query = "SELECT d FROM DatTrimestreHistorico d")
@XmlRootElement
public class DatTrimestreHistorico implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_TRIMESTRE_HISTORICO_ID_GENERATOR", sequenceName = "SQ_DAT_TRIMESTRE_HISTORICO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_TRIMESTRE_HISTORICO_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    @Column(name = "CUENTAS_CONSIDERADAS")
    private BigDecimal cuentasConsideradas;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    private BigDecimal saldo;

    @Column(name = "TOTAL_CUENTAS")
    private BigDecimal totalCuentas;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatTipoCuentaHistorico
    @ManyToOne
    @JoinColumn(name = "ID_TIPO_CUENTA_HISTORICO")
    private DatTipoCuentaHistorico datTipoCuentaHistorico;

    public DatTrimestreHistorico() {
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

    public BigDecimal getCuentasConsideradas() {
        return this.cuentasConsideradas;
    }

    public void setCuentasConsideradas(BigDecimal cuentasConsideradas) {
        this.cuentasConsideradas = cuentasConsideradas;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getSaldo() {
        return this.saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getTotalCuentas() {
        return this.totalCuentas;
    }

    public void setTotalCuentas(BigDecimal totalCuentas) {
        this.totalCuentas = totalCuentas;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

    public DatTipoCuentaHistorico getDatTipoCuentaHistorico() {
        return this.datTipoCuentaHistorico;
    }

    public void setDatTipoCuentaHistorico(DatTipoCuentaHistorico datTipoCuentaHistorico) {
        this.datTipoCuentaHistorico = datTipoCuentaHistorico;
    }

}
