package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the DAT_ADJETIVO database table.
 *
 */
@Entity
@Table(name = "DAT_ADJETIVO")
@NamedQuery(name = "DatAdjetivo.findAll", query = "SELECT d FROM DatAdjetivo d")
@XmlRootElement
public class DatAdjetivo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_ADJETIVO_ID_GENERATOR", sequenceName = "SQ_DAT_ADJETIVO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_ADJETIVO_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    private String codigo;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    //bi-directional many-to-one association to DatCuentasCliente
    @ManyToOne
    @JoinColumn(name = "ID_CUENTA")
    private DatCuentasCliente datCuentasCliente;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatObligacionesCliente
    @ManyToOne
    @JoinColumn(name = "ID_OBLIGACION")
    private DatObligacionesCliente datObligacionesCliente;

    public DatAdjetivo() {
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

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public DatCuentasCliente getDatCuentasCliente() {
        return this.datCuentasCliente;
    }

    public void setDatCuentasCliente(DatCuentasCliente datCuentasCliente) {
        this.datCuentasCliente = datCuentasCliente;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

    public DatObligacionesCliente getDatObligacionesCliente() {
        return this.datObligacionesCliente;
    }

    public void setDatObligacionesCliente(DatObligacionesCliente datObligacionesCliente) {
        this.datObligacionesCliente = datObligacionesCliente;
    }

}
