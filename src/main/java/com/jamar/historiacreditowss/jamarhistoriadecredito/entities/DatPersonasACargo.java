package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the DAT_PERSONAS_A_CARGO database table.
 *
 */
@Entity
@Table(name = "DAT_PERSONAS_A_CARGO")
@NamedQuery(name = "DatPersonasACargo.findAll", query = "SELECT d FROM DatPersonasACargo d")
@XmlRootElement
public class DatPersonasACargo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_PERSONAS_A_CARGO_ID_GENERATOR", sequenceName = "SQ_DAT_PERSONAS_A_CARGO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_PERSONAS_A_CARGO_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    private BigDecimal cantidad;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    @Column(name = "ID_REGISTRO")
    private String idRegistro;

    @Column(name = "NIT_REPORTA")
    private String nitReporta;

    @Column(name = "RAZON_SOCIAL")
    private String razonSocial;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatNaturale
    @ManyToOne
    @JoinColumn(name = "ID_NATURAL")
    private DatNaturale datNaturale;

    public DatPersonasACargo() {
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

    public BigDecimal getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getIdRegistro() {
        return this.idRegistro;
    }

    public void setIdRegistro(String idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getNitReporta() {
        return this.nitReporta;
    }

    public void setNitReporta(String nitReporta) {
        this.nitReporta = nitReporta;
    }

    public String getRazonSocial() {
        return this.razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

    public DatNaturale getDatNaturale() {
        return this.datNaturale;
    }

    public void setDatNaturale(DatNaturale datNaturale) {
        this.datNaturale = datNaturale;
    }

}
