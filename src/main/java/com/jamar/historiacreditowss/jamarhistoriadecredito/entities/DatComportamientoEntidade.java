package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * The persistent class for the DAT_COMPORTAMIENTO_ENTIDADES database table.
 *
 */
@Entity
@Table(name = "DAT_COMPORTAMIENTO_ENTIDADES")
@NamedQuery(name = "DatComportamientoEntidade.findAll", query = "SELECT d FROM DatComportamientoEntidade d")
@XmlRootElement
public class DatComportamientoEntidade implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_COMPORTAMIENTO_ENTIDADES_ID_GENERATOR", sequenceName = "SQ_DAT_COMPORTAMIE_ENTIDADES")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_COMPORTAMIENTO_ENTIDADES_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    @Column(name = "COD_SECTOR")
    private BigDecimal codSector;

    private String entidad;

    private String estado;

    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_ACTUALIZACION")
    private Date fechaActualizacion;

    @Column(name = "NUMERO_CUENTA")
    private String numeroCuenta;

    @Column(name = "TIPO_CUENTA")
    private String tipoCuenta;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatInfoAgregadaMicrocred
    @ManyToOne
    @JoinColumn(name = "ID_INFO_AGREGADA_MICROCREDITO")
    private DatInfoAgregadaMicrocred datInfoAgregadaMicrocred;

    //bi-directional many-to-one association to DatCompEntComportamiento
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datComportamientoEntidade")
    private List<DatCompEntComportamiento> datCompEntComportamientos;

    public DatComportamientoEntidade() {
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

    public BigDecimal getCodSector() {
        return this.codSector;
    }

    public void setCodSector(BigDecimal codSector) {
        this.codSector = codSector;
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

    public Date getFechaActualizacion() {
        return this.fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public String getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
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

    public DatInfoAgregadaMicrocred getDatInfoAgregadaMicrocred() {
        return this.datInfoAgregadaMicrocred;
    }

    public void setDatInfoAgregadaMicrocred(DatInfoAgregadaMicrocred datInfoAgregadaMicrocred) {
        this.datInfoAgregadaMicrocred = datInfoAgregadaMicrocred;
    }

    @XmlTransient
    public List<DatCompEntComportamiento> getDatCompEntComportamientos() {
        return this.datCompEntComportamientos;
    }

    public void setDatCompEntComportamientos(List<DatCompEntComportamiento> datCompEntComportamientos) {
        this.datCompEntComportamientos = datCompEntComportamientos;
    }

    public DatCompEntComportamiento addDatCompEntComportamiento(DatCompEntComportamiento datCompEntComportamiento) {
        getDatCompEntComportamientos().add(datCompEntComportamiento);
        datCompEntComportamiento.setDatComportamientoEntidade(this);

        return datCompEntComportamiento;
    }

    public DatCompEntComportamiento removeDatCompEntComportamiento(DatCompEntComportamiento datCompEntComportamiento) {
        getDatCompEntComportamientos().remove(datCompEntComportamiento);
        datCompEntComportamiento.setDatComportamientoEntidade(null);

        return datCompEntComportamiento;
    }

}
