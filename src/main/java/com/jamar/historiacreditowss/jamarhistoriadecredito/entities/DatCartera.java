package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the DAT_CARTERA database table.
 *
 */
@Entity
@Table(name = "DAT_CARTERA")
@NamedQuery(name = "DatCartera.findAll", query = "SELECT d FROM DatCartera d")
@XmlRootElement
public class DatCartera implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_CARTERA_ID_GENERATOR", sequenceName = "SQ_DAT_CARTERA")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_CARTERA_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    @Column(name = "NUMERO_CUENTAS")
    private BigDecimal numeroCuentas;

    private String tipo;

    private BigDecimal valor;

    //bi-directional many-to-one association to DatCarteraSecResEnd
    @ManyToOne
    @JoinColumn(name = "ID_SECTOR_ENDEUDAMIENTO")
    private DatCarteraSecResEnd datCarteraSecResEnd;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    public DatCartera() {
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

    public BigDecimal getNumeroCuentas() {
        return this.numeroCuentas;
    }

    public void setNumeroCuentas(BigDecimal numeroCuentas) {
        this.numeroCuentas = numeroCuentas;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getValor() {
        return this.valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public DatCarteraSecResEnd getDatCarteraSecResEnd() {
        return this.datCarteraSecResEnd;
    }

    public void setDatCarteraSecResEnd(DatCarteraSecResEnd datCarteraSecResEnd) {
        this.datCarteraSecResEnd = datCarteraSecResEnd;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

}
