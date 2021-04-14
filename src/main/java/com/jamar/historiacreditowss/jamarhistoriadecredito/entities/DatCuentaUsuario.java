package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the DAT_CUENTA_USUARIO database table.
 *
 */
@Entity
@Table(name = "DAT_CUENTA_USUARIO")
@NamedQuery(name = "DatCuentaUsuario.findAll", query = "SELECT d FROM DatCuentaUsuario d")
@XmlRootElement
public class DatCuentaUsuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_CUENTA_USUARIO_ID_GENERATOR", sequenceName = "SQ_DAT_CUENTA_USUARIO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_CUENTA_USUARIO_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    private String calificacion;

    @Column(name = "COMPORTAMIENTO_NEGATIVO")
    private String comportamientoNegativo;

    @Column(name = "CUOTA_MES")
    private BigDecimal cuotaMes;

    @Column(name = "ESTADO_ACTUAL")
    private String estadoActual;

    @Column(name = "SALDO_ACTUAL")
    private BigDecimal saldoActual;

    @Column(name = "SALDO_MORA")
    private BigDecimal saldoMora;

    @Column(name = "TOTAL_DEUDA_CARTERAS")
    private BigDecimal totalDeudaCarteras;

    @Column(name = "VALOR_INICIAL")
    private BigDecimal valorInicial;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatUsuario
    @ManyToOne
    @JoinColumn(name = "ID_USUARIO")
    private DatUsuario datUsuario;

    public DatCuentaUsuario() {
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

    public String getCalificacion() {
        return this.calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getComportamientoNegativo() {
        return this.comportamientoNegativo;
    }

    public void setComportamientoNegativo(String comportamientoNegativo) {
        this.comportamientoNegativo = comportamientoNegativo;
    }

    public BigDecimal getCuotaMes() {
        return this.cuotaMes;
    }

    public void setCuotaMes(BigDecimal cuotaMes) {
        this.cuotaMes = cuotaMes;
    }

    public String getEstadoActual() {
        return this.estadoActual;
    }

    public void setEstadoActual(String estadoActual) {
        this.estadoActual = estadoActual;
    }

    public BigDecimal getSaldoActual() {
        return this.saldoActual;
    }

    public void setSaldoActual(BigDecimal saldoActual) {
        this.saldoActual = saldoActual;
    }

    public BigDecimal getSaldoMora() {
        return this.saldoMora;
    }

    public void setSaldoMora(BigDecimal saldoMora) {
        this.saldoMora = saldoMora;
    }

    public BigDecimal getTotalDeudaCarteras() {
        return this.totalDeudaCarteras;
    }

    public void setTotalDeudaCarteras(BigDecimal totalDeudaCarteras) {
        this.totalDeudaCarteras = totalDeudaCarteras;
    }

    public BigDecimal getValorInicial() {
        return this.valorInicial;
    }

    public void setValorInicial(BigDecimal valorInicial) {
        this.valorInicial = valorInicial;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

    public DatUsuario getDatUsuario() {
        return this.datUsuario;
    }

    public void setDatUsuario(DatUsuario datUsuario) {
        this.datUsuario = datUsuario;
    }

}
