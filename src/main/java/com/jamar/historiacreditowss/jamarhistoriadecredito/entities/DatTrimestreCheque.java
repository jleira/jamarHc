package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the DAT_TRIMESTRE_CHEQUE database table.
 *
 */
@Entity
@Table(name = "DAT_TRIMESTRE_CHEQUE")
@NamedQuery(name = "DatTrimestreCheque.findAll", query = "SELECT d FROM DatTrimestreCheque d")
@XmlRootElement
public class DatTrimestreCheque implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_TRIMESTRE_CHEQUE_ID_GENERATOR", sequenceName = "SQ_DAT_TRIMESTRE_CHEQUE")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_TRIMESTRE_CHEQUE_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    @Column(name = "CANTIDAD_DEVUELTOS")
    private BigDecimal cantidadDevueltos;

    @Column(name = "CANTIDAD_PAGADOS")
    private BigDecimal cantidadPagados;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    @Column(name = "VALOR_DEVUELTOS")
    private BigDecimal valorDevueltos;

    @Column(name = "VALOR_PAGADOS")
    private BigDecimal valorPagados;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatInfoAgregada
    @ManyToOne
    @JoinColumn(name = "ID_INFO_AGREGADA")
    private DatInfoAgregada datInfoAgregada;

    public DatTrimestreCheque() {
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

    public BigDecimal getCantidadDevueltos() {
        return this.cantidadDevueltos;
    }

    public void setCantidadDevueltos(BigDecimal cantidadDevueltos) {
        this.cantidadDevueltos = cantidadDevueltos;
    }

    public BigDecimal getCantidadPagados() {
        return this.cantidadPagados;
    }

    public void setCantidadPagados(BigDecimal cantidadPagados) {
        this.cantidadPagados = cantidadPagados;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getValorDevueltos() {
        return this.valorDevueltos;
    }

    public void setValorDevueltos(BigDecimal valorDevueltos) {
        this.valorDevueltos = valorDevueltos;
    }

    public BigDecimal getValorPagados() {
        return this.valorPagados;
    }

    public void setValorPagados(BigDecimal valorPagados) {
        this.valorPagados = valorPagados;
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
