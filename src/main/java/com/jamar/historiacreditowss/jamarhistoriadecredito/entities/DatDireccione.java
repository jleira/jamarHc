package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * The persistent class for the DAT_DIRECCIONES database table.
 *
 */
@Entity
@Table(name = "DAT_DIRECCIONES")
@NamedQuery(name = "DatDireccione.findAll", query = "SELECT d FROM DatDireccione d")
@XmlRootElement
public class DatDireccione implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_DIRECCIONES_ID_GENERATOR", sequenceName = "SQ_DAT_DIRECCIONES")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_DIRECCIONES_ID_GENERATOR")
    private long id;

    private BigDecimal actualizacion;

    @Column(name = "C_EMP")
    private String cEmp;

    private BigDecimal creacion;

    @Column(name = "ENT_LOCAL_CODIGO_SUSCRIPTOR")
    private String entLocalCodigoSuscriptor;

    @Column(name = "ENT_LOCAL_CONTRATO")
    private BigDecimal entLocalContrato;

    @Column(name = "ENT_LOCAL_NIT")
    private String entLocalNit;

    @Column(name = "ENT_LOCAL_NOMBRE_NIT")
    private String entLocalNombreNit;

    @Column(name = "ENT_LOCAL_NOMBRE_SUSCRIPTOR")
    private String entLocalNombreSuscriptor;

    private String estrato;

    private String fuente;

    private String llave;

    @Column(name = "NUM_REPORTES")
    private BigDecimal numReportes;

    @Column(name = "NUMERO_ENTIDADES")
    private String numeroEntidades;

    @Column(name = "PROBABILIDAD_ENTREGA")
    private String probabilidadEntrega;

    private String tipo;

    @Column(name = "TIPO_CORRESPONDENCIA")
    private String tipoCorrespondencia;

    @Column(name = "TIPO_LABORAL_O_COMERCIAL")
    private String tipoLaboralOComercial;

    @Column(name = "TIPO_RESIDENCIA")
    private String tipoResidencia;

    @Column(name = "ULTIMA_CONFIRMACION")
    private String ultimaConfirmacion;

    private String zona;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatLocalizacion
    @ManyToOne
    @JoinColumn(name = "ID_LOCALIZACION")
    private DatLocalizacion datLocalizacion;

    //bi-directional many-to-one association to DatParteDireccion
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datDireccione")
    private List<DatParteDireccion> datParteDireccions;

    public DatDireccione() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigDecimal getActualizacion() {
        return this.actualizacion;
    }

    public void setActualizacion(BigDecimal actualizacion) {
        this.actualizacion = actualizacion;
    }

    public String getCEmp() {
        return this.cEmp;
    }

    public void setCEmp(String cEmp) {
        this.cEmp = cEmp;
    }

    public BigDecimal getCreacion() {
        return this.creacion;
    }

    public void setCreacion(BigDecimal creacion) {
        this.creacion = creacion;
    }

    public String getEntLocalCodigoSuscriptor() {
        return this.entLocalCodigoSuscriptor;
    }

    public void setEntLocalCodigoSuscriptor(String entLocalCodigoSuscriptor) {
        this.entLocalCodigoSuscriptor = entLocalCodigoSuscriptor;
    }

    public BigDecimal getEntLocalContrato() {
        return this.entLocalContrato;
    }

    public void setEntLocalContrato(BigDecimal entLocalContrato) {
        this.entLocalContrato = entLocalContrato;
    }

    public String getEntLocalNit() {
        return this.entLocalNit;
    }

    public void setEntLocalNit(String entLocalNit) {
        this.entLocalNit = entLocalNit;
    }

    public String getEntLocalNombreNit() {
        return this.entLocalNombreNit;
    }

    public void setEntLocalNombreNit(String entLocalNombreNit) {
        this.entLocalNombreNit = entLocalNombreNit;
    }

    public String getEntLocalNombreSuscriptor() {
        return this.entLocalNombreSuscriptor;
    }

    public void setEntLocalNombreSuscriptor(String entLocalNombreSuscriptor) {
        this.entLocalNombreSuscriptor = entLocalNombreSuscriptor;
    }

    public String getEstrato() {
        return this.estrato;
    }

    public void setEstrato(String estrato) {
        this.estrato = estrato;
    }

    public String getFuente() {
        return this.fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public String getLlave() {
        return this.llave;
    }

    public void setLlave(String llave) {
        this.llave = llave;
    }

    public BigDecimal getNumReportes() {
        return this.numReportes;
    }

    public void setNumReportes(BigDecimal numReportes) {
        this.numReportes = numReportes;
    }

    public String getNumeroEntidades() {
        return this.numeroEntidades;
    }

    public void setNumeroEntidades(String numeroEntidades) {
        this.numeroEntidades = numeroEntidades;
    }

    public String getProbabilidadEntrega() {
        return this.probabilidadEntrega;
    }

    public void setProbabilidadEntrega(String probabilidadEntrega) {
        this.probabilidadEntrega = probabilidadEntrega;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipoCorrespondencia() {
        return this.tipoCorrespondencia;
    }

    public void setTipoCorrespondencia(String tipoCorrespondencia) {
        this.tipoCorrespondencia = tipoCorrespondencia;
    }

    public String getTipoLaboralOComercial() {
        return this.tipoLaboralOComercial;
    }

    public void setTipoLaboralOComercial(String tipoLaboralOComercial) {
        this.tipoLaboralOComercial = tipoLaboralOComercial;
    }

    public String getTipoResidencia() {
        return this.tipoResidencia;
    }

    public void setTipoResidencia(String tipoResidencia) {
        this.tipoResidencia = tipoResidencia;
    }

    public String getUltimaConfirmacion() {
        return this.ultimaConfirmacion;
    }

    public void setUltimaConfirmacion(String ultimaConfirmacion) {
        this.ultimaConfirmacion = ultimaConfirmacion;
    }

    public String getZona() {
        return this.zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

    public DatLocalizacion getDatLocalizacion() {
        return this.datLocalizacion;
    }

    public void setDatLocalizacion(DatLocalizacion datLocalizacion) {
        this.datLocalizacion = datLocalizacion;
    }

    @XmlTransient
    public List<DatParteDireccion> getDatParteDireccions() {
        return this.datParteDireccions;
    }

    public void setDatParteDireccions(List<DatParteDireccion> datParteDireccions) {
        this.datParteDireccions = datParteDireccions;
    }

    public DatParteDireccion addDatParteDireccion(DatParteDireccion datParteDireccion) {
        getDatParteDireccions().add(datParteDireccion);
        datParteDireccion.setDatDireccione(this);

        return datParteDireccion;
    }

    public DatParteDireccion removeDatParteDireccion(DatParteDireccion datParteDireccion) {
        getDatParteDireccions().remove(datParteDireccion);
        datParteDireccion.setDatDireccione(null);

        return datParteDireccion;
    }

}
