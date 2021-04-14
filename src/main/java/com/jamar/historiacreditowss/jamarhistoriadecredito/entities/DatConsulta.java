package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the DAT_CONSULTA database table.
 *
 */
@Entity
@Table(name = "DAT_CONSULTA")
@NamedQuery(name = "DatConsulta.findAll", query = "SELECT d FROM DatConsulta d")
@XmlRootElement
public class DatConsulta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_CONSULTA_ID_GENERATOR", sequenceName = "SQ_DAT_CONSULTA")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_CONSULTA_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    private BigDecimal cantidad;

    private String ciudad;

    private String entidad;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    private String llave;

    @Column(name = "NIT_SUSCRIPTOR")
    private String nitSuscriptor;

    private String oficina;

    private String razon;

    private String sector;

    @Column(name = "TIPO_CUENTA")
    private String tipoCuenta;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    public DatConsulta() {
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

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEntidad() {
        return this.entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLlave() {
        return this.llave;
    }

    public void setLlave(String llave) {
        this.llave = llave;
    }

    public String getNitSuscriptor() {
        return this.nitSuscriptor;
    }

    public void setNitSuscriptor(String nitSuscriptor) {
        this.nitSuscriptor = nitSuscriptor;
    }

    public String getOficina() {
        return this.oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public String getRazon() {
        return this.razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public String getSector() {
        return this.sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getTipoCuenta() {
        return this.tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

}
