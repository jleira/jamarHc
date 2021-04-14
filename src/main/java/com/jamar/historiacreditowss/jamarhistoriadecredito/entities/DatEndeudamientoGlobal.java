package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the DAT_ENDEUDAMIENTO_GLOBAL database table.
 *
 */
@Entity
@Table(name = "DAT_ENDEUDAMIENTO_GLOBAL")
@NamedQuery(name = "DatEndeudamientoGlobal.findAll", query = "SELECT d FROM DatEndeudamientoGlobal d")
@XmlRootElement
public class DatEndeudamientoGlobal implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_ENDEUDAMIENTO_GLOBAL_ID_GENERATOR", sequenceName = "SQ_DAT_ENDEUDAMIENTO_GLOBAL")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_ENDEUDAMIENTO_GLOBAL_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    private String calificacion;

    @Column(name = "ENTIDAD_NIT")
    private String entidadNit;

    @Column(name = "ENTIDAD_NOMBRE")
    private String entidadNombre;

    @Column(name = "ENTIDAD_SECTOR")
    private String entidadSector;

    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_REPORTE")
    private Date fechaReporte;

    private String fuente;

    @Temporal(TemporalType.DATE)
    @Column(name = "GARANTIA_FECHA")
    private Date garantiaFecha;

    @Column(name = "GARANTIA_TIPO")
    private String garantiaTipo;

    @Column(name = "GARANTIA_VALOR")
    private BigDecimal garantiaValor;

    private String independiente;

    private String llave;

    private String moneda;

    @Column(name = "NUMERO_CREDITOS")
    private BigDecimal numeroCreditos;

    @Column(name = "SALDO_PENDIENTE")
    private BigDecimal saldoPendiente;

    @Column(name = "TIPO_CREDITO")
    private String tipoCredito;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    public DatEndeudamientoGlobal() {
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

    public String getEntidadNit() {
        return this.entidadNit;
    }

    public void setEntidadNit(String entidadNit) {
        this.entidadNit = entidadNit;
    }

    public String getEntidadNombre() {
        return this.entidadNombre;
    }

    public void setEntidadNombre(String entidadNombre) {
        this.entidadNombre = entidadNombre;
    }

    public String getEntidadSector() {
        return this.entidadSector;
    }

    public void setEntidadSector(String entidadSector) {
        this.entidadSector = entidadSector;
    }

    public Date getFechaReporte() {
        return this.fechaReporte;
    }

    public void setFechaReporte(Date fechaReporte) {
        this.fechaReporte = fechaReporte;
    }

    public String getFuente() {
        return this.fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public Date getGarantiaFecha() {
        return this.garantiaFecha;
    }

    public void setGarantiaFecha(Date garantiaFecha) {
        this.garantiaFecha = garantiaFecha;
    }

    public String getGarantiaTipo() {
        return this.garantiaTipo;
    }

    public void setGarantiaTipo(String garantiaTipo) {
        this.garantiaTipo = garantiaTipo;
    }

    public BigDecimal getGarantiaValor() {
        return this.garantiaValor;
    }

    public void setGarantiaValor(BigDecimal garantiaValor) {
        this.garantiaValor = garantiaValor;
    }

    public String getIndependiente() {
        return this.independiente;
    }

    public void setIndependiente(String independiente) {
        this.independiente = independiente;
    }

    public String getLlave() {
        return this.llave;
    }

    public void setLlave(String llave) {
        this.llave = llave;
    }

    public String getMoneda() {
        return this.moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public BigDecimal getNumeroCreditos() {
        return this.numeroCreditos;
    }

    public void setNumeroCreditos(BigDecimal numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }

    public BigDecimal getSaldoPendiente() {
        return this.saldoPendiente;
    }

    public void setSaldoPendiente(BigDecimal saldoPendiente) {
        this.saldoPendiente = saldoPendiente;
    }

    public String getTipoCredito() {
        return this.tipoCredito;
    }

    public void setTipoCredito(String tipoCredito) {
        this.tipoCredito = tipoCredito;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

}
