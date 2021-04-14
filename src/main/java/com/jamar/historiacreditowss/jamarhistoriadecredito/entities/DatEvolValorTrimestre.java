package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the DAT_EVOL_VALOR_TRIMESTRE database table.
 *
 */
@Entity
@Table(name = "DAT_EVOL_VALOR_TRIMESTRE")
@NamedQuery(name = "DatEvolValorTrimestre.findAll", query = "SELECT d FROM DatEvolValorTrimestre d")
@XmlRootElement
public class DatEvolValorTrimestre implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_EVOL_VALOR_TRIMESTRE_ID_GENERATOR", sequenceName = "SQ_DAT_EVOL_VALOR_TRIMESTRE")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_EVOL_VALOR_TRIMESTRE_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    @Column(name = "COD_MENOR_CALIFICACION")
    private String codMenorCalificacion;

    private BigDecimal cuota;

    @Column(name = "CUPO_INICIAL")
    private BigDecimal cupoInicial;

    private BigDecimal num;

    @Column(name = "PORCENTAJE_DEUDA")
    private BigDecimal porcentajeDeuda;

    private BigDecimal saldo;

    @Column(name = "SALDO_MORA")
    private BigDecimal saldoMora;

    @Column(name = "TEXT_MENOR_CALIFICACION")
    private String textMenorCalificacion;

    @Column(name = "TIPO_CUENTA")
    private String tipoCuenta;

    private String trimestre;

    //bi-directional many-to-one association to DatEvolDeudaTipoCuenta
    @ManyToOne
    @JoinColumn(name = "ID_EVOL_DEUDA_TIPO_CUENTA")
    private DatEvolDeudaTipoCuenta datEvolDeudaTipoCuenta;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    public DatEvolValorTrimestre() {
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

    public String getCodMenorCalificacion() {
        return this.codMenorCalificacion;
    }

    public void setCodMenorCalificacion(String codMenorCalificacion) {
        this.codMenorCalificacion = codMenorCalificacion;
    }

    public BigDecimal getCuota() {
        return this.cuota;
    }

    public void setCuota(BigDecimal cuota) {
        this.cuota = cuota;
    }

    public BigDecimal getCupoInicial() {
        return this.cupoInicial;
    }

    public void setCupoInicial(BigDecimal cupoInicial) {
        this.cupoInicial = cupoInicial;
    }

    public BigDecimal getNum() {
        return this.num;
    }

    public void setNum(BigDecimal num) {
        this.num = num;
    }

    public BigDecimal getPorcentajeDeuda() {
        return this.porcentajeDeuda;
    }

    public void setPorcentajeDeuda(BigDecimal porcentajeDeuda) {
        this.porcentajeDeuda = porcentajeDeuda;
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

    public String getTextMenorCalificacion() {
        return this.textMenorCalificacion;
    }

    public void setTextMenorCalificacion(String textMenorCalificacion) {
        this.textMenorCalificacion = textMenorCalificacion;
    }

    public String getTipoCuenta() {
        return this.tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getTrimestre() {
        return this.trimestre;
    }

    public void setTrimestre(String trimestre) {
        this.trimestre = trimestre;
    }

    public DatEvolDeudaTipoCuenta getDatEvolDeudaTipoCuenta() {
        return this.datEvolDeudaTipoCuenta;
    }

    public void setDatEvolDeudaTipoCuenta(DatEvolDeudaTipoCuenta datEvolDeudaTipoCuenta) {
        this.datEvolDeudaTipoCuenta = datEvolDeudaTipoCuenta;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

}
