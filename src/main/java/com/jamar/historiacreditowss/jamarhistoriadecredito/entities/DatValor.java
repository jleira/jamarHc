package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the DAT_VALOR database table.
 *
 */
@Entity
@Table(name = "DAT_VALOR")
@NamedQuery(name = "DatValor.findAll", query = "SELECT d FROM DatValor d")
@XmlRootElement
public class DatValor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_VALOR_ID_GENERATOR", sequenceName = "SQ_DAT_VALOR")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_VALOR_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    private BigDecimal valor;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatSery
    @ManyToOne
    @JoinColumn(name = "ID_SERIES")
    private DatSery datSery;

    public DatValor() {
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

    public BigDecimal getValor() {
        return this.valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

    public DatSery getDatSery() {
        return this.datSery;
    }

    public void setDatSery(DatSery datSery) {
        this.datSery = datSery;
    }

}
