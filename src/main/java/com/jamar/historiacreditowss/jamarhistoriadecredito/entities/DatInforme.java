package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * The persistent class for the DAT_INFORME database table.
 *
 */
@Entity
@Table(name = "DAT_INFORME")
@NamedQuery(name = "DatInforme.findAll", query = "SELECT d FROM DatInforme d")
@XmlRootElement
public class DatInforme implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_INFORME_ID_GENERATOR", sequenceName = "SQ_DAT_INFORME")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_INFORME_ID_GENERATOR")
    private long id;

    @Column(name = "APELLIDO_DIGITADO")
    private String apellidoDigitado;

    @Column(name = "C_EMP")
    private String cEmp;

    @Column(name = "COD_SEGURIDAD")
    private String codSeguridad;

    @Column(name = "ES_INDEPENDIENTE")
    private String esIndependiente;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_CONSULTA")
    private Date fechaConsulta;

    private String identificacion;

    @Column(name = "IDENTIFICACION_DIGITADA")
    private String identificacionDigitada;

    private String nombre;

    private String respuesta;

    @Column(name = "SCORE_CLASIFICACION")
    private String scoreClasificacion;

    @Temporal(TemporalType.DATE)
    @Column(name = "SCORE_FECHA")
    private Date scoreFecha;

    @Column(name = "SCORE_NOMBRE")
    private String scoreNombre;

    @Column(name = "SCORE_POBLACION")
    private BigDecimal scorePoblacion;

    @Column(name = "SCORE_PUNTAJE")
    private BigDecimal scorePuntaje;

    @Column(name = "SCORE_TIPO")
    private String scoreTipo;

    @Column(name = "TIPO_IDDIGITADO")
    private String tipoIddigitado;

    //bi-directional many-to-one association to DatActividadEconomica
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatActividadEconomica> datActividadEconomicas;

    //bi-directional many-to-one association to DatAdjetivo
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatAdjetivo> datAdjetivos;

    //bi-directional many-to-one association to DatAlerta
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatAlerta> datAlertas;

    //bi-directional many-to-one association to DatCaracterFecha
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatCaracterFecha> datCaracterFechas;

    //bi-directional many-to-one association to DatCartera
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatCartera> datCarteras;

    //bi-directional many-to-one association to DatCarteraSecResEnd
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatCarteraSecResEnd> datCarteraSecResEnds;

    //bi-directional many-to-one association to DatCelular
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatCelular> datCelulars;

    //bi-directional many-to-one association to DatComentario
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatComentario> datComentarios;

    //bi-directional many-to-one association to DatComportamiento
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatComportamiento> datComportamientos;

    //bi-directional many-to-one association to DatComportamientoEntidade
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatComportamientoEntidade> datComportamientoEntidades;

    //bi-directional many-to-one association to DatCompEntComportamiento
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatCompEntComportamiento> datCompEntComportamientos;

    //bi-directional many-to-one association to DatConsulta
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatConsulta> datConsultas;

    //bi-directional many-to-one association to DatCuentasCliente
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatCuentasCliente> datCuentasClientes;

    //bi-directional many-to-one association to DatCuentaAnalisisVectore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatCuentaAnalisisVectore> datCuentaAnalisisVectores;

    //bi-directional many-to-one association to DatCuentaUsuario
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatCuentaUsuario> datCuentaUsuarios;

    //bi-directional many-to-one association to DatDireccione
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatDireccione> datDirecciones;

    //bi-directional many-to-one association to DatEmail
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatEmail> datEmails;

    //bi-directional many-to-one association to DatEmpleador
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatEmpleador> datEmpleadors;

    //bi-directional many-to-one association to DatEndeudamientoGlobal
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatEndeudamientoGlobal> datEndeudamientoGlobals;

    //bi-directional many-to-one association to DatEstadoCivil
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatEstadoCivil> datEstadoCivils;

    //bi-directional many-to-one association to DatEstadoFinanciero
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatEstadoFinanciero> datEstadoFinancieros;

    //bi-directional many-to-one association to DatEstadoPortafolio
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatEstadoPortafolio> datEstadoPortafolios;

    //bi-directional many-to-one association to DatEvolucionDeudaSector
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatEvolucionDeudaSector> datEvolucionDeudaSectors;

    //bi-directional many-to-one association to DatEvolDeudaMicrocredito
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatEvolDeudaMicrocredito> datEvolDeudaMicrocreditos;

    //bi-directional many-to-one association to DatEvolDeudaTipoCuenta
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatEvolDeudaTipoCuenta> datEvolDeudaTipoCuentas;

    //bi-directional many-to-one association to DatEvolValorTrimestre
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatEvolValorTrimestre> datEvolValorTrimestres;

    //bi-directional many-to-one association to DatFuerzaMayor
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatFuerzaMayor> datFuerzaMayors;

    //bi-directional many-to-one association to DatIdentificacion
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatIdentificacion> datIdentificacions;

    //bi-directional many-to-one association to DatInfoAgregada
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatInfoAgregada> datInfoAgregadas;

    //bi-directional many-to-one association to DatInfoAgregadaMicrocred
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatInfoAgregadaMicrocred> datInfoAgregadaMicrocreds;

    //bi-directional many-to-one association to DatJuridica
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatJuridica> datJuridicas;

    //bi-directional many-to-one association to DatLocalizacion
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatLocalizacion> datLocalizacions;

    //bi-directional many-to-one association to DatMorasMaxima
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatMorasMaxima> datMorasMaximas;

    //bi-directional many-to-one association to DatNaturale
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatNaturale> datNaturales;

    //bi-directional many-to-one association to DatNivelEstudio
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatNivelEstudio> datNivelEstudios;

    //bi-directional many-to-one association to DatObligacionesCliente
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatObligacionesCliente> datObligacionesClientes;

    //bi-directional many-to-one association to DatOperInternacionale
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatOperInternacionale> datOperInternacionales;

    //bi-directional many-to-one association to DatParteDireccion
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatParteDireccion> datParteDireccions;

    //bi-directional many-to-one association to DatPersonasACargo
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatPersonasACargo> datPersonasACargos;

    //bi-directional many-to-one association to DatProductosValore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatProductosValore> datProductosValores;

    //bi-directional many-to-one association to DatRazon
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatRazon> datRazons;

    //bi-directional many-to-one association to DatReclamo
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatReclamo> datReclamos;

    //bi-directional many-to-one association to DatRespuestaPersLinea
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatRespuestaPersLinea> datRespuestaPersLineas;

    
    //bi-directional many-to-one association to DatRespuestaPersLinea
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatDictum> datDictum;

    //bi-directional many-to-one association to DatRespuestaPersLinea
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatArbolesDictum> datArbolesDictum;

    
    //bi-directional many-to-one association to DatResumenPerfilGeneral
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatResumenPerfilGeneral> datResumenPerfilGenerals;

    //bi-directional many-to-one association to DatSaldosMe
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatSaldosMe> datSaldosMes;

    //bi-directional many-to-one association to DatSaldosSector
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatSaldosSector> datSaldosSectors;

    //bi-directional many-to-one association to DatSaldosYMora
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatSaldosYMora> datSaldosYMoras;

    //bi-directional many-to-one association to DatScore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatScore> datScores;

    //bi-directional many-to-one association to DatSectorAnalisisVectore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatSectorAnalisisVectore> datSectorAnalisisVectores;

    //bi-directional many-to-one association to DatSectorEndeudaActual
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatSectorEndeudaActual> datSectorEndeudaActuals;

    //bi-directional many-to-one association to DatSery
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatSery> datSeries;

    //bi-directional many-to-one association to DatSubtipo
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatSubtipo> datSubtipos;

    //bi-directional many-to-one association to DatTelefono
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatTelefono> datTelefonos;

    //bi-directional many-to-one association to DatTipoCuentaEndActual
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatTipoCuentaEndActual> datTipoCuentaEndActuals;

    //bi-directional many-to-one association to DatTipoCuentaHistorico
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatTipoCuentaHistorico> datTipoCuentaHistoricos;

    //bi-directional many-to-one association to DatTipoCuentaPortafolio
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatTipoCuentaPortafolio> datTipoCuentaPortafolios;

    //bi-directional many-to-one association to DatTotalesHistorico
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatTotalesHistorico> datTotalesHistoricos;

    //bi-directional many-to-one association to DatTotalesTipoCuenta
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatTotalesTipoCuenta> datTotalesTipoCuentas;

    //bi-directional many-to-one association to DatTotalesTotal
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatTotalesTotal> datTotalesTotals;

    //bi-directional many-to-one association to DatTrimestreCheque
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatTrimestreCheque> datTrimestreCheques;

    //bi-directional many-to-one association to DatTrimestreDeuda
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatTrimestreDeuda> datTrimestreDeudas;

    //bi-directional many-to-one association to DatTrimestreDeudaMicro
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatTrimestreDeudaMicro> datTrimestreDeudaMicros;

    //bi-directional many-to-one association to DatTrimestreDeuMicrocred
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatTrimestreDeuMicrocred> datTrimestreDeuMicrocreds;

    //bi-directional many-to-one association to DatTrimestreHistorico
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatTrimestreHistorico> datTrimestreHistoricos;

    //bi-directional many-to-one association to DatTrimestreResEndeuda
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatTrimestreResEndeuda> datTrimestreResEndeudas;

    //bi-directional many-to-one association to DatUsuario
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatUsuario> datUsuarios;

    //bi-directional many-to-one association to DatValor
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInforme")
    private List<DatValor> datValors;

    public DatInforme() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getApellidoDigitado() {
        return this.apellidoDigitado;
    }

    public void setApellidoDigitado(String apellidoDigitado) {
        this.apellidoDigitado = apellidoDigitado;
    }

    public String getCEmp() {
        return this.cEmp;
    }

    public void setCEmp(String cEmp) {
        this.cEmp = cEmp;
    }

    public String getCodSeguridad() {
        return this.codSeguridad;
    }

    public void setCodSeguridad(String codSeguridad) {
        this.codSeguridad = codSeguridad;
    }

    public String getEsIndependiente() {
        return this.esIndependiente;
    }

    public void setEsIndependiente(String esIndependiente) {
        this.esIndependiente = esIndependiente;
    }

    public Date getFechaConsulta() {
        return this.fechaConsulta;
    }

    public void setFechaConsulta(Date fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public String getIdentificacion() {
        return this.identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getIdentificacionDigitada() {
        return this.identificacionDigitada;
    }

    public void setIdentificacionDigitada(String identificacionDigitada) {
        this.identificacionDigitada = identificacionDigitada;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRespuesta() {
        return this.respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getScoreClasificacion() {
        return this.scoreClasificacion;
    }

    public void setScoreClasificacion(String scoreClasificacion) {
        this.scoreClasificacion = scoreClasificacion;
    }

    public Date getScoreFecha() {
        return this.scoreFecha;
    }

    public void setScoreFecha(Date scoreFecha) {
        this.scoreFecha = scoreFecha;
    }

    public String getScoreNombre() {
        return this.scoreNombre;
    }

    public void setScoreNombre(String scoreNombre) {
        this.scoreNombre = scoreNombre;
    }

    public BigDecimal getScorePoblacion() {
        return this.scorePoblacion;
    }

    public void setScorePoblacion(BigDecimal scorePoblacion) {
        this.scorePoblacion = scorePoblacion;
    }

    public BigDecimal getScorePuntaje() {
        return this.scorePuntaje;
    }

    public void setScorePuntaje(BigDecimal scorePuntaje) {
        this.scorePuntaje = scorePuntaje;
    }

    public String getScoreTipo() {
        return this.scoreTipo;
    }

    public void setScoreTipo(String scoreTipo) {
        this.scoreTipo = scoreTipo;
    }

    public String getTipoIddigitado() {
        return this.tipoIddigitado;
    }

    public void setTipoIddigitado(String tipoIddigitado) {
        this.tipoIddigitado = tipoIddigitado;
    }

    @XmlTransient
    public List<DatActividadEconomica> getDatActividadEconomicas() {
        return this.datActividadEconomicas;
    }

    public void setDatActividadEconomicas(List<DatActividadEconomica> datActividadEconomicas) {
        this.datActividadEconomicas = datActividadEconomicas;
    }

    public DatActividadEconomica addDatActividadEconomica(DatActividadEconomica datActividadEconomica) {
        getDatActividadEconomicas().add(datActividadEconomica);
        datActividadEconomica.setDatInforme(this);

        return datActividadEconomica;
    }

    public DatActividadEconomica removeDatActividadEconomica(DatActividadEconomica datActividadEconomica) {
        getDatActividadEconomicas().remove(datActividadEconomica);
        datActividadEconomica.setDatInforme(null);

        return datActividadEconomica;
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
        datAdjetivo.setDatInforme(this);

        return datAdjetivo;
    }

    public DatAdjetivo removeDatAdjetivo(DatAdjetivo datAdjetivo) {
        getDatAdjetivos().remove(datAdjetivo);
        datAdjetivo.setDatInforme(null);

        return datAdjetivo;
    }

    @XmlTransient
    public List<DatAlerta> getDatAlertas() {
        return this.datAlertas;
    }

    public void setDatAlertas(List<DatAlerta> datAlertas) {
        this.datAlertas = datAlertas;
    }

    public DatAlerta addDatAlerta(DatAlerta datAlerta) {
        getDatAlertas().add(datAlerta);
        datAlerta.setDatInforme(this);

        return datAlerta;
    }

    public DatAlerta removeDatAlerta(DatAlerta datAlerta) {
        getDatAlertas().remove(datAlerta);
        datAlerta.setDatInforme(null);

        return datAlerta;
    }

    @XmlTransient
    public List<DatCaracterFecha> getDatCaracterFechas() {
        return this.datCaracterFechas;
    }

    public void setDatCaracterFechas(List<DatCaracterFecha> datCaracterFechas) {
        this.datCaracterFechas = datCaracterFechas;
    }

    public DatCaracterFecha addDatCaracterFecha(DatCaracterFecha datCaracterFecha) {
        getDatCaracterFechas().add(datCaracterFecha);
        datCaracterFecha.setDatInforme(this);

        return datCaracterFecha;
    }

    public DatCaracterFecha removeDatCaracterFecha(DatCaracterFecha datCaracterFecha) {
        getDatCaracterFechas().remove(datCaracterFecha);
        datCaracterFecha.setDatInforme(null);

        return datCaracterFecha;
    }

    @XmlTransient
    public List<DatCartera> getDatCarteras() {
        return this.datCarteras;
    }

    public void setDatCarteras(List<DatCartera> datCarteras) {
        this.datCarteras = datCarteras;
    }

    public DatCartera addDatCartera(DatCartera datCartera) {
        getDatCarteras().add(datCartera);
        datCartera.setDatInforme(this);

        return datCartera;
    }

    public DatCartera removeDatCartera(DatCartera datCartera) {
        getDatCarteras().remove(datCartera);
        datCartera.setDatInforme(null);

        return datCartera;
    }

    @XmlTransient
    public List<DatCarteraSecResEnd> getDatCarteraSecResEnds() {
        return this.datCarteraSecResEnds;
    }

    public void setDatCarteraSecResEnds(List<DatCarteraSecResEnd> datCarteraSecResEnds) {
        this.datCarteraSecResEnds = datCarteraSecResEnds;
    }

    public DatCarteraSecResEnd addDatCarteraSecResEnd(DatCarteraSecResEnd datCarteraSecResEnd) {
        getDatCarteraSecResEnds().add(datCarteraSecResEnd);
        datCarteraSecResEnd.setDatInforme(this);

        return datCarteraSecResEnd;
    }

    public DatCarteraSecResEnd removeDatCarteraSecResEnd(DatCarteraSecResEnd datCarteraSecResEnd) {
        getDatCarteraSecResEnds().remove(datCarteraSecResEnd);
        datCarteraSecResEnd.setDatInforme(null);

        return datCarteraSecResEnd;
    }

    @XmlTransient
    public List<DatCelular> getDatCelulars() {
        return this.datCelulars;
    }

    public void setDatCelulars(List<DatCelular> datCelulars) {
        this.datCelulars = datCelulars;
    }

    public DatCelular addDatCelular(DatCelular datCelular) {
        getDatCelulars().add(datCelular);
        datCelular.setDatInforme(this);

        return datCelular;
    }

    public DatCelular removeDatCelular(DatCelular datCelular) {
        getDatCelulars().remove(datCelular);
        datCelular.setDatInforme(null);

        return datCelular;
    }

    @XmlTransient
    public List<DatComentario> getDatComentarios() {
        return this.datComentarios;
    }

    public void setDatComentarios(List<DatComentario> datComentarios) {
        this.datComentarios = datComentarios;
    }

    public DatComentario addDatComentario(DatComentario datComentario) {
        getDatComentarios().add(datComentario);
        datComentario.setDatInforme(this);

        return datComentario;
    }

    public DatComentario removeDatComentario(DatComentario datComentario) {
        getDatComentarios().remove(datComentario);
        datComentario.setDatInforme(null);

        return datComentario;
    }

    @XmlTransient
    public List<DatComportamiento> getDatComportamientos() {
        return this.datComportamientos;
    }

    public void setDatComportamientos(List<DatComportamiento> datComportamientos) {
        this.datComportamientos = datComportamientos;
    }

    public DatComportamiento addDatComportamiento(DatComportamiento datComportamiento) {
        getDatComportamientos().add(datComportamiento);
        datComportamiento.setDatInforme(this);

        return datComportamiento;
    }

    public DatComportamiento removeDatComportamiento(DatComportamiento datComportamiento) {
        getDatComportamientos().remove(datComportamiento);
        datComportamiento.setDatInforme(null);

        return datComportamiento;
    }

    @XmlTransient
    public List<DatComportamientoEntidade> getDatComportamientoEntidades() {
        return this.datComportamientoEntidades;
    }

    public void setDatComportamientoEntidades(List<DatComportamientoEntidade> datComportamientoEntidades) {
        this.datComportamientoEntidades = datComportamientoEntidades;
    }

    public DatComportamientoEntidade addDatComportamientoEntidade(DatComportamientoEntidade datComportamientoEntidade) {
        getDatComportamientoEntidades().add(datComportamientoEntidade);
        datComportamientoEntidade.setDatInforme(this);

        return datComportamientoEntidade;
    }

    public DatComportamientoEntidade removeDatComportamientoEntidade(DatComportamientoEntidade datComportamientoEntidade) {
        getDatComportamientoEntidades().remove(datComportamientoEntidade);
        datComportamientoEntidade.setDatInforme(null);

        return datComportamientoEntidade;
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
        datCompEntComportamiento.setDatInforme(this);

        return datCompEntComportamiento;
    }

    public DatCompEntComportamiento removeDatCompEntComportamiento(DatCompEntComportamiento datCompEntComportamiento) {
        getDatCompEntComportamientos().remove(datCompEntComportamiento);
        datCompEntComportamiento.setDatInforme(null);

        return datCompEntComportamiento;
    }

    @XmlTransient
    public List<DatConsulta> getDatConsultas() {
        return this.datConsultas;
    }

    public void setDatConsultas(List<DatConsulta> datConsultas) {
        this.datConsultas = datConsultas;
    }

    public DatConsulta addDatConsulta(DatConsulta datConsulta) {
        getDatConsultas().add(datConsulta);
        datConsulta.setDatInforme(this);

        return datConsulta;
    }

    public DatConsulta removeDatConsulta(DatConsulta datConsulta) {
        getDatConsultas().remove(datConsulta);
        datConsulta.setDatInforme(null);

        return datConsulta;
    }

    @XmlTransient
    public List<DatCuentasCliente> getDatCuentasClientes() {
        return this.datCuentasClientes;
    }

    public void setDatCuentasClientes(List<DatCuentasCliente> datCuentasClientes) {
        this.datCuentasClientes = datCuentasClientes;
    }

    public DatCuentasCliente addDatCuentasCliente(DatCuentasCliente datCuentasCliente) {
        getDatCuentasClientes().add(datCuentasCliente);
        datCuentasCliente.setDatInforme(this);

        return datCuentasCliente;
    }

    public DatCuentasCliente removeDatCuentasCliente(DatCuentasCliente datCuentasCliente) {
        getDatCuentasClientes().remove(datCuentasCliente);
        datCuentasCliente.setDatInforme(null);

        return datCuentasCliente;
    }

    @XmlTransient
    public List<DatCuentaAnalisisVectore> getDatCuentaAnalisisVectores() {
        return this.datCuentaAnalisisVectores;
    }

    public void setDatCuentaAnalisisVectores(List<DatCuentaAnalisisVectore> datCuentaAnalisisVectores) {
        this.datCuentaAnalisisVectores = datCuentaAnalisisVectores;
    }

    public DatCuentaAnalisisVectore addDatCuentaAnalisisVectore(DatCuentaAnalisisVectore datCuentaAnalisisVectore) {
        getDatCuentaAnalisisVectores().add(datCuentaAnalisisVectore);
        datCuentaAnalisisVectore.setDatInforme(this);

        return datCuentaAnalisisVectore;
    }

    public DatCuentaAnalisisVectore removeDatCuentaAnalisisVectore(DatCuentaAnalisisVectore datCuentaAnalisisVectore) {
        getDatCuentaAnalisisVectores().remove(datCuentaAnalisisVectore);
        datCuentaAnalisisVectore.setDatInforme(null);

        return datCuentaAnalisisVectore;
    }

    @XmlTransient
    public List<DatCuentaUsuario> getDatCuentaUsuarios() {
        return this.datCuentaUsuarios;
    }

    public void setDatCuentaUsuarios(List<DatCuentaUsuario> datCuentaUsuarios) {
        this.datCuentaUsuarios = datCuentaUsuarios;
    }

    public DatCuentaUsuario addDatCuentaUsuario(DatCuentaUsuario datCuentaUsuario) {
        getDatCuentaUsuarios().add(datCuentaUsuario);
        datCuentaUsuario.setDatInforme(this);

        return datCuentaUsuario;
    }

    public DatCuentaUsuario removeDatCuentaUsuario(DatCuentaUsuario datCuentaUsuario) {
        getDatCuentaUsuarios().remove(datCuentaUsuario);
        datCuentaUsuario.setDatInforme(null);

        return datCuentaUsuario;
    }

    @XmlTransient
    public List<DatDireccione> getDatDirecciones() {
        return this.datDirecciones;
    }

    public void setDatDirecciones(List<DatDireccione> datDirecciones) {
        this.datDirecciones = datDirecciones;
    }

    public DatDireccione addDatDireccione(DatDireccione datDireccione) {
        getDatDirecciones().add(datDireccione);
        datDireccione.setDatInforme(this);

        return datDireccione;
    }

    public DatDireccione removeDatDireccione(DatDireccione datDireccione) {
        getDatDirecciones().remove(datDireccione);
        datDireccione.setDatInforme(null);

        return datDireccione;
    }

    @XmlTransient
    public List<DatEmail> getDatEmails() {
        return this.datEmails;
    }

    public void setDatEmails(List<DatEmail> datEmails) {
        this.datEmails = datEmails;
    }

    public DatEmail addDatEmail(DatEmail datEmail) {
        getDatEmails().add(datEmail);
        datEmail.setDatInforme(this);

        return datEmail;
    }

    public DatEmail removeDatEmail(DatEmail datEmail) {
        getDatEmails().remove(datEmail);
        datEmail.setDatInforme(null);

        return datEmail;
    }

    @XmlTransient
    public List<DatEmpleador> getDatEmpleadors() {
        return this.datEmpleadors;
    }

    public void setDatEmpleadors(List<DatEmpleador> datEmpleadors) {
        this.datEmpleadors = datEmpleadors;
    }

    public DatEmpleador addDatEmpleador(DatEmpleador datEmpleador) {
        getDatEmpleadors().add(datEmpleador);
        datEmpleador.setDatInforme(this);

        return datEmpleador;
    }

    public DatEmpleador removeDatEmpleador(DatEmpleador datEmpleador) {
        getDatEmpleadors().remove(datEmpleador);
        datEmpleador.setDatInforme(null);

        return datEmpleador;
    }

    @XmlTransient
    public List<DatEndeudamientoGlobal> getDatEndeudamientoGlobals() {
        return this.datEndeudamientoGlobals;
    }

    public void setDatEndeudamientoGlobals(List<DatEndeudamientoGlobal> datEndeudamientoGlobals) {
        this.datEndeudamientoGlobals = datEndeudamientoGlobals;
    }

    public DatEndeudamientoGlobal addDatEndeudamientoGlobal(DatEndeudamientoGlobal datEndeudamientoGlobal) {
        getDatEndeudamientoGlobals().add(datEndeudamientoGlobal);
        datEndeudamientoGlobal.setDatInforme(this);

        return datEndeudamientoGlobal;
    }

    public DatEndeudamientoGlobal removeDatEndeudamientoGlobal(DatEndeudamientoGlobal datEndeudamientoGlobal) {
        getDatEndeudamientoGlobals().remove(datEndeudamientoGlobal);
        datEndeudamientoGlobal.setDatInforme(null);

        return datEndeudamientoGlobal;
    }

    @XmlTransient
    public List<DatEstadoCivil> getDatEstadoCivils() {
        return this.datEstadoCivils;
    }

    public void setDatEstadoCivils(List<DatEstadoCivil> datEstadoCivils) {
        this.datEstadoCivils = datEstadoCivils;
    }

    public DatEstadoCivil addDatEstadoCivil(DatEstadoCivil datEstadoCivil) {
        getDatEstadoCivils().add(datEstadoCivil);
        datEstadoCivil.setDatInforme(this);

        return datEstadoCivil;
    }

    public DatEstadoCivil removeDatEstadoCivil(DatEstadoCivil datEstadoCivil) {
        getDatEstadoCivils().remove(datEstadoCivil);
        datEstadoCivil.setDatInforme(null);

        return datEstadoCivil;
    }

    @XmlTransient
    public List<DatEstadoFinanciero> getDatEstadoFinancieros() {
        return this.datEstadoFinancieros;
    }

    public void setDatEstadoFinancieros(List<DatEstadoFinanciero> datEstadoFinancieros) {
        this.datEstadoFinancieros = datEstadoFinancieros;
    }

    public DatEstadoFinanciero addDatEstadoFinanciero(DatEstadoFinanciero datEstadoFinanciero) {
        getDatEstadoFinancieros().add(datEstadoFinanciero);
        datEstadoFinanciero.setDatInforme(this);

        return datEstadoFinanciero;
    }

    public DatEstadoFinanciero removeDatEstadoFinanciero(DatEstadoFinanciero datEstadoFinanciero) {
        getDatEstadoFinancieros().remove(datEstadoFinanciero);
        datEstadoFinanciero.setDatInforme(null);

        return datEstadoFinanciero;
    }

    @XmlTransient
    public List<DatEstadoPortafolio> getDatEstadoPortafolios() {
        return this.datEstadoPortafolios;
    }

    public void setDatEstadoPortafolios(List<DatEstadoPortafolio> datEstadoPortafolios) {
        this.datEstadoPortafolios = datEstadoPortafolios;
    }

    public DatEstadoPortafolio addDatEstadoPortafolio(DatEstadoPortafolio datEstadoPortafolio) {
        getDatEstadoPortafolios().add(datEstadoPortafolio);
        datEstadoPortafolio.setDatInforme(this);

        return datEstadoPortafolio;
    }

    public DatEstadoPortafolio removeDatEstadoPortafolio(DatEstadoPortafolio datEstadoPortafolio) {
        getDatEstadoPortafolios().remove(datEstadoPortafolio);
        datEstadoPortafolio.setDatInforme(null);

        return datEstadoPortafolio;
    }

    @XmlTransient
    public List<DatEvolucionDeudaSector> getDatEvolucionDeudaSectors() {
        return this.datEvolucionDeudaSectors;
    }

    public void setDatEvolucionDeudaSectors(List<DatEvolucionDeudaSector> datEvolucionDeudaSectors) {
        this.datEvolucionDeudaSectors = datEvolucionDeudaSectors;
    }

    public DatEvolucionDeudaSector addDatEvolucionDeudaSector(DatEvolucionDeudaSector datEvolucionDeudaSector) {
        getDatEvolucionDeudaSectors().add(datEvolucionDeudaSector);
        datEvolucionDeudaSector.setDatInforme(this);

        return datEvolucionDeudaSector;
    }

    public DatEvolucionDeudaSector removeDatEvolucionDeudaSector(DatEvolucionDeudaSector datEvolucionDeudaSector) {
        getDatEvolucionDeudaSectors().remove(datEvolucionDeudaSector);
        datEvolucionDeudaSector.setDatInforme(null);

        return datEvolucionDeudaSector;
    }

    @XmlTransient
    public List<DatEvolDeudaMicrocredito> getDatEvolDeudaMicrocreditos() {
        return this.datEvolDeudaMicrocreditos;
    }

    public void setDatEvolDeudaMicrocreditos(List<DatEvolDeudaMicrocredito> datEvolDeudaMicrocreditos) {
        this.datEvolDeudaMicrocreditos = datEvolDeudaMicrocreditos;
    }

    public DatEvolDeudaMicrocredito addDatEvolDeudaMicrocredito(DatEvolDeudaMicrocredito datEvolDeudaMicrocredito) {
        getDatEvolDeudaMicrocreditos().add(datEvolDeudaMicrocredito);
        datEvolDeudaMicrocredito.setDatInforme(this);

        return datEvolDeudaMicrocredito;
    }

    public DatEvolDeudaMicrocredito removeDatEvolDeudaMicrocredito(DatEvolDeudaMicrocredito datEvolDeudaMicrocredito) {
        getDatEvolDeudaMicrocreditos().remove(datEvolDeudaMicrocredito);
        datEvolDeudaMicrocredito.setDatInforme(null);

        return datEvolDeudaMicrocredito;
    }

    @XmlTransient
    public List<DatEvolDeudaTipoCuenta> getDatEvolDeudaTipoCuentas() {
        return this.datEvolDeudaTipoCuentas;
    }

    public void setDatEvolDeudaTipoCuentas(List<DatEvolDeudaTipoCuenta> datEvolDeudaTipoCuentas) {
        this.datEvolDeudaTipoCuentas = datEvolDeudaTipoCuentas;
    }

    public DatEvolDeudaTipoCuenta addDatEvolDeudaTipoCuenta(DatEvolDeudaTipoCuenta datEvolDeudaTipoCuenta) {
        getDatEvolDeudaTipoCuentas().add(datEvolDeudaTipoCuenta);
        datEvolDeudaTipoCuenta.setDatInforme(this);

        return datEvolDeudaTipoCuenta;
    }

    public DatEvolDeudaTipoCuenta removeDatEvolDeudaTipoCuenta(DatEvolDeudaTipoCuenta datEvolDeudaTipoCuenta) {
        getDatEvolDeudaTipoCuentas().remove(datEvolDeudaTipoCuenta);
        datEvolDeudaTipoCuenta.setDatInforme(null);

        return datEvolDeudaTipoCuenta;
    }

    @XmlTransient
    public List<DatEvolValorTrimestre> getDatEvolValorTrimestres() {
        return this.datEvolValorTrimestres;
    }

    public void setDatEvolValorTrimestres(List<DatEvolValorTrimestre> datEvolValorTrimestres) {
        this.datEvolValorTrimestres = datEvolValorTrimestres;
    }

    public DatEvolValorTrimestre addDatEvolValorTrimestre(DatEvolValorTrimestre datEvolValorTrimestre) {
        getDatEvolValorTrimestres().add(datEvolValorTrimestre);
        datEvolValorTrimestre.setDatInforme(this);

        return datEvolValorTrimestre;
    }

    public DatEvolValorTrimestre removeDatEvolValorTrimestre(DatEvolValorTrimestre datEvolValorTrimestre) {
        getDatEvolValorTrimestres().remove(datEvolValorTrimestre);
        datEvolValorTrimestre.setDatInforme(null);

        return datEvolValorTrimestre;
    }

    @XmlTransient
    public List<DatFuerzaMayor> getDatFuerzaMayors() {
        return this.datFuerzaMayors;
    }

    public void setDatFuerzaMayors(List<DatFuerzaMayor> datFuerzaMayors) {
        this.datFuerzaMayors = datFuerzaMayors;
    }

    public DatFuerzaMayor addDatFuerzaMayor(DatFuerzaMayor datFuerzaMayor) {
        getDatFuerzaMayors().add(datFuerzaMayor);
        datFuerzaMayor.setDatInforme(this);

        return datFuerzaMayor;
    }

    public DatFuerzaMayor removeDatFuerzaMayor(DatFuerzaMayor datFuerzaMayor) {
        getDatFuerzaMayors().remove(datFuerzaMayor);
        datFuerzaMayor.setDatInforme(null);

        return datFuerzaMayor;
    }

    @XmlTransient
    public List<DatIdentificacion> getDatIdentificacions() {
        return this.datIdentificacions;
    }

    public void setDatIdentificacions(List<DatIdentificacion> datIdentificacions) {
        this.datIdentificacions = datIdentificacions;
    }

    public DatIdentificacion addDatIdentificacion(DatIdentificacion datIdentificacion) {
        getDatIdentificacions().add(datIdentificacion);
        datIdentificacion.setDatInforme(this);

        return datIdentificacion;
    }

    public DatIdentificacion removeDatIdentificacion(DatIdentificacion datIdentificacion) {
        getDatIdentificacions().remove(datIdentificacion);
        datIdentificacion.setDatInforme(null);

        return datIdentificacion;
    }

    @XmlTransient
    public List<DatInfoAgregada> getDatInfoAgregadas() {
        return this.datInfoAgregadas;
    }

    public void setDatInfoAgregadas(List<DatInfoAgregada> datInfoAgregadas) {
        this.datInfoAgregadas = datInfoAgregadas;
    }

    public DatInfoAgregada addDatInfoAgregada(DatInfoAgregada datInfoAgregada) {
        getDatInfoAgregadas().add(datInfoAgregada);
        datInfoAgregada.setDatInforme(this);

        return datInfoAgregada;
    }

    public DatInfoAgregada removeDatInfoAgregada(DatInfoAgregada datInfoAgregada) {
        getDatInfoAgregadas().remove(datInfoAgregada);
        datInfoAgregada.setDatInforme(null);

        return datInfoAgregada;
    }

    @XmlTransient
    public List<DatInfoAgregadaMicrocred> getDatInfoAgregadaMicrocreds() {
        return this.datInfoAgregadaMicrocreds;
    }

    public void setDatInfoAgregadaMicrocreds(List<DatInfoAgregadaMicrocred> datInfoAgregadaMicrocreds) {
        this.datInfoAgregadaMicrocreds = datInfoAgregadaMicrocreds;
    }

    public DatInfoAgregadaMicrocred addDatInfoAgregadaMicrocred(DatInfoAgregadaMicrocred datInfoAgregadaMicrocred) {
        getDatInfoAgregadaMicrocreds().add(datInfoAgregadaMicrocred);
        datInfoAgregadaMicrocred.setDatInforme(this);

        return datInfoAgregadaMicrocred;
    }

    public DatInfoAgregadaMicrocred removeDatInfoAgregadaMicrocred(DatInfoAgregadaMicrocred datInfoAgregadaMicrocred) {
        getDatInfoAgregadaMicrocreds().remove(datInfoAgregadaMicrocred);
        datInfoAgregadaMicrocred.setDatInforme(null);

        return datInfoAgregadaMicrocred;
    }

    @XmlTransient
    public List<DatJuridica> getDatJuridicas() {
        return this.datJuridicas;
    }

    public void setDatJuridicas(List<DatJuridica> datJuridicas) {
        this.datJuridicas = datJuridicas;
    }

    public DatJuridica addDatJuridica(DatJuridica datJuridica) {
        getDatJuridicas().add(datJuridica);
        datJuridica.setDatInforme(this);

        return datJuridica;
    }

    public DatJuridica removeDatJuridica(DatJuridica datJuridica) {
        getDatJuridicas().remove(datJuridica);
        datJuridica.setDatInforme(null);

        return datJuridica;
    }

    @XmlTransient
    public List<DatLocalizacion> getDatLocalizacions() {
        return this.datLocalizacions;
    }

    public void setDatLocalizacions(List<DatLocalizacion> datLocalizacions) {
        this.datLocalizacions = datLocalizacions;
    }

    public DatLocalizacion addDatLocalizacion(DatLocalizacion datLocalizacion) {
        getDatLocalizacions().add(datLocalizacion);
        datLocalizacion.setDatInforme(this);

        return datLocalizacion;
    }

    public DatLocalizacion removeDatLocalizacion(DatLocalizacion datLocalizacion) {
        getDatLocalizacions().remove(datLocalizacion);
        datLocalizacion.setDatInforme(null);

        return datLocalizacion;
    }

    @XmlTransient
    public List<DatMorasMaxima> getDatMorasMaximas() {
        return this.datMorasMaximas;
    }

    public void setDatMorasMaximas(List<DatMorasMaxima> datMorasMaximas) {
        this.datMorasMaximas = datMorasMaximas;
    }

    public DatMorasMaxima addDatMorasMaxima(DatMorasMaxima datMorasMaxima) {
        getDatMorasMaximas().add(datMorasMaxima);
        datMorasMaxima.setDatInforme(this);

        return datMorasMaxima;
    }

    public DatMorasMaxima removeDatMorasMaxima(DatMorasMaxima datMorasMaxima) {
        getDatMorasMaximas().remove(datMorasMaxima);
        datMorasMaxima.setDatInforme(null);

        return datMorasMaxima;
    }

    @XmlTransient
    public List<DatNaturale> getDatNaturales() {
        return this.datNaturales;
    }

    public void setDatNaturales(List<DatNaturale> datNaturales) {
        this.datNaturales = datNaturales;
    }

    public DatNaturale addDatNaturale(DatNaturale datNaturale) {
        getDatNaturales().add(datNaturale);
        datNaturale.setDatInforme(this);

        return datNaturale;
    }

    public DatNaturale removeDatNaturale(DatNaturale datNaturale) {
        getDatNaturales().remove(datNaturale);
        datNaturale.setDatInforme(null);

        return datNaturale;
    }

    @XmlTransient
    public List<DatNivelEstudio> getDatNivelEstudios() {
        return this.datNivelEstudios;
    }

    public void setDatNivelEstudios(List<DatNivelEstudio> datNivelEstudios) {
        this.datNivelEstudios = datNivelEstudios;
    }

    public DatNivelEstudio addDatNivelEstudio(DatNivelEstudio datNivelEstudio) {
        getDatNivelEstudios().add(datNivelEstudio);
        datNivelEstudio.setDatInforme(this);

        return datNivelEstudio;
    }

    public DatNivelEstudio removeDatNivelEstudio(DatNivelEstudio datNivelEstudio) {
        getDatNivelEstudios().remove(datNivelEstudio);
        datNivelEstudio.setDatInforme(null);

        return datNivelEstudio;
    }

    @XmlTransient
    public List<DatObligacionesCliente> getDatObligacionesClientes() {
        return this.datObligacionesClientes;
    }

    public void setDatObligacionesClientes(List<DatObligacionesCliente> datObligacionesClientes) {
        this.datObligacionesClientes = datObligacionesClientes;
    }

    public DatObligacionesCliente addDatObligacionesCliente(DatObligacionesCliente datObligacionesCliente) {
        getDatObligacionesClientes().add(datObligacionesCliente);
        datObligacionesCliente.setDatInforme(this);

        return datObligacionesCliente;
    }

    public DatObligacionesCliente removeDatObligacionesCliente(DatObligacionesCliente datObligacionesCliente) {
        getDatObligacionesClientes().remove(datObligacionesCliente);
        datObligacionesCliente.setDatInforme(null);

        return datObligacionesCliente;
    }

    @XmlTransient
    public List<DatOperInternacionale> getDatOperInternacionales() {
        return this.datOperInternacionales;
    }

    public void setDatOperInternacionales(List<DatOperInternacionale> datOperInternacionales) {
        this.datOperInternacionales = datOperInternacionales;
    }

    public DatOperInternacionale addDatOperInternacionale(DatOperInternacionale datOperInternacionale) {
        getDatOperInternacionales().add(datOperInternacionale);
        datOperInternacionale.setDatInforme(this);

        return datOperInternacionale;
    }

    public DatOperInternacionale removeDatOperInternacionale(DatOperInternacionale datOperInternacionale) {
        getDatOperInternacionales().remove(datOperInternacionale);
        datOperInternacionale.setDatInforme(null);

        return datOperInternacionale;
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
        datParteDireccion.setDatInforme(this);

        return datParteDireccion;
    }

    public DatParteDireccion removeDatParteDireccion(DatParteDireccion datParteDireccion) {
        getDatParteDireccions().remove(datParteDireccion);
        datParteDireccion.setDatInforme(null);

        return datParteDireccion;
    }

    @XmlTransient
    public List<DatPersonasACargo> getDatPersonasACargos() {
        return this.datPersonasACargos;
    }

    public void setDatPersonasACargos(List<DatPersonasACargo> datPersonasACargos) {
        this.datPersonasACargos = datPersonasACargos;
    }

    public DatPersonasACargo addDatPersonasACargo(DatPersonasACargo datPersonasACargo) {
        getDatPersonasACargos().add(datPersonasACargo);
        datPersonasACargo.setDatInforme(this);

        return datPersonasACargo;
    }

    public DatPersonasACargo removeDatPersonasACargo(DatPersonasACargo datPersonasACargo) {
        getDatPersonasACargos().remove(datPersonasACargo);
        datPersonasACargo.setDatInforme(null);

        return datPersonasACargo;
    }

    @XmlTransient
    public List<DatProductosValore> getDatProductosValores() {
        return this.datProductosValores;
    }

    public void setDatProductosValores(List<DatProductosValore> datProductosValores) {
        this.datProductosValores = datProductosValores;
    }

    public DatProductosValore addDatProductosValore(DatProductosValore datProductosValore) {
        getDatProductosValores().add(datProductosValore);
        datProductosValore.setDatInforme(this);

        return datProductosValore;
    }

    public DatProductosValore removeDatProductosValore(DatProductosValore datProductosValore) {
        getDatProductosValores().remove(datProductosValore);
        datProductosValore.setDatInforme(null);

        return datProductosValore;
    }

    @XmlTransient
    public List<DatRazon> getDatRazons() {
        return this.datRazons;
    }

    public void setDatRazons(List<DatRazon> datRazons) {
        this.datRazons = datRazons;
    }

    public DatRazon addDatRazon(DatRazon datRazon) {
        getDatRazons().add(datRazon);
        datRazon.setDatInforme(this);

        return datRazon;
    }

    public DatRazon removeDatRazon(DatRazon datRazon) {
        getDatRazons().remove(datRazon);
        datRazon.setDatInforme(null);

        return datRazon;
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
        datReclamo.setDatInforme(this);

        return datReclamo;
    }

    public DatReclamo removeDatReclamo(DatReclamo datReclamo) {
        getDatReclamos().remove(datReclamo);
        datReclamo.setDatInforme(null);

        return datReclamo;
    }

    @XmlTransient
    public List<DatRespuestaPersLinea> getDatRespuestaPersLineas() {
        return this.datRespuestaPersLineas;
    }

    public void setDatRespuestaPersLineas(List<DatRespuestaPersLinea> datRespuestaPersLineas) {
        this.datRespuestaPersLineas = datRespuestaPersLineas;
    }

    public DatRespuestaPersLinea addDatRespuestaPersLinea(DatRespuestaPersLinea datRespuestaPersLinea) {
        getDatRespuestaPersLineas().add(datRespuestaPersLinea);
        datRespuestaPersLinea.setDatInforme(this);

        return datRespuestaPersLinea;
    }

    public DatRespuestaPersLinea removeDatRespuestaPersLinea(DatRespuestaPersLinea datRespuestaPersLinea) {
        getDatRespuestaPersLineas().remove(datRespuestaPersLinea);
        datRespuestaPersLinea.setDatInforme(null);

        return datRespuestaPersLinea;
    }
    

    @XmlTransient
    public List<DatDictum> getDatDictum() {
        return this.datDictum;
    }

    public void setDatDictum(List<DatDictum> datDictum) {
        this.datDictum = datDictum;
    }

    public DatDictum addDatDictum(DatDictum datDictum) {
        getDatDictum().add(datDictum);
        datDictum.setDatInforme(this);

        return datDictum;
    }

    public DatDictum removeDatDictum(DatDictum datDictum) {
    	getDatDictum().remove(datDictum);
        datDictum.setDatInforme(null);

        return datDictum;
    }
    
    @XmlTransient
    public List<DatArbolesDictum> getDatArbolesDictum() {
        return this.datArbolesDictum;
    }

    public void setDatArbolesDictum(List<DatArbolesDictum> datArbolesDictum) {
        this.datArbolesDictum = datArbolesDictum;
    }

    public DatArbolesDictum addArbolesDictum(DatArbolesDictum datArbolesDictum) {
    	getDatArbolesDictum().add(datArbolesDictum);
    	datArbolesDictum.setDatInforme(this);

        return datArbolesDictum;
    }

    public DatArbolesDictum removeDatArbolesDictum(DatArbolesDictum datArbolesDictum) {
    	getDatArbolesDictum().remove(datArbolesDictum);
    	datArbolesDictum.setDatInforme(null);

        return datArbolesDictum;
    }

    @XmlTransient
    public List<DatResumenPerfilGeneral> getDatResumenPerfilGenerals() {
        return this.datResumenPerfilGenerals;
    }

    public void setDatResumenPerfilGenerals(List<DatResumenPerfilGeneral> datResumenPerfilGenerals) {
        this.datResumenPerfilGenerals = datResumenPerfilGenerals;
    }

    public DatResumenPerfilGeneral addDatResumenPerfilGeneral(DatResumenPerfilGeneral datResumenPerfilGeneral) {
        getDatResumenPerfilGenerals().add(datResumenPerfilGeneral);
        datResumenPerfilGeneral.setDatInforme(this);

        return datResumenPerfilGeneral;
    }

    public DatResumenPerfilGeneral removeDatResumenPerfilGeneral(DatResumenPerfilGeneral datResumenPerfilGeneral) {
        getDatResumenPerfilGenerals().remove(datResumenPerfilGeneral);
        datResumenPerfilGeneral.setDatInforme(null);

        return datResumenPerfilGeneral;
    }

    @XmlTransient
    public List<DatSaldosMe> getDatSaldosMes() {
        return this.datSaldosMes;
    }

    public void setDatSaldosMes(List<DatSaldosMe> datSaldosMes) {
        this.datSaldosMes = datSaldosMes;
    }

    public DatSaldosMe addDatSaldosMe(DatSaldosMe datSaldosMe) {
        getDatSaldosMes().add(datSaldosMe);
        datSaldosMe.setDatInforme(this);

        return datSaldosMe;
    }

    public DatSaldosMe removeDatSaldosMe(DatSaldosMe datSaldosMe) {
        getDatSaldosMes().remove(datSaldosMe);
        datSaldosMe.setDatInforme(null);

        return datSaldosMe;
    }

    @XmlTransient
    public List<DatSaldosSector> getDatSaldosSectors() {
        return this.datSaldosSectors;
    }

    public void setDatSaldosSectors(List<DatSaldosSector> datSaldosSectors) {
        this.datSaldosSectors = datSaldosSectors;
    }

    public DatSaldosSector addDatSaldosSector(DatSaldosSector datSaldosSector) {
        getDatSaldosSectors().add(datSaldosSector);
        datSaldosSector.setDatInforme(this);

        return datSaldosSector;
    }

    public DatSaldosSector removeDatSaldosSector(DatSaldosSector datSaldosSector) {
        getDatSaldosSectors().remove(datSaldosSector);
        datSaldosSector.setDatInforme(null);

        return datSaldosSector;
    }

    @XmlTransient
    public List<DatSaldosYMora> getDatSaldosYMoras() {
        return this.datSaldosYMoras;
    }

    public void setDatSaldosYMoras(List<DatSaldosYMora> datSaldosYMoras) {
        this.datSaldosYMoras = datSaldosYMoras;
    }

    public DatSaldosYMora addDatSaldosYMora(DatSaldosYMora datSaldosYMora) {
        getDatSaldosYMoras().add(datSaldosYMora);
        datSaldosYMora.setDatInforme(this);

        return datSaldosYMora;
    }

    public DatSaldosYMora removeDatSaldosYMora(DatSaldosYMora datSaldosYMora) {
        getDatSaldosYMoras().remove(datSaldosYMora);
        datSaldosYMora.setDatInforme(null);

        return datSaldosYMora;
    }

    @XmlTransient
    public List<DatScore> getDatScores() {
        return this.datScores;
    }

    public void setDatScores(List<DatScore> datScores) {
        this.datScores = datScores;
    }

    public DatScore addDatScore(DatScore datScore) {
        getDatScores().add(datScore);
        datScore.setDatInforme(this);

        return datScore;
    }

    public DatScore removeDatScore(DatScore datScore) {
        getDatScores().remove(datScore);
        datScore.setDatInforme(null);

        return datScore;
    }

    @XmlTransient
    public List<DatSectorAnalisisVectore> getDatSectorAnalisisVectores() {
        return this.datSectorAnalisisVectores;
    }

    public void setDatSectorAnalisisVectores(List<DatSectorAnalisisVectore> datSectorAnalisisVectores) {
        this.datSectorAnalisisVectores = datSectorAnalisisVectores;
    }

    public DatSectorAnalisisVectore addDatSectorAnalisisVectore(DatSectorAnalisisVectore datSectorAnalisisVectore) {
        getDatSectorAnalisisVectores().add(datSectorAnalisisVectore);
        datSectorAnalisisVectore.setDatInforme(this);

        return datSectorAnalisisVectore;
    }

    public DatSectorAnalisisVectore removeDatSectorAnalisisVectore(DatSectorAnalisisVectore datSectorAnalisisVectore) {
        getDatSectorAnalisisVectores().remove(datSectorAnalisisVectore);
        datSectorAnalisisVectore.setDatInforme(null);

        return datSectorAnalisisVectore;
    }

    @XmlTransient
    public List<DatSectorEndeudaActual> getDatSectorEndeudaActuals() {
        return this.datSectorEndeudaActuals;
    }

    public void setDatSectorEndeudaActuals(List<DatSectorEndeudaActual> datSectorEndeudaActuals) {
        this.datSectorEndeudaActuals = datSectorEndeudaActuals;
    }

    public DatSectorEndeudaActual addDatSectorEndeudaActual(DatSectorEndeudaActual datSectorEndeudaActual) {
        getDatSectorEndeudaActuals().add(datSectorEndeudaActual);
        datSectorEndeudaActual.setDatInforme(this);

        return datSectorEndeudaActual;
    }

    public DatSectorEndeudaActual removeDatSectorEndeudaActual(DatSectorEndeudaActual datSectorEndeudaActual) {
        getDatSectorEndeudaActuals().remove(datSectorEndeudaActual);
        datSectorEndeudaActual.setDatInforme(null);

        return datSectorEndeudaActual;
    }

    @XmlTransient
    public List<DatSery> getDatSeries() {
        return this.datSeries;
    }

    public void setDatSeries(List<DatSery> datSeries) {
        this.datSeries = datSeries;
    }

    public DatSery addDatSery(DatSery datSery) {
        getDatSeries().add(datSery);
        datSery.setDatInforme(this);

        return datSery;
    }

    public DatSery removeDatSery(DatSery datSery) {
        getDatSeries().remove(datSery);
        datSery.setDatInforme(null);

        return datSery;
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
        datSubtipo.setDatInforme(this);

        return datSubtipo;
    }

    public DatSubtipo removeDatSubtipo(DatSubtipo datSubtipo) {
        getDatSubtipos().remove(datSubtipo);
        datSubtipo.setDatInforme(null);

        return datSubtipo;
    }

    @XmlTransient
    public List<DatTelefono> getDatTelefonos() {
        return this.datTelefonos;
    }

    public void setDatTelefonos(List<DatTelefono> datTelefonos) {
        this.datTelefonos = datTelefonos;
    }

    public DatTelefono addDatTelefono(DatTelefono datTelefono) {
        getDatTelefonos().add(datTelefono);
        datTelefono.setDatInforme(this);

        return datTelefono;
    }

    public DatTelefono removeDatTelefono(DatTelefono datTelefono) {
        getDatTelefonos().remove(datTelefono);
        datTelefono.setDatInforme(null);

        return datTelefono;
    }

    @XmlTransient
    public List<DatTipoCuentaEndActual> getDatTipoCuentaEndActuals() {
        return this.datTipoCuentaEndActuals;
    }

    public void setDatTipoCuentaEndActuals(List<DatTipoCuentaEndActual> datTipoCuentaEndActuals) {
        this.datTipoCuentaEndActuals = datTipoCuentaEndActuals;
    }

    public DatTipoCuentaEndActual addDatTipoCuentaEndActual(DatTipoCuentaEndActual datTipoCuentaEndActual) {
        getDatTipoCuentaEndActuals().add(datTipoCuentaEndActual);
        datTipoCuentaEndActual.setDatInforme(this);

        return datTipoCuentaEndActual;
    }

    public DatTipoCuentaEndActual removeDatTipoCuentaEndActual(DatTipoCuentaEndActual datTipoCuentaEndActual) {
        getDatTipoCuentaEndActuals().remove(datTipoCuentaEndActual);
        datTipoCuentaEndActual.setDatInforme(null);

        return datTipoCuentaEndActual;
    }

    @XmlTransient
    public List<DatTipoCuentaHistorico> getDatTipoCuentaHistoricos() {
        return this.datTipoCuentaHistoricos;
    }

    public void setDatTipoCuentaHistoricos(List<DatTipoCuentaHistorico> datTipoCuentaHistoricos) {
        this.datTipoCuentaHistoricos = datTipoCuentaHistoricos;
    }

    public DatTipoCuentaHistorico addDatTipoCuentaHistorico(DatTipoCuentaHistorico datTipoCuentaHistorico) {
        getDatTipoCuentaHistoricos().add(datTipoCuentaHistorico);
        datTipoCuentaHistorico.setDatInforme(this);

        return datTipoCuentaHistorico;
    }

    public DatTipoCuentaHistorico removeDatTipoCuentaHistorico(DatTipoCuentaHistorico datTipoCuentaHistorico) {
        getDatTipoCuentaHistoricos().remove(datTipoCuentaHistorico);
        datTipoCuentaHistorico.setDatInforme(null);

        return datTipoCuentaHistorico;
    }

    @XmlTransient
    public List<DatTipoCuentaPortafolio> getDatTipoCuentaPortafolios() {
        return this.datTipoCuentaPortafolios;
    }

    public void setDatTipoCuentaPortafolios(List<DatTipoCuentaPortafolio> datTipoCuentaPortafolios) {
        this.datTipoCuentaPortafolios = datTipoCuentaPortafolios;
    }

    public DatTipoCuentaPortafolio addDatTipoCuentaPortafolio(DatTipoCuentaPortafolio datTipoCuentaPortafolio) {
        getDatTipoCuentaPortafolios().add(datTipoCuentaPortafolio);
        datTipoCuentaPortafolio.setDatInforme(this);

        return datTipoCuentaPortafolio;
    }

    public DatTipoCuentaPortafolio removeDatTipoCuentaPortafolio(DatTipoCuentaPortafolio datTipoCuentaPortafolio) {
        getDatTipoCuentaPortafolios().remove(datTipoCuentaPortafolio);
        datTipoCuentaPortafolio.setDatInforme(null);

        return datTipoCuentaPortafolio;
    }

    @XmlTransient
    public List<DatTotalesHistorico> getDatTotalesHistoricos() {
        return this.datTotalesHistoricos;
    }

    public void setDatTotalesHistoricos(List<DatTotalesHistorico> datTotalesHistoricos) {
        this.datTotalesHistoricos = datTotalesHistoricos;
    }

    public DatTotalesHistorico addDatTotalesHistorico(DatTotalesHistorico datTotalesHistorico) {
        getDatTotalesHistoricos().add(datTotalesHistorico);
        datTotalesHistorico.setDatInforme(this);

        return datTotalesHistorico;
    }

    public DatTotalesHistorico removeDatTotalesHistorico(DatTotalesHistorico datTotalesHistorico) {
        getDatTotalesHistoricos().remove(datTotalesHistorico);
        datTotalesHistorico.setDatInforme(null);

        return datTotalesHistorico;
    }

    @XmlTransient
    public List<DatTotalesTipoCuenta> getDatTotalesTipoCuentas() {
        return this.datTotalesTipoCuentas;
    }

    public void setDatTotalesTipoCuentas(List<DatTotalesTipoCuenta> datTotalesTipoCuentas) {
        this.datTotalesTipoCuentas = datTotalesTipoCuentas;
    }

    public DatTotalesTipoCuenta addDatTotalesTipoCuenta(DatTotalesTipoCuenta datTotalesTipoCuenta) {
        getDatTotalesTipoCuentas().add(datTotalesTipoCuenta);
        datTotalesTipoCuenta.setDatInforme(this);

        return datTotalesTipoCuenta;
    }

    public DatTotalesTipoCuenta removeDatTotalesTipoCuenta(DatTotalesTipoCuenta datTotalesTipoCuenta) {
        getDatTotalesTipoCuentas().remove(datTotalesTipoCuenta);
        datTotalesTipoCuenta.setDatInforme(null);

        return datTotalesTipoCuenta;
    }

    @XmlTransient
    public List<DatTotalesTotal> getDatTotalesTotals() {
        return this.datTotalesTotals;
    }

    public void setDatTotalesTotals(List<DatTotalesTotal> datTotalesTotals) {
        this.datTotalesTotals = datTotalesTotals;
    }

    public DatTotalesTotal addDatTotalesTotal(DatTotalesTotal datTotalesTotal) {
        getDatTotalesTotals().add(datTotalesTotal);
        datTotalesTotal.setDatInforme(this);

        return datTotalesTotal;
    }

    public DatTotalesTotal removeDatTotalesTotal(DatTotalesTotal datTotalesTotal) {
        getDatTotalesTotals().remove(datTotalesTotal);
        datTotalesTotal.setDatInforme(null);

        return datTotalesTotal;
    }

    @XmlTransient
    public List<DatTrimestreCheque> getDatTrimestreCheques() {
        return this.datTrimestreCheques;
    }

    public void setDatTrimestreCheques(List<DatTrimestreCheque> datTrimestreCheques) {
        this.datTrimestreCheques = datTrimestreCheques;
    }

    public DatTrimestreCheque addDatTrimestreCheque(DatTrimestreCheque datTrimestreCheque) {
        getDatTrimestreCheques().add(datTrimestreCheque);
        datTrimestreCheque.setDatInforme(this);

        return datTrimestreCheque;
    }

    public DatTrimestreCheque removeDatTrimestreCheque(DatTrimestreCheque datTrimestreCheque) {
        getDatTrimestreCheques().remove(datTrimestreCheque);
        datTrimestreCheque.setDatInforme(null);

        return datTrimestreCheque;
    }

    @XmlTransient
    public List<DatTrimestreDeuda> getDatTrimestreDeudas() {
        return this.datTrimestreDeudas;
    }

    public void setDatTrimestreDeudas(List<DatTrimestreDeuda> datTrimestreDeudas) {
        this.datTrimestreDeudas = datTrimestreDeudas;
    }

    public DatTrimestreDeuda addDatTrimestreDeuda(DatTrimestreDeuda datTrimestreDeuda) {
        getDatTrimestreDeudas().add(datTrimestreDeuda);
        datTrimestreDeuda.setDatInforme(this);

        return datTrimestreDeuda;
    }

    public DatTrimestreDeuda removeDatTrimestreDeuda(DatTrimestreDeuda datTrimestreDeuda) {
        getDatTrimestreDeudas().remove(datTrimestreDeuda);
        datTrimestreDeuda.setDatInforme(null);

        return datTrimestreDeuda;
    }

    @XmlTransient
    public List<DatTrimestreDeudaMicro> getDatTrimestreDeudaMicros() {
        return this.datTrimestreDeudaMicros;
    }

    public void setDatTrimestreDeudaMicros(List<DatTrimestreDeudaMicro> datTrimestreDeudaMicros) {
        this.datTrimestreDeudaMicros = datTrimestreDeudaMicros;
    }

    public DatTrimestreDeudaMicro addDatTrimestreDeudaMicro(DatTrimestreDeudaMicro datTrimestreDeudaMicro) {
        getDatTrimestreDeudaMicros().add(datTrimestreDeudaMicro);
        datTrimestreDeudaMicro.setDatInforme(this);

        return datTrimestreDeudaMicro;
    }

    public DatTrimestreDeudaMicro removeDatTrimestreDeudaMicro(DatTrimestreDeudaMicro datTrimestreDeudaMicro) {
        getDatTrimestreDeudaMicros().remove(datTrimestreDeudaMicro);
        datTrimestreDeudaMicro.setDatInforme(null);

        return datTrimestreDeudaMicro;
    }

    @XmlTransient
    public List<DatTrimestreDeuMicrocred> getDatTrimestreDeuMicrocreds() {
        return this.datTrimestreDeuMicrocreds;
    }

    public void setDatTrimestreDeuMicrocreds(List<DatTrimestreDeuMicrocred> datTrimestreDeuMicrocreds) {
        this.datTrimestreDeuMicrocreds = datTrimestreDeuMicrocreds;
    }

    public DatTrimestreDeuMicrocred addDatTrimestreDeuMicrocred(DatTrimestreDeuMicrocred datTrimestreDeuMicrocred) {
        getDatTrimestreDeuMicrocreds().add(datTrimestreDeuMicrocred);
        datTrimestreDeuMicrocred.setDatInforme(this);

        return datTrimestreDeuMicrocred;
    }

    public DatTrimestreDeuMicrocred removeDatTrimestreDeuMicrocred(DatTrimestreDeuMicrocred datTrimestreDeuMicrocred) {
        getDatTrimestreDeuMicrocreds().remove(datTrimestreDeuMicrocred);
        datTrimestreDeuMicrocred.setDatInforme(null);

        return datTrimestreDeuMicrocred;
    }

    @XmlTransient
    public List<DatTrimestreHistorico> getDatTrimestreHistoricos() {
        return this.datTrimestreHistoricos;
    }

    public void setDatTrimestreHistoricos(List<DatTrimestreHistorico> datTrimestreHistoricos) {
        this.datTrimestreHistoricos = datTrimestreHistoricos;
    }

    public DatTrimestreHistorico addDatTrimestreHistorico(DatTrimestreHistorico datTrimestreHistorico) {
        getDatTrimestreHistoricos().add(datTrimestreHistorico);
        datTrimestreHistorico.setDatInforme(this);

        return datTrimestreHistorico;
    }

    public DatTrimestreHistorico removeDatTrimestreHistorico(DatTrimestreHistorico datTrimestreHistorico) {
        getDatTrimestreHistoricos().remove(datTrimestreHistorico);
        datTrimestreHistorico.setDatInforme(null);

        return datTrimestreHistorico;
    }

    @XmlTransient
    public List<DatTrimestreResEndeuda> getDatTrimestreResEndeudas() {
        return this.datTrimestreResEndeudas;
    }

    public void setDatTrimestreResEndeudas(List<DatTrimestreResEndeuda> datTrimestreResEndeudas) {
        this.datTrimestreResEndeudas = datTrimestreResEndeudas;
    }

    public DatTrimestreResEndeuda addDatTrimestreResEndeuda(DatTrimestreResEndeuda datTrimestreResEndeuda) {
        getDatTrimestreResEndeudas().add(datTrimestreResEndeuda);
        datTrimestreResEndeuda.setDatInforme(this);

        return datTrimestreResEndeuda;
    }

    public DatTrimestreResEndeuda removeDatTrimestreResEndeuda(DatTrimestreResEndeuda datTrimestreResEndeuda) {
        getDatTrimestreResEndeudas().remove(datTrimestreResEndeuda);
        datTrimestreResEndeuda.setDatInforme(null);

        return datTrimestreResEndeuda;
    }

    @XmlTransient
    public List<DatUsuario> getDatUsuarios() {
        return this.datUsuarios;
    }

    public void setDatUsuarios(List<DatUsuario> datUsuarios) {
        this.datUsuarios = datUsuarios;
    }

    public DatUsuario addDatUsuario(DatUsuario datUsuario) {
        getDatUsuarios().add(datUsuario);
        datUsuario.setDatInforme(this);

        return datUsuario;
    }

    public DatUsuario removeDatUsuario(DatUsuario datUsuario) {
        getDatUsuarios().remove(datUsuario);
        datUsuario.setDatInforme(null);

        return datUsuario;
    }

    @XmlTransient
    public List<DatValor> getDatValors() {
        return this.datValors;
    }

    public void setDatValors(List<DatValor> datValors) {
        this.datValors = datValors;
    }

    public DatValor addDatValor(DatValor datValor) {
        getDatValors().add(datValor);
        datValor.setDatInforme(this);

        return datValor;
    }

    public DatValor removeDatValor(DatValor datValor) {
        getDatValors().remove(datValor);
        datValor.setDatInforme(null);

        return datValor;
    }

}
