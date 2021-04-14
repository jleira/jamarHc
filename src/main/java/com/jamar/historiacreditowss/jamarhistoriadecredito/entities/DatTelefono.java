package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * The persistent class for the DAT_TELEFONO database table.
 * 
 */
@Entity
@Table(name="DAT_TELEFONO")
@NamedQuery(name="DatTelefono.findAll", query="SELECT d FROM DatTelefono d")
@XmlRootElement
public class DatTelefono implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator( allocationSize=1,name="DAT_TELEFONO_ID_GENERATOR", sequenceName="SQ_DAT_TELEFONO")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DAT_TELEFONO_ID_GENERATOR")
	private long id;

	private BigDecimal actualizacion;

	@Column(name="C_EMP")
	private String cEmp;

	private BigDecimal creacion;

	@Column(name="DATO_CODIGO_AREA")
	private BigDecimal datoCodigoArea;

	@Column(name="DATO_CODIGO_PAIS")
	private BigDecimal datoCodigoPais;

	@Column(name="DATO_NOMBRE_CIUDAD")
	private String datoNombreCiudad;

	@Column(name="DATO_NOMBRE_DEPARTAMENTO")
	private String datoNombreDepartamento;

	@Column(name="DATO_NUMERO")
	private BigDecimal datoNumero;

	@Column(name="ENT_LOC_COD_SUBSCRIPTOR")
	private String entLocCodSubscriptor;

	@Column(name="ENT_LOC_CONTRATO")
	private BigDecimal entLocContrato;

	@Column(name="ENT_LOC_NIT")
	private String entLocNit;

	@Column(name="ENT_LOC_NOMBRE_NIT")
	private String entLocNombreNit;

	@Column(name="ENT_LOC_NOMBRE_SUBS")
	private String entLocNombreSubs;

	private String fuente;

	private String llave;

	@Column(name="NUM_REPORTES")
	private BigDecimal numReportes;

	@Column(name="NUMERO_ENTIDADES")
	private String numeroEntidades;

	private String tipo;

	@Column(name="TIPO_LABORAL_O_COMERCIAL")
	private String tipoLaboralOComercial;

	@Column(name="TIPO_RESIDENCIA")
	private String tipoResidencia;

	@Column(name="ULTIMA_CONFIRMACION")
	private String ultimaConfirmacion;

	//bi-directional many-to-one association to DatInforme
	@ManyToOne
	@JoinColumn(name="ID_INFORME")
	private DatInforme datInforme;

	//bi-directional many-to-one association to DatLocalizacion
	@ManyToOne
	@JoinColumn(name="ID_LOCALIZACION")
	private DatLocalizacion datLocalizacion;

	public DatTelefono() {
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

	public BigDecimal getDatoCodigoArea() {
		return this.datoCodigoArea;
	}

	public void setDatoCodigoArea(BigDecimal datoCodigoArea) {
		this.datoCodigoArea = datoCodigoArea;
	}

	public BigDecimal getDatoCodigoPais() {
		return this.datoCodigoPais;
	}

	public void setDatoCodigoPais(BigDecimal datoCodigoPais) {
		this.datoCodigoPais = datoCodigoPais;
	}

	public String getDatoNombreCiudad() {
		return this.datoNombreCiudad;
	}

	public void setDatoNombreCiudad(String datoNombreCiudad) {
		this.datoNombreCiudad = datoNombreCiudad;
	}

	public String getDatoNombreDepartamento() {
		return this.datoNombreDepartamento;
	}

	public void setDatoNombreDepartamento(String datoNombreDepartamento) {
		this.datoNombreDepartamento = datoNombreDepartamento;
	}

	public BigDecimal getDatoNumero() {
		return this.datoNumero;
	}

	public void setDatoNumero(BigDecimal datoNumero) {
		this.datoNumero = datoNumero;
	}

	public String getEntLocCodSubscriptor() {
		return this.entLocCodSubscriptor;
	}

	public void setEntLocCodSubscriptor(String entLocCodSubscriptor) {
		this.entLocCodSubscriptor = entLocCodSubscriptor;
	}

	public BigDecimal getEntLocContrato() {
		return this.entLocContrato;
	}

	public void setEntLocContrato(BigDecimal entLocContrato) {
		this.entLocContrato = entLocContrato;
	}

	public String getEntLocNit() {
		return this.entLocNit;
	}

	public void setEntLocNit(String entLocNit) {
		this.entLocNit = entLocNit;
	}

	public String getEntLocNombreNit() {
		return this.entLocNombreNit;
	}

	public void setEntLocNombreNit(String entLocNombreNit) {
		this.entLocNombreNit = entLocNombreNit;
	}

	public String getEntLocNombreSubs() {
		return this.entLocNombreSubs;
	}

	public void setEntLocNombreSubs(String entLocNombreSubs) {
		this.entLocNombreSubs = entLocNombreSubs;
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

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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

}