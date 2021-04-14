package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * The persistent class for the DAT_NATURALES database table.
 *
 */
@Entity
@Table(name = "DAT_NATURALES")
@NamedQuery(name = "DatNaturale.findAll", query = "SELECT d FROM DatNaturale d")
@XmlRootElement
public class DatNaturale implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_NATURALES_ID_GENERATOR", sequenceName = "SQ_DAT_NATURALES")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_NATURALES_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    @Column(name = "EDAD_MAX")
    private BigDecimal edadMax;

    @Column(name = "EDAD_MIN")
    private BigDecimal edadMin;

    @Column(name = "ESTADO_CIVIL")
    private String estadoCivil;

    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_NACIMIENTO")
    private Date fechaNacimiento;

    private String genero;

    @Column(name = "IDEN_NAL_CIUDAD")
    private String idenNalCiudad;

    @Column(name = "IDEN_NAL_DEPARTAMENTO")
    private String idenNalDepartamento;

    @Column(name = "IDEN_NAL_ESTADO")
    private String idenNalEstado;

    @Column(name = "IDEN_NAL_ESTADO_CIVIL")
    private String idenNalEstadoCivil;

    @Temporal(TemporalType.DATE)
    @Column(name = "IDEN_NAL_FECHA_EXPEDICION")
    private Date idenNalFechaExpedicion;

    @Column(name = "IDEN_NAL_GENERO")
    private String idenNalGenero;

    @Column(name = "IDEN_NAL_NUMERO")
    private String idenNalNumero;

    private String llave;

    private String nacionalidad;

    @Column(name = "NOMBRE_COMPLETO")
    private String nombreCompleto;

    private String nombres;

    private String numero;

    @Column(name = "PRIMER_APELLIDO")
    private String primerApellido;

    private String rut;

    @Column(name = "SEGUNDO_APELLIDO")
    private String segundoApellido;

    @Column(name = "TIPO_NACIONAL_INTER")
    private String tipoNacionalInter;

    @Column(name = "UBICACION_ANTIGUEDAD")
    private BigDecimal ubicacionAntiguedad;

    @Column(name = "UBICACION_TIPO")
    private String ubicacionTipo;

    private String validada;

    //bi-directional many-to-one association to DatActividadEconomica
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datNaturale")
    private List<DatActividadEconomica> datActividadEconomicas;

    //bi-directional many-to-one association to DatEmpleador
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datNaturale")
    private List<DatEmpleador> datEmpleadors;

    //bi-directional many-to-one association to DatEstadoCivil
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datNaturale")
    private List<DatEstadoCivil> datEstadoCivils;

    //bi-directional many-to-one association to DatEstadoFinanciero
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datNaturale")
    private List<DatEstadoFinanciero> datEstadoFinancieros;

    //bi-directional many-to-one association to DatFuerzaMayor
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datNaturale")
    private List<DatFuerzaMayor> datFuerzaMayors;

    //bi-directional many-to-one association to DatIdentificacion
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datNaturale")
    private List<DatIdentificacion> datIdentificacions;

    //bi-directional many-to-one association to DatLocalizacion
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datNaturale")
    private List<DatLocalizacion> datLocalizacions;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatNivelEstudio
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datNaturale")
    private List<DatNivelEstudio> datNivelEstudios;

    //bi-directional many-to-one association to DatOperInternacionale
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datNaturale")
    private List<DatOperInternacionale> datOperInternacionales;

    //bi-directional many-to-one association to DatPersonasACargo
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datNaturale")
    private List<DatPersonasACargo> datPersonasACargos;

    public DatNaturale() {
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

    public BigDecimal getEdadMax() {
        return this.edadMax;
    }

    public void setEdadMax(BigDecimal edadMax) {
        this.edadMax = edadMax;
    }

    public BigDecimal getEdadMin() {
        return this.edadMin;
    }

    public void setEdadMin(BigDecimal edadMin) {
        this.edadMin = edadMin;
    }

    public String getEstadoCivil() {
        return this.estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdenNalCiudad() {
        return this.idenNalCiudad;
    }

    public void setIdenNalCiudad(String idenNalCiudad) {
        this.idenNalCiudad = idenNalCiudad;
    }

    public String getIdenNalDepartamento() {
        return this.idenNalDepartamento;
    }

    public void setIdenNalDepartamento(String idenNalDepartamento) {
        this.idenNalDepartamento = idenNalDepartamento;
    }

    public String getIdenNalEstado() {
        return this.idenNalEstado;
    }

    public void setIdenNalEstado(String idenNalEstado) {
        this.idenNalEstado = idenNalEstado;
    }

    public String getIdenNalEstadoCivil() {
        return this.idenNalEstadoCivil;
    }

    public void setIdenNalEstadoCivil(String idenNalEstadoCivil) {
        this.idenNalEstadoCivil = idenNalEstadoCivil;
    }

    public Date getIdenNalFechaExpedicion() {
        return this.idenNalFechaExpedicion;
    }

    public void setIdenNalFechaExpedicion(Date idenNalFechaExpedicion) {
        this.idenNalFechaExpedicion = idenNalFechaExpedicion;
    }

    public String getIdenNalGenero() {
        return this.idenNalGenero;
    }

    public void setIdenNalGenero(String idenNalGenero) {
        this.idenNalGenero = idenNalGenero;
    }

    public String getIdenNalNumero() {
        return this.idenNalNumero;
    }

    public void setIdenNalNumero(String idenNalNumero) {
        this.idenNalNumero = idenNalNumero;
    }

    public String getLlave() {
        return this.llave;
    }

    public void setLlave(String llave) {
        this.llave = llave;
    }

    public String getNacionalidad() {
        return this.nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNombreCompleto() {
        return this.nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombres() {
        return this.nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPrimerApellido() {
        return this.primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getRut() {
        return this.rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getSegundoApellido() {
        return this.segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getTipoNacionalInter() {
        return this.tipoNacionalInter;
    }

    public void setTipoNacionalInter(String tipoNacionalInter) {
        this.tipoNacionalInter = tipoNacionalInter;
    }

    public BigDecimal getUbicacionAntiguedad() {
        return this.ubicacionAntiguedad;
    }

    public void setUbicacionAntiguedad(BigDecimal ubicacionAntiguedad) {
        this.ubicacionAntiguedad = ubicacionAntiguedad;
    }

    public String getUbicacionTipo() {
        return this.ubicacionTipo;
    }

    public void setUbicacionTipo(String ubicacionTipo) {
        this.ubicacionTipo = ubicacionTipo;
    }

    public String getValidada() {
        return this.validada;
    }

    public void setValidada(String validada) {
        this.validada = validada;
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
        datActividadEconomica.setDatNaturale(this);

        return datActividadEconomica;
    }

    public DatActividadEconomica removeDatActividadEconomica(DatActividadEconomica datActividadEconomica) {
        getDatActividadEconomicas().remove(datActividadEconomica);
        datActividadEconomica.setDatNaturale(null);

        return datActividadEconomica;
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
        datEmpleador.setDatNaturale(this);

        return datEmpleador;
    }

    public DatEmpleador removeDatEmpleador(DatEmpleador datEmpleador) {
        getDatEmpleadors().remove(datEmpleador);
        datEmpleador.setDatNaturale(null);

        return datEmpleador;
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
        datEstadoCivil.setDatNaturale(this);

        return datEstadoCivil;
    }

    public DatEstadoCivil removeDatEstadoCivil(DatEstadoCivil datEstadoCivil) {
        getDatEstadoCivils().remove(datEstadoCivil);
        datEstadoCivil.setDatNaturale(null);

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
        datEstadoFinanciero.setDatNaturale(this);

        return datEstadoFinanciero;
    }

    public DatEstadoFinanciero removeDatEstadoFinanciero(DatEstadoFinanciero datEstadoFinanciero) {
        getDatEstadoFinancieros().remove(datEstadoFinanciero);
        datEstadoFinanciero.setDatNaturale(null);

        return datEstadoFinanciero;
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
        datFuerzaMayor.setDatNaturale(this);

        return datFuerzaMayor;
    }

    public DatFuerzaMayor removeDatFuerzaMayor(DatFuerzaMayor datFuerzaMayor) {
        getDatFuerzaMayors().remove(datFuerzaMayor);
        datFuerzaMayor.setDatNaturale(null);

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
        datIdentificacion.setDatNaturale(this);

        return datIdentificacion;
    }

    public DatIdentificacion removeDatIdentificacion(DatIdentificacion datIdentificacion) {
        getDatIdentificacions().remove(datIdentificacion);
        datIdentificacion.setDatNaturale(null);

        return datIdentificacion;
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
        datLocalizacion.setDatNaturale(this);

        return datLocalizacion;
    }

    public DatLocalizacion removeDatLocalizacion(DatLocalizacion datLocalizacion) {
        getDatLocalizacions().remove(datLocalizacion);
        datLocalizacion.setDatNaturale(null);

        return datLocalizacion;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
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
        datNivelEstudio.setDatNaturale(this);

        return datNivelEstudio;
    }

    public DatNivelEstudio removeDatNivelEstudio(DatNivelEstudio datNivelEstudio) {
        getDatNivelEstudios().remove(datNivelEstudio);
        datNivelEstudio.setDatNaturale(null);

        return datNivelEstudio;
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
        datOperInternacionale.setDatNaturale(this);

        return datOperInternacionale;
    }

    public DatOperInternacionale removeDatOperInternacionale(DatOperInternacionale datOperInternacionale) {
        getDatOperInternacionales().remove(datOperInternacionale);
        datOperInternacionale.setDatNaturale(null);

        return datOperInternacionale;
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
        datPersonasACargo.setDatNaturale(this);

        return datPersonasACargo;
    }

    public DatPersonasACargo removeDatPersonasACargo(DatPersonasACargo datPersonasACargo) {
        getDatPersonasACargos().remove(datPersonasACargo);
        datPersonasACargo.setDatNaturale(null);

        return datPersonasACargo;
    }

}
