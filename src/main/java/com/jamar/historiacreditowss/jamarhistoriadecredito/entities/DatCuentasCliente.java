package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * The persistent class for the DAT_CUENTAS_CLIENTE database table.
 *
 */
@Entity
@Table(name = "DAT_CUENTAS_CLIENTE")
@NamedQuery(name = "DatCuentasCliente.findAll", query = "SELECT d FROM DatCuentasCliente d")
@XmlRootElement
public class DatCuentasCliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_CUENTAS_CLIENTE_ID_GENERATOR", sequenceName = "SQ_DAT_CUENTAS_CLIENTE")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_CUENTAS_CLIENTE_ID_GENERATOR")
    private long id;

    private String bloqueada;

    @Column(name = "C_EMP")
    private String cEmp;

    private String calificacion;

    @Column(name = "CARACTERISTICAS_CLASE")
    private String caracteristicasClase;

    private String ciudad;

    @Column(name = "COD_SUSCRIPTOR")
    private String codSuscriptor;

    @Column(name = "CODIGO_DANE_CIUDAD")
    private String codigoDaneCiudad;

    private String entidad;

    @Column(name = "ESTADO_CODIGO")
    private String estadoCodigo;

    @Temporal(TemporalType.DATE)
    @Column(name = "ESTADO_FECHA")
    private Date estadoFecha;

    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_APERTURA")
    private Date fechaApertura;

    private String identificacion;

    private String independiente;

    private String llave;

    private String numero;

    private String oficina;

    private String sector;

    @Column(name = "SITUACION_TITULAR")
    private String situacionTitular;

    @Column(name = "TIPO_CUENTA_CLIENTE")
    private String tipoCuentaCliente;

    @Column(name = "TIPO_IDENTIFICACION")
    private String tipoIdentificacion;

    @Column(name = "VALORES_CALIFICACION")
    private String valoresCalificacion;

    @Column(name = "VALS_CANTIDAD_CHEQUE_DEVUELTOS")
    private BigDecimal valsCantidadChequeDevueltos;

    @Column(name = "VALS_CANTIDAD_CHEQUES_PAGADOS")
    private BigDecimal valsCantidadChequesPagados;

    @Column(name = "VALS_CREDITOS_EFECTIVO")
    private BigDecimal valsCreditosEfectivo;

    @Column(name = "VALS_CREDITOS_TRANSFERENCIA")
    private BigDecimal valsCreditosTransferencia;

    @Column(name = "VALS_DEBITOS_EFECTIVO")
    private BigDecimal valsDebitosEfectivo;

    @Column(name = "VALS_DEBITOS_TRANSFERENCIA")
    private BigDecimal valsDebitosTransferencia;

    @Column(name = "VALS_MONEDA")
    private String valsMoneda;

    @Column(name = "VALS_SOBREGIRO_DIAS")
    private BigDecimal valsSobregiroDias;

    @Temporal(TemporalType.DATE)
    @Column(name = "VALS_SOBREGIRO_FECHA")
    private Date valsSobregiroFecha;

    @Column(name = "VALS_SOBREGIRO_VALOR")
    private BigDecimal valsSobregiroValor;

    @Column(name = "VALS_VALOR_CHEQUES_DEVUELTOS")
    private BigDecimal valsValorChequesDevueltos;

    @Column(name = "VALS_VALOR_CHEQUES_PAGADOS")
    private BigDecimal valsValorChequesPagados;

    @Temporal(TemporalType.DATE)
    @Column(name = "VALS_FECHA")
    private Date valsFecha;

    //bi-directional many-to-one association to DatAdjetivo
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datCuentasCliente")
    private List<DatAdjetivo> datAdjetivos;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatReclamo
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datCuentasCliente")
    private List<DatReclamo> datReclamos;

    public DatCuentasCliente() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBloqueada() {
        return this.bloqueada;
    }

    public void setBloqueada(String bloqueada) {
        this.bloqueada = bloqueada;
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

    public String getCaracteristicasClase() {
        return this.caracteristicasClase;
    }

    public void setCaracteristicasClase(String caracteristicasClase) {
        this.caracteristicasClase = caracteristicasClase;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodSuscriptor() {
        return this.codSuscriptor;
    }

    public void setCodSuscriptor(String codSuscriptor) {
        this.codSuscriptor = codSuscriptor;
    }

    public String getCodigoDaneCiudad() {
        return this.codigoDaneCiudad;
    }

    public void setCodigoDaneCiudad(String codigoDaneCiudad) {
        this.codigoDaneCiudad = codigoDaneCiudad;
    }

    public String getEntidad() {
        return this.entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getEstadoCodigo() {
        return this.estadoCodigo;
    }

    public void setEstadoCodigo(String estadoCodigo) {
        this.estadoCodigo = estadoCodigo;
    }

    public Date getEstadoFecha() {
        return this.estadoFecha;
    }

    public void setEstadoFecha(Date estadoFecha) {
        this.estadoFecha = estadoFecha;
    }

    public Date getFechaApertura() {
        return this.fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getIdentificacion() {
        return this.identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
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

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getOficina() {
        return this.oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public String getSector() {
        return this.sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getSituacionTitular() {
        return this.situacionTitular;
    }

    public void setSituacionTitular(String situacionTitular) {
        this.situacionTitular = situacionTitular;
    }

    public String getTipoCuentaCliente() {
        return this.tipoCuentaCliente;
    }

    public void setTipoCuentaCliente(String tipoCuentaCliente) {
        this.tipoCuentaCliente = tipoCuentaCliente;
    }

    public String getTipoIdentificacion() {
        return this.tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getValoresCalificacion() {
        return this.valoresCalificacion;
    }

    public void setValoresCalificacion(String valoresCalificacion) {
        this.valoresCalificacion = valoresCalificacion;
    }

    public BigDecimal getValsCantidadChequeDevueltos() {
        return this.valsCantidadChequeDevueltos;
    }

    public void setValsCantidadChequeDevueltos(BigDecimal valsCantidadChequeDevueltos) {
        this.valsCantidadChequeDevueltos = valsCantidadChequeDevueltos;
    }

    public BigDecimal getValsCantidadChequesPagados() {
        return this.valsCantidadChequesPagados;
    }

    public void setValsCantidadChequesPagados(BigDecimal valsCantidadChequesPagados) {
        this.valsCantidadChequesPagados = valsCantidadChequesPagados;
    }

    public BigDecimal getValsCreditosEfectivo() {
        return this.valsCreditosEfectivo;
    }

    public void setValsCreditosEfectivo(BigDecimal valsCreditosEfectivo) {
        this.valsCreditosEfectivo = valsCreditosEfectivo;
    }

    public BigDecimal getValsCreditosTransferencia() {
        return this.valsCreditosTransferencia;
    }

    public void setValsCreditosTransferencia(BigDecimal valsCreditosTransferencia) {
        this.valsCreditosTransferencia = valsCreditosTransferencia;
    }

    public BigDecimal getValsDebitosEfectivo() {
        return this.valsDebitosEfectivo;
    }

    public void setValsDebitosEfectivo(BigDecimal valsDebitosEfectivo) {
        this.valsDebitosEfectivo = valsDebitosEfectivo;
    }

    public BigDecimal getValsDebitosTransferencia() {
        return this.valsDebitosTransferencia;
    }

    public void setValsDebitosTransferencia(BigDecimal valsDebitosTransferencia) {
        this.valsDebitosTransferencia = valsDebitosTransferencia;
    }

    public String getValsMoneda() {
        return this.valsMoneda;
    }

    public void setValsMoneda(String valsMoneda) {
        this.valsMoneda = valsMoneda;
    }

    public BigDecimal getValsSobregiroDias() {
        return this.valsSobregiroDias;
    }

    public void setValsSobregiroDias(BigDecimal valsSobregiroDias) {
        this.valsSobregiroDias = valsSobregiroDias;
    }

    public Date getValsSobregiroFecha() {
        return this.valsSobregiroFecha;
    }

    public void setValsSobregiroFecha(Date valsSobregiroFecha) {
        this.valsSobregiroFecha = valsSobregiroFecha;
    }

    public BigDecimal getValsSobregiroValor() {
        return this.valsSobregiroValor;
    }

    public void setValsSobregiroValor(BigDecimal valsSobregiroValor) {
        this.valsSobregiroValor = valsSobregiroValor;
    }

    public BigDecimal getValsValorChequesDevueltos() {
        return this.valsValorChequesDevueltos;
    }

    public void setValsValorChequesDevueltos(BigDecimal valsValorChequesDevueltos) {
        this.valsValorChequesDevueltos = valsValorChequesDevueltos;
    }

    public BigDecimal getValsValorChequesPagados() {
        return this.valsValorChequesPagados;
    }

    public void setValsValorChequesPagados(BigDecimal valsValorChequesPagados) {
        this.valsValorChequesPagados = valsValorChequesPagados;
    }

    public Date getValsFecha() {
        return valsFecha;
    }

    public void setValsFecha(Date valsFecha) {
        this.valsFecha = valsFecha;
    }

    @XmlTransient
    public List<DatAdjetivo> getDatAdjetivos() {
        return this.datAdjetivos;
    }

    public void setDatAdjetivos(List<DatAdjetivo> datAdjetivos) {
        this.datAdjetivos = datAdjetivos;
    }

    public DatAdjetivo addDatAdjetivo(DatAdjetivo datAdjetivo) {
        getDatAdjetivos().add(datAdjetivo);
        datAdjetivo.setDatCuentasCliente(this);

        return datAdjetivo;
    }

    public DatAdjetivo removeDatAdjetivo(DatAdjetivo datAdjetivo) {
        getDatAdjetivos().remove(datAdjetivo);
        datAdjetivo.setDatCuentasCliente(null);

        return datAdjetivo;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

    @XmlTransient
    public List<DatReclamo> getDatReclamos() {
        return this.datReclamos;
    }

    public void setDatReclamos(List<DatReclamo> datReclamos) {
        this.datReclamos = datReclamos;
    }

    public DatReclamo addDatReclamo(DatReclamo datReclamo) {
        getDatReclamos().add(datReclamo);
        datReclamo.setDatCuentasCliente(this);

        return datReclamo;
    }

    public DatReclamo removeDatReclamo(DatReclamo datReclamo) {
        getDatReclamos().remove(datReclamo);
        datReclamo.setDatCuentasCliente(null);

        return datReclamo;
    }

}
