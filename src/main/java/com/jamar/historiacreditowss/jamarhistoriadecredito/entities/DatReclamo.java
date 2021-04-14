package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * The persistent class for the DAT_RECLAMO database table.
 *
 */
@Entity
@Table(name = "DAT_RECLAMO")
@NamedQuery(name = "DatReclamo.findAll", query = "SELECT d FROM DatReclamo d")
@XmlRootElement
public class DatReclamo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_RECLAMO_ID_GENERATOR", sequenceName = "SQ_DAT_RECLAMO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_RECLAMO_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    private String entidad;

    private String estado;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_CIERRE")
    private Date fechaCierre;

    private String llave;

    private String numero;

    @Column(name = "NUMERO_CUENTA")
    private String numeroCuenta;

    private String ratificado;

    private String texto;

    private String tipo;

    @Column(name = "TIPO_LEYENDA")
    private String tipoLeyenda;

    //bi-directional many-to-one association to DatCuentasCliente
    @ManyToOne
    @JoinColumn(name = "ID_CUENTA_CLIENTE")
    private DatCuentasCliente datCuentasCliente;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatObligacionesCliente
    @ManyToOne
    @JoinColumn(name = "ID_OBLIGACION_CLIENTE")
    private DatObligacionesCliente datObligacionesCliente;

    //bi-directional many-to-one association to DatSubtipo
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datReclamo")
    private List<DatSubtipo> datSubtipos;

    public DatReclamo() {
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

    public String getEntidad() {
        return this.entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFechaCierre() {
        return this.fechaCierre;
    }

    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public String getLlave() {
        return this.llave;
    }

    public void setLlave(String llave) {
        this.llave = llave;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getRatificado() {
        return this.ratificado;
    }

    public void setRatificado(String ratificado) {
        this.ratificado = ratificado;
    }

    public String getTexto() {
        return this.texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipoLeyenda() {
        return this.tipoLeyenda;
    }

    public void setTipoLeyenda(String tipoLeyenda) {
        this.tipoLeyenda = tipoLeyenda;
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

    @XmlTransient
    public List<DatSubtipo> getDatSubtipos() {
        return this.datSubtipos;
    }

    public void setDatSubtipos(List<DatSubtipo> datSubtipos) {
        this.datSubtipos = datSubtipos;
    }

    public DatSubtipo addDatSubtipo(DatSubtipo datSubtipo) {
        getDatSubtipos().add(datSubtipo);
        datSubtipo.setDatReclamo(this);

        return datSubtipo;
    }

    public DatSubtipo removeDatSubtipo(DatSubtipo datSubtipo) {
        getDatSubtipos().remove(datSubtipo);
        datSubtipo.setDatReclamo(null);

        return datSubtipo;
    }

}
