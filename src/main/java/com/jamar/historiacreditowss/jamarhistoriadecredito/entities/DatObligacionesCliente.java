package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * The persistent class for the DAT_OBLIGACIONES_CLIENTE database table.
 *
 */
@Entity
@Table(name = "DAT_OBLIGACIONES_CLIENTE")
@NamedQuery(name = "DatObligacionesCliente.findAll", query = "SELECT d FROM DatObligacionesCliente d")
@XmlRootElement
public class DatObligacionesCliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_OBLIGACIONES_CLIENTE_ID_GENERATOR", sequenceName = "SQ_DAT_OBLIGACIONES_CLIENTE")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_OBLIGACIONES_CLIENTE_ID_GENERATOR")
    private long id;

    private String bloqueada;

    @Column(name = "C_EMP")
    private String cEmp;

    private String calificacion;

    private String calificacionhd;

    @Column(name = "CAR_AMPARADA")
    private String carAmparada;

    @Column(name = "CAR_CALIDAD_DEUDOR")
    private String carCalidadDeudor;

    @Column(name = "CAR_CLASE")
    private String carClase;

    @Column(name = "CAR_CODIGO_AMPARADA")
    private String carCodigoAmparada;

    @Column(name = "CAR_EJECUCION_CONTRATO")
    private BigDecimal carEjecucionContrato;

    @Temporal(TemporalType.DATE)
    @Column(name = "CAR_FECHA_PERMANENCIA")
    private Date carFechaPermanencia;

    @Column(name = "CAR_FRANQUICIA")
    private String carFranquicia;

    @Column(name = "CAR_GARANTIA")
    private String carGarantia;

    @Column(name = "CAR_MARCA")
    private String carMarca;

    @Column(name = "CAR_MESES_PERMANENCIA")
    private BigDecimal carMesesPermanencia;

    @Column(name = "CAR_TIPO_CONTRATO")
    private String carTipoContrato;

    @Column(name = "CAR_TIPO_CUENTA")
    private String carTipoCuenta;

    @Column(name = "CAR_TIPO_OBLIGACION")
    private String carTipoObligacion;

    private String ciudad;

    @Column(name = "COD_SUSCRIPTOR")
    private String codSuscriptor;

    @Column(name = "CODIGO_DANE_CIUDAD")
    private String codigoDaneCiudad;

    private String comportamiento;

    private String entidad;

    @Column(name = "ESTADO_CUENTA_CODIGO")
    private String estadoCuentaCodigo;

    @Temporal(TemporalType.DATE)
    @Column(name = "ESTADO_CUENTA_FECHA")
    private Date estadoCuentaFecha;

    @Column(name = "ESTADO_ORIGEN_CODIGO")
    private String estadoOrigenCodigo;

    @Temporal(TemporalType.DATE)
    @Column(name = "ESTADO_ORIGEN_FECHA")
    private Date estadoOrigenFecha;

    @Column(name = "ESTADO_PAGO_CODIGO")
    private String estadoPagoCodigo;

    @Temporal(TemporalType.DATE)
    @Column(name = "ESTADO_PAGO_FECHA")
    private Date estadoPagoFecha;

    @Column(name = "ESTADO_PAGO_MESES")
    private BigDecimal estadoPagoMeses;

    @Column(name = "ESTADO_PLASTICO_CODIGO")
    private String estadoPlasticoCodigo;

    @Temporal(TemporalType.DATE)
    @Column(name = "ESTADO_PLASTICO_FECHA")
    private Date estadoPlasticoFecha;

    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_APERTURA")
    private Date fechaApertura;

    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_VENCIMIENTO")
    private Date fechaVencimiento;

    @Column(name = "FORMA_PAGO")
    private String formaPago;

    private String identificacion;

    private String independiente;

    private String llave;

    private String numero;

    private String oficina;

    @Column(name = "PROBABILIDAD_INCUMPLIMIENTO")
    private BigDecimal probabilidadIncumplimiento;

    private String sector;

    @Column(name = "SITUACION_TITULAR")
    private String situacionTitular;

    @Column(name = "TIPO_IDENTIFICACION")
    private String tipoIdentificacion;

    @Column(name = "VALOR_CALIFICACION")
    private String valorCalificacion;

    @Column(name = "VALOR_CUOTA")
    private BigDecimal valorCuota;

    @Column(name = "VALOR_CUOTAS_CANCELADAS")
    private BigDecimal valorCuotasCanceladas;

    @Column(name = "VALOR_CUOTAS_MORA")
    private BigDecimal valorCuotasMora;

    @Column(name = "VALOR_CUPO_TOTAL")
    private BigDecimal valorCupoTotal;

    @Column(name = "VALOR_DIAS_MORA")
    private BigDecimal valorDiasMora;

    @Column(name = "VALOR_DISPONIBLE")
    private BigDecimal valorDisponible;

    @Temporal(TemporalType.DATE)
    @Column(name = "VALOR_FECHA")
    private Date valorFecha;

    @Temporal(TemporalType.DATE)
    @Column(name = "VALOR_FECHA_LIMITE_PAGO")
    private Date valorFechaLimitePago;

    @Temporal(TemporalType.DATE)
    @Column(name = "VALOR_FECHA_PAGO_CUOTA")
    private Date valorFechaPagoCuota;

    @Column(name = "VALOR_MONEDA")
    private String valorMoneda;

    @Column(name = "VALOR_PERIODICIDAD")
    private String valorPeriodicidad;

    @Column(name = "VALOR_SALDO_ACTUAL")
    private BigDecimal valorSaldoActual;

    @Column(name = "VALOR_SALDO_MORA")
    private BigDecimal valorSaldoMora;

    @Column(name = "VALOR_TOTAL_CUOTAS")
    private BigDecimal valorTotalCuotas;

    @Column(name = "VALOR_VALOR_INICIAL")
    private BigDecimal valorValorInicial;

    @Column(name = "TIPO_OBLIGACION")
    private String tipoObligacion;

    //bi-directional many-to-one association to DatAdjetivo
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datObligacionesCliente")
    private List<DatAdjetivo> datAdjetivos;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatReclamo
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datObligacionesCliente")
    private List<DatReclamo> datReclamos;

    public DatObligacionesCliente() {
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

    public String getCalificacionhd() {
        return this.calificacionhd;
    }

    public void setCalificacionhd(String calificacionhd) {
        this.calificacionhd = calificacionhd;
    }

    public String getCarAmparada() {
        return this.carAmparada;
    }

    public void setCarAmparada(String carAmparada) {
        this.carAmparada = carAmparada;
    }

    public String getCarCalidadDeudor() {
        return this.carCalidadDeudor;
    }

    public void setCarCalidadDeudor(String carCalidadDeudor) {
        this.carCalidadDeudor = carCalidadDeudor;
    }

    public String getCarClase() {
        return this.carClase;
    }

    public void setCarClase(String carClase) {
        this.carClase = carClase;
    }

    public String getCarCodigoAmparada() {
        return this.carCodigoAmparada;
    }

    public void setCarCodigoAmparada(String carCodigoAmparada) {
        this.carCodigoAmparada = carCodigoAmparada;
    }

    public BigDecimal getCarEjecucionContrato() {
        return this.carEjecucionContrato;
    }

    public void setCarEjecucionContrato(BigDecimal carEjecucionContrato) {
        this.carEjecucionContrato = carEjecucionContrato;
    }

    public Date getCarFechaPermanencia() {
        return this.carFechaPermanencia;
    }

    public void setCarFechaPermanencia(Date carFechaPermanencia) {
        this.carFechaPermanencia = carFechaPermanencia;
    }

    public String getCarFranquicia() {
        return this.carFranquicia;
    }

    public void setCarFranquicia(String carFranquicia) {
        this.carFranquicia = carFranquicia;
    }

    public String getCarGarantia() {
        return this.carGarantia;
    }

    public void setCarGarantia(String carGarantia) {
        this.carGarantia = carGarantia;
    }

    public String getCarMarca() {
        return this.carMarca;
    }

    public void setCarMarca(String carMarca) {
        this.carMarca = carMarca;
    }

    public BigDecimal getCarMesesPermanencia() {
        return this.carMesesPermanencia;
    }

    public void setCarMesesPermanencia(BigDecimal carMesesPermanencia) {
        this.carMesesPermanencia = carMesesPermanencia;
    }

    public String getCarTipoContrato() {
        return this.carTipoContrato;
    }

    public void setCarTipoContrato(String carTipoContrato) {
        this.carTipoContrato = carTipoContrato;
    }

    public String getCarTipoCuenta() {
        return this.carTipoCuenta;
    }

    public void setCarTipoCuenta(String carTipoCuenta) {
        this.carTipoCuenta = carTipoCuenta;
    }

    public String getCarTipoObligacion() {
        return this.carTipoObligacion;
    }

    public void setCarTipoObligacion(String carTipoObligacion) {
        this.carTipoObligacion = carTipoObligacion;
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

    public String getComportamiento() {
        return this.comportamiento;
    }

    public void setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }

    public String getEntidad() {
        return this.entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getEstadoCuentaCodigo() {
        return this.estadoCuentaCodigo;
    }

    public void setEstadoCuentaCodigo(String estadoCuentaCodigo) {
        this.estadoCuentaCodigo = estadoCuentaCodigo;
    }

    public Date getEstadoCuentaFecha() {
        return this.estadoCuentaFecha;
    }

    public void setEstadoCuentaFecha(Date estadoCuentaFecha) {
        this.estadoCuentaFecha = estadoCuentaFecha;
    }

    public String getEstadoOrigenCodigo() {
        return this.estadoOrigenCodigo;
    }

    public void setEstadoOrigenCodigo(String estadoOrigenCodigo) {
        this.estadoOrigenCodigo = estadoOrigenCodigo;
    }

    public Date getEstadoOrigenFecha() {
        return this.estadoOrigenFecha;
    }

    public void setEstadoOrigenFecha(Date estadoOrigenFecha) {
        this.estadoOrigenFecha = estadoOrigenFecha;
    }

    public String getEstadoPagoCodigo() {
        return this.estadoPagoCodigo;
    }

    public void setEstadoPagoCodigo(String estadoPagoCodigo) {
        this.estadoPagoCodigo = estadoPagoCodigo;
    }

    public Date getEstadoPagoFecha() {
        return this.estadoPagoFecha;
    }

    public void setEstadoPagoFecha(Date estadoPagoFecha) {
        this.estadoPagoFecha = estadoPagoFecha;
    }

    public BigDecimal getEstadoPagoMeses() {
        return this.estadoPagoMeses;
    }

    public void setEstadoPagoMeses(BigDecimal estadoPagoMeses) {
        this.estadoPagoMeses = estadoPagoMeses;
    }

    public String getEstadoPlasticoCodigo() {
        return this.estadoPlasticoCodigo;
    }

    public void setEstadoPlasticoCodigo(String estadoPlasticoCodigo) {
        this.estadoPlasticoCodigo = estadoPlasticoCodigo;
    }

    public Date getEstadoPlasticoFecha() {
        return this.estadoPlasticoFecha;
    }

    public void setEstadoPlasticoFecha(Date estadoPlasticoFecha) {
        this.estadoPlasticoFecha = estadoPlasticoFecha;
    }

    public Date getFechaApertura() {
        return this.fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public Date getFechaVencimiento() {
        return this.fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFormaPago() {
        return this.formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
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

    public BigDecimal getProbabilidadIncumplimiento() {
        return this.probabilidadIncumplimiento;
    }

    public void setProbabilidadIncumplimiento(BigDecimal probabilidadIncumplimiento) {
        this.probabilidadIncumplimiento = probabilidadIncumplimiento;
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

    public String getTipoIdentificacion() {
        return this.tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getValorCalificacion() {
        return this.valorCalificacion;
    }

    public void setValorCalificacion(String valorCalificacion) {
        this.valorCalificacion = valorCalificacion;
    }

    public BigDecimal getValorCuota() {
        return this.valorCuota;
    }

    public void setValorCuota(BigDecimal valorCuota) {
        this.valorCuota = valorCuota;
    }

    public BigDecimal getValorCuotasCanceladas() {
        return this.valorCuotasCanceladas;
    }

    public void setValorCuotasCanceladas(BigDecimal valorCuotasCanceladas) {
        this.valorCuotasCanceladas = valorCuotasCanceladas;
    }

    public BigDecimal getValorCuotasMora() {
        return this.valorCuotasMora;
    }

    public void setValorCuotasMora(BigDecimal valorCuotasMora) {
        this.valorCuotasMora = valorCuotasMora;
    }

    public BigDecimal getValorCupoTotal() {
        return this.valorCupoTotal;
    }

    public void setValorCupoTotal(BigDecimal valorCupoTotal) {
        this.valorCupoTotal = valorCupoTotal;
    }

    public BigDecimal getValorDiasMora() {
        return this.valorDiasMora;
    }

    public void setValorDiasMora(BigDecimal valorDiasMora) {
        this.valorDiasMora = valorDiasMora;
    }

    public BigDecimal getValorDisponible() {
        return this.valorDisponible;
    }

    public void setValorDisponible(BigDecimal valorDisponible) {
        this.valorDisponible = valorDisponible;
    }

    public Date getValorFecha() {
        return this.valorFecha;
    }

    public void setValorFecha(Date valorFecha) {
        this.valorFecha = valorFecha;
    }

    public Date getValorFechaLimitePago() {
        return this.valorFechaLimitePago;
    }

    public void setValorFechaLimitePago(Date valorFechaLimitePago) {
        this.valorFechaLimitePago = valorFechaLimitePago;
    }

    public Date getValorFechaPagoCuota() {
        return this.valorFechaPagoCuota;
    }

    public void setValorFechaPagoCuota(Date valorFechaPagoCuota) {
        this.valorFechaPagoCuota = valorFechaPagoCuota;
    }

    public String getValorMoneda() {
        return this.valorMoneda;
    }

    public void setValorMoneda(String valorMoneda) {
        this.valorMoneda = valorMoneda;
    }

    public String getValorPeriodicidad() {
        return this.valorPeriodicidad;
    }

    public void setValorPeriodicidad(String valorPeriodicidad) {
        this.valorPeriodicidad = valorPeriodicidad;
    }

    public BigDecimal getValorSaldoActual() {
        return this.valorSaldoActual;
    }

    public void setValorSaldoActual(BigDecimal valorSaldoActual) {
        this.valorSaldoActual = valorSaldoActual;
    }

    public BigDecimal getValorSaldoMora() {
        return this.valorSaldoMora;
    }

    public void setValorSaldoMora(BigDecimal valorSaldoMora) {
        this.valorSaldoMora = valorSaldoMora;
    }

    public BigDecimal getValorTotalCuotas() {
        return this.valorTotalCuotas;
    }

    public void setValorTotalCuotas(BigDecimal valorTotalCuotas) {
        this.valorTotalCuotas = valorTotalCuotas;
    }

    public BigDecimal getValorValorInicial() {
        return this.valorValorInicial;
    }

    public void setValorValorInicial(BigDecimal valorValorInicial) {
        this.valorValorInicial = valorValorInicial;
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
        datAdjetivo.setDatObligacionesCliente(this);

        return datAdjetivo;
    }

    public DatAdjetivo removeDatAdjetivo(DatAdjetivo datAdjetivo) {
        getDatAdjetivos().remove(datAdjetivo);
        datAdjetivo.setDatObligacionesCliente(null);

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
        datReclamo.setDatObligacionesCliente(this);

        return datReclamo;
    }

    public DatReclamo removeDatReclamo(DatReclamo datReclamo) {
        getDatReclamos().remove(datReclamo);
        datReclamo.setDatObligacionesCliente(null);

        return datReclamo;
    }

    public String getTipoObligacion() {
        return tipoObligacion;
    }

    public void setTipoObligacion(String tipoObligacion) {
        this.tipoObligacion = tipoObligacion;
    }

}
