/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jamar.historiacreditowss.jamarhistoriadecredito.business;

import com.jamar.historiacreditowss.jamarhistoriadecredito.entities.*;
import com.jamar.historiacreditowss.jamarhistoriadecredito.generics.*;
import com.jamar.historiacreditowss.jamarhistoriadecredito.util.AdapterUtil;
import com.jamar.historiacreditowss.jamarhistoriadecredito.util.Constants;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import com.sun.org.apache.xerces.internal.dom.ElementNSImpl;

//com.sun.org.apache.xerces.internal.dom.ElementNSImpl cannot be cast to org.apache.xerces.dom.ElementNSImpl

/**
 *
 * @author Ruthford Jay Archbold
 * @since 2020-10-19
 * @version 3.0
 */
public class HistoriaCreditoWrapper {

	public DatActividadEconomica getActividadEconomicaFromActividadEconomicaResponse(
			InfoDemograficaType.ActividadEconomica actividadEconomicaType, DatNaturale naturale, DatInforme informe) {
		DatActividadEconomica actividadEconomica = new DatActividadEconomica();
		actividadEconomica.setCEmp(informe.getCEmp());
		actividadEconomica.setDatNaturale(naturale);
		actividadEconomica.setDatInforme(informe);
		actividadEconomica.setCiiu(actividadEconomicaType.getCIIU());
		actividadEconomica.setEstado(actividadEconomicaType.getEstado());
		if (actividadEconomicaType.getEstrato() != null) {
			actividadEconomica.setEstrato(new BigDecimal(actividadEconomicaType.getEstrato()));
		}
		actividadEconomica.setFecha(AdapterUtil.toDate(actividadEconomicaType.getFecha()));
		actividadEconomica.setIdRegistro(actividadEconomicaType.getIdRegistro());
		actividadEconomica.setNitReporta(actividadEconomicaType.getNitReporta());
		actividadEconomica.setRazonSocial(actividadEconomicaType.getRazonSocial());
		actividadEconomica.setTipo(actividadEconomicaType.getTipo());
		return actividadEconomica;
	}

	public List<DatActividadEconomica> getActividadEconomicaFromServiceResponse(
			List<InfoDemograficaType.ActividadEconomica> actividadesEconomicasType, DatNaturale naturale,
			DatInforme informe) {
		List<DatActividadEconomica> actividadesEconomicas = new ArrayList<DatActividadEconomica>();
		for (InfoDemograficaType.ActividadEconomica actividadEconomicaType : actividadesEconomicasType) {
			actividadesEconomicas.add(
					getActividadEconomicaFromActividadEconomicaResponse(actividadEconomicaType, naturale, informe));
		}
		return actividadesEconomicas;
	}

	public DatAdjetivo getAdjetivoFromConsultaResponse(AdjetivoType adjetivoType, DatObligacionesCliente obligacion,
			DatInforme informe) {
		DatAdjetivo adjetivo = new DatAdjetivo();
		adjetivo.setCEmp(informe.getCEmp());
		adjetivo.setDatObligacionesCliente(obligacion);
		adjetivo.setCodigo(adjetivoType.getCodigo());
		adjetivo.setFecha(AdapterUtil.toDate(adjetivoType.getFecha()));
		adjetivo.setDatInforme(informe);
		return adjetivo;
	}

	public List<DatAdjetivo> getAdjetivosFromServiceResponse(List<AdjetivoType> adjetivosType,
			DatObligacionesCliente obligacion, DatInforme informe) {
		List<DatAdjetivo> adjetivos = new ArrayList<DatAdjetivo>();
		for (AdjetivoType adjetivoType : adjetivosType) {
			adjetivos.add(getAdjetivoFromConsultaResponse(adjetivoType, obligacion, informe));
		}
		return adjetivos;
	}

	public DatAdjetivo getAdjetivoFromConsultaResponse(AdjetivoType adjetivoType, DatCuentasCliente obligacion,
			DatInforme informe) {
		DatAdjetivo adjetivo = new DatAdjetivo();
		adjetivo.setCEmp(informe.getCEmp());
		adjetivo.setDatCuentasCliente(obligacion);
		adjetivo.setDatInforme(informe);
		adjetivo.setCodigo(adjetivoType.getCodigo());
		adjetivo.setFecha(AdapterUtil.toDate(adjetivoType.getFecha()));
		return adjetivo;
	}

	public List<DatAdjetivo> getAdjetivosFromServiceResponse(List<AdjetivoType> adjetivosType,
			DatCuentasCliente obligacion, DatInforme informe) {
		List<DatAdjetivo> adjetivos = new ArrayList<DatAdjetivo>();
		for (AdjetivoType adjetivoType : adjetivosType) {
			adjetivos.add(getAdjetivoFromConsultaResponse(adjetivoType, obligacion, informe));
		}
		return adjetivos;
	}

	public DatAlerta getAlertaFromAlertaResponse(AlertaType alertaType, DatInforme informe) {
		DatAlerta alerta = new DatAlerta();
		alerta.setCEmp(informe.getCEmp());
		alerta.setDatInforme(informe);
		alerta.setCodigo(alertaType.getCodigo());
		alerta.setColocacion(AdapterUtil.toDate(alertaType.getColocacion()));
		alerta.setLlave(alertaType.getLlave());
		alerta.setModificacion(AdapterUtil.toDate(alertaType.getModificacion()));
		if (alertaType.getTexto() != null) {
			alerta.setTexto(alertaType.getTexto().toUpperCase());
		}
		alerta.setVencimiento(AdapterUtil.toDate(alertaType.getVencimiento()));
		if (alertaType.getFuente() != null) {
			alerta.setFuenteCodigo(alertaType.getFuente().getCodigo());
			if (alertaType.getFuente().getNombre() != null) {
				alerta.setFuenteNombre(alertaType.getFuente().getNombre().toUpperCase());
			}
		}
		return alerta;
	}

	public List<DatAlerta> getAlertasFromServiceResponse(List<AlertaType> alertasType, DatInforme informe) {
		List<DatAlerta> alertas = new ArrayList<DatAlerta>();
		for (AlertaType alertaType : alertasType) {
			alertas.add(getAlertaFromAlertaResponse(alertaType, informe));
		}
		return alertas;
	}

	public DatCaracterFecha getCaracterFechaFromResponse(
			SectorAnalisisVectoresType.Cuenta.CaracterFecha caracterFechaType,
			DatCuentaAnalisisVectore cuentaAnalisisVectore, DatInforme informe) {
		DatCaracterFecha caracterFecha = new DatCaracterFecha();
		caracterFecha.setCEmp(informe.getCEmp());
		caracterFecha.setDatCuentaAnalisisVectore(cuentaAnalisisVectore);
		caracterFecha.setDatInforme(informe);
		caracterFecha.setFecha(AdapterUtil.toDate(caracterFechaType.getFecha()));
		if (caracterFechaType.getSaldoDeudaTotalMora() != null) {
			caracterFecha.setSaldoDeudaTotalMora(caracterFechaType.getSaldoDeudaTotalMora());
		} else {
			caracterFecha.setSaldoDeudaTotalMora("");
		}
		return caracterFecha;
	}

	public List<DatCaracterFecha> getCaracterFechaFromServiceResponse(
			List<SectorAnalisisVectoresType.Cuenta.CaracterFecha> caracteresFechasType,
			DatCuentaAnalisisVectore cuentaAnalisisVectore, DatInforme informe) {
		List<DatCaracterFecha> caracteresFechas = new ArrayList<DatCaracterFecha>();
		for (SectorAnalisisVectoresType.Cuenta.CaracterFecha caracterFechatType : caracteresFechasType) {
			caracteresFechas.add(getCaracterFechaFromResponse(caracterFechatType, cuentaAnalisisVectore, informe));
		}
		return caracteresFechas;
	}

	public DatCaracterFecha getCaracterFechaFromResponse(
			SectorAnalisisVectoresType.MorasMaximas.CaracterFecha caracterFechaType, DatMorasMaxima morasMaxima,
			DatInforme informe) {
		DatCaracterFecha caracterFecha = new DatCaracterFecha();
		caracterFecha.setCEmp(informe.getCEmp());
		caracterFecha.setDatMorasMaxima(morasMaxima);
		caracterFecha.setDatInforme(informe);
		caracterFecha.setFecha(AdapterUtil.toDate(caracterFechaType.getFecha()));
		caracterFecha.setSaldoDeudaTotalMora(caracterFechaType.getSaldoDeudaTotalMora());
		return caracterFecha;
	}

	public List<DatCaracterFecha> getCaracterFechaFromServiceResponse(
			List<SectorAnalisisVectoresType.MorasMaximas.CaracterFecha> caracteresFechasType,
			DatMorasMaxima morasMaxima, DatInforme informe) {
		List<DatCaracterFecha> caracteresFechas = new ArrayList<DatCaracterFecha>();
		for (SectorAnalisisVectoresType.MorasMaximas.CaracterFecha caracterFechatType : caracteresFechasType) {
			caracteresFechas.add(getCaracterFechaFromResponse(caracterFechatType, morasMaxima, informe));
		}
		return caracteresFechas;
	}

	public DatCartera getCarteraFromResponse(ResumenEndeudamientoType.Trimestre.Sector.Cartera carteraType,
			DatCarteraSecResEnd sectorResEndeudamiento, DatInforme informe) {
		DatCartera cartera = new DatCartera();
		cartera.setCEmp(informe.getCEmp());
		cartera.setNumeroCuentas(new BigDecimal(carteraType.getNumeroCuentas()));
		cartera.setDatCarteraSecResEnd(sectorResEndeudamiento);
		cartera.setDatInforme(informe);
		if (carteraType.getTipo() != null) {
			cartera.setTipo(carteraType.getTipo().toUpperCase());
		}
		cartera.setValor(new BigDecimal(carteraType.getValor()));
		return cartera;
	}

	public List<DatCartera> getCarterasFromResponse(
			List<ResumenEndeudamientoType.Trimestre.Sector.Cartera> carterasType,
			DatCarteraSecResEnd sectorResEndeudamiento, DatInforme informe) {
		List<DatCartera> carteras = new ArrayList<DatCartera>();
		for (ResumenEndeudamientoType.Trimestre.Sector.Cartera carteraType : carterasType) {
			carteras.add(getCarteraFromResponse(carteraType, sectorResEndeudamiento, informe));
		}
		return carteras;
	}

	public DatCelular getCelularFromResponse(LocalizacionType.Celular celularType, DatLocalizacion localizacion,
			DatInforme informe) {
		DatCelular celular = new DatCelular();
		celular.setActualizacion(new BigDecimal(celularType.getActualizacion()));
		celular.setFuente(celularType.getFuente());
		celular.setLlave(celularType.getLlave());
		celular.setDatLocalizacion(localizacion);
		celular.setDatInforme(informe);
		celular.setNumeroEntidades(celularType.getNumeroEntidades());
		celular.setReportado(celularType.getReportado());
		celular.setTipo(celularType.getTipo());
		celular.setUltimaConfirmacion(celularType.getUltimaConfirmacion());
		celular.setCEmp(informe.getCEmp());
		if (celularType.getNumReportes() != null) {
			celular.setNumReportes(new BigDecimal(celularType.getNumReportes()));
		}
		if (celularType.getCreacion() != null) {
			celular.setCreacion(new BigDecimal(celularType.getCreacion()));
		}
		if (celularType.getDato() != null) {
			if (celularType.getDato().getCodigoArea() != null) {
				celular.setDatoCodigoArea(new BigDecimal(celularType.getDato().getCodigoArea()));
			}
			if (celularType.getDato().getCodigoPais() != null) {
				celular.setDatoCodigoPais(new BigDecimal(celularType.getDato().getCodigoPais()));
			}
			celular.setDatoNombreCiudad(celularType.getDato().getNombreCiudad());
			if (celularType.getDato().getNumero() != null) {
				celular.setDatoNumero(new BigDecimal(celularType.getDato().getNumero()));
			}
			celular.setDatoNombreCiudad(celularType.getDato().getNombreCiudad());
		}
		if (celularType.getEntidad() != null) {
			celular.setEntLocalCodigoSubs(celularType.getEntidad().getCodigoSuscriptor());
			if (celularType.getEntidad().getContrato() != null) {
				celular.setEntLocalContrato(new BigDecimal(celularType.getEntidad().getContrato()));
			}
			celular.setEntLocalNit(celularType.getEntidad().getNit());
			celular.setEntLocalNombreNit(celularType.getEntidad().getNombreNit());
			celular.setEntLocalNombreSubscriptor(celularType.getEntidad().getNombreSuscriptor());
		}
		return celular;
	}

	public List<DatCelular> getCelularsFromServiceResponse(List<LocalizacionType.Celular> celularesType,
			DatLocalizacion localizacion, DatInforme informe) {
		List<DatCelular> celulares = new ArrayList<DatCelular>();
		for (LocalizacionType.Celular celularType : celularesType) {
			celulares.add(getCelularFromResponse(celularType, localizacion, informe));
		}
		return celulares;
	}

	public DatComentario getComentarioFromComentarioResponse(ComentarioType comentarioType, DatInforme informe) {
		DatComentario comentario = new DatComentario();
		comentario.setDatInforme(informe);
		comentario.setCEmp(informe.getCEmp());
		comentario.setFechaVencimiento(AdapterUtil.toDate(comentarioType.getFechaVencimiento()));
		comentario.setTipo(comentarioType.getTipo());
		return comentario;
	}

	public List<DatComentario> getComentariosFromServiceResponse(List<ComentarioType> comentariosType,
			DatInforme informe) {
		List<DatComentario> comentarios = new ArrayList<DatComentario>();
		for (ComentarioType comentarioType : comentariosType) {
			comentarios.add(getComentarioFromComentarioResponse(comentarioType, informe));
		}
		return comentarios;
	}

	public DatCompEntComportamiento getComportamientoFromResponse(
			ComportamientoEntidadesType.ComportamientoEntidades.Comportamiento comportamientoType,
			DatComportamientoEntidade comportamientoEntidade, DatInforme informe) {
		DatCompEntComportamiento compEntComportamiento = new DatCompEntComportamiento();
		compEntComportamiento.setCEmp(informe.getCEmp());
		compEntComportamiento.setDatComportamientoEntidade(comportamientoEntidade);
		compEntComportamiento.setDatInforme(informe);
		compEntComportamiento.setMes(AdapterUtil.toDate(comportamientoType.getMes()));
		compEntComportamiento.setValor(comportamientoType.getValor());
		return compEntComportamiento;
	}

	public List<DatCompEntComportamiento> getActividadEconomicaFromServiceResponse(
			List<ComportamientoEntidadesType.ComportamientoEntidades.Comportamiento> comportamientosType,
			DatComportamientoEntidade comportamientoEntidade, DatInforme informe) {
		List<DatCompEntComportamiento> comportamientos = new ArrayList<DatCompEntComportamiento>();
		for (ComportamientoEntidadesType.ComportamientoEntidades.Comportamiento comportamientoType : comportamientosType) {
			comportamientos.add(getComportamientoFromResponse(comportamientoType, comportamientoEntidade, informe));
		}
		return comportamientos;
	}

	public DatComportamiento getComportamientoFromResponse(ResumenType.Comportamiento.Mes mesType,
			DatInfoAgregada infoAgregada, DatInforme informe) {
		DatComportamiento comportamiento = new DatComportamiento();
		comportamiento.setCantidad(new BigDecimal(mesType.getCantidad()));
		comportamiento.setCEmp(informe.getCEmp());
		comportamiento.setComportamiento(mesType.getComportamiento());
		comportamiento.setFecha(AdapterUtil.toDate(mesType.getFecha()));
		comportamiento.setDatInfoAgregada(infoAgregada);
		comportamiento.setDatInforme(informe);
		return comportamiento;
	}

	public List<DatComportamiento> getComportamientosFromResponseX(List<ResumenType.Comportamiento.Mes> mesesType,
			DatInfoAgregada infoAgregada, DatInforme informe) {
		List<DatComportamiento> comportamientos = new ArrayList<DatComportamiento>();
		for (ResumenType.Comportamiento.Mes mesType : mesesType) {
			comportamientos.add(getComportamientoFromResponse(mesType, infoAgregada, informe));
		}
		return comportamientos;
	}

	public DatComportamientoEntidade getComportamientoEntFromComentarioResponse(
			ComportamientoEntidadesType.ComportamientoEntidades comportamientoType,
			DatInfoAgregadaMicrocred infoAgregadaMicrocredito, DatInforme informe) {
		DatComportamientoEntidade comportamientoEntidade = new DatComportamientoEntidade();
		comportamientoEntidade.setCEmp(informe.getCEmp());
		comportamientoEntidade.setCodSector(new BigDecimal(comportamientoType.getCodSector()));
		comportamientoEntidade.setEntidad(comportamientoType.getEntidad().toUpperCase());
		if (comportamientoType.getEstado() != null) {
			comportamientoEntidade.setEstado(comportamientoType.getEstado().toUpperCase());
		}
		comportamientoEntidade.setFechaActualizacion(AdapterUtil.toDate(comportamientoType.getFechaActualizacion()));
		comportamientoEntidade.setDatInfoAgregadaMicrocred(infoAgregadaMicrocredito);
		comportamientoEntidade.setNumeroCuenta(comportamientoType.getNumeroCuenta());
		comportamientoEntidade.setTipoCuenta(comportamientoType.getTipoCuenta());
		comportamientoEntidade.setDatInforme(informe);
		if (comportamientoType.getComportamiento() != null && !comportamientoType.getComportamiento().isEmpty()) {
			comportamientoEntidade.setDatCompEntComportamientos(getActividadEconomicaFromServiceResponse(
					comportamientoType.getComportamiento(), comportamientoEntidade, informe));
		}
		return comportamientoEntidade;
	}

	public List<DatComportamientoEntidade> getComportamientosEntFromServiceResponse(
			List<ComportamientoEntidadesType.ComportamientoEntidades> comportamientosType,
			DatInfoAgregadaMicrocred infoAgregadaMicrocredito, DatInforme informe) {
		List<DatComportamientoEntidade> comportamientosEntidades = new ArrayList<DatComportamientoEntidade>();
		for (ComportamientoEntidadesType.ComportamientoEntidades comportamientoEntidade : comportamientosType) {
			comportamientosEntidades.add(getComportamientoEntFromComentarioResponse(comportamientoEntidade,
					infoAgregadaMicrocredito, informe));
		}
		return comportamientosEntidades;
	}

	public DatConsulta getConsultaFromConsultaResponse(ConsultaType consultaType, DatInforme informe) {
		DatConsulta consulta = new DatConsulta();
		consulta.setDatInforme(informe);
		consulta.setCantidad(new BigDecimal(consultaType.getCantidad()));
		consulta.setCEmp(informe.getCEmp());
		consulta.setCiudad(consultaType.getCiudad());
		consulta.setEntidad(consultaType.getEntidad());
		consulta.setFecha(AdapterUtil.toDate(consultaType.getFecha()));
		consulta.setLlave(consultaType.getLlave());
		consulta.setNitSuscriptor(consultaType.getNitSuscriptor());
		consulta.setOficina(consultaType.getOficina());
		consulta.setRazon(consultaType.getRazon());
		consulta.setSector(consultaType.getSector());
		consulta.setTipoCuenta(consultaType.getTipoCuenta());
		return consulta;
	}

	public List<DatConsulta> getConsultaFromServiceResponse(List<ConsultaType> consultasType, DatInforme informe) {
		List<DatConsulta> consultas = new ArrayList<DatConsulta>();
		for (ConsultaType consultaType : consultasType) {
			consultas.add(getConsultaFromConsultaResponse(consultaType, informe));
		}
		return consultas;
	}

	public DatCuentaUsuario getSectorEndeudamientoActualFromResponse(TipoCuentaType.Usuario.Cuenta tipoCuentaType,
			DatUsuario usuario, DatInforme informe) {
		DatCuentaUsuario cuenta = new DatCuentaUsuario();
		cuenta.setCalificacion(tipoCuentaType.getCalificacion());
		cuenta.setCEmp(informe.getCEmp());
		cuenta.setCuotaMes(new BigDecimal(tipoCuentaType.getCuotaMes()));
		if (tipoCuentaType.getEstadoActual() != null) {
			cuenta.setEstadoActual(tipoCuentaType.getEstadoActual().toUpperCase());
		}
		cuenta.setSaldoActual(new BigDecimal(tipoCuentaType.getSaldoActual()));
		cuenta.setSaldoMora(new BigDecimal(tipoCuentaType.getSaldoMora()));
		cuenta.setTotalDeudaCarteras(new BigDecimal(tipoCuentaType.getTotalDeudaCarteras()));
		cuenta.setDatUsuario(usuario);
		cuenta.setDatInforme(informe);
		cuenta.setValorInicial(new BigDecimal(tipoCuentaType.getValorInicial()));
		cuenta.setComportamientoNegativo(AdapterUtil.getCharFromBoolean(tipoCuentaType.isComportamientoNegativo()));
		return cuenta;
	}

	public List<DatCuentaUsuario> getSectoresEndeudamientoActualFromServiceResponse(
			List<TipoCuentaType.Usuario.Cuenta> tiposCuentasType, DatUsuario usuario, DatInforme informe) {
		List<DatCuentaUsuario> cuentas = new ArrayList<DatCuentaUsuario>();
		for (TipoCuentaType.Usuario.Cuenta cuentaType : tiposCuentasType) {
			cuentas.add(getSectorEndeudamientoActualFromResponse(cuentaType, usuario, informe));
		}
		return cuentas;
	}

	public DatCuentaAnalisisVectore getCuentaAnalisisVectoreFromResponse(SectorAnalisisVectoresType.Cuenta cuentaType,
			DatSectorAnalisisVectore sectorAnalisisVec, DatInforme informe) {
		DatCuentaAnalisisVectore cuenta = new DatCuentaAnalisisVectore();
		cuenta.setContieneDatos(AdapterUtil.getCharFromBoolean(cuentaType.isContieneDatos()));
		cuenta.setEntidad(cuentaType.getEntidad().toUpperCase());
		cuenta.setCEmp(informe.getCEmp());
		if (cuentaType.getEstado() != null) {
			cuenta.setEstado(cuentaType.getEstado().toUpperCase());
		}
		cuenta.setNumeroCuenta(cuentaType.getNumeroCuenta());
		cuenta.setDatSectorAnalisisVectore(sectorAnalisisVec);
		cuenta.setTipoCuenta(cuentaType.getTipoCuenta());
		cuenta.setDatInforme(informe);
		if (cuentaType.getCaracterFecha() != null && !cuentaType.getCaracterFecha().isEmpty()) {
			cuenta.setDatCaracterFechas(
					getCaracterFechaFromServiceResponse(cuentaType.getCaracterFecha(), cuenta, informe));
		}
		return cuenta;
	}

	public List<DatCuentaAnalisisVectore> getCuentaAnalisisVectoreFromServiceResponse(
			List<SectorAnalisisVectoresType.Cuenta> cuentasType, DatSectorAnalisisVectore sectorAnalisisVec,
			DatInforme informe) {
		List<DatCuentaAnalisisVectore> cuentaAnalisisVectores = new ArrayList<DatCuentaAnalisisVectore>();
		for (SectorAnalisisVectoresType.Cuenta cuentaType : cuentasType) {
			cuentaAnalisisVectores.add(getCuentaAnalisisVectoreFromResponse(cuentaType, sectorAnalisisVec, informe));
		}
		return cuentaAnalisisVectores;
	}

	public List<DatCuentasCliente> getCuentasFromResponse(InformeType informeType, DatInforme informe) {
		List<DatCuentasCliente> cuentas = new ArrayList<DatCuentasCliente>();
		List<DatCuentasCliente> cuentasAhorro = new ArrayList<DatCuentasCliente>();
		List<DatCuentasCliente> cuentasCorriente = new ArrayList<DatCuentasCliente>();
		if (informeType.getCuentaAhorro() != null && !informeType.getCuentaAhorro().isEmpty()) {
			cuentasAhorro = getCuentasAhorro(informeType.getCuentaAhorro(), informe);
		}
		if (informeType.getCuentaCorriente() != null && !informeType.getCuentaCorriente().isEmpty()) {
			cuentasCorriente = getCuentasCorrientes(informeType.getCuentaCorriente(), informe);
		}
		cuentas.addAll(cuentasAhorro);
		cuentas.addAll(cuentasCorriente);
		return cuentas;
	}

	public List<DatCuentasCliente> getCuentasAhorro(List<CuentaAhorroType> cuentasAhorroType, DatInforme informe) {
		List<DatCuentasCliente> cuentas = new ArrayList<DatCuentasCliente>();
		for (CuentaAhorroType cuentaAhorroType : cuentasAhorroType) {
			cuentas.add(getCuentaAhorro(cuentaAhorroType, informe));
		}
		return cuentas;
	}

	public List<DatCuentasCliente> getCuentasCorrientes(List<CuentaCorrienteType> cuentasCorrientesType,
			DatInforme informe) {
		List<DatCuentasCliente> cuentas = new ArrayList<DatCuentasCliente>();
		for (CuentaCorrienteType cuentaCorrienteType : cuentasCorrientesType) {
			cuentas.add(getCuentaCorriente(cuentaCorrienteType, informe));
		}
		return cuentas;
	}

	public DatCuentasCliente getCuentaAhorro(CuentaAhorroType cuentaAhorroType, DatInforme informe) {
		DatCuentasCliente cuenta = new DatCuentasCliente();
		cuenta.setDatInforme(informe);
		cuenta.setCalificacion(cuentaAhorroType.getCalificacion());
		if (cuentaAhorroType.getCaracteristicas() != null) {
			cuenta.setCaracteristicasClase(cuentaAhorroType.getCaracteristicas().getClase());
		}
		cuenta.setCEmp(informe.getCEmp());
		cuenta.setCalificacion(cuentaAhorroType.getCalificacion());
		cuenta.setOficina(cuentaAhorroType.getOficina());
		cuenta.setBloqueada(AdapterUtil.getCharFromBoolean(cuentaAhorroType.isBloqueada()));
		cuenta.setCiudad(cuentaAhorroType.getCiudad());
		cuenta.setCodigoDaneCiudad(cuentaAhorroType.getCodigoDaneCiudad());
		cuenta.setCodSuscriptor(cuentaAhorroType.getCodSuscriptor());
		cuenta.setEntidad(cuentaAhorroType.getEntidad());
		cuenta.setFechaApertura(AdapterUtil.toDate(cuentaAhorroType.getFechaApertura()));
		cuenta.setIdentificacion(cuentaAhorroType.getIdentificacion());
		cuenta.setIndependiente(cuentaAhorroType.getIndependiente());
		cuenta.setLlave(cuentaAhorroType.getLlave());
		cuenta.setTipoCuentaCliente("A");
		cuenta.setNumero(cuentaAhorroType.getNumero());
		cuenta.setSector(cuentaAhorroType.getSector());
		cuenta.setSituacionTitular(cuentaAhorroType.getSituacionTitular());
		cuenta.setTipoIdentificacion(cuentaAhorroType.getTipoIdentificacion());
		if (cuentaAhorroType.getValores() != null && cuentaAhorroType.getValores().getValor() != null) {
			cuenta.setValsMoneda(cuentaAhorroType.getValores().getValor().getMoneda());
			if (cuentaAhorroType.getValores().getValor().getCreditosEfectivo() != null) {
				cuenta.setValsCreditosEfectivo(
						new BigDecimal(cuentaAhorroType.getValores().getValor().getCreditosEfectivo()));
			}
			if (cuentaAhorroType.getValores().getValor().getDebitosEfectivo() != null) {
				cuenta.setValsDebitosEfectivo(
						new BigDecimal(cuentaAhorroType.getValores().getValor().getDebitosEfectivo()));
			}
			if (cuentaAhorroType.getValores().getValor().getCreditosTransferencia() != null) {
				cuenta.setValsCreditosTransferencia(
						new BigDecimal(cuentaAhorroType.getValores().getValor().getCreditosTransferencia()));
			}
			if (cuentaAhorroType.getValores().getValor().getDebitosTransferencia() != null) {
				cuenta.setValsDebitosTransferencia(
						new BigDecimal(cuentaAhorroType.getValores().getValor().getDebitosTransferencia()));
			}
			if (cuentaAhorroType.getValores().getValor().getFecha() != null) {
				cuenta.setValsFecha(AdapterUtil.toDate(cuentaAhorroType.getValores().getValor().getFecha()));
			}
			cuenta.setValoresCalificacion(cuentaAhorroType.getValores().getValor().getCalificacion());
		}
		if (cuentaAhorroType.getAdjetivo() != null && !cuentaAhorroType.getAdjetivo().isEmpty()) {
			cuenta.setDatAdjetivos(getAdjetivosFromServiceResponse(cuentaAhorroType.getAdjetivo(), cuenta, informe));
		}
		if (cuentaAhorroType.getEstado() != null) {
			cuenta.setEstadoFecha(AdapterUtil.toDate(cuentaAhorroType.getEstado().getFecha()));
			cuenta.setEstadoCodigo(cuentaAhorroType.getEstado().getCodigo());
		}
		if (cuentaAhorroType.getReclamo() != null) {
			List<DatReclamo> reclamos = new ArrayList<DatReclamo>();
			reclamos.add(getReclamoFromResponse(cuentaAhorroType.getReclamo(), null, cuenta, null));
			cuenta.setDatReclamos(reclamos);
		}
		return cuenta;
	}

	public DatCuentasCliente getCuentaCorriente(CuentaCorrienteType cuentaAhorroType, DatInforme informe) {
		DatCuentasCliente cuenta = new DatCuentasCliente();
		cuenta.setCalificacion(cuentaAhorroType.getCalificacion());
		cuenta.setDatInforme(informe);
		if (cuentaAhorroType.getCaracteristicas() != null) {
			cuenta.setCaracteristicasClase(cuentaAhorroType.getCaracteristicas().getClase());
		}
		if (cuentaAhorroType.getSobregiro() != null) {
			cuenta.setValsSobregiroDias(new BigDecimal(cuentaAhorroType.getSobregiro().getDias()));
			cuenta.setValsSobregiroFecha(AdapterUtil.toDate(cuentaAhorroType.getSobregiro().getFecha()));
			cuenta.setValsSobregiroValor(new BigDecimal(cuentaAhorroType.getSobregiro().getValor()));
		}
		cuenta.setCEmp(informe.getCEmp());
		cuenta.setCalificacion(cuentaAhorroType.getCalificacion());
		cuenta.setBloqueada(AdapterUtil.getCharFromBoolean(cuentaAhorroType.isBloqueada()));
		cuenta.setCiudad(cuentaAhorroType.getCiudad());
		cuenta.setCodigoDaneCiudad(cuentaAhorroType.getCodigoDaneCiudad());
		cuenta.setCodSuscriptor(cuentaAhorroType.getCodSuscriptor());
		cuenta.setEntidad(cuentaAhorroType.getEntidad());
		cuenta.setFechaApertura(AdapterUtil.toDate(cuentaAhorroType.getFechaApertura()));
		cuenta.setIdentificacion(cuentaAhorroType.getIdentificacion());
		cuenta.setIndependiente(cuentaAhorroType.getIndependiente());
		cuenta.setLlave(cuentaAhorroType.getLlave());
		cuenta.setNumero(cuentaAhorroType.getNumero());
		cuenta.setSector(cuentaAhorroType.getSector());
		cuenta.setOficina(cuentaAhorroType.getOficina());
		cuenta.setTipoCuentaCliente("C");
		cuenta.setSituacionTitular(cuentaAhorroType.getSituacionTitular());
		cuenta.setTipoIdentificacion(cuentaAhorroType.getTipoIdentificacion());
		if (cuentaAhorroType.getValores() != null && cuentaAhorroType.getValores().getValor() != null) {
			cuenta.setValsMoneda(cuentaAhorroType.getValores().getValor().getMoneda());
			if (cuentaAhorroType.getValores().getValor().getCreditosEfectivo() != null) {
				cuenta.setValsCreditosEfectivo(
						new BigDecimal(cuentaAhorroType.getValores().getValor().getCreditosEfectivo()));
			}
			if (cuentaAhorroType.getValores().getValor().getDebitosEfectivo() != null) {
				cuenta.setValsDebitosEfectivo(
						new BigDecimal(cuentaAhorroType.getValores().getValor().getDebitosEfectivo()));
			}
			if (cuentaAhorroType.getValores().getValor().getCreditosTransferencia() != null) {
				cuenta.setValsCreditosTransferencia(
						new BigDecimal(cuentaAhorroType.getValores().getValor().getCreditosTransferencia()));
			}
			if (cuentaAhorroType.getValores().getValor().getDebitosTransferencia() != null) {
				cuenta.setValsDebitosTransferencia(
						new BigDecimal(cuentaAhorroType.getValores().getValor().getDebitosTransferencia()));
			}
			if (cuentaAhorroType.getValores().getValor().getCantidadChequesDevueltos() != null) {
				cuenta.setValsCantidadChequeDevueltos(
						new BigDecimal(cuentaAhorroType.getValores().getValor().getCantidadChequesDevueltos()));
			}
			if (cuentaAhorroType.getValores().getValor().getCantidadChequesPagados() != null) {
				cuenta.setValsCantidadChequesPagados(
						new BigDecimal(cuentaAhorroType.getValores().getValor().getCantidadChequesPagados()));
			}
			if (cuentaAhorroType.getValores().getValor().getValorChequesDevueltos() != null) {
				cuenta.setValsValorChequesDevueltos(
						new BigDecimal(cuentaAhorroType.getValores().getValor().getValorChequesDevueltos()));
			}
			if (cuentaAhorroType.getValores().getValor().getValorChequesPagados() != null) {
				cuenta.setValsValorChequesPagados(
						new BigDecimal(cuentaAhorroType.getValores().getValor().getValorChequesPagados()));
			}
			if (cuentaAhorroType.getValores().getValor().getFecha() != null) {
				cuenta.setValsFecha(AdapterUtil.toDate(cuentaAhorroType.getValores().getValor().getFecha()));
			}
			cuenta.setValoresCalificacion(cuentaAhorroType.getValores().getValor().getCalificacion());
		}
		if (cuentaAhorroType.getAdjetivo() != null && !cuentaAhorroType.getAdjetivo().isEmpty()) {
			cuenta.setDatAdjetivos(getAdjetivosFromServiceResponse(cuentaAhorroType.getAdjetivo(), cuenta, informe));
		}
		if (cuentaAhorroType.getEstado() != null) {
			cuenta.setEstadoFecha(AdapterUtil.toDate(cuentaAhorroType.getEstado().getFecha()));
			cuenta.setEstadoCodigo(cuentaAhorroType.getEstado().getCodigo());
		}
		if (cuentaAhorroType.getReclamo() != null) {
			List<DatReclamo> reclamos = new ArrayList<DatReclamo>();
			reclamos.add(getReclamoFromResponse(cuentaAhorroType.getReclamo(), null, cuenta, null));
			cuenta.setDatReclamos(reclamos);
		}
		return cuenta;
	}

	public DatDireccione getDireccionFromResponse(LocalizacionType.Direccion direccionType,
			DatLocalizacion localizacion, DatInforme informe) {
		DatDireccione direccion = new DatDireccione();
		direccion.setActualizacion(new BigDecimal(direccionType.getActualizacion()));
		if (direccionType.getCreacion() != null) {
			direccion.setCreacion(new BigDecimal(direccionType.getCreacion()));
		}
		if (direccionType.getEntidad() != null) {
			direccion.setEntLocalCodigoSuscriptor(direccionType.getEntidad().getCodigoSuscriptor());
			if (direccionType.getEntidad().getContrato() != null) {
				direccion.setEntLocalContrato(new BigDecimal(direccionType.getEntidad().getContrato()));
			}
			direccion.setEntLocalNit(direccionType.getEntidad().getNit());
			direccion.setEntLocalNombreNit(direccionType.getEntidad().getNombreNit());
			direccion.setEntLocalNombreSuscriptor(direccionType.getEntidad().getNombreSuscriptor());
		}
		direccion.setEstrato(direccionType.getEstrato());
		direccion.setFuente(direccionType.getFuente());
		direccion.setLlave(direccionType.getLlave());
		direccion.setDatLocalizacion(localizacion);
		direccion.setDatInforme(informe);
		direccion.setCEmp(informe.getCEmp());
		direccion.setNumeroEntidades(direccionType.getNumeroEntidades());
		if (direccionType.getNumReportes() != null) {
			direccion.setNumReportes(new BigDecimal(direccionType.getNumReportes()));
		}
		direccion.setProbabilidadEntrega(direccionType.getProbabilidadEntrega());
		direccion.setTipo(direccionType.getTipo());
		direccion.setTipoCorrespondencia(direccionType.getTipoCorrespondencia());
		direccion.setTipoLaboralOComercial(direccionType.getTipoLaboralOComercial());
		direccion.setTipoResidencia(direccionType.getTipoResidencia());
		direccion.setUltimaConfirmacion(direccionType.getUltimaConfirmacion());
		direccion.setZona(direccionType.getZona());
		if (direccionType.getDato() != null && direccionType.getDato().getParteDireccion() != null) {
			direccion.setDatParteDireccions(getPartesDireccionesFromServiceResponse(
					direccionType.getDato().getParteDireccion(), direccion, informe));
		}
		return direccion;
	}

	public List<DatDireccione> getDireccionesFromServiceResponse(List<LocalizacionType.Direccion> direccionesType,
			DatLocalizacion localizacion, DatInforme informe) {
		List<DatDireccione> direcciones = new ArrayList<DatDireccione>();
		for (LocalizacionType.Direccion direccionType : direccionesType) {
			direcciones.add(getDireccionFromResponse(direccionType, localizacion, informe));
		}
		return direcciones;
	}

	public DatEmail getEmailFromResponse(LocalizacionType.Email emailType, DatLocalizacion localizacion,
			DatInforme informe) {
		DatEmail email = new DatEmail();
		email.setActualizacion(new BigDecimal(emailType.getActualizacion()));
		if (emailType.getCreacion() != null) {
			email.setCreacion(new BigDecimal(emailType.getCreacion()));
		}
		if (emailType.getEntidad() != null) {
			email.setEntLocalCodigoSubscriptor(emailType.getEntidad().getCodigoSuscriptor());
			if (emailType.getEntidad().getContrato() != null) {
				email.setEntLocalContrato(new BigDecimal(emailType.getEntidad().getContrato()));
			}
			email.setEntLocalNit(emailType.getEntidad().getNit());
			email.setEntLocalNombreNit(emailType.getEntidad().getNombreNit());
			email.setEntLocalNombreSuscriptor(emailType.getEntidad().getNombreSuscriptor());
		}
		email.setReportado(emailType.getReportado());
		email.setUltimaConfirmacion(emailType.getUltimaConfirmacion());
		email.setFuente(emailType.getFuente());
		email.setLlave(emailType.getLlave());
		email.setCEmp(informe.getCEmp());
		email.setDatLocalizacion(localizacion);
		email.setDatInforme(informe);
		email.setNumeroEntidades(emailType.getNumeroEntidades());
		if (emailType.getDato() != null) {
			email.setDatoEmail(emailType.getDato().getDireccion());
		}
		if (emailType.getNumReportes() != null) {
			email.setNumReportes(new BigDecimal(emailType.getNumReportes()));
		}
		return email;
	}

	public List<DatEmail> getEmailsFromServiceResponse(List<LocalizacionType.Email> emailsType,
			DatLocalizacion localizacion, DatInforme informe) {
		List<DatEmail> emails = new ArrayList<DatEmail>();
		for (LocalizacionType.Email emailType : emailsType) {
			emails.add(getEmailFromResponse(emailType, localizacion, informe));
		}
		return emails;
	}

	public DatEmpleador getAlertaFromAlertaResponse(InfoDemograficaType.Empleador empleadorType, DatNaturale naturale,
			DatInforme informe) {
		DatEmpleador empleador = new DatEmpleador();
		empleador.setCEmp(informe.getCEmp());
		empleador.setFecha(AdapterUtil.toDate(empleadorType.getFecha()));
		empleador.setDatNaturale(naturale);
		empleador.setDatInforme(informe);
		empleador.setFechaIngreso(AdapterUtil.toDate(empleadorType.getFechaIngreso()));
		empleador.setIdRegistro(empleadorType.getIdRegistro());
		empleador.setNit(empleadorType.getNit());
		empleador.setNitReporta(empleadorType.getNitReporta());
		empleador.setNombre(empleadorType.getNombre());
		empleador.setRazonSocial(empleadorType.getRazonSocial());
		empleador.setTipoContrato(empleadorType.getTipoContrato());
		return empleador;
	}

	public List<DatEmpleador> getAlertasFromServiceResponse(List<InfoDemograficaType.Empleador> empleadoresType,
			DatNaturale naturale, DatInforme informe) {
		List<DatEmpleador> empleadores = new ArrayList<DatEmpleador>();
		for (InfoDemograficaType.Empleador empleadorType : empleadoresType) {
			empleadores.add(getAlertaFromAlertaResponse(empleadorType, naturale, informe));
		}
		return empleadores;
	}

	public DatEndeudamientoGlobal getEndGlobalFromResponse(EndeudamientoGlobalType endGlobalType, DatInforme informe) {
		DatEndeudamientoGlobal endGlobal = new DatEndeudamientoGlobal();
		endGlobal.setCalificacion(endGlobalType.getCalificacion());
		endGlobal.setCEmp(informe.getCEmp());
		if (endGlobalType.getEntidad() != null) {
			endGlobal.setEntidadNit(endGlobalType.getEntidad().getNit());
			endGlobal.setEntidadNombre(endGlobalType.getEntidad().getNombre());
			endGlobal.setEntidadSector(endGlobalType.getEntidad().getSector());
		}
		endGlobal.setFechaReporte(AdapterUtil.toDate(endGlobalType.getFechaReporte()));
		endGlobal.setFuente(endGlobalType.getFuente());
		if (endGlobalType.getGarantia() != null) {
			endGlobal.setGarantiaFecha(AdapterUtil.toDate(endGlobalType.getGarantia().getFecha()));
			endGlobal.setGarantiaTipo(endGlobalType.getGarantia().getTipo());
			if (endGlobalType.getGarantia().getValor() != null) {
				endGlobal.setGarantiaValor(new BigDecimal(endGlobalType.getGarantia().getValor()));
			} else {
				endGlobal.setGarantiaValor(new BigDecimal(0));
			}
		}
		endGlobal.setIndependiente(endGlobalType.getIndependiente());
		endGlobal.setDatInforme(informe);
		endGlobal.setLlave(endGlobalType.getLlave());
		endGlobal.setMoneda(endGlobalType.getMoneda());
		endGlobal.setNumeroCreditos(new BigDecimal(endGlobalType.getNumeroCreditos()));
		endGlobal.setSaldoPendiente(new BigDecimal(endGlobalType.getSaldoPendiente()));
		endGlobal.setTipoCredito(endGlobalType.getTipoCredito());
		return endGlobal;
	}

	public List<DatEndeudamientoGlobal> getEndGlobalesFromResponse(List<EndeudamientoGlobalType> endGlobalTypes,
			DatInforme informe) {
		List<DatEndeudamientoGlobal> endeudamientosGlobales = new ArrayList<DatEndeudamientoGlobal>();
		for (EndeudamientoGlobalType endGlobaltype : endGlobalTypes) {
			endeudamientosGlobales.add(getEndGlobalFromResponse(endGlobaltype, informe));
		}
		return endeudamientosGlobales;
	}

	public DatEstadoCivil getEstadoCivilFromEstadoCivilResponse(InfoDemograficaType.EstadoCivil estadoCivilType,
			DatNaturale naturale, DatInforme informe) {
		DatEstadoCivil estadoCivil = new DatEstadoCivil();
		estadoCivil.setCEmp(informe.getCEmp());
		estadoCivil.setDatNaturale(naturale);
		estadoCivil.setDatInforme(informe);
		estadoCivil.setEstado(estadoCivilType.getEstado());
		estadoCivil.setFecha(AdapterUtil.toDate(estadoCivilType.getFecha()));
		estadoCivil.setIdRegistro(estadoCivilType.getIdRegistro());
		estadoCivil.setNitReporta(estadoCivilType.getNitReporta());
		estadoCivil.setRazonSocial(estadoCivilType.getRazonSocial());
		return estadoCivil;
	}

	public List<DatEstadoCivil> getEstadoCivilFromServiceResponse(
			List<InfoDemograficaType.EstadoCivil> estadoCivilesType, DatNaturale naturale, DatInforme informe) {
		List<DatEstadoCivil> estadosCiviles = new ArrayList<DatEstadoCivil>();
		for (InfoDemograficaType.EstadoCivil estadoCivilType : estadoCivilesType) {
			estadosCiviles.add(getEstadoCivilFromEstadoCivilResponse(estadoCivilType, naturale, informe));
		}
		return estadosCiviles;
	}

	public DatEstadoFinanciero getEstadoFinancieroleFromEstadoFinancieroResponse(
			InfoDemograficaType.EstadoFinanciero estadoFinancieroType, DatNaturale naturale, DatInforme informe) {
		DatEstadoFinanciero estadoFinanciero = new DatEstadoFinanciero();
		if (estadoFinancieroType.getActivos() != null) {
			estadoFinanciero.setActivos(new BigDecimal(estadoFinancieroType.getActivos()));
		} else {
			estadoFinanciero.setActivos(new BigDecimal(0));
		}
		estadoFinanciero.setCEmp(informe.getCEmp());
		estadoFinanciero.setDatNaturale(naturale);
		estadoFinanciero.setDatInforme(informe);
		estadoFinanciero.setFecha(AdapterUtil.toDate(estadoFinancieroType.getFecha()));
		estadoFinanciero.setIdRegistro(estadoFinancieroType.getIdRegistro());
		if (estadoFinancieroType.getIngresos() != null) {
			estadoFinanciero.setIngresos(new BigDecimal(estadoFinancieroType.getIngresos()));
		} else {
			estadoFinanciero.setIngresos(new BigDecimal(0));
		}
		estadoFinanciero.setNitReporta(estadoFinancieroType.getNitReporta());
		if (estadoFinancieroType.getPasivos() != null) {
			estadoFinanciero.setPasivos(new BigDecimal(estadoFinancieroType.getPasivos()));
		} else {
			estadoFinanciero.setPasivos(new BigDecimal(0));
		}
		estadoFinanciero.setRazonSocial(estadoFinancieroType.getRazonSocial());
		return estadoFinanciero;
	}

	public List<DatEstadoFinanciero> getEstadosFinancierosFromServiceResponse(
			List<InfoDemograficaType.EstadoFinanciero> estadosFinancierosType, DatNaturale naturale,
			DatInforme informe) {
		List<DatEstadoFinanciero> estadosFinancieros = new ArrayList<DatEstadoFinanciero>();
		for (InfoDemograficaType.EstadoFinanciero estadoFinancieroType : estadosFinancierosType) {
			estadosFinancieros
					.add(getEstadoFinancieroleFromEstadoFinancieroResponse(estadoFinancieroType, naturale, informe));
		}
		return estadosFinancieros;
	}

	public DatEstadoPortafolio getEstPortafolioFromResponse(ComposicionPortafolioType.TipoCuenta.Estado estadoType,
			DatTipoCuentaPortafolio tipoCuentaPortafolio, DatInforme informe) {
		DatEstadoPortafolio estadoPortafolio = new DatEstadoPortafolio();
		estadoPortafolio.setCantidad(new BigDecimal(estadoType.getCantidad()));
		estadoPortafolio.setCEmp(informe.getCEmp());
		if (estadoType.getCodigo() != null) {
			estadoPortafolio.setCodigo(estadoType.getCodigo().toUpperCase());
		}
		estadoPortafolio.setDatTipoCuentaPortafolio(tipoCuentaPortafolio);
		estadoPortafolio.setDatInforme(informe);
		return estadoPortafolio;
	}

	public List<DatEstadoPortafolio> getEstPortafoliosFromResponse(
			List<ComposicionPortafolioType.TipoCuenta.Estado> estadosType, DatTipoCuentaPortafolio tipoCuentaPortafolio,
			DatInforme informe) {
		List<DatEstadoPortafolio> estadosPortafolios = new ArrayList<DatEstadoPortafolio>();
		for (ComposicionPortafolioType.TipoCuenta.Estado estadoType : estadosType) {
			estadosPortafolios.add(getEstPortafolioFromResponse(estadoType, tipoCuentaPortafolio, informe));
		}
		return estadosPortafolios;
	}

	public List<DatEvolDeudaMicrocredito> getEvolDeudaMicroResponse(EvolucionDeudaMicrocreditoType evolDeudaType,
			DatInfoAgregadaMicrocred infoAgregadaMicrocredito, DatInforme informe) {
		List<DatEvolDeudaMicrocredito> evolDeudas = new ArrayList<DatEvolDeudaMicrocredito>();
		DatEvolDeudaMicrocredito evolDeuda = new DatEvolDeudaMicrocredito();
		evolDeuda.setCEmp(informe.getCEmp());
		evolDeuda.setDatInfoAgregadaMicrocred(infoAgregadaMicrocredito);
		evolDeuda.setDatInforme(informe);
		if (evolDeudaType.getTrimestres() != null && evolDeudaType.getTrimestres().getTrimestre() != null
				&& !evolDeudaType.getTrimestres().getTrimestre().isEmpty()) {
			evolDeuda.setDatTrimestreDeuMicrocreds(getComportamientosEntFromServiceResponse(
					evolDeudaType.getTrimestres().getTrimestre(), evolDeuda, informe));
		}
		if (evolDeudaType.getEvolucionDeudaSector() != null && !evolDeudaType.getEvolucionDeudaSector().isEmpty()) {
			evolDeuda.setDatEvolucionDeudaSectors(
					getEvolDeudasFromServiceResponse(evolDeudaType.getEvolucionDeudaSector(), evolDeuda, informe));
		}
		evolDeudas.add(evolDeuda);
		return evolDeudas;
	}

	public DatEvolDeudaTipoCuenta getEvolDeudaTipoCuentaResponse(
			EvolucionDeudaMicrocreditoType.EvolucionDeudaSector.EvolucionDeudaTipoCuenta evolDeudasType,
			DatEvolucionDeudaSector evolDeuda, DatInforme informe) {
		DatEvolDeudaTipoCuenta evolDeudaTipoCuenta = new DatEvolDeudaTipoCuenta();
		evolDeudaTipoCuenta.setDatEvolucionDeudaSector(evolDeuda);
		evolDeudaTipoCuenta.setDatInforme(informe);
		evolDeudaTipoCuenta.setCEmp(informe.getCEmp());
		evolDeudaTipoCuenta.setTipoCuenta(evolDeudasType.getTipoCuenta());
		if (evolDeudasType.getEvolucionDeudaValorTrimestre() != null
				&& !evolDeudasType.getEvolucionDeudaValorTrimestre().isEmpty()) {
			evolDeudaTipoCuenta.setDatEvolValorTrimestres(getEvolDeudasTipoCuentaServiceResponse(
					evolDeudasType.getEvolucionDeudaValorTrimestre(), evolDeudaTipoCuenta, informe));
		}
		return evolDeudaTipoCuenta;
	}

	public List<DatEvolDeudaTipoCuenta> getEvolDeudasTipoCuentaServiceResponse(
			List<EvolucionDeudaMicrocreditoType.EvolucionDeudaSector.EvolucionDeudaTipoCuenta> evolDeudasType,
			DatEvolucionDeudaSector evolDeuda, DatInforme informe) {
		List<DatEvolDeudaTipoCuenta> evolucionesDeudas = new ArrayList<DatEvolDeudaTipoCuenta>();
		for (EvolucionDeudaMicrocreditoType.EvolucionDeudaSector.EvolucionDeudaTipoCuenta evolDeudaType : evolDeudasType) {
			evolucionesDeudas.add(getEvolDeudaTipoCuentaResponse(evolDeudaType, evolDeuda, informe));
		}
		return evolucionesDeudas;
	}

	public DatEvolValorTrimestre getEvolDeudaTipoCuentaResponse(
			EvolucionDeudaMicrocreditoType.EvolucionDeudaSector.EvolucionDeudaTipoCuenta.EvolucionDeudaValorTrimestre evolDeudasTrimType,
			DatEvolDeudaTipoCuenta evolDeuda, DatInforme informe) {
		DatEvolValorTrimestre evolValorTrimestre = new DatEvolValorTrimestre();
		evolValorTrimestre.setCEmp(informe.getCEmp());
		evolValorTrimestre.setDatEvolDeudaTipoCuenta(evolDeuda);
		evolValorTrimestre.setDatInforme(informe);
		evolValorTrimestre.setCodMenorCalificacion(evolDeudasTrimType.getCodMenorCalificacion());
		evolValorTrimestre.setCuota(new BigDecimal(evolDeudasTrimType.getCuota()));
		evolValorTrimestre.setCupoInicial(new BigDecimal(evolDeudasTrimType.getCupoInicial()));
		evolValorTrimestre.setNum(new BigDecimal(evolDeudasTrimType.getNum()));
		evolValorTrimestre.setPorcentajeDeuda(new BigDecimal(evolDeudasTrimType.getPorcentajeDeuda()));
		evolValorTrimestre.setSaldo(new BigDecimal(evolDeudasTrimType.getSaldo()));
		evolValorTrimestre.setSaldoMora(new BigDecimal(evolDeudasTrimType.getSaldoMora()));
		evolValorTrimestre.setTextMenorCalificacion(evolDeudasTrimType.getTextoMenorCalificacion());
		evolValorTrimestre.setTipoCuenta(evolDeudasTrimType.getTipoCuenta());
		evolValorTrimestre.setTrimestre(evolDeudasTrimType.getTrimestre());
		return evolValorTrimestre;
	}

	public List<DatEvolValorTrimestre> getEvolDeudasTipoCuentaServiceResponse(
			List<EvolucionDeudaMicrocreditoType.EvolucionDeudaSector.EvolucionDeudaTipoCuenta.EvolucionDeudaValorTrimestre> evolDeudasTrimType,
			DatEvolDeudaTipoCuenta evolDeuda, DatInforme informe) {
		List<DatEvolValorTrimestre> evolucionesDeudas = new ArrayList<DatEvolValorTrimestre>();
		for (EvolucionDeudaMicrocreditoType.EvolucionDeudaSector.EvolucionDeudaTipoCuenta.EvolucionDeudaValorTrimestre evolDeudaType : evolDeudasTrimType) {
			evolucionesDeudas.add(getEvolDeudaTipoCuentaResponse(evolDeudaType, evolDeuda, informe));
		}
		return evolucionesDeudas;
	}

	public DatEvolucionDeudaSector getEvolDeudaFromComentarioResponse(
			EvolucionDeudaMicrocreditoType.EvolucionDeudaSector evolDeudasType, DatEvolDeudaMicrocredito evolDeuda,
			DatInforme informe) {
		DatEvolucionDeudaSector evolDeudaSector = new DatEvolucionDeudaSector();
		evolDeudaSector.setDatEvolDeudaMicrocredito(evolDeuda);
		evolDeudaSector.setDatInforme(informe);
		evolDeudaSector.setCEmp(informe.getCEmp());
		evolDeudaSector.setCodSector(new BigDecimal(evolDeudasType.getCodSector()));
		evolDeudaSector.setNombreSector(evolDeudasType.getNombreSector().toUpperCase());
		if (evolDeudasType.getEvolucionDeudaTipoCuenta() != null
				&& !evolDeudasType.getEvolucionDeudaTipoCuenta().isEmpty()) {
			evolDeudaSector.setDatEvolDeudaTipoCuentas(getEvolDeudasTipoCuentaServiceResponse(
					evolDeudasType.getEvolucionDeudaTipoCuenta(), evolDeudaSector, informe));
		}
		return evolDeudaSector;
	}

	public List<DatEvolucionDeudaSector> getEvolDeudasFromServiceResponse(
			List<EvolucionDeudaMicrocreditoType.EvolucionDeudaSector> evolDeudasType,
			DatEvolDeudaMicrocredito evolDeuda, DatInforme informe) {
		List<DatEvolucionDeudaSector> evolucionesDeudas = new ArrayList<DatEvolucionDeudaSector>();
		for (EvolucionDeudaMicrocreditoType.EvolucionDeudaSector evolDeudaType : evolDeudasType) {
			evolucionesDeudas.add(getEvolDeudaFromComentarioResponse(evolDeudaType, evolDeuda, informe));
		}
		return evolucionesDeudas;
	}

	public DatFuerzaMayor getFuerzaMayorFromFuerzaMayorResponse(InfoDemograficaType.FuerzaMayor fuerzaMayorType,
			DatNaturale naturale, DatInforme informe) {
		DatFuerzaMayor fuerzaMayor = new DatFuerzaMayor();
		fuerzaMayor.setFechaFuerzaMayor(AdapterUtil.toDate(fuerzaMayorType.getFechaFuerzaMayor()));
		fuerzaMayor.setFuerzaMayor(AdapterUtil.getCharFromBoolean(fuerzaMayorType.isFuerzaMayor()));
		fuerzaMayor.setIdRegistro(fuerzaMayorType.getIdRegistro());
		fuerzaMayor.setNitReporta(fuerzaMayorType.getNitReporta());
		fuerzaMayor.setRazonSocial(fuerzaMayorType.getRazonSocial());
		fuerzaMayor.setDatNaturale(naturale);
		fuerzaMayor.setDatInforme(informe);
		fuerzaMayor.setCEmp(informe.getCEmp());
		return fuerzaMayor;
	}

	public List<DatFuerzaMayor> getFuerzaMayorFromServiceResponse(
			List<InfoDemograficaType.FuerzaMayor> fuerzasMayoresType, DatNaturale naturale, DatInforme informe) {
		List<DatFuerzaMayor> fuerzasMayores = new ArrayList<DatFuerzaMayor>();
		for (InfoDemograficaType.FuerzaMayor fuerzaMayorType : fuerzasMayoresType) {
			fuerzasMayores.add(getFuerzaMayorFromFuerzaMayorResponse(fuerzaMayorType, naturale, informe));
		}
		return fuerzasMayores;
	}

	public DatIdentificacion getIdentificacionFromIdentificacionResponse(
			InfoDemograficaType.Identificacion identificacionType, DatNaturale naturale, DatInforme informe) {
		DatIdentificacion identificacion = new DatIdentificacion();
		identificacion.setCEmp(informe.getCEmp());
		identificacion.setFecha(AdapterUtil.toDate(identificacionType.getFecha()));
		identificacion.setFechaExpedicion(AdapterUtil.toDate(identificacionType.getFechaExpedicion()));
		identificacion.setFechaNacimiento(AdapterUtil.toDate(identificacionType.getFechaNacimiento()));
		identificacion.setIdRegistro(identificacionType.getIdRegistro());
		identificacion.setLugarExpedicion(identificacionType.getLugarExpedicion());
		identificacion.setNitReporta(identificacionType.getNitReporta());
		identificacion.setRazonSocial(identificacionType.getRazonSocial());
		identificacion.setDatNaturale(naturale);
		identificacion.setDatInforme(informe);
		return identificacion;
	}

	public List<DatIdentificacion> getIdentificacionFromServiceResponse(
			List<InfoDemograficaType.Identificacion> IdentificacionesType, DatNaturale naturale, DatInforme informe) {
		List<DatIdentificacion> identificaciones = new ArrayList<DatIdentificacion>();
		for (InfoDemograficaType.Identificacion identificacionType : IdentificacionesType) {
			identificaciones.add(getIdentificacionFromIdentificacionResponse(identificacionType, naturale, informe));
		}
		return identificaciones;
	}

	public DatInfoAgregada getInfoAgregadaFromResponse(InfoAgregadaType infoAgregadaType, DatInforme informe) {
		DatInfoAgregada infoAgregada = new DatInfoAgregada();
		infoAgregada.setDatInforme(informe);
		infoAgregada.setCEmp(informe.getCEmp());
		if (infoAgregadaType.getEvolucionDeuda() != null
				&& infoAgregadaType.getEvolucionDeuda().getAnalisisPromedio() != null) {
			EvolucionDeudaType.AnalisisPromedio analisisPromedio = infoAgregadaType.getEvolucionDeuda()
					.getAnalisisPromedio();
			infoAgregada.setEvolDeuAnaPromApeCuen(new BigDecimal(analisisPromedio.getAperturaCuentas()));
			infoAgregada.setEvolDeuAnaPromCalificacion(new BigDecimal(analisisPromedio.getCalificacion()));
			infoAgregada.setEvolDeuAnaPromCierCue(new BigDecimal(analisisPromedio.getCierreCuentas()));
			infoAgregada.setEvolDeuAnaPromCuota(new BigDecimal(analisisPromedio.getCuota()));
			infoAgregada.setEvolDeuAnaPromCupoTot(new BigDecimal(analisisPromedio.getCupoTotal()));
			infoAgregada.setEvolDeuAnaPromMoraMax(new BigDecimal(analisisPromedio.getMoraMaxima()));
			infoAgregada.setEvolDeuAnaPromPorcUso(new BigDecimal(analisisPromedio.getPorcentajeUso()));
			infoAgregada.setEvolDeuAnaPromSaldo(new BigDecimal(analisisPromedio.getSaldo()));
			infoAgregada.setEvolDeuAnaPromScore(new BigDecimal(analisisPromedio.getScore()));
			infoAgregada.setEvolDeuAnaPromTotAbi(new BigDecimal(analisisPromedio.getTotalAbiertas()));
			infoAgregada.setEvolDeuAnaPromTotCerr(new BigDecimal(analisisPromedio.getTotalCerradas()));
		}
		if (infoAgregadaType.getResumenEndeudamiento() != null
				&& infoAgregadaType.getResumenEndeudamiento().getTrimestre() != null
				&& !infoAgregadaType.getResumenEndeudamiento().getTrimestre().isEmpty()) {
			infoAgregada.setDatTrimestreResEndeudas(getTrimestreChequesFromResponseY(
					infoAgregadaType.getResumenEndeudamiento().getTrimestre(), infoAgregada, informe));
		}
		if (infoAgregadaType.getEvolucionDeuda() != null) {
			if (infoAgregadaType.getEvolucionDeuda().getTrimestre() != null
					&& !infoAgregadaType.getEvolucionDeuda().getTrimestre().isEmpty()) {
				infoAgregada.setDatTrimestreDeudas(getTrimestreChequesFromResponseX(
						infoAgregadaType.getEvolucionDeuda().getTrimestre(), infoAgregada, informe));
			}
		}
		if (infoAgregadaType.getCheques() != null && infoAgregadaType.getCheques().getTrimestre() != null
				&& !infoAgregadaType.getCheques().getTrimestre().isEmpty()) {
			infoAgregada.setDatTrimestreCheques(getTrimestreChequesFromResponse(
					infoAgregadaType.getCheques().getTrimestre(), infoAgregada, informe));
		}
		if (infoAgregadaType.getTotales() != null) {
			if (infoAgregadaType.getTotales().getTipoCuenta() != null
					&& !infoAgregadaType.getTotales().getTipoCuenta().isEmpty()) {
				infoAgregada.setDatTotalesTipoCuentas(getTotalesTipoCuentasFromResponse(
						infoAgregadaType.getTotales().getTipoCuenta(), infoAgregada, informe));
			}
			if (infoAgregadaType.getTotales().getTotal() != null
					&& !infoAgregadaType.getTotales().getTotal().isEmpty()) {
				infoAgregada.setDatTotalesTotals(
						getTotalesTotalFromResponse(infoAgregadaType.getTotales().getTotal(), infoAgregada, informe));
			}
		}
		if (infoAgregadaType.getComposicionPortafolio() != null
				&& infoAgregadaType.getComposicionPortafolio().getTipoCuenta() != null
				&& !infoAgregadaType.getComposicionPortafolio().getTipoCuenta().isEmpty()) {
			infoAgregada.setDatTipoCuentaPortafolios(getTipoCuentaPortafoliosFromResponse(
					infoAgregadaType.getComposicionPortafolio().getTipoCuenta(), infoAgregada, informe));
		}
		if (infoAgregadaType.getHistoricoSaldos() != null) {
			if (infoAgregadaType.getHistoricoSaldos().getTipoCuenta() != null
					&& !infoAgregadaType.getHistoricoSaldos().getTipoCuenta().isEmpty()) {
				infoAgregada.setDatTipoCuentaHistoricos(getComportamientosFromResponse(
						infoAgregadaType.getHistoricoSaldos().getTipoCuenta(), infoAgregada, informe));
			}
			if (infoAgregadaType.getHistoricoSaldos().getTotales() != null
					&& !infoAgregadaType.getHistoricoSaldos().getTotales().isEmpty()) {
				infoAgregada.setDatTotalesHistoricos(getTotalesHistoricosFromResponse(
						infoAgregadaType.getHistoricoSaldos().getTotales(), infoAgregada, informe));
			}
		}
		if (infoAgregadaType.getResumen() != null) {
			if (infoAgregadaType.getResumen().getComportamiento() != null
					&& infoAgregadaType.getResumen().getComportamiento().getMes() != null
					&& !infoAgregadaType.getResumen().getComportamiento().getMes().isEmpty()) {
				infoAgregada.setDatComportamientos(getComportamientosFromResponseX(
						infoAgregadaType.getResumen().getComportamiento().getMes(), infoAgregada, informe));
			}
			if (infoAgregadaType.getResumen().getSaldos() != null) {
				infoAgregada.setSaldosCuotaMensual(
						new BigDecimal(infoAgregadaType.getResumen().getSaldos().getCuotaMensual()));
				infoAgregada.setSaldosSaldoCreditoMasAlto(
						new BigDecimal(infoAgregadaType.getResumen().getSaldos().getSaldoCreditoMasAlto()));
				infoAgregada.setSaldosSaldoM30(new BigDecimal(infoAgregadaType.getResumen().getSaldos().getSaldoM30()));
				infoAgregada.setSaldosSaldoM60(new BigDecimal(infoAgregadaType.getResumen().getSaldos().getSaldoM60()));
				infoAgregada.setSaldosSaldoM90(new BigDecimal(infoAgregadaType.getResumen().getSaldos().getSaldoM90()));
				infoAgregada
						.setSaldosSaldoTotal(new BigDecimal(infoAgregadaType.getResumen().getSaldos().getSaldoTotal()));
				infoAgregada.setSaldosSaldoTotalEnMora(
						new BigDecimal(infoAgregadaType.getResumen().getSaldos().getSaldoTotalEnMora()));
				if (infoAgregadaType.getResumen().getSaldos().getMes() != null
						&& !infoAgregadaType.getResumen().getSaldos().getMes().isEmpty()) {
					infoAgregada.setDatSaldosMes(getSaldosMesFromResponse(
							infoAgregadaType.getResumen().getSaldos().getMes(), infoAgregada, informe));
				}
				if (infoAgregadaType.getResumen().getSaldos().getSector() != null
						&& !infoAgregadaType.getResumen().getSaldos().getSector().isEmpty()) {
					infoAgregada.setDatSaldosSectors(getSaldosSectorFromResponse(
							infoAgregadaType.getResumen().getSaldos().getSector(), infoAgregada, informe));
				}
			}
			if (infoAgregadaType.getResumen().getPrincipales() != null) {
				ResumenType.Principales principales = infoAgregadaType.getResumen().getPrincipales();
				if (principales.getDesacuerdosALaFecha() != null) {
					infoAgregada.setResPrinAcuALaFecha(new BigDecimal(principales.getDesacuerdosALaFecha()));
				} else {
					infoAgregada.setResPrinAcuALaFecha(new BigDecimal(0));
				}
				infoAgregada.setResPrinAntiguedadDesde(AdapterUtil.toDate(principales.getAntiguedadDesde()));
				if (principales.getConsultadasUlt6Meses() != null) {
					infoAgregada.setResPrinConUlt6mes(new BigDecimal(principales.getConsultadasUlt6Meses()));
				} else {
					infoAgregada.setResPrinConUlt6mes(new BigDecimal(0));
				}
				if (principales.getCreditosActualesNegativos() != null) {
					infoAgregada.setResPrinCredActNeg(new BigDecimal(principales.getCreditosActualesNegativos()));
				} else {
					infoAgregada.setResPrinCredActNeg(new BigDecimal(0));
				}
				if (principales.getCreditosCerrados() != null) {
					infoAgregada.setResPrinCreditosCerrados(new BigDecimal(principales.getCreditosCerrados()));
				} else {
					infoAgregada.setResPrinCreditosCerrados(new BigDecimal(0));
				}
				if (principales.getCreditoVigentes() != null) {
					infoAgregada.setResPrinCreditosVigentes(new BigDecimal(principales.getCreditoVigentes()));
				} else {
					infoAgregada.setResPrinCreditosVigentes(new BigDecimal(0));
				}
				if (principales.getCuentasAbiertasAHOCCB() != null) {
					infoAgregada.setResPrinCueAbAhoccb(new BigDecimal(principales.getCuentasAbiertasAHOCCB()));
				} else {
					infoAgregada.setResPrinCueAbAhoccb(new BigDecimal(0));
				}
				if (principales.getCuentasCerradasAHOCCB() != null) {
					infoAgregada.setResPrinCueCerrAhoccb(new BigDecimal(principales.getCuentasCerradasAHOCCB()));
				} else {
					infoAgregada.setResPrinCueCerrAhoccb(new BigDecimal(0));
				}
				if (principales.getHistNegUlt12Meses() != null) {
					infoAgregada.setResPrinHistNegUlt12meses(new BigDecimal(principales.getHistNegUlt12Meses()));
				} else {
					infoAgregada.setResPrinHistNegUlt12meses(new BigDecimal(0));
				}
				if (principales.getReclamosVigentes() != null) {
					infoAgregada.setResPrinReclamosVig(new BigDecimal(principales.getReclamosVigentes()));
				} else {
					infoAgregada.setResPrinReclamosVig(new BigDecimal(0));
				}
			}
		}
		return infoAgregada;
	}

	public DatInfoAgregadaMicrocred getInfoAgregadaFromResponse(InfoAgregadaMicrocreditoType infoAgregadaType,
			DatInforme informe) {
		DatInfoAgregadaMicrocred infoAgregadaMicrocredito = new DatInfoAgregadaMicrocred();
		infoAgregadaMicrocredito.setCEmp(informe.getCEmp());
		infoAgregadaMicrocredito.setDatInforme(informe);
		if (infoAgregadaType.getAnalisisVectores() != null && infoAgregadaType.getAnalisisVectores().getSector() != null
				&& !infoAgregadaType.getAnalisisVectores().getSector().isEmpty()) {
			infoAgregadaMicrocredito.setDatSectorAnalisisVectores(getSectorAnalisisVectoresFromServiceResponse(
					infoAgregadaType.getAnalisisVectores().getSector(), infoAgregadaMicrocredito, informe));
		}
		if (infoAgregadaType.getEvolucionDeuda() != null) {
			infoAgregadaMicrocredito.setDatEvolDeudaMicrocreditos(
					getEvolDeudaMicroResponse(infoAgregadaType.getEvolucionDeuda(), infoAgregadaMicrocredito, informe));
		}
		if (infoAgregadaType.getResumen() != null) {
			if (infoAgregadaType.getResumen().getImagenTendenciaEndeudamiento() != null
					&& infoAgregadaType.getResumen().getImagenTendenciaEndeudamiento().getSeries() != null
					&& !infoAgregadaType.getResumen().getImagenTendenciaEndeudamiento().getSeries().isEmpty()) {
				infoAgregadaMicrocredito.setDatSeries(getSectoresEndeudamientoActualFromServiceResponseX(
						infoAgregadaType.getResumen().getImagenTendenciaEndeudamiento().getSeries(),
						infoAgregadaMicrocredito, informe));
			}
			if (infoAgregadaType.getResumen().getEndeudamientoActual() != null
					&& infoAgregadaType.getResumen().getEndeudamientoActual().getSector() != null
					&& !infoAgregadaType.getResumen().getEndeudamientoActual().getSector().isEmpty()) {
				infoAgregadaMicrocredito.setDatSectorEndeudaActuals(getSectoresEndeudamientoActualFromServiceResponse(
						infoAgregadaType.getResumen().getEndeudamientoActual().getSector(), infoAgregadaMicrocredito,
						informe));
			}
			if (infoAgregadaType.getResumen().getPerfilGeneral() != null) {
				infoAgregadaMicrocredito.setDatResumenPerfilGenerals(getResumesPerfilGeneralFromServiceResponse(
						infoAgregadaType.getResumen().getPerfilGeneral(), infoAgregadaMicrocredito, informe));
			}
			if (infoAgregadaType.getResumen().getVectorSaldosYMoras() != null) {
				if (infoAgregadaType.getResumen().getVectorSaldosYMoras().getSaldosYMoras() != null
						&& !infoAgregadaType.getResumen().getVectorSaldosYMoras().getSaldosYMoras().isEmpty()) {
					infoAgregadaMicrocredito.setDatSaldosYMoras(getSaldosYMoraFromServiceResponse(
							infoAgregadaType.getResumen().getVectorSaldosYMoras().getSaldosYMoras(),
							infoAgregadaMicrocredito, informe));
				}
				infoAgregadaMicrocredito.setResVecSalMorasPosSecCoo(AdapterUtil.getCharFromBoolean(
						infoAgregadaType.getResumen().getVectorSaldosYMoras().isPoseeSectorCooperativo()));
				infoAgregadaMicrocredito.setResVecSalMorasPosSecFin(AdapterUtil.getCharFromBoolean(
						infoAgregadaType.getResumen().getVectorSaldosYMoras().isPoseeSectorFinanciero()));
				infoAgregadaMicrocredito.setResVecSalMorasPosSecReal(AdapterUtil
						.getCharFromBoolean(infoAgregadaType.getResumen().getVectorSaldosYMoras().isPoseeSectorReal()));
				infoAgregadaMicrocredito.setResVecSalMorasPosSecTel(AdapterUtil.getCharFromBoolean(
						infoAgregadaType.getResumen().getVectorSaldosYMoras().isPoseeSectorTelcos()));
			}
		}
		if (infoAgregadaType.getComportamientoEntidades() != null) {
			if (infoAgregadaType.getComportamientoEntidades().getComportamientoEntidades() != null
					&& !infoAgregadaType.getComportamientoEntidades().getComportamientoEntidades().isEmpty()) {
				infoAgregadaMicrocredito.setDatComportamientoEntidades(getComportamientosEntFromServiceResponse(
						infoAgregadaType.getComportamientoEntidades().getComportamientoEntidades(),
						infoAgregadaMicrocredito, informe));
			}
		}
		return infoAgregadaMicrocredito;
	}

	public List<DatInforme> getInformesFromServiceResponse(Informes informe, String empresa) {
		List<DatInforme> informesPersistense = new ArrayList<DatInforme>();
		for (InformeType inform : informe.getInforme()) {
			informesPersistense.add(getInformeFromInformeResponse(inform, empresa));
		}
		return informesPersistense;
	}
	
	public DatPreselecta getInformesFromServiceResponsePreselecta(Informes informe, String empresa) {
		DatPreselecta informesPersistense = new DatPreselecta();
		for (InformeType inform : informe.getInforme()) {
			if(inform.getRespuestaPersonalizada() != null) {
				if(guardapreselecta(inform.getRespuestaPersonalizada().getLinea())) {
					informesPersistense= getPreselectava(inform, empresa);
				}				
			}
		}
		return informesPersistense;
	}

	public DatInforme getInformeFromInformeResponse(InformeType informeType, String empresa) {
		DatInforme informe = new DatInforme();
		informe.setCEmp(empresa);
		informe.setIdentificacion(informeType.getIdentificacion());
		informe.setIdentificacionDigitada(informeType.getIdentificacionDigitada());

		if (informeType.getAlerta() != null && !informeType.getAlerta().isEmpty()) {
			informe.setDatAlertas(getAlertasFromServiceResponse(informeType.getAlerta(), informe));
		}
		if (informeType.getComentario() != null && !informeType.getComentario().isEmpty()) {
			informe.setDatComentarios(getComentariosFromServiceResponse(informeType.getComentario(), informe));
		}
		if (informeType.getConsulta() != null && !informeType.getConsulta().isEmpty()) {
			informe.setDatConsultas(getConsultaFromServiceResponse(informeType.getConsulta(), informe));
		}
		if (informeType.getScore() != null && !informeType.getScore().isEmpty()) {
			informe.setDatScores(getScoresFromResponse(informeType.getScore(), informe));
		}
		if (informeType.getEndeudamientoGlobal() != null && !informeType.getEndeudamientoGlobal().isEmpty()) {
			informe.setDatEndeudamientoGlobals(
					getEndGlobalesFromResponse(informeType.getEndeudamientoGlobal(), informe));
		}
		if (informeType.getInfoAgregada() != null) {
			List<DatInfoAgregada> infosAgregadas = new ArrayList<DatInfoAgregada>();
			infosAgregadas.add(getInfoAgregadaFromResponse(informeType.getInfoAgregada(), informe));
			informe.setDatInfoAgregadas(infosAgregadas);
		}
		if (informeType.getInfoAgregadaMicrocredito() != null) {
			List<DatInfoAgregadaMicrocred> infoAgregadasMicrocreditos = new ArrayList<DatInfoAgregadaMicrocred>();
			infoAgregadasMicrocreditos
					.add(getInfoAgregadaFromResponse(informeType.getInfoAgregadaMicrocredito(), informe));
			informe.setDatInfoAgregadaMicrocreds(infoAgregadasMicrocreditos);
		}
		if (informeType.getRespuestaPersonalizada() != null
				&& informeType.getRespuestaPersonalizada().getLinea() != null
				&& !informeType.getRespuestaPersonalizada().getLinea().isEmpty()) {

			informe.setDatRespuestaPersLineas(getRespuestaPersLineaFromServiceResponse(
					informeType.getRespuestaPersonalizada().getLinea(), informe));
			
			informe.setDatDictum(getRespuestaDictumFromServiceResponse(informeType.getRespuestaPersonalizada().getLinea(), informe));
			
			informe.setDatArbolesDictum(getRespuestaArbolesDictumFromServiceResponse(informeType.getRespuestaPersonalizada().getLinea(), informe));
			
		}
		informe.setDatJuridicas(getPersonaJuridica(informeType, informe));
		informe.setDatNaturales(getNaturaleFromResponse(informeType, informe));
		informe.setDatCuentasClientes(getCuentasFromResponse(informeType, informe));
		informe.setDatObligacionesClientes(getObligacionesFromResponse(informeType, informe));
		informe.setApellidoDigitado(informeType.getApellidoDigitado());
		informe.setCodSeguridad(informeType.getCodSeguridad());
		if (informeType.getReclamo() != null && !informeType.getReclamo().isEmpty()) {
			informe.setDatReclamos(getReclamosFromResponse(informeType.getReclamo(), informe, null, null));
		}
		if (informeType.isEsIndependiente() != null) {
			informe.setEsIndependiente(AdapterUtil.getCharFromBoolean(informeType.isEsIndependiente()));
		}
		informe.setFechaConsulta(AdapterUtil.toDate(informeType.getFechaConsulta()));

		informe.setNombre(informeType.getNombre());
		informe.setRespuesta(informeType.getRespuesta());
		informe.setTipoIddigitado(informeType.getTipoIdDigitado());
		if (informeType.getScore() != null && !informeType.getScore().isEmpty()) {
			for (ScoreType score : informeType.getScore()) {
				informe.setScoreClasificacion(score.getClasificacion());
				informe.setScoreFecha(AdapterUtil.toDate(score.getFecha()));
				informe.setScoreNombre(score.getNombreScore());
				if (score.getPoblacion() != null) {
					informe.setScorePoblacion(new BigDecimal(score.getPoblacion()));
				} else {
					informe.setScorePoblacion(new BigDecimal(0));
				}
				informe.setScorePuntaje(new BigDecimal(score.getPuntaje()));
				informe.setScoreTipo(score.getTipo());
			}
		}
		if (informeType.getProductosValores() != null) {
			informe.setDatProductosValores(getProductosValoresFromResponse(informeType.getProductosValores(), informe));
		}
		DatNaturale naturale = null;
		DatJuridica juridica = null;
		if (informeType.getLocalizacion() != null && !informeType.getLocalizacion().isEmpty()) {
			if (informe.getDatNaturales() != null && !informe.getDatNaturales().isEmpty()) {
				naturale = informe.getDatNaturales().get(0);
			}
			if (informe.getDatJuridicas() != null && !informe.getDatJuridicas().isEmpty()) {
				juridica = informe.getDatJuridicas().get(0);
			}
			informe.setDatLocalizacions(
					getLocalizacionFromServiceResponse(informeType.getLocalizacion(), informe, naturale, juridica));
		}
		informe.setFechaConsulta(new Date());
		return informe;
	}

	public List<DatJuridica> getPersonaJuridica(InformeType informeType, DatInforme informe) {
		List<DatJuridica> juridicas = null;
		DatJuridica juridica;
		if (informeType.getJuridicaExtranjera() != null) {
			juridica = new DatJuridica();
			juridica.setCEmp(informe.getCEmp());
			juridica.setDatInforme(informe);
			juridica.setIdentificacion(informeType.getJuridicaExtranjera().getIdentificacion());
			juridica.setLlave(informeType.getJuridicaExtranjera().getLlave());
			juridica.setRazonSocial(informeType.getJuridicaExtranjera().getRazonSocial());
			juridica.setTipoPersonaJuridica(Constants.TIPO_JURIDICA_EXTRANJERA);
			juridica.setValidada(AdapterUtil.getCharFromBoolean(informeType.getJuridicaExtranjera().isValidada()));
			juridicas = new ArrayList<DatJuridica>();
			juridicas.add(juridica);
		} else if (informeType.getJuridicaNacional() != null) {
			juridica = new DatJuridica();
			juridica.setCEmp(informe.getCEmp());
			juridica.setDatInforme(informe);
			juridica.setIdentificacion(informeType.getJuridicaNacional().getIdentificacion());
			juridica.setLlave(informeType.getJuridicaNacional().getLlave());
			juridica.setRazonSocial(informeType.getJuridicaNacional().getRazonSocial());
			juridica.setTipoPersonaJuridica(Constants.TIPO_JURIDICA_NACIONAL);
			juridica.setValidada(AdapterUtil.getCharFromBoolean(informeType.getJuridicaNacional().isValidada()));
			juridicas = new ArrayList<DatJuridica>();
			juridicas.add(juridica);

		}
		return juridicas;
	}

	public DatLocalizacion getLocalizacionComentarioResponse(LocalizacionType localizacionType, DatInforme informe,
			DatNaturale naturale, DatJuridica juridica) {
		DatLocalizacion localizacion = new DatLocalizacion();
		localizacion.setDatInforme(informe);
		localizacion.setRespuesta(localizacionType.getRespuesta());
		localizacion.setDatNaturale(naturale);
		localizacion.setDatJuridica(juridica);
		localizacion.setCEmp(informe.getCEmp());
		localizacion.setFechaConsulta(new BigDecimal(localizacionType.getFechaConsulta()));
		if (localizacionType.getEmail() != null && !localizacionType.getEmail().isEmpty()) {
			localizacion.setDatEmails(getEmailsFromServiceResponse(localizacionType.getEmail(), localizacion, informe));
		}
		if (localizacionType.getCelular() != null && !localizacionType.getCelular().isEmpty()) {
			localizacion.setDatCelulars(
					getCelularsFromServiceResponse(localizacionType.getCelular(), localizacion, informe));
		}
		if (localizacionType.getTelefono() != null && !localizacionType.getTelefono().isEmpty()) {
			localizacion.setDatTelefonos(
					getTelefonoFromServiceResponse(localizacionType.getTelefono(), localizacion, informe));
		}
		if (localizacionType.getDireccion() != null && !localizacionType.getDireccion().isEmpty()) {
			localizacion.setDatDirecciones(
					getDireccionesFromServiceResponse(localizacionType.getDireccion(), localizacion, informe));
		}
		return localizacion;
	}

	public List<DatLocalizacion> getLocalizacionFromServiceResponse(List<LocalizacionType> localizacionesType,
			DatInforme informe, DatNaturale naturale, DatJuridica juridica) {
		List<DatLocalizacion> localizaciones = new ArrayList<DatLocalizacion>();
		for (LocalizacionType localizacionType : localizacionesType) {
			localizaciones.add(getLocalizacionComentarioResponse(localizacionType, informe, naturale, juridica));
		}
		return localizaciones;
	}

	public DatMorasMaxima getMorasMaximaFromResponse(SectorAnalisisVectoresType.MorasMaximas morasType,
			DatSectorAnalisisVectore sectorAnalisisVec, DatInforme informe) {
		DatMorasMaxima morasMaxima = new DatMorasMaxima();
		morasMaxima.setCEmp(informe.getCEmp());
		morasMaxima.setDatSectorAnalisisVectore(sectorAnalisisVec);
		morasMaxima.setDatInforme(informe);
		if (morasType.getCaracterFecha() != null && !morasType.getCaracterFecha().isEmpty()) {
			morasMaxima.setDatCaracterFechas(
					getCaracterFechaFromServiceResponse(morasType.getCaracterFecha(), morasMaxima, informe));
		}
		return morasMaxima;
	}

	public List<DatMorasMaxima> getMorasMaximaFromServiceResponse(
			List<SectorAnalisisVectoresType.MorasMaximas> morasType, DatSectorAnalisisVectore sectorAnalisisVec,
			DatInforme informe) {
		List<DatMorasMaxima> morasMaximas = new ArrayList<DatMorasMaxima>();
		for (SectorAnalisisVectoresType.MorasMaximas moraMaximaType : morasType) {
			morasMaximas.add(getMorasMaximaFromResponse(moraMaximaType, sectorAnalisisVec, informe));
		}
		return morasMaximas;
	}

	public List<DatNaturale> getNaturaleFromResponse(InformeType informeType, DatInforme informe) {
		List<DatNaturale> naturales = new ArrayList<DatNaturale>();
		DatNaturale natural;
		if (informeType.getNaturalExtranjera() != null) {
			natural = new DatNaturale();
			natural.setCEmp(informe.getCEmp());
			natural.setDatInforme(informe);
			natural.setNombreCompleto(informeType.getNaturalExtranjera().getNombre());
			natural.setValidada(AdapterUtil.getCharFromBoolean(informeType.getNaturalExtranjera().isValidada()));
			natural.setNumero(informeType.getNaturalExtranjera().getNumero());
			natural.setNacionalidad(informeType.getNaturalExtranjera().getNacionalidad());
			natural.setFechaNacimiento(AdapterUtil.toDate(informeType.getNaturalExtranjera().getFechaNacimiento()));
			natural.setLlave(informeType.getNaturalExtranjera().getLlave());
			natural.setTipoNacionalInter("I");
			if (informeType.getNaturalExtranjera().isRut() != null) {
				natural.setRut(AdapterUtil.getCharFromBoolean(informeType.getNaturalExtranjera().isRut()));
			}
			if (informeType.getNaturalExtranjera().getUbicacion() != null) {
				if (informeType.getNaturalExtranjera().getUbicacion().getAntiguedad() != null) {
					natural.setUbicacionAntiguedad(
							new BigDecimal(informeType.getNaturalExtranjera().getUbicacion().getAntiguedad()));
				}
				natural.setUbicacionTipo(informeType.getNaturalExtranjera().getUbicacion().getTipo().toUpperCase());
			}
			if (informeType.getNaturalExtranjera().getInfoDemografica() != null) {

				if (informeType.getNaturalExtranjera().getInfoDemografica().getEmpleador() != null
						&& !informeType.getNaturalExtranjera().getInfoDemografica().getEmpleador().isEmpty()) {
					natural.setDatEmpleadors(getAlertasFromServiceResponse(
							informeType.getNaturalExtranjera().getInfoDemografica().getEmpleador(), natural, informe));
				}

				if (informeType.getNaturalExtranjera().getInfoDemografica().getActividadEconomica() != null
						&& !informeType.getNaturalExtranjera().getInfoDemografica().getActividadEconomica().isEmpty()) {
					natural.setDatActividadEconomicas(getActividadEconomicaFromServiceResponse(
							informeType.getNaturalExtranjera().getInfoDemografica().getActividadEconomica(), natural,
							informe));
				}

				if (informeType.getNaturalExtranjera().getInfoDemografica().getNivelEstudios() != null
						&& !informeType.getNaturalExtranjera().getInfoDemografica().getNivelEstudios().isEmpty()) {
					natural.setDatNivelEstudios(getNivelEstudioFromServiceResponse(
							informeType.getNaturalExtranjera().getInfoDemografica().getNivelEstudios(), natural,
							informe));
				}
				if (informeType.getNaturalExtranjera().getInfoDemografica().getFuerzaMayor() != null
						&& !informeType.getNaturalExtranjera().getInfoDemografica().getFuerzaMayor().isEmpty()) {
					natural.setDatFuerzaMayors(getFuerzaMayorFromServiceResponse(
							informeType.getNaturalExtranjera().getInfoDemografica().getFuerzaMayor(), natural,
							informe));
				}
				if (informeType.getNaturalExtranjera().getInfoDemografica().getIdentificacion() != null
						&& !informeType.getNaturalExtranjera().getInfoDemografica().getIdentificacion().isEmpty()) {
					natural.setDatIdentificacions(getIdentificacionFromServiceResponse(
							informeType.getNaturalExtranjera().getInfoDemografica().getIdentificacion(), natural,
							informe));
				}
				if (informeType.getNaturalExtranjera().getInfoDemografica().getEstadoCivil() != null
						&& !informeType.getNaturalExtranjera().getInfoDemografica().getEstadoCivil().isEmpty()) {
					natural.setDatEstadoCivils(getEstadoCivilFromServiceResponse(
							informeType.getNaturalExtranjera().getInfoDemografica().getEstadoCivil(), natural,
							informe));
				}
				if (informeType.getNaturalExtranjera().getInfoDemografica().getOperacionesInternacionales() != null
						&& !informeType.getNaturalExtranjera().getInfoDemografica().getOperacionesInternacionales()
								.isEmpty()) {
					natural.setDatOperInternacionales(getOperacionesInternacionaleFromServiceResponse(
							informeType.getNaturalExtranjera().getInfoDemografica().getOperacionesInternacionales(),
							natural, informe));
				}
				if (informeType.getNaturalExtranjera().getInfoDemografica().getEstadoFinanciero() != null
						&& !informeType.getNaturalExtranjera().getInfoDemografica().getEstadoFinanciero().isEmpty()) {
					natural.setDatEstadoFinancieros(getEstadosFinancierosFromServiceResponse(
							informeType.getNaturalExtranjera().getInfoDemografica().getEstadoFinanciero(), natural,
							informe));
				}
				if (informeType.getNaturalExtranjera().getInfoDemografica().getPersonasACargo() != null
						&& !informeType.getNaturalExtranjera().getInfoDemografica().getPersonasACargo().isEmpty()) {
					natural.setDatPersonasACargos(getPersonasACargoFromServiceResponse(
							informeType.getNaturalExtranjera().getInfoDemografica().getPersonasACargo(), natural,
							informe));
				}
			}
			naturales.add(natural);
		} else if (informeType.getNaturalNacional() != null) {
			natural = new DatNaturale();
			natural.setCEmp(informe.getCEmp());
			natural.setDatInforme(informe);
			natural.setNombres(informeType.getNaturalNacional().getNombres());
			natural.setPrimerApellido(informeType.getNaturalNacional().getPrimerApellido());
			natural.setSegundoApellido(informeType.getNaturalNacional().getSegundoApellido());
			natural.setNombreCompleto(informeType.getNaturalNacional().getNombreCompleto());
			natural.setEstadoCivil(informeType.getNaturalNacional().getEstadoCivil());
			natural.setTipoNacionalInter("N");
			if (informeType.getNaturalNacional().getGenero() != null) {
				natural.setGenero(Integer.toString(informeType.getNaturalNacional().getGenero()));
			}
			if (informeType.getNaturalNacional().getIdentificacion() != null) {
				natural.setIdenNalNumero((informeType.getNaturalNacional().getIdentificacion().getNumero()));
				if (informeType.getNaturalNacional().getIdentificacion().getEstado() != null) {
					if (informeType.getNaturalNacional().getIdentificacion().getEstado().trim().equals("")) {
						natural.setIdenNalEstado("9999");
					} else {
						natural.setIdenNalEstado(informeType.getNaturalNacional().getIdentificacion().getEstado());
					}
				} else {
					natural.setIdenNalEstado("9999");
				}
				natural.setIdenNalFechaExpedicion(
						AdapterUtil.toDate(informeType.getNaturalNacional().getIdentificacion().getFechaExpedicion()));
				natural.setIdenNalCiudad(informeType.getNaturalNacional().getIdentificacion().getCiudad());
				natural.setIdenNalDepartamento(informeType.getNaturalNacional().getIdentificacion().getDepartamento());
				natural.setIdenNalEstadoCivil(informeType.getNaturalNacional().getIdentificacion().getEstadoCivil());
				natural.setIdenNalGenero(informeType.getNaturalNacional().getIdentificacion().getGenero());
			}
			if (informeType.getNaturalNacional().getEdad() != null) {
				if (informeType.getNaturalNacional().getEdad().getMax() != null) {
					natural.setEdadMax(new BigDecimal(informeType.getNaturalNacional().getEdad().getMax()));
				} else {
					natural.setEdadMax(new BigDecimal(0));
				}
				natural.setEdadMin(new BigDecimal(informeType.getNaturalNacional().getEdad().getMin()));
			}
			natural.setValidada(AdapterUtil.getCharFromBoolean(informeType.getNaturalNacional().isValidada()));
			natural.setRut(AdapterUtil.getCharFromBoolean(informeType.getNaturalNacional().isRut()));
			if (informeType.getNaturalNacional().getUbicacion() != null) {
				if (informeType.getNaturalNacional().getUbicacion().getAntiguedad() != null) {
					natural.setUbicacionAntiguedad(
							new BigDecimal(informeType.getNaturalNacional().getUbicacion().getAntiguedad()));
				}
				natural.setUbicacionTipo(informeType.getNaturalNacional().getUbicacion().getTipo().toUpperCase());
			}
			if (informeType.getNaturalNacional().getInfoDemografica() != null) {
				if (informeType.getNaturalNacional().getInfoDemografica().getEmpleador() != null
						&& !informeType.getNaturalNacional().getInfoDemografica().getEmpleador().isEmpty()) {
					natural.setDatEmpleadors(getAlertasFromServiceResponse(
							informeType.getNaturalNacional().getInfoDemografica().getEmpleador(), natural, informe));
				}
				if (informeType.getNaturalNacional().getInfoDemografica().getActividadEconomica() != null
						&& !informeType.getNaturalNacional().getInfoDemografica().getActividadEconomica().isEmpty()) {
					natural.setDatActividadEconomicas(getActividadEconomicaFromServiceResponse(
							informeType.getNaturalNacional().getInfoDemografica().getActividadEconomica(), natural,
							informe));
				}
				if (informeType.getNaturalNacional().getInfoDemografica().getNivelEstudios() != null
						&& !informeType.getNaturalNacional().getInfoDemografica().getNivelEstudios().isEmpty()) {
					natural.setDatNivelEstudios(getNivelEstudioFromServiceResponse(
							informeType.getNaturalNacional().getInfoDemografica().getNivelEstudios(), natural,
							informe));
				}
				if (informeType.getNaturalNacional().getInfoDemografica().getFuerzaMayor() != null
						&& !informeType.getNaturalNacional().getInfoDemografica().getFuerzaMayor().isEmpty()) {
					natural.setDatFuerzaMayors(getFuerzaMayorFromServiceResponse(
							informeType.getNaturalNacional().getInfoDemografica().getFuerzaMayor(), natural, informe));
				}
				if (informeType.getNaturalNacional().getInfoDemografica().getIdentificacion() != null
						&& !informeType.getNaturalNacional().getInfoDemografica().getIdentificacion().isEmpty()) {
					natural.setDatIdentificacions(getIdentificacionFromServiceResponse(
							informeType.getNaturalNacional().getInfoDemografica().getIdentificacion(), natural,
							informe));
				}
				if (informeType.getNaturalNacional().getInfoDemografica().getEstadoCivil() != null
						&& !informeType.getNaturalNacional().getInfoDemografica().getEstadoCivil().isEmpty()) {
					natural.setDatEstadoCivils(getEstadoCivilFromServiceResponse(
							informeType.getNaturalNacional().getInfoDemografica().getEstadoCivil(), natural, informe));
				}
				if (informeType.getNaturalNacional().getInfoDemografica().getOperacionesInternacionales() != null
						&& !informeType.getNaturalNacional().getInfoDemografica().getOperacionesInternacionales()
								.isEmpty()) {
					natural.setDatOperInternacionales(getOperacionesInternacionaleFromServiceResponse(
							informeType.getNaturalNacional().getInfoDemografica().getOperacionesInternacionales(),
							natural, informe));
				}
				if (informeType.getNaturalNacional().getInfoDemografica().getEstadoFinanciero() != null
						&& !informeType.getNaturalNacional().getInfoDemografica().getEstadoFinanciero().isEmpty()) {
					natural.setDatEstadoFinancieros(getEstadosFinancierosFromServiceResponse(
							informeType.getNaturalNacional().getInfoDemografica().getEstadoFinanciero(), natural,
							informe));
				}
				if (informeType.getNaturalNacional().getInfoDemografica().getPersonasACargo() != null
						&& !informeType.getNaturalNacional().getInfoDemografica().getPersonasACargo().isEmpty()) {
					natural.setDatPersonasACargos(getPersonasACargoFromServiceResponse(
							informeType.getNaturalNacional().getInfoDemografica().getPersonasACargo(), natural,
							informe));
				}
			}
			naturales.add(natural);
		}
		return naturales;
	}

	public DatNivelEstudio getNivelEstudioFromNivelEstudioResponse(InfoDemograficaType.NivelEstudios nivelEstudiosType,
			DatNaturale naturale, DatInforme informe) {
		DatNivelEstudio nivelEstudio = new DatNivelEstudio();
		nivelEstudio.setCEmp(informe.getCEmp());
		nivelEstudio.setFecha(AdapterUtil.toDate(nivelEstudiosType.getFecha()));
		nivelEstudio.setIdRegistro(nivelEstudiosType.getIdRegistro());
		nivelEstudio.setNitReporta(nivelEstudiosType.getNitReporta());
		nivelEstudio.setNivel(nivelEstudiosType.getNivel());
		nivelEstudio.setRazonSocial(nivelEstudio.getRazonSocial());
		nivelEstudio.setDatNaturale(naturale);
		nivelEstudio.setDatInforme(informe);
		return nivelEstudio;
	}

	public List<DatNivelEstudio> getNivelEstudioFromServiceResponse(
			List<InfoDemograficaType.NivelEstudios> nivelesEstudiosType, DatNaturale naturale, DatInforme informe) {
		List<DatNivelEstudio> nivelesEstudios = new ArrayList<DatNivelEstudio>();
		for (InfoDemograficaType.NivelEstudios nivelEstudiosType : nivelesEstudiosType) {
			nivelesEstudios.add(getNivelEstudioFromNivelEstudioResponse(nivelEstudiosType, naturale, informe));
		}
		return nivelesEstudios;
	}

	public List<DatObligacionesCliente> getObligacionesFromResponse(InformeType informeType, DatInforme informe) {
		List<DatObligacionesCliente> obligaciones = new ArrayList<DatObligacionesCliente>();
		List<DatObligacionesCliente> obligacionesTarjetas = new ArrayList<DatObligacionesCliente>();
		List<DatObligacionesCliente> obligacionesCartera = new ArrayList<DatObligacionesCliente>();
		if (informeType.getTarjetaCredito() != null && !informeType.getTarjetaCredito().isEmpty()) {
			obligacionesTarjetas = getTarjetasCredito(informeType.getTarjetaCredito(), informe);
		}
		if (informeType.getCuentaCartera() != null && !informeType.getCuentaCartera().isEmpty()) {
			obligacionesCartera = getCuentasCarteraa(informeType.getCuentaCartera(), informe);
		}
		obligaciones.addAll(obligacionesCartera);
		obligaciones.addAll(obligacionesTarjetas);
		return obligaciones;
	}

	public List<DatObligacionesCliente> getTarjetasCredito(List<TarjetaCreditoType> tarjetasCreditoType,
			DatInforme informe) {
		List<DatObligacionesCliente> obligacionesTarjetas = new ArrayList<DatObligacionesCliente>();
		for (TarjetaCreditoType tarjetaCreditoType : tarjetasCreditoType) {
			obligacionesTarjetas.add(getTarjetaCredito(tarjetaCreditoType, informe));
		}
		return obligacionesTarjetas;
	}

	public List<DatObligacionesCliente> getCuentasCarteraa(List<CuentaCarteraType> cuentasCarteraType,
			DatInforme informe) {
		List<DatObligacionesCliente> obligacionesCartera = new ArrayList<DatObligacionesCliente>();
		for (CuentaCarteraType cuentaCarteraType : cuentasCarteraType) {
			obligacionesCartera.add(getCuentaCartera(cuentaCarteraType, informe));
		}
		return obligacionesCartera;
	}

	public DatObligacionesCliente getTarjetaCredito(TarjetaCreditoType tarjetaCreditoType, DatInforme informe) {
		DatObligacionesCliente obligacion = new DatObligacionesCliente();
		if (tarjetaCreditoType.getReclamo() != null) {
			List<DatReclamo> reclamos = new ArrayList<DatReclamo>();
			reclamos.add(getReclamoFromResponse(tarjetaCreditoType.getReclamo(), null, null, obligacion));
			obligacion.setDatReclamos(reclamos);
		}
		obligacion.setDatInforme(informe);
		obligacion.setCEmp(informe.getCEmp());
		obligacion.setTipoObligacion("T");
		obligacion.setValorCuotasCanceladas(new BigDecimal(0));
		obligacion.setLlave(tarjetaCreditoType.getLlave());
		obligacion.setBloqueada(AdapterUtil.getCharFromBoolean(tarjetaCreditoType.isBloqueada()));
		obligacion.setEntidad(tarjetaCreditoType.getEntidad());
		obligacion.setNumero(tarjetaCreditoType.getNumero());
		obligacion.setFechaApertura(AdapterUtil.toDate(tarjetaCreditoType.getFechaApertura()));
		obligacion.setFechaVencimiento(AdapterUtil.toDate(tarjetaCreditoType.getFechaVencimiento()));
		obligacion.setComportamiento(tarjetaCreditoType.getComportamiento());
		obligacion.setFormaPago(tarjetaCreditoType.getFormaPago());
		if (tarjetaCreditoType.getProbabilidadIncumplimiento() != null) {
			obligacion
					.setProbabilidadIncumplimiento(new BigDecimal(tarjetaCreditoType.getProbabilidadIncumplimiento()));
		} else {
			obligacion.setProbabilidadIncumplimiento(new BigDecimal(0));
		}
		obligacion.setCalificacion(tarjetaCreditoType.getCalificacion());
		obligacion.setSituacionTitular(tarjetaCreditoType.getSituacionTitular());
		obligacion.setOficina(tarjetaCreditoType.getOficina());
		obligacion.setCiudad(tarjetaCreditoType.getCiudad());
		obligacion.setCodigoDaneCiudad(tarjetaCreditoType.getCodigoDaneCiudad());
		obligacion.setCodSuscriptor(tarjetaCreditoType.getCodSuscriptor());
		obligacion.setTipoIdentificacion(tarjetaCreditoType.getTipoIdentificacion());
		obligacion.setIdentificacion(tarjetaCreditoType.getIdentificacion());
		obligacion.setSector(tarjetaCreditoType.getSector());
		obligacion.setCalificacionhd(AdapterUtil.getCharFromBoolean(tarjetaCreditoType.isCalificacionHD()));
		obligacion.setIndependiente(tarjetaCreditoType.getIndependiente());
		if (tarjetaCreditoType.getCaracteristicas() != null) {
			obligacion.setCarTipoCuenta("TDC");
			obligacion.setCarTipoObligacion("1");
			obligacion.setCarCodigoAmparada(tarjetaCreditoType.getCaracteristicas().getCodigoAmparada());
			obligacion.setCarFranquicia(tarjetaCreditoType.getCaracteristicas().getFranquicia());
			obligacion.setCarClase(tarjetaCreditoType.getCaracteristicas().getClase());
			obligacion.setCarMarca(tarjetaCreditoType.getCaracteristicas().getMarca());
			obligacion.setCarAmparada(
					AdapterUtil.getCharFromBoolean(tarjetaCreditoType.getCaracteristicas().isAmparada()));
			obligacion.setCarGarantia(tarjetaCreditoType.getCaracteristicas().getGarantia());
		}
		if (tarjetaCreditoType.getValores() != null && tarjetaCreditoType.getValores().getValor() != null) {
			obligacion.setValorMoneda(tarjetaCreditoType.getValores().getValor().getMoneda());
			obligacion.setValorSaldoActual(new BigDecimal(tarjetaCreditoType.getValores().getValor().getSaldoActual()));
			obligacion.setValorSaldoMora(new BigDecimal(tarjetaCreditoType.getValores().getValor().getSaldoMora()));
			obligacion.setValorDisponible(new BigDecimal(tarjetaCreditoType.getValores().getValor().getDisponible()));
			obligacion.setValorCuota(new BigDecimal(tarjetaCreditoType.getValores().getValor().getCuota()));
			obligacion.setValorCupoTotal(new BigDecimal(tarjetaCreditoType.getValores().getValor().getCupoTotal()));
			if (tarjetaCreditoType.getValores().getValor().getCuotasMora() != null) {
				obligacion
						.setValorCuotasMora(new BigDecimal(tarjetaCreditoType.getValores().getValor().getCuotasMora()));
			} else {
				obligacion.setValorCuotasMora(new BigDecimal(0));
			}
			if (tarjetaCreditoType.getValores().getValor().getDiasMora() != null) {
				obligacion.setValorDiasMora(new BigDecimal(tarjetaCreditoType.getValores().getValor().getDiasMora()));
			} else {
				obligacion.setValorDiasMora(new BigDecimal(0));
			}
			obligacion.setValorCupoTotal(new BigDecimal(tarjetaCreditoType.getValores().getValor().getCupoTotal()));
			obligacion.setValorFechaPagoCuota(
					AdapterUtil.toDate(tarjetaCreditoType.getValores().getValor().getFechaPagoCuota()));
			obligacion.setValorFechaLimitePago(
					AdapterUtil.toDate(tarjetaCreditoType.getValores().getValor().getFechaLimitePago()));
			obligacion.setValorFecha(AdapterUtil.toDate(tarjetaCreditoType.getValores().getValor().getFecha()));
			obligacion.setValorCalificacion(tarjetaCreditoType.getValores().getValor().getCalificacion());
		}
		if (tarjetaCreditoType.getEstados() != null) {
			if (tarjetaCreditoType.getEstados().getEstadoCuenta() != null) {
				obligacion.setEstadoCuentaCodigo(tarjetaCreditoType.getEstados().getEstadoCuenta().getCodigo());
				obligacion.setEstadoCuentaFecha(
						AdapterUtil.toDate(tarjetaCreditoType.getEstados().getEstadoCuenta().getFecha()));
			}
			if (tarjetaCreditoType.getEstados().getEstadoOrigen() != null) {
				obligacion.setEstadoOrigenCodigo(tarjetaCreditoType.getEstados().getEstadoOrigen().getCodigo());
				obligacion.setEstadoOrigenFecha(
						AdapterUtil.toDate(tarjetaCreditoType.getEstados().getEstadoOrigen().getFecha()));
			}
			if (tarjetaCreditoType.getEstados().getEstadoPago() != null) {
				obligacion.setEstadoPagoCodigo(tarjetaCreditoType.getEstados().getEstadoPago().getCodigo());
				obligacion.setEstadoPagoFecha(
						AdapterUtil.toDate(tarjetaCreditoType.getEstados().getEstadoPago().getFecha()));
				if (tarjetaCreditoType.getEstados().getEstadoPago().getMeses() != null) {
					obligacion.setEstadoPagoMeses(
							new BigDecimal(tarjetaCreditoType.getEstados().getEstadoPago().getMeses()));
				} else {
					obligacion.setEstadoPagoMeses(new BigDecimal(0));
				}
			}
			if (tarjetaCreditoType.getEstados().getEstadoPlastico() != null) {
				obligacion.setEstadoPlasticoCodigo(tarjetaCreditoType.getEstados().getEstadoPlastico().getCodigo());
				obligacion.setEstadoPlasticoFecha(
						AdapterUtil.toDate(tarjetaCreditoType.getEstados().getEstadoPlastico().getFecha()));
			}
			if (tarjetaCreditoType.getAdjetivo() != null && !tarjetaCreditoType.getAdjetivo().isEmpty()) {
				obligacion.setDatAdjetivos(
						getAdjetivosFromServiceResponse(tarjetaCreditoType.getAdjetivo(), obligacion, informe));
			}
		}
		return obligacion;
	}

	public DatObligacionesCliente getCuentaCartera(CuentaCarteraType cuentaCarteraType, DatInforme informe) {
		DatObligacionesCliente obligacion = new DatObligacionesCliente();
		obligacion.setDatInforme(informe);
		obligacion.setLlave(cuentaCarteraType.getLlave());
		obligacion.setCEmp(informe.getCEmp());
		obligacion.setTipoObligacion("C");
		obligacion.setBloqueada(AdapterUtil.getCharFromBoolean(cuentaCarteraType.isBloqueada()));
		obligacion.setEntidad(cuentaCarteraType.getEntidad().toUpperCase());
		obligacion.setNumero(cuentaCarteraType.getNumero());
		obligacion.setFechaApertura(AdapterUtil.toDate(cuentaCarteraType.getFechaApertura()));
		obligacion.setFechaVencimiento(AdapterUtil.toDate(cuentaCarteraType.getFechaVencimiento()));
		obligacion.setComportamiento(cuentaCarteraType.getComportamiento());
		obligacion.setFormaPago(cuentaCarteraType.getFormaPago());
		if (cuentaCarteraType.getProbabilidadIncumplimiento() != null) {
			obligacion.setProbabilidadIncumplimiento(new BigDecimal(cuentaCarteraType.getProbabilidadIncumplimiento()));
		} else {
			obligacion.setProbabilidadIncumplimiento(new BigDecimal(0));
		}
		obligacion.setCalificacion(cuentaCarteraType.getCalificacion());
		obligacion.setSituacionTitular(cuentaCarteraType.getSituacionTitular());
		obligacion.setOficina(cuentaCarteraType.getOficina());
		obligacion.setCiudad(cuentaCarteraType.getCiudad());
		obligacion.setCodigoDaneCiudad(cuentaCarteraType.getCodigoDaneCiudad());
		obligacion.setCodSuscriptor(cuentaCarteraType.getCodSuscriptor());
		obligacion.setTipoIdentificacion(cuentaCarteraType.getTipoIdentificacion());
		obligacion.setIdentificacion(cuentaCarteraType.getIdentificacion());
		obligacion.setSector(cuentaCarteraType.getSector());
		obligacion.setCalificacionhd(AdapterUtil.getCharFromBoolean(cuentaCarteraType.isCalificacionHD()));
		obligacion.setIndependiente(cuentaCarteraType.getIndependiente());
		if (cuentaCarteraType.getCaracteristicas() != null) {
			obligacion.setCarTipoCuenta(cuentaCarteraType.getCaracteristicas().getTipoCuenta());
			if (cuentaCarteraType.getCaracteristicas().getTipoObligacion() != null) {
				obligacion.setCarTipoObligacion(cuentaCarteraType.getCaracteristicas().getTipoObligacion());
			} else {
				obligacion.setCarTipoObligacion("F");
			}
			obligacion.setCarTipoContrato(cuentaCarteraType.getCaracteristicas().getTipoContrato());
			obligacion.setCarEjecucionContrato(
					new BigDecimal(cuentaCarteraType.getCaracteristicas().getEjecucionContrato()));
			if (cuentaCarteraType.getCaracteristicas().getMesesPermanencia() != null) {
				obligacion.setCarMesesPermanencia(
						new BigDecimal(cuentaCarteraType.getCaracteristicas().getMesesPermanencia()));
			}
			obligacion.setCarFechaPermanencia(
					AdapterUtil.toDate(cuentaCarteraType.getCaracteristicas().getFechaPermanencia()));
			obligacion.setCarCalidadDeudor(cuentaCarteraType.getCaracteristicas().getCalidadDeudor());
			obligacion.setCarGarantia(cuentaCarteraType.getCaracteristicas().getGarantia());
		}
		if (cuentaCarteraType.getValores() != null && cuentaCarteraType.getValores().getValor() != null) {
			obligacion.setValorMoneda(cuentaCarteraType.getValores().getValor().getMoneda());
			obligacion.setValorSaldoActual(new BigDecimal(cuentaCarteraType.getValores().getValor().getSaldoActual()));
			obligacion.setValorSaldoMora(new BigDecimal(cuentaCarteraType.getValores().getValor().getSaldoMora()));
			obligacion.setValorDisponible(new BigDecimal(cuentaCarteraType.getValores().getValor().getDisponible()));
			obligacion.setValorCuota(new BigDecimal(cuentaCarteraType.getValores().getValor().getCuota()));
			obligacion
					.setValorValorInicial(new BigDecimal(cuentaCarteraType.getValores().getValor().getValorInicial()));
			if (cuentaCarteraType.getValores().getValor().getCuotasMora() != null) {
				obligacion
						.setValorCuotasMora(new BigDecimal(cuentaCarteraType.getValores().getValor().getCuotasMora()));
			} else {
				obligacion.setValorCuotasMora(new BigDecimal(0));
			}
			if (cuentaCarteraType.getValores().getValor().getDiasMora() != null) {
				obligacion.setValorDiasMora(new BigDecimal(cuentaCarteraType.getValores().getValor().getDiasMora()));
			} else {
				obligacion.setValorDiasMora(new BigDecimal(0));
			}
			if (cuentaCarteraType.getValores().getValor().getCuotasCanceladas() != null) {
				obligacion.setValorCuotasCanceladas(
						new BigDecimal(cuentaCarteraType.getValores().getValor().getCuotasCanceladas()));
			} else {
				obligacion.setValorCuotasCanceladas(new BigDecimal(0));
			}
			if (cuentaCarteraType.getValores().getValor().getTotalCuotas() != null) {
				obligacion.setValorTotalCuotas(
						new BigDecimal(cuentaCarteraType.getValores().getValor().getTotalCuotas()));
			} else {
				obligacion.setValorTotalCuotas(new BigDecimal(0));
			}
			obligacion.setValorPeriodicidad(cuentaCarteraType.getValores().getValor().getPeriodicidad());
			obligacion.setValorFechaPagoCuota(
					AdapterUtil.toDate(cuentaCarteraType.getValores().getValor().getFechaPagoCuota()));
			obligacion.setValorFechaLimitePago(
					AdapterUtil.toDate(cuentaCarteraType.getValores().getValor().getFechaLimitePago()));
			obligacion.setValorFecha(AdapterUtil.toDate(cuentaCarteraType.getValores().getValor().getFecha()));
			obligacion.setValorCalificacion(cuentaCarteraType.getValores().getValor().getCalificacion());
		}
		if (cuentaCarteraType.getEstados() != null) {
			if (cuentaCarteraType.getEstados().getEstadoCuenta() != null) {
				obligacion.setEstadoCuentaCodigo(cuentaCarteraType.getEstados().getEstadoCuenta().getCodigo());
				obligacion.setEstadoCuentaFecha(
						AdapterUtil.toDate(cuentaCarteraType.getEstados().getEstadoCuenta().getFecha()));
			}
			if (cuentaCarteraType.getEstados().getEstadoOrigen() != null) {
				obligacion.setEstadoOrigenCodigo(cuentaCarteraType.getEstados().getEstadoOrigen().getCodigo());
				obligacion.setEstadoOrigenFecha(
						AdapterUtil.toDate(cuentaCarteraType.getEstados().getEstadoOrigen().getFecha()));
			}
			if (cuentaCarteraType.getEstados().getEstadoPago() != null) {
				obligacion.setEstadoPagoCodigo(cuentaCarteraType.getEstados().getEstadoPago().getCodigo());
				obligacion.setEstadoPagoFecha(
						AdapterUtil.toDate(cuentaCarteraType.getEstados().getEstadoPago().getFecha()));
				obligacion
						.setEstadoPagoMeses(new BigDecimal(cuentaCarteraType.getEstados().getEstadoPago().getMeses()));
			}
			if (cuentaCarteraType.getAdjetivo() != null && !cuentaCarteraType.getAdjetivo().isEmpty()) {
				obligacion.setDatAdjetivos(
						getAdjetivosFromServiceResponse(cuentaCarteraType.getAdjetivo(), obligacion, informe));
			}
		}
		return obligacion;
	}

	public DatOperInternacionale getOperacionesInternacionaleFromOperacionesInternacionaleResponse(
			InfoDemograficaType.OperacionesInternacionales operacionInternacionalType, DatNaturale naturales,
			DatInforme informe) {
		DatOperInternacionale operacionInternacional = new DatOperInternacionale();
		operacionInternacional.setCEmp(informe.getCEmp());
		operacionInternacional.setFecha(AdapterUtil.toDate(operacionInternacionalType.getFecha()));
		operacionInternacional.setIdRegistro(operacionInternacionalType.getIdRegistro());
		operacionInternacional.setNitReporta(operacionInternacionalType.getNitReporta());
		operacionInternacional.setOperaInt(AdapterUtil.getCharFromBoolean(operacionInternacionalType.isOperaInt()));
		operacionInternacional.setRazonSocial(operacionInternacionalType.getRazonSocial());
		operacionInternacional.setDatInforme(informe);
		operacionInternacional.setDatNaturale(naturales);
		return operacionInternacional;
	}

	public List<DatOperInternacionale> getOperacionesInternacionaleFromServiceResponse(
			List<InfoDemograficaType.OperacionesInternacionales> operacionesInternacionalesType, DatNaturale naturales,
			DatInforme informe) {
		List<DatOperInternacionale> operacionesInternacionales = new ArrayList<DatOperInternacionale>();
		for (InfoDemograficaType.OperacionesInternacionales operacionInternacionalType : operacionesInternacionalesType) {
			operacionesInternacionales.add(getOperacionesInternacionaleFromOperacionesInternacionaleResponse(
					operacionInternacionalType, naturales, informe));
		}
		return operacionesInternacionales;
	}

	public DatParteDireccion getParteDireccionFromResponse(ParteDireccionType parteDireccionType,
			DatDireccione direccion, DatInforme informe) {
		DatParteDireccion parteDireccion = new DatParteDireccion();
		parteDireccion.setCodigo(parteDireccionType.getCodigo());
		parteDireccion.setTipo(parteDireccionType.getTipo());
		parteDireccion.setDatDireccione(direccion);
		parteDireccion.setValor(parteDireccionType.getValor());
		parteDireccion.setDatInforme(informe);
		parteDireccion.setCEmp(informe.getCEmp());
		return parteDireccion;
	}

	public List<DatParteDireccion> getPartesDireccionesFromServiceResponse(
			List<ParteDireccionType> partesDireccionesType, DatDireccione direccion, DatInforme informe) {
		List<DatParteDireccion> direcciones = new ArrayList<DatParteDireccion>();
		for (ParteDireccionType parteDireccionType : partesDireccionesType) {
			direcciones.add(getParteDireccionFromResponse(parteDireccionType, direccion, informe));
		}
		return direcciones;
	}

	public DatPersonasACargo getPersonasACargoFromPersonasACargoResponse(
			InfoDemograficaType.PersonasACargo personasACargoType, DatNaturale naturale, DatInforme informe) {
		DatPersonasACargo personaACargo = new DatPersonasACargo();
		personaACargo.setCantidad(new BigDecimal(personasACargoType.getCantidad()));
		personaACargo.setCEmp(informe.getCEmp());
		personaACargo.setFecha(AdapterUtil.toDate(personasACargoType.getFecha()));
		personaACargo.setIdRegistro(personasACargoType.getIdRegistro());
		personaACargo.setNitReporta(personasACargoType.getNitReporta());
		personaACargo.setRazonSocial(personasACargoType.getRazonSocial());
		personaACargo.setDatNaturale(naturale);
		personaACargo.setDatInforme(informe);
		return personaACargo;
	}

	public List<DatPersonasACargo> getPersonasACargoFromServiceResponse(
			List<InfoDemograficaType.PersonasACargo> personasACargoType, DatNaturale naturale, DatInforme informe) {
		List<DatPersonasACargo> personasACargo = new ArrayList<DatPersonasACargo>();
		for (InfoDemograficaType.PersonasACargo personaACargoType : personasACargoType) {
			personasACargo.add(getPersonasACargoFromPersonasACargoResponse(personaACargoType, naturale, informe));
		}
		return personasACargo;
	}

	public List<DatProductosValore> getProductosValoresFromResponse(ProductosValoresType productosValoresType,
			DatInforme informe) {
		List<DatProductosValore> productoValor = new ArrayList<DatProductosValore>();
		DatProductosValore productosValores = new DatProductosValore();
		productosValores.setClasificacion(productosValoresType.getClasificacion());
		productosValores.setProducto(productosValoresType.getProducto());
		productosValores.setRazon1(productosValoresType.getRazon1());
		productosValores.setRazon10(productosValoresType.getRazon10());
		productosValores.setRazon2(productosValoresType.getRazon2());
		productosValores.setRazon3(productosValoresType.getRazon3());
		productosValores.setRazon4(productosValoresType.getRazon4());
		productosValores.setRazon5(productosValoresType.getRazon5());
		productosValores.setRazon6(productosValoresType.getRazon6());
		productosValores.setRazon7(productosValoresType.getRazon7());
		productosValores.setRazon8(productosValoresType.getRazon8());
		productosValores.setRazon9(productosValoresType.getRazon9());
		productosValores.setValor1(productosValoresType.getValor1());
		productosValores.setValor2(productosValoresType.getValor2());
		productosValores.setValor3(productosValoresType.getValor3());
		productosValores.setValor4(productosValoresType.getValor4());
		productosValores.setValor5(productosValoresType.getValor5());
		productosValores.setValor6(productosValoresType.getValor6());
		productosValores.setValor7(productosValoresType.getValor7());
		productosValores.setValor8(productosValoresType.getValor8());
		productosValores.setValor9(productosValoresType.getValor9());
		productosValores.setValor10(productosValoresType.getValor10());
		productosValores.setValor1smlv(productosValoresType.getValor1Smlv());
		productosValores.setValor2smlv(productosValoresType.getValor2Smlv());
		productosValores.setValor3smlv(productosValoresType.getValor3Smlv());
		productosValores.setValor4smlv(productosValoresType.getValor4Smlv());
		productosValores.setValor5smlv(productosValoresType.getValor5Smlv());
		productosValores.setValor6smlv(productosValoresType.getValor6Smlv());
		productosValores.setValor7smlv(productosValoresType.getValor7Smlv());
		productosValores.setValor8smlv(productosValoresType.getValor8Smlv());
		productosValores.setValor9smlv(productosValoresType.getValor9Smlv());
		productosValores.setValor10smlv(productosValoresType.getValor10Smlv());
		productosValores.setCEmp(informe.getCEmp());
		productosValores.setDatInforme(informe);
		productoValor.add(productosValores);
		return productoValor;
	}

	public DatRazon getRazonFromResponse(ScoreType.Razon razonType, DatScore score, DatInforme informe) {
		DatRazon razon = new DatRazon();
		razon.setCEmp(informe.getCEmp());
		razon.setDatScore(score);
		razon.setDatInforme(informe);
		razon.setCodigo(razonType.getCodigo());
		return null;
	}

	public List<DatRazon> getRazonesFromResponse(List<ScoreType.Razon> razonTypes, DatScore score, DatInforme informe) {
		List<DatRazon> razones = new ArrayList<DatRazon>();
		for (ScoreType.Razon razonType : razonTypes) {
			razones.add(getRazonFromResponse(razonType, score, informe));
		}
		return razones;
	}

	public DatReclamo getReclamoFromResponse(ReclamoType reclamoType, DatInforme informe, DatCuentasCliente cuenta,
			DatObligacionesCliente obligacion) {
		DatReclamo reclamo = new DatReclamo();
		if (cuenta != null) {
			reclamo.setDatCuentasCliente(cuenta);
		}
		if (obligacion != null) {
			reclamo.setDatObligacionesCliente(obligacion);
		}
		if (informe != null) {
			reclamo.setDatInforme(informe);
		}
		reclamo.setCEmp(informe != null ? informe.getCEmp() : null);
		reclamo.setEntidad(reclamoType.getEntidad());
		reclamo.setEstado(reclamoType.getEstado());
		reclamo.setFecha(AdapterUtil.toDate(reclamoType.getFecha()));
		reclamo.setFechaCierre(AdapterUtil.toDate(reclamoType.getFechaCierre()));
		reclamo.setLlave(reclamoType.getLlave());
		reclamo.setNumero(reclamoType.getNumero());
		reclamo.setNumeroCuenta(reclamoType.getNumeroCuenta());
		reclamo.setRatificado(AdapterUtil.getCharFromBoolean(reclamoType.isRatificado()));
		reclamo.setTexto(reclamoType.getTexto());
		reclamo.setTipo(reclamoType.getTipo());
		reclamo.setTipoLeyenda(reclamoType.getTipoLeyenda());
		if (reclamoType.getSubtipo() != null && !reclamoType.getSubtipo().isEmpty()) {
			reclamo.setDatSubtipos(getSubtipoFromServiceResponse(reclamoType.getSubtipo(), reclamo, informe));
		}
		return reclamo;
	}

	public List<DatReclamo> getReclamosFromResponse(List<ReclamoType> reclamosType, DatInforme informe,
			DatCuentasCliente cuenta, DatObligacionesCliente obligacion) {
		List<DatReclamo> reclamos = new ArrayList<DatReclamo>();
		for (ReclamoType reclamoType : reclamosType) {
			reclamos.add(getReclamoFromResponse(reclamoType, informe, cuenta, obligacion));
		}
		return reclamos;

	}

	Map<String, String> test = new HashMap<String, String>();

	public DatRespuestaPersLinea getRespuestaPersLineaFromComentarioResponse(LineaType lineaType, DatInforme informe) {
		DatRespuestaPersLinea respuestaPersLinea = new DatRespuestaPersLinea();
		respuestaPersLinea.setCEmp(informe.getCEmp());
		respuestaPersLinea.setConsecutivo(new BigDecimal(lineaType.getConsecutivo()));
		respuestaPersLinea.setValor(lineaType.getValue());
		respuestaPersLinea.setDatInforme(informe);
		/*
		 * String[] test2 = lineaType.getValue().split("]["); int i = 0;
		 * while(i<test2.length) { String key = "", value = "";
		 * if(test2[i].startsWith("[")) { key = test2[i].substring(1); } else { key =
		 * test2[i]; } i++; if(test2[i].endsWith("]")) { value = test2[i].substring(1);
		 * } else { value = test2[i]; } i++; test.put(key, value); }
		 */
		return respuestaPersLinea;
	}

	public List<DatRespuestaPersLinea> getRespuestaPersLineaFromServiceResponse(List<LineaType> lineasType,
			DatInforme informe) {
		test = new HashMap<String, String>();
		List<DatRespuestaPersLinea> respuestasPersonalinadasLinea = new ArrayList<DatRespuestaPersLinea>();
		for (LineaType lineaType : lineasType) {
			respuestasPersonalinadasLinea.add(getRespuestaPersLineaFromComentarioResponse(lineaType, informe));
		}
		return respuestasPersonalinadasLinea;
	}

	public List<DatDictum> getRespuestaDictumFromServiceResponse(List<LineaType> lineasType, DatInforme informe) {
		test = new HashMap<String, String>();
		List<DatDictum> respDictum = new ArrayList<DatDictum>();
		String separador = Pattern.quote("][");
		for (LineaType lineaType : lineasType) {
			DatDictum resDactdictum = new DatDictum();

			String lineas = lineaType.getValue();
			String[] arrlineas = lineas.split(separador);
			String key = "";
			String valor = "";
			for (int i = 0; i < arrlineas.length; i++) {
				if (i == 0 || i == 2) {
					if (arrlineas[i].startsWith("[")) {
						key = arrlineas[i].substring(1);
					} else {
						key = arrlineas[i];
					}
				}
				if (i == 1 || i == 3) {
					if (arrlineas[i].endsWith("]")) {
						valor = arrlineas[i].substring(0, arrlineas[i].length() - 1);
					} else {
						valor = arrlineas[i];
					}
					resDactdictum.setCEmp(informe.getCEmp());
					resDactdictum.setDatInforme(informe);
					resDactdictum.setLlave(key);
					resDactdictum.setValor(valor);
					respDictum.add(resDactdictum);
					resDactdictum = new DatDictum();
				}
			}

		}
		return respDictum;
	}

	public Boolean guardapreselecta(List<LineaType> lineasType) {
		Boolean respuesta=false;
		String separador = Pattern.quote("][");
		for (LineaType lineaType : lineasType) {
			String lineas = lineaType.getValue();
			String[] arrlineas = lineas.split(separador);
			String key = "";
			String valor = "";
			for (int i = 0; i < arrlineas.length; i++) {
				if (i == 0 || i == 2) {
					if (arrlineas[i].startsWith("[")) {
						key = arrlineas[i].substring(1);
					} else {
						key = arrlineas[i];
					}
				}
				if (i == 1 || i == 3) {
					if (arrlineas[i].endsWith("]")) {
						valor = arrlineas[i].substring(0, arrlineas[i].length() - 1);
					} else {
						valor = arrlineas[i];
					}					
					if(key.equals("NODO")) {
						int val=Integer.parseInt(valor);
						if(val==0) {
							respuesta=true;							
						}
					}
				}
			}
		}

		return respuesta;
	}
	public List<DatArbolesDictum> getRespuestaArbolesDictumFromServiceResponse(List<LineaType> lineasType, DatInforme informe) {
		test = new HashMap<String, String>();
		List<DatArbolesDictum> respDictum = new ArrayList<DatArbolesDictum>();
		String separador = Pattern.quote("][");
		DatArbolesDictum resDactdictum = new DatArbolesDictum();
		resDactdictum.setcEmp(informe.getCEmp());
		resDactdictum.setDatInforme(informe);
		resDactdictum.setN_IDE(informe.getIdentificacionDigitada());
		for (LineaType lineaType : lineasType) {

			String lineas = lineaType.getValue();
			String[] arrlineas = lineas.split(separador);
			String key = "";
			String valor = "";

			for (int i = 0; i < arrlineas.length; i++) {
				if (i == 0 || i == 2) {
					if (arrlineas[i].startsWith("[")) {
						key = arrlineas[i].substring(1);
					} else {
						key = arrlineas[i];
					}
				}
				if (i == 1 || i == 3) {
					if (arrlineas[i].endsWith("]")) {
						valor = arrlineas[i].substring(0, arrlineas[i].length() - 1);
					} else {
						valor = arrlineas[i];
					}
					
					if(key.equals("ACIERTA_MASTER")) {
						resDactdictum.setACIERTA_MASTER(valor);
						}
					else if(key.equals("NODO")) {resDactdictum.setNODO(valor);}
					else if(key.equals("NIVEL_DE_RIESGO")) {resDactdictum.setNIVEL_DE_RIESGO(valor);}
					else if(key.equals("CO01MOR081RO")) {resDactdictum.setCO01MOR081RO(valor);}
					else if(key.equals("CO02END015CB")) {resDactdictum.setCO02END015CB(valor);}
					else if(key.equals("CO02NUM056CB")) {resDactdictum.setCO02NUM056CB(valor);}
					else if(key.equals("CO01END009RO")) {resDactdictum.setCO01END009RO(valor);}
					else if(key.equals("CO01END015RO")) {resDactdictum.setCO01END015RO(valor);}
					else if(key.equals("CO01END071RO")) {resDactdictum.setCO01END071RO(valor);}
					else if(key.equals("CO01END076RO")) {resDactdictum.setCO01END076RO(valor);}
					else if(key.equals("MARCADATA")) {resDactdictum.setMARCADATA(valor);}
					else if(key.equals("DECISION")) {resDactdictum.setDECISION(valor);}
					else if(key.equals("CUPO_PERFIL")) {
						float f=Float.parseFloat(valor);
						resDactdictum.setCUPO_PERFIL(f);
						;}
					else if(key.equals("FILTRO")) {resDactdictum.setFILTRO(valor);}
					else if(key.equals("NUM_FILTRO")) {resDactdictum.setNUM_FILTRO(valor);}
					else if(key.equals("EXCEPCION")) {resDactdictum.setEXCEPCION(valor);}
					else if(key.equals("PERFIL_CLIENTE")) {resDactdictum.setPERFIL_CLIENTE(valor);}
					else if(key.equals("MORA_CC_DR_ULT_6M_SIN_REAL")) {resDactdictum.setMORA_CC_DR_ULT_6M_SIN_REAL(valor);}
					else if(key.equals("MORA_CC_DR_ULT_6M_REAL")) {resDactdictum.setMORA_CC_DR_ULT_6M_REAL(valor);}
					else if(key.equals("MORA_CC_DR_ULT_6M_TODO")) {resDactdictum.setMORA_CC_DR_ULT_6M_TODO(valor);}
					else if(key.equals("MORA_MAX_CC_DR_ULT_12M_SIN_REAL")) {resDactdictum.setMORA_MAX_CC_DR_ULT_12M_SIN_REAL(valor);}
					else if(key.equals("MORA_MAX_CC_DR_ULT_12M_REAL")) {resDactdictum.setMORA_MAX_CC_DR_ULT_12M_REAL(valor);}
					else if(key.equals("MORA_MAX_CC_DR_ULT_12M_TODO")) {resDactdictum.setMORA_MAX_CC_DR_ULT_12M_TODO(valor);}
					else if(key.equals("OBLIG_ABIERTAS")) {resDactdictum.setOBLIG_ABIERTAS(valor);}
					else if(key.equals("OBLIG_CERRADAS_ULT_12M_SIN_REAL")) {resDactdictum.setOBLIG_CERRADAS_ULT_12M_SIN_REAL(valor);}
					else if(key.equals("OBLIG_CERRADAS_ULT_12M_REAL")) {resDactdictum.setOBLIG_CERRADAS_ULT_12M_REAL(valor);}
					else if(key.equals("OBLIG_CERRADAS_ULT_12M_TODO")) {resDactdictum.setOBLIG_CERRADAS_ULT_12M_TODO(valor);}
					else if(key.equals("MORA_90_O_MAS_ULT_6M_SIN_REAL")) {resDactdictum.setMORA_90_O_MAS_ULT_6M_SIN_REAL(valor);}
					else if(key.equals("MORA_90_O_MAS_ULT_6M_REAL")) {resDactdictum.setMORA_90_O_MAS_ULT_6M_REAL(valor);}
					else if(key.equals("MORA_90_O_MAS_ULT_6M_TODO")) {resDactdictum.setMORA_90_O_MAS_ULT_6M_TODO(valor);}
					else if(key.equals("MORA_MAX_90_O_MAS_ULT_12M_SIN_REAL")) {resDactdictum.setMORA_MAX_90_O_MAS_ULT_12M_SIN_REAL(valor);}
					else if(key.equals("MORA_MAX_90_O_MAS_ULT_12M_REAL")) {resDactdictum.setMORA_MAX_90_O_MAS_ULT_12M_REAL(valor);}
					else if(key.equals("MORA_MAX_90_O_MAS_ULT_12M_TODO")) {resDactdictum.setMORA_MAX_90_O_MAS_ULT_12M_TODO(valor);}
					else if(key.equals("MORA_AL_DIA_ULT_12M")) {resDactdictum.setMORA_AL_DIA_ULT_12M(valor);}
					else if(key.equals("MORA_ACTUAL_SIN_REAL")) {resDactdictum.setMORA_ACTUAL_SIN_REAL(valor);}
					else if(key.equals("MORA_ACTUAL_REAL")) {resDactdictum.setMORA_ACTUAL_REAL(valor);}
					else if(key.equals("MORA_ACTUAL_TODO")) {resDactdictum.setMORA_ACTUAL_TODO(valor);}
					else if(key.equals("OBLIG_ABIERTAS_SIN_MORAS")) {resDactdictum.setOBLIG_ABIERTAS_SIN_MORAS(valor);}
					else if(key.equals("OBLIG_TDC")) {resDactdictum.setOBLIG_TDC(valor);}
					else if(key.equals("CUPO_TDC")) {resDactdictum.setCUPO_TDC(valor);}
					/*
					 * ---key----> PORC_ESTIMADO  ---value----> 0.15
					 * ---key----> FACTOR  ---value----> 16.10306
					 * 
					 * 
					 * */
					else if(key.equals("PORC_ESTIMADO")) {
						float f=Float.parseFloat(valor);
						resDactdictum.setPORC_ESTIMADO(f)
						;}
					else if(key.equals("FACTOR")) {
						float f=Float.parseFloat(valor);
						resDactdictum.setFACTOR(f);}
					else if(key.equals("MORA_30_O_60_ULT_6M_SIN_REAL")) {resDactdictum.setMORA_30_O_60_ULT_6M_SIN_REAL(valor);}
					else if(key.equals("MORA_30_O_60_ULT_6M_REAL")) {resDactdictum.setMORA_30_O_60_ULT_6M_REAL(valor);}
					else if(key.equals("MORA_MAX_30_O_60_ULT_12M_SIN_REAL")) {resDactdictum.setMORA_MAX_30_O_60_ULT_12M_SIN_REAL(valor);}
					else if(key.equals("MORA_MAX_30_O_60_ULT_12M_REAL")) {resDactdictum.setMORA_MAX_30_O_60_ULT_12M_REAL(valor);}
					else if(key.equals("OBLIG_ABIERTAS_SIN_REAL")) {resDactdictum.setOBLIG_ABIERTAS_SIN_REAL(valor);}
					else if(key.equals("MORA_60_O_MAS_ULT_12M_SIN_REAL")) {resDactdictum.setMORA_60_O_MAS_ULT_12M_SIN_REAL(valor);}
					else if(key.equals("MORA_60_O_MAS_ULT_12M_REAL")) {resDactdictum.setMORA_60_O_MAS_ULT_12M_REAL(valor);}
					else if(key.equals("MORA_60_O_MAS_ULT_12M_TODO")) {resDactdictum.setMORA_60_O_MAS_ULT_12M_TODO(valor);}
					else if(key.equals("MORA_60_O_MAS_ULT_6M_SIN_REAL")) {resDactdictum.setMORA_60_O_MAS_ULT_6M_SIN_REAL(valor);}
					else if(key.equals("MORA_60_O_MAS_ULT_6M_REAL")) {resDactdictum.setMORA_60_O_MAS_ULT_6M_REAL(valor);}
					else if(key.equals("MORA_60_O_MAS_ULT_6M_TODO")) {resDactdictum.setMORA_60_O_MAS_ULT_6M_TODO(valor);}
					else if(key.equals("CLIENTES_OBLIG_CREDIJAMAR")) {resDactdictum.setCLIENTES_OBLIG_CREDIJAMAR(valor);}
					else if(key.equals("TIPO_CLIENTE")) {resDactdictum.setTIPO_CLIENTE(valor);}
					
					
				}
			}


		}
		resDactdictum.setFechaconsulta(new java.util.Date());

		respDictum.add(resDactdictum);
		resDactdictum = new DatArbolesDictum();

		return respDictum;
	}

	public List<DatPreselecta> getPreselecta(InformeType informeType,DatInforme informe) {
		List<DatPreselecta> respDictum = new ArrayList<DatPreselecta>();
		DatPreselecta resDactdictum = new DatPreselecta();
		resDactdictum.setcEmp(informe.getCEmp());
		resDactdictum.setAPELLIDO(informeType.getApellidoDigitado());
		resDactdictum.setFechaConsulta(AdapterUtil.toDate(informeType.getFechaConsulta()));
		resDactdictum.setN_IDE(informeType.getIdentificacionDigitada());
		resDactdictum.setRESPUESTA(informeType.getRespuesta());
		resDactdictum.setUSUARIO("HISTCREDITO");
		respDictum.add(resDactdictum);
		return respDictum;
	}
	public DatPreselecta getPreselectava(InformeType informeType,String cemp) {
		DatPreselecta resDacPreselecta = new DatPreselecta();
		resDacPreselecta.setcEmp(cemp);
		resDacPreselecta.setAPELLIDO(informeType.getApellidoDigitado());
		resDacPreselecta.setFechaConsulta(AdapterUtil.toDate(informeType.getFechaConsulta()));
		resDacPreselecta.setN_IDE(informeType.getIdentificacionDigitada());
		resDacPreselecta.setRESPUESTA(informeType.getRespuesta());
		resDacPreselecta.setUSUARIO("HISTCREDITO");
		resDacPreselecta.setDatPreRespPersonalizada(getRespPersPreslFromServiceResponse(informeType.getRespuestaPersonalizada().getLinea(),resDacPreselecta));
		resDacPreselecta.setDatPreScoreMotor(getRespScorelFromServiceResponse(informeType.getScore(),resDacPreselecta));
		resDacPreselecta.setDatPreNaturalNacional(getNaturalePreFromResponse(informeType,resDacPreselecta));
		return resDacPreselecta;
	}
	
	// informacion de naturales
	
	public List<DatPreNaturalNacional> getNaturalePreFromResponse(InformeType informeType, DatPreselecta preselecta) {
		List<DatPreNaturalNacional> naturales = new ArrayList<DatPreNaturalNacional>();
		DatPreNaturalNacional natural;
		if (informeType.getNaturalExtranjera() != null) {
			natural = new DatPreNaturalNacional();
			natural.setcEmp(preselecta.getcEmp());
			natural.setDatPreselecta(preselecta);
			natural.setNOMBRECOMPLETO(informeType.getNaturalExtranjera().getNombre());
			if(informeType.getNaturalExtranjera().isValidada()) {
				natural.setVALIDADA("true");				
			}else {
				natural.setVALIDADA("false");

			}
			natural.setIDENTIFICACION(informeType.getNaturalExtranjera().getNumero());		
			natural.setPRIMERAPELLIDO(informeType.getApellidoDigitado());		

			if (informeType.getNaturalExtranjera().isRut() != null) {
				natural.setRut(AdapterUtil.getCharFromBoolean(informeType.getNaturalExtranjera().isRut()));
			}
			naturales.add(natural);
		} else if (informeType.getNaturalNacional() != null) {
			natural = new DatPreNaturalNacional();
			natural.setcEmp(preselecta.getcEmp());
			natural.setDatPreselecta(preselecta);

			
			natural.setNOMBRES(informeType.getNaturalNacional().getNombres());
			natural.setPRIMERAPELLIDO(informeType.getNaturalNacional().getPrimerApellido());
			natural.setSEGUNDOAPELLIDO(informeType.getNaturalNacional().getSegundoApellido());
			natural.setNOMBRECOMPLETO(informeType.getNaturalNacional().getNombreCompleto());
			
			if (informeType.getNaturalNacional().getGenero() != null) {
				natural.setGENERO(informeType.getNaturalNacional().getGenero());
			}
			
			if (informeType.getNaturalNacional().getEdad() != null) {
				if (informeType.getNaturalNacional().getEdad().getMax() != null) {
					natural.setEDADMIN(new BigDecimal(informeType.getNaturalNacional().getEdad().getMax()));
				} else {
					natural.setEDADMIN(new BigDecimal(0));
				}
				natural.setEDADMIN(new BigDecimal(informeType.getNaturalNacional().getEdad().getMin()));
			}
			if(informeType.getNaturalNacional().isValidada()) {
				natural.setVALIDADA("true");				
			}else {
				natural.setVALIDADA("false");

			}
			natural.setRut(AdapterUtil.getCharFromBoolean(informeType.getNaturalNacional().isRut()));
			

			naturales.add(natural);
		}
		return naturales;
	}

	
	//informacion de naturales 
	
	
	
	
	

	public List<DatPreScoreMotor> getRespScorelFromServiceResponse(List<ScoreType> scoresTypes, DatPreselecta preselecta) {
		test = new HashMap<String, String>();
		List<DatPreScoreMotor> respDatRespPers = new ArrayList<DatPreScoreMotor>();
		for (ScoreType scoreType : scoresTypes) {
			respDatRespPers.add(getScorePreFromResponse(scoreType, preselecta));
		}		
		return respDatRespPers;
	}

	public DatPreScoreMotor getScorePreFromResponse(ScoreType scoreType, DatPreselecta preselecta) {
		DatPreScoreMotor score = new DatPreScoreMotor();

		score.setcEmp(preselecta.getcEmp());
		score.setCLASIFICACION(scoreType.getClasificacion());
		score.setDatPreselecta(preselecta);
		score.setPUNTAJE(new BigDecimal(scoreType.getPuntaje()));
		score.setTIPO(scoreType.getTipo());	
		return score;
	}
	public List<DatPreRespPersonalizada> getRespPersPreslFromServiceResponse(List<LineaType> lineasType, DatPreselecta preselecta) {
		test = new HashMap<String, String>();
		List<DatPreRespPersonalizada> respDatRespPers = new ArrayList<DatPreRespPersonalizada>();
		String separador = Pattern.quote("][");
		for (LineaType lineaType : lineasType) {
			DatPreRespPersonalizada resDatresp = new DatPreRespPersonalizada();

			String lineas = lineaType.getValue();
			String[] arrlineas = lineas.split(separador);
			String key = "";
			String valor = "";
			for (int i = 0; i < arrlineas.length; i++) {
				if (i == 0 || i == 2) {
					if (arrlineas[i].startsWith("[")) {
						key = arrlineas[i].substring(1);
					} else {
						key = arrlineas[i];
					}
				}
				if (i == 1 || i == 3) {
					if (arrlineas[i].endsWith("]")) {
						valor = arrlineas[i].substring(0, arrlineas[i].length() - 1);
					} else {
						valor = arrlineas[i];
					}
					resDatresp.setcEmp(preselecta.getcEmp());
					resDatresp.setDatPreselecta(preselecta);
					resDatresp.setNOMBRE(key);
					resDatresp.setVALOR(valor);
					respDatRespPers.add(resDatresp);
					resDatresp = new DatPreRespPersonalizada();
				}
			}

		}
		return respDatRespPers;
	}

	public List<DatResumenPerfilGeneral> getResumesPerfilGeneralFromServiceResponse(PerfilGeneralType perfilGeneralType,
			DatInfoAgregadaMicrocred infoAgregadaMicrocredito, DatInforme informe) {
		List<DatResumenPerfilGeneral> resumenPerfilesGenerales = new ArrayList<DatResumenPerfilGeneral>();
		DatResumenPerfilGeneral resumePerfilGeneralTel = new DatResumenPerfilGeneral();
		DatResumenPerfilGeneral resumePerfilGeneralCoo = new DatResumenPerfilGeneral();
		DatResumenPerfilGeneral resumePerfilGeneralFin = new DatResumenPerfilGeneral();
		DatResumenPerfilGeneral resumePerfilGeneralRea = new DatResumenPerfilGeneral();
		DatResumenPerfilGeneral resumePerfilGeneralTotPrin = new DatResumenPerfilGeneral();
		DatResumenPerfilGeneral resumePerfilGeneralTotalDeud = new DatResumenPerfilGeneral();
		if (perfilGeneralType.getAntiguedadDesde() != null) {
			resumePerfilGeneralTel
					.setAntiguedadDesde(AdapterUtil.toDate(perfilGeneralType.getAntiguedadDesde().getSectorTelcos()));
			resumePerfilGeneralCoo.setAntiguedadDesde(
					AdapterUtil.toDate(perfilGeneralType.getAntiguedadDesde().getSectorCooperativo()));
			resumePerfilGeneralFin.setAntiguedadDesde(
					AdapterUtil.toDate(perfilGeneralType.getAntiguedadDesde().getSectorFinanciero()));
			resumePerfilGeneralRea
					.setAntiguedadDesde(AdapterUtil.toDate(perfilGeneralType.getAntiguedadDesde().getSectorReal()));
		}
		resumePerfilGeneralTel.setCEmp(informe.getCEmp());
		resumePerfilGeneralCoo.setCEmp(informe.getCEmp());
		resumePerfilGeneralFin.setCEmp(informe.getCEmp());
		resumePerfilGeneralRea.setCEmp(informe.getCEmp());
		resumePerfilGeneralTotPrin.setCEmp(informe.getCEmp());
		resumePerfilGeneralTotalDeud.setCEmp(informe.getCEmp());
		resumePerfilGeneralTel.setTipoSectorPerfil("TEL");
		resumePerfilGeneralCoo.setTipoSectorPerfil("COO");
		resumePerfilGeneralFin.setTipoSectorPerfil("FIN");
		resumePerfilGeneralRea.setTipoSectorPerfil("REA");
		resumePerfilGeneralTotPrin.setTipoSectorPerfil("TCP");
		resumePerfilGeneralTotalDeud.setTipoSectorPerfil("TCD");
		if (perfilGeneralType.getConsultaUlt6Meses() != null) {
			resumePerfilGeneralTel
					.setCon6mes(new BigDecimal(perfilGeneralType.getConsultaUlt6Meses().getSectorTelcos()));
			resumePerfilGeneralCoo
					.setCon6mes(new BigDecimal(perfilGeneralType.getConsultaUlt6Meses().getSectorCooperativo()));
			resumePerfilGeneralFin
					.setCon6mes(new BigDecimal(perfilGeneralType.getConsultaUlt6Meses().getSectorFinanciero()));
			resumePerfilGeneralRea.setCon6mes(new BigDecimal(perfilGeneralType.getConsultaUlt6Meses().getSectorReal()));
			resumePerfilGeneralTotPrin
					.setCon6mes(new BigDecimal(perfilGeneralType.getConsultaUlt6Meses().getTotalComoPrincipal()));
			resumePerfilGeneralTotalDeud
					.setCon6mes(new BigDecimal(perfilGeneralType.getConsultaUlt6Meses().getTotalComoCodeudorYOtros()));
		}
		if (perfilGeneralType.getCreditosCerrados() != null) {
			resumePerfilGeneralTel
					.setCreditosCerrados(new BigDecimal(perfilGeneralType.getCreditosCerrados().getSectorTelcos()));
			resumePerfilGeneralCoo.setCreditosCerrados(
					new BigDecimal(perfilGeneralType.getCreditosCerrados().getSectorCooperativo()));
			resumePerfilGeneralFin
					.setCreditosCerrados(new BigDecimal(perfilGeneralType.getCreditosCerrados().getSectorFinanciero()));
			resumePerfilGeneralRea
					.setCreditosCerrados(new BigDecimal(perfilGeneralType.getCreditosCerrados().getSectorReal()));
			resumePerfilGeneralTotPrin.setCreditosCerrados(
					new BigDecimal(perfilGeneralType.getCreditosCerrados().getTotalComoPrincipal()));
			resumePerfilGeneralTotalDeud.setCreditosCerrados(
					new BigDecimal(perfilGeneralType.getCreditosCerrados().getTotalComoCodeudorYOtros()));
		}
		if (perfilGeneralType.getCreditosReestructurados() != null) {
			resumePerfilGeneralTel.setCreditosReestructurados(
					new BigDecimal(perfilGeneralType.getCreditosReestructurados().getSectorTelcos()));
			resumePerfilGeneralCoo.setCreditosReestructurados(
					new BigDecimal(perfilGeneralType.getCreditosReestructurados().getSectorCooperativo()));
			resumePerfilGeneralFin.setCreditosReestructurados(
					new BigDecimal(perfilGeneralType.getCreditosReestructurados().getSectorFinanciero()));
			resumePerfilGeneralRea.setCreditosReestructurados(
					new BigDecimal(perfilGeneralType.getCreditosReestructurados().getSectorReal()));
			resumePerfilGeneralTotPrin.setCreditosReestructurados(
					new BigDecimal(perfilGeneralType.getCreditosReestructurados().getTotalComoPrincipal()));
			resumePerfilGeneralTotalDeud.setCreditosReestructurados(
					new BigDecimal(perfilGeneralType.getCreditosReestructurados().getTotalComoCodeudorYOtros()));
		}
		if (perfilGeneralType.getCreditosVigentes() != null) {
			resumePerfilGeneralTel
					.setCreditosVigentes(new BigDecimal(perfilGeneralType.getCreditosVigentes().getSectorTelcos()));
			resumePerfilGeneralCoo.setCreditosVigentes(
					new BigDecimal(perfilGeneralType.getCreditosVigentes().getSectorCooperativo()));
			resumePerfilGeneralFin
					.setCreditosVigentes(new BigDecimal(perfilGeneralType.getCreditosVigentes().getSectorFinanciero()));
			resumePerfilGeneralRea
					.setCreditosVigentes(new BigDecimal(perfilGeneralType.getCreditosVigentes().getSectorReal()));
			resumePerfilGeneralTotPrin.setCreditosVigentes(
					new BigDecimal(perfilGeneralType.getCreditosVigentes().getTotalComoPrincipal()));
			resumePerfilGeneralTotalDeud.setCreditosVigentes(
					new BigDecimal(perfilGeneralType.getCreditosVigentes().getTotalComoCodeudorYOtros()));
		}
		if (perfilGeneralType.getCreditosRefinanciados() != null) {
			resumePerfilGeneralTel.setCreditosRefinanciados(
					new BigDecimal(perfilGeneralType.getCreditosRefinanciados().getSectorTelcos()));
			resumePerfilGeneralCoo.setCreditosRefinanciados(
					new BigDecimal(perfilGeneralType.getCreditosRefinanciados().getSectorCooperativo()));
			resumePerfilGeneralFin.setCreditosRefinanciados(
					new BigDecimal(perfilGeneralType.getCreditosRefinanciados().getSectorFinanciero()));
			resumePerfilGeneralRea.setCreditosRefinanciados(
					new BigDecimal(perfilGeneralType.getCreditosRefinanciados().getSectorReal()));
			resumePerfilGeneralTotPrin.setCreditosRefinanciados(
					new BigDecimal(perfilGeneralType.getCreditosRefinanciados().getTotalComoPrincipal()));
			resumePerfilGeneralTotalDeud.setCreditosRefinanciados(
					new BigDecimal(perfilGeneralType.getCreditosRefinanciados().getTotalComoCodeudorYOtros()));
		}
		if (perfilGeneralType.getDesacuerdos() != null) {
			resumePerfilGeneralTel.setDesacuerdos(new BigDecimal(perfilGeneralType.getDesacuerdos().getSectorTelcos()));
			resumePerfilGeneralCoo
					.setDesacuerdos(new BigDecimal(perfilGeneralType.getDesacuerdos().getSectorCooperativo()));
			resumePerfilGeneralFin
					.setDesacuerdos(new BigDecimal(perfilGeneralType.getDesacuerdos().getSectorFinanciero()));
			resumePerfilGeneralRea.setDesacuerdos(new BigDecimal(perfilGeneralType.getDesacuerdos().getSectorReal()));
			resumePerfilGeneralTotPrin
					.setDesacuerdos(new BigDecimal(perfilGeneralType.getDesacuerdos().getTotalComoPrincipal()));
			resumePerfilGeneralTotalDeud
					.setDesacuerdos(new BigDecimal(perfilGeneralType.getDesacuerdos().getTotalComoCodeudorYOtros()));
		}
		resumePerfilGeneralTel.setDatInfoAgregadaMicrocred(infoAgregadaMicrocredito);
		resumePerfilGeneralCoo.setDatInfoAgregadaMicrocred(infoAgregadaMicrocredito);
		resumePerfilGeneralFin.setDatInfoAgregadaMicrocred(infoAgregadaMicrocredito);
		resumePerfilGeneralRea.setDatInfoAgregadaMicrocred(infoAgregadaMicrocredito);
		resumePerfilGeneralTotPrin.setDatInfoAgregadaMicrocred(infoAgregadaMicrocredito);
		resumePerfilGeneralTotalDeud.setDatInfoAgregadaMicrocred(infoAgregadaMicrocredito);
		resumePerfilGeneralTel.setDatInforme(informe);
		resumePerfilGeneralCoo.setDatInforme(informe);
		resumePerfilGeneralFin.setDatInforme(informe);
		resumePerfilGeneralRea.setDatInforme(informe);
		resumePerfilGeneralTotPrin.setDatInforme(informe);
		resumePerfilGeneralTotalDeud.setDatInforme(informe);
		resumenPerfilesGenerales.add(resumePerfilGeneralTel);
		resumenPerfilesGenerales.add(resumePerfilGeneralCoo);
		resumenPerfilesGenerales.add(resumePerfilGeneralFin);
		resumenPerfilesGenerales.add(resumePerfilGeneralRea);
		resumenPerfilesGenerales.add(resumePerfilGeneralTotPrin);
		resumenPerfilesGenerales.add(resumePerfilGeneralTotalDeud);
		return resumenPerfilesGenerales;
	}

	public DatSaldosMe getSaldoMesFromResponse(ResumenType.Saldos.Mes mesType, DatInfoAgregada infoAgregada,
			DatInforme informe) {
		DatSaldosMe saldosMes = new DatSaldosMe();
		saldosMes.setCEmp(informe.getCEmp());
		saldosMes.setFecha(AdapterUtil.toDate(mesType.getFecha()));
		saldosMes.setDatInfoAgregada(infoAgregada);
		saldosMes.setDatInforme(informe);
		saldosMes.setSaldoTotal(new BigDecimal(mesType.getSaldoTotal()));
		saldosMes.setSaldoTotalMora(new BigDecimal(mesType.getSaldoTotalMora()));
		return saldosMes;
	}

	public List<DatSaldosMe> getSaldosMesFromResponse(List<ResumenType.Saldos.Mes> mesesType,
			DatInfoAgregada infoAgregada, DatInforme informe) {
		List<DatSaldosMe> saldosMes = new ArrayList<DatSaldosMe>();
		for (ResumenType.Saldos.Mes mesType : mesesType) {
			saldosMes.add(getSaldoMesFromResponse(mesType, infoAgregada, informe));
		}
		return saldosMes;
	}

	public DatSaldosSector getSaldoSectorFromResponse(ResumenType.Saldos.Sector sectorType,
			DatInfoAgregada infoAgregada, DatInforme informe) {
		DatSaldosSector saldoSector = new DatSaldosSector();
		saldoSector.setCEmp(informe.getCEmp());
		saldoSector.setDatInfoAgregada(infoAgregada);
		saldoSector.setDatInforme(informe);
		saldoSector.setParticipacion(new BigDecimal(sectorType.getParticipacion()));
		saldoSector.setSaldo(new BigDecimal(sectorType.getSaldo()));
		saldoSector.setSector(new BigDecimal(sectorType.getSector()));
		return saldoSector;
	}

	public List<DatSaldosSector> getSaldosSectorFromResponse(List<ResumenType.Saldos.Sector> sectoresType,
			DatInfoAgregada infoAgregada, DatInforme informe) {
		List<DatSaldosSector> saldosSectore = new ArrayList<DatSaldosSector>();
		for (ResumenType.Saldos.Sector sector : sectoresType) {
			saldosSectore.add(getSaldoSectorFromResponse(sector, infoAgregada, informe));
		}
		return saldosSectore;
	}

	public DatSaldosYMora getSaldosYMoraFromComentarioResponse(VectorSaldosYMorasType.SaldosYMoras saldoYMoraType,
			DatInfoAgregadaMicrocred infoAgregadaMicrocredito, DatInforme informe) {
		DatSaldosYMora saldosYMora = new DatSaldosYMora();
		saldosYMora.setCEmp(informe.getCEmp());
		saldosYMora.setFecha(AdapterUtil.toDate(saldoYMoraType.getFecha()));
		saldosYMora.setDatInfoAgregadaMicrocred(infoAgregadaMicrocredito);
		saldosYMora.setDatInforme(informe);
		saldosYMora.setMorasMaximas(saldoYMoraType.getMorasMaximas());
		saldosYMora.setMorasMaxSectorCooperativo(saldoYMoraType.getMorasMaxSectorCooperativo());
		saldosYMora.setMorasMaxSectorFinanciero(saldoYMoraType.getMorasMaxSectorFinanciero());
		saldosYMora.setMorasMaxSectorReal(saldoYMoraType.getMorasMaxSectorReal());
		saldosYMora.setMorasMaxSectorTelcos(saldoYMoraType.getMorasMaxSectorTelcos());
		if (saldoYMoraType.getNumCreditos30() != null) {
			saldosYMora.setNumCreditos30(new BigDecimal(saldoYMoraType.getNumCreditos30()));
		}
		if (saldoYMoraType.getNumCreditosMayorIgual60() != null) {
			saldosYMora.setNumCreditosMayorIgual60(new BigDecimal(saldoYMoraType.getNumCreditosMayorIgual60()));
		}
		if (saldoYMoraType.getSaldoDeudaTotal() != null) {
			saldosYMora.setSaldoDeudaTotal(new BigDecimal(saldoYMoraType.getSaldoDeudaTotal()));
		}
		if (saldoYMoraType.getSaldoDeudaTotalMora() != null) {
			saldosYMora.setSaldoDeudaTotalMora(new BigDecimal(saldoYMoraType.getSaldoDeudaTotalMora()));
		}
		if (saldoYMoraType.getTotalCuentasMora() != null) {
			saldosYMora.setTotalCuentasMora(new BigDecimal(saldoYMoraType.getTotalCuentasMora()));
		}
		return saldosYMora;
	}

	public List<DatSaldosYMora> getSaldosYMoraFromServiceResponse(
			List<VectorSaldosYMorasType.SaldosYMoras> saldosYMorasType,
			DatInfoAgregadaMicrocred infoAgregadaMicrocredito, DatInforme informe) {
		List<DatSaldosYMora> saldosYMoras = new ArrayList<DatSaldosYMora>();
		for (VectorSaldosYMorasType.SaldosYMoras saldoYMoraType : saldosYMorasType) {
			saldosYMoras.add(getSaldosYMoraFromComentarioResponse(saldoYMoraType, infoAgregadaMicrocredito, informe));
		}
		return saldosYMoras;
	}

	public DatScore getScoreFromResponse(ScoreType scoreType, DatInforme informe) {
		DatScore score = new DatScore();
		score.setCEmp(informe.getCEmp());
		score.setClasificacion(scoreType.getClasificacion());
		score.setFecha(AdapterUtil.toDate(scoreType.getFecha()));
		score.setDatInforme(informe);
		score.setNombreScore(scoreType.getNombreScore());
		if (scoreType.getPoblacion() != null) {
			score.setPoblacion(new BigDecimal(scoreType.getPoblacion()));
		}
		score.setPuntaje(new BigDecimal(scoreType.getPuntaje()));
		score.setTipo(scoreType.getTipo());
		if (scoreType.getRazon() != null && !scoreType.getRazon().isEmpty()) {
			score.setDatRazons(getRazonesFromResponse(scoreType.getRazon(), score, informe));
		}
		return score;
	}

	public List<DatScore> getScoresFromResponse(List<ScoreType> scoresTypes, DatInforme informe) {
		List<DatScore> scores = new ArrayList<DatScore>();
		for (ScoreType scoreType : scoresTypes) {
			scores.add(getScoreFromResponse(scoreType, informe));
		}
		return scores;
	}

	public DatSectorAnalisisVectore getSectorAnalisisVectoreFromResponse(SectorAnalisisVectoresType sectorType,
			DatInfoAgregadaMicrocred infoAgregadaMicrocredito, DatInforme informe) {
		DatSectorAnalisisVectore sectorAnalisisVectore = new DatSectorAnalisisVectore();
		sectorAnalisisVectore.setCEmp(informe.getCEmp());
		sectorAnalisisVectore.setDatInfoAgregadaMicrocred(infoAgregadaMicrocredito);
		if (sectorType.getNombreSector() != null) {
			sectorAnalisisVectore.setNombreSector(sectorType.getNombreSector().toUpperCase());
		}
		sectorAnalisisVectore.setDatInforme(informe);
		if (sectorType.getCuenta() != null && !sectorType.getCuenta().isEmpty()) {
			sectorAnalisisVectore.setDatCuentaAnalisisVectores(getCuentaAnalisisVectoreFromServiceResponse(
					sectorType.getCuenta(), sectorAnalisisVectore, informe));
		}
		if (sectorType.getMorasMaximas() != null && !sectorType.getMorasMaximas().isEmpty()) {
			sectorAnalisisVectore.setDatMorasMaximas(
					getMorasMaximaFromServiceResponse(sectorType.getMorasMaximas(), sectorAnalisisVectore, informe));
		}
		return sectorAnalisisVectore;
	}

	public List<DatSectorAnalisisVectore> getSectorAnalisisVectoresFromServiceResponse(
			List<SectorAnalisisVectoresType> sectoresType, DatInfoAgregadaMicrocred infoAgregadaMicrocredito,
			DatInforme informe) {
		List<DatSectorAnalisisVectore> analisisVectores = new ArrayList<DatSectorAnalisisVectore>();
		for (SectorAnalisisVectoresType sectorType : sectoresType) {
			analisisVectores.add(getSectorAnalisisVectoreFromResponse(sectorType, infoAgregadaMicrocredito, informe));
		}
		return analisisVectores;
	}

	public DatSectorEndeudaActual getSectorEndeudamientoActualFromResponse(
			SectorEndeudamientoActualType sectorEndActualType, DatInfoAgregadaMicrocred infoAgregadaMicrocredito,
			DatInforme informe) {
		DatSectorEndeudaActual sectorEndeudamientoActual = new DatSectorEndeudaActual();
		sectorEndeudamientoActual.setCEmp(informe.getCEmp());
		sectorEndeudamientoActual.setCodSector(new BigDecimal(sectorEndActualType.getCodSector()));
		sectorEndeudamientoActual.setDatInfoAgregadaMicrocred(infoAgregadaMicrocredito);
		sectorEndeudamientoActual.setDatInforme(informe);
		if (sectorEndActualType.getTipoCuenta() != null && !sectorEndActualType.getTipoCuenta().isEmpty()) {
			sectorEndeudamientoActual.setDatTipoCuentaEndActuals(getSectoresEndeudamientoActualFromServiceResponse(
					sectorEndActualType.getTipoCuenta(), sectorEndeudamientoActual, informe));
		}

		return sectorEndeudamientoActual;
	}

	public List<DatSectorEndeudaActual> getSectoresEndeudamientoActualFromServiceResponse(
			List<SectorEndeudamientoActualType> sectoresEndActualType,
			DatInfoAgregadaMicrocred infoAgregadaMicrocredito, DatInforme informe) {
		List<DatSectorEndeudaActual> endActualList = new ArrayList<DatSectorEndeudaActual>();
		for (SectorEndeudamientoActualType endType : sectoresEndActualType) {
			endActualList.add(getSectorEndeudamientoActualFromResponse(endType, infoAgregadaMicrocredito, informe));
		}
		return endActualList;
	}

	public DatCarteraSecResEnd getSectorResEndFromResponse(ResumenEndeudamientoType.Trimestre.Sector sectorType,
			DatTrimestreResEndeuda trimestreResEnd, DatInforme informe) {
		DatCarteraSecResEnd sectorResEndeudamiento = new DatCarteraSecResEnd();
		sectorResEndeudamiento.setCEmp(informe.getCEmp());
		if (sectorType.getCodigoSector() != null) {
			sectorResEndeudamiento.setCodigoSector(new BigDecimal(sectorType.getCodigoSector()));
		} else {
			sectorResEndeudamiento.setCodigoSector(new BigDecimal(0));
		}
		if (sectorType.getGarantiaAdmisible() != null) {
			sectorResEndeudamiento.setGarantiaAdmisible(new BigDecimal(sectorType.getGarantiaAdmisible()));
		} else {
			sectorResEndeudamiento.setGarantiaAdmisible(new BigDecimal(0));
		}
		if (sectorType.getGarantiaOtro() != null) {
			sectorResEndeudamiento.setGarantiaOtro(new BigDecimal(sectorType.getGarantiaOtro()));
		} else {
			sectorResEndeudamiento.setGarantiaOtro(new BigDecimal(0));
		}
		if (sectorType.getSector() != null) {
			sectorResEndeudamiento.setSector(sectorType.getSector().toUpperCase());
		}
		sectorResEndeudamiento.setDatInforme(informe);
		sectorResEndeudamiento.setDatTrimestreResEndeuda(trimestreResEnd);
		if (sectorType.getCartera() != null && !sectorType.getCartera().isEmpty()) {
			sectorResEndeudamiento
					.setDatCarteras(getCarterasFromResponse(sectorType.getCartera(), sectorResEndeudamiento, informe));
		}
		return sectorResEndeudamiento;
	}

	public List<DatCarteraSecResEnd> getSectoresResEndFromResponse(
			List<ResumenEndeudamientoType.Trimestre.Sector> sectoresType, DatTrimestreResEndeuda trimestreResEnd,
			DatInforme informe) {
		List<DatCarteraSecResEnd> sectoresEnd = new ArrayList<DatCarteraSecResEnd>();
		for (ResumenEndeudamientoType.Trimestre.Sector sectorType : sectoresType) {
			sectoresEnd.add(getSectorResEndFromResponse(sectorType, trimestreResEnd, informe));
		}
		return sectoresEnd;
	}

	public DatSery getSectorEndeudamientoActualFromResponse(SeriesType evolDeuda,
			DatInfoAgregadaMicrocred infoAgregadaMicrocredito, DatInforme informe) {
		DatSery sery = new DatSery();
		sery.setCEmp(informe.getCEmp());
		sery.setDatInfoAgregadaMicrocred(infoAgregadaMicrocredito);
		if (evolDeuda.getSerie() != null) {
			sery.setSerie(evolDeuda.getSerie().toUpperCase());
		}
		sery.setDatInforme(informe);
		if (evolDeuda.getValores() != null && evolDeuda.getValores().getValor() != null
				&& !evolDeuda.getValores().getValor().isEmpty()) {
			sery.setDatValors(getSectoresEndeudamientoActualFromServiceResponse(evolDeuda.getValores().getValor(), sery,
					informe));
		}
		return sery;
	}

	public List<DatSery> getSectoresEndeudamientoActualFromServiceResponseX(List<SeriesType> evolDeuda,
			DatInfoAgregadaMicrocred infoAgregadaMicrocredito, DatInforme informe) {
		List<DatSery> series = new ArrayList<DatSery>();
		for (SeriesType seriesType : evolDeuda) {
			series.add(getSectorEndeudamientoActualFromResponse(seriesType, infoAgregadaMicrocredito, informe));
		}
		return series;
	}

	public DatSubtipo getSubtipoFromSubtipoResponse(ReclamoType.Subtipo subtipoType, DatReclamo reclamo,
			DatInforme informe) {
		DatSubtipo subtipo = new DatSubtipo();
		subtipo.setDatReclamo(reclamo);
		subtipo.setDatInforme(informe);
		subtipo.setCodigo(subtipoType.getCodigo());
		subtipo.setNombre(subtipoType.getNombre());
		return subtipo;
	}

	public List<DatSubtipo> getSubtipoFromServiceResponse(List<ReclamoType.Subtipo> subtiposType, DatReclamo reclamo,
			DatInforme informe) {
		List<DatSubtipo> subtipos = new ArrayList<DatSubtipo>();
		for (ReclamoType.Subtipo subtipoType : subtiposType) {
			subtipos.add(getSubtipoFromSubtipoResponse(subtipoType, reclamo, informe));
		}
		return subtipos;
	}

	public DatTelefono getTelefonoFromResponse(LocalizacionType.Telefono telefonoType, DatLocalizacion localizacion,
			DatInforme informe) {
		DatTelefono telefono = new DatTelefono();
		telefono.setDatInforme(informe);
		telefono.setCEmp(informe.getCEmp());
		telefono.setActualizacion(new BigDecimal(telefonoType.getActualizacion()));
		if (telefonoType.getCreacion() != null) {
			telefono.setCreacion(new BigDecimal(telefonoType.getCreacion()));
		}
		if (telefonoType.getDato() != null) {
			if (telefonoType.getDato().getCodigoArea() != null) {
				telefono.setDatoCodigoArea(new BigDecimal(telefonoType.getDato().getCodigoArea()));
			}
			if (telefonoType.getDato().getCodigoPais() != null) {
				telefono.setDatoCodigoPais(new BigDecimal(telefonoType.getDato().getCodigoPais()));
			}
			telefono.setDatoNombreCiudad(telefonoType.getDato().getNombreCiudad());
			telefono.setDatoNombreDepartamento(telefonoType.getDato().getNombreDepartamento());
			if (telefonoType.getDato().getNumero() != null) {
				telefono.setDatoNumero(new BigDecimal(telefonoType.getDato().getNumero()));
			}
		}
		if (telefonoType.getEntidad() != null) {
			telefono.setEntLocCodSubscriptor(telefonoType.getEntidad().getCodigoSuscriptor());
			if (telefonoType.getEntidad().getContrato() != null) {
				telefono.setEntLocContrato(new BigDecimal(telefonoType.getEntidad().getContrato()));
			}
			telefono.setEntLocNit(telefonoType.getEntidad().getNit());
			telefono.setEntLocNombreNit(telefonoType.getEntidad().getNombreNit());
			telefono.setEntLocNombreSubs(telefonoType.getEntidad().getNombreSuscriptor());
		}
		telefono.setFuente(telefonoType.getFuente());
		telefono.setLlave(telefonoType.getLlave());
		telefono.setDatLocalizacion(localizacion);
		telefono.setNumeroEntidades(telefonoType.getNumeroEntidades());
		if (telefonoType.getNumReportes() != null) {
			telefono.setNumReportes(new BigDecimal(telefonoType.getNumReportes()));
		}
		telefono.setTipo(telefonoType.getTipo());
		telefono.setTipoLaboralOComercial(telefonoType.getTipoLaboralOComercial());
		telefono.setTipoResidencia(telefonoType.getTipoResidencia());
		telefono.setUltimaConfirmacion(telefonoType.getUltimaConfirmacion());
		return telefono;
	}

	public List<DatTelefono> getTelefonoFromServiceResponse(List<LocalizacionType.Telefono> telefonosType,
			DatLocalizacion localizacion, DatInforme informe) {
		List<DatTelefono> telefonos = new ArrayList<DatTelefono>();
		for (LocalizacionType.Telefono telefonoType : telefonosType) {
			telefonos.add(getTelefonoFromResponse(telefonoType, localizacion, informe));
		}
		return telefonos;
	}

	public DatTipoCuentaEndActual getSectorEndeudamientoActualFromResponse(TipoCuentaType tipoCuentaType,
			DatSectorEndeudaActual sectorEndeudamientoActual, DatInforme informe) {
		DatTipoCuentaEndActual tipoCuentaEndActual = new DatTipoCuentaEndActual();
		tipoCuentaEndActual.setCEmp(informe.getCEmp());
		tipoCuentaEndActual.setDatInforme(informe);
		tipoCuentaEndActual.setDatSectorEndeudaActual(sectorEndeudamientoActual);
		tipoCuentaEndActual.setTipoCuenta(tipoCuentaType.getTipoCuenta());
		if (tipoCuentaType.getUsuario() != null && !tipoCuentaType.getUsuario().isEmpty()) {
			tipoCuentaEndActual.setDatUsuarios(getSectoresEndeudamientoActualFromServiceResponse(
					tipoCuentaType.getUsuario(), tipoCuentaEndActual, informe));
		}
		return tipoCuentaEndActual;
	}

	public List<DatTipoCuentaEndActual> getSectoresEndeudamientoActualFromServiceResponse(
			List<TipoCuentaType> tiposCuentasType, DatSectorEndeudaActual sectorEndeudamientoActual,
			DatInforme informe) {
		List<DatTipoCuentaEndActual> tipoCuentasEndActual = new ArrayList<DatTipoCuentaEndActual>();
		for (TipoCuentaType tipoCuentaType : tiposCuentasType) {
			tipoCuentasEndActual
					.add(getSectorEndeudamientoActualFromResponse(tipoCuentaType, sectorEndeudamientoActual, informe));
		}
		return tipoCuentasEndActual;
	}

	public DatTipoCuentaHistorico getComportamientoFromResponse(HistoricoSaldosType.TipoCuenta tipoCuentaType,
			DatInfoAgregada infoAgregada, DatInforme informe) {
		DatTipoCuentaHistorico tipoCuentaHistorico = new DatTipoCuentaHistorico();
		tipoCuentaHistorico.setDatInfoAgregada(infoAgregada);
		tipoCuentaHistorico.setDatInforme(informe);
		tipoCuentaHistorico.setCEmp(informe.getCEmp());
		tipoCuentaHistorico.setTipo(tipoCuentaType.getTipo());
		if (tipoCuentaType.getTrimestre() != null && !tipoCuentaType.getTrimestre().isEmpty()) {
			tipoCuentaHistorico.setDatTrimestreHistoricos(
					getTrimestresHistoricosFromResponse(tipoCuentaType.getTrimestre(), tipoCuentaHistorico, informe));
		}
		return tipoCuentaHistorico;
	}

	public List<DatTipoCuentaHistorico> getComportamientosFromResponse(
			List<HistoricoSaldosType.TipoCuenta> tiposCuentasType, DatInfoAgregada infoAgregada, DatInforme informe) {
		List<DatTipoCuentaHistorico> tipoCuentasHistoricos = new ArrayList<DatTipoCuentaHistorico>();
		for (HistoricoSaldosType.TipoCuenta tipoCuentaType : tiposCuentasType) {
			tipoCuentasHistoricos.add(getComportamientoFromResponse(tipoCuentaType, infoAgregada, informe));
		}
		return tipoCuentasHistoricos;
	}

	public DatTipoCuentaPortafolio getTipoCuentaPortafolioFromResponse(
			ComposicionPortafolioType.TipoCuenta tipoCuentaType, DatInfoAgregada infoAgregada, DatInforme informe) {
		DatTipoCuentaPortafolio tipoCuentaPortafolio = new DatTipoCuentaPortafolio();
		if (tipoCuentaType.getCalidadDeudor() != null) {
			tipoCuentaPortafolio.setCalidadDeudor(tipoCuentaType.getCalidadDeudor().toUpperCase());
		}
		tipoCuentaPortafolio.setCantidad(new BigDecimal(tipoCuentaType.getCantidad()));
		tipoCuentaPortafolio.setCEmp(informe.getCEmp());
		tipoCuentaPortafolio.setDatInfoAgregada(infoAgregada);
		tipoCuentaPortafolio.setDatInforme(informe);
		tipoCuentaPortafolio.setPorcentaje(new BigDecimal(tipoCuentaType.getPorcentaje()));
		tipoCuentaPortafolio.setTipo(tipoCuentaType.getTipo());
		if (tipoCuentaType.getEstado() != null && !tipoCuentaType.getEstado().isEmpty()) {
			tipoCuentaPortafolio.setDatEstadoPortafolios(
					getEstPortafoliosFromResponse(tipoCuentaType.getEstado(), tipoCuentaPortafolio, informe));
		}
		return tipoCuentaPortafolio;
	}

	public List<DatTipoCuentaPortafolio> getTipoCuentaPortafoliosFromResponse(
			List<ComposicionPortafolioType.TipoCuenta> tiposCuentasType, DatInfoAgregada infoAgregada,
			DatInforme informe) {
		List<DatTipoCuentaPortafolio> tiposCuentasPort = new ArrayList<DatTipoCuentaPortafolio>();
		for (ComposicionPortafolioType.TipoCuenta tipoCuentaType : tiposCuentasType) {
			tiposCuentasPort.add(getTipoCuentaPortafolioFromResponse(tipoCuentaType, infoAgregada, informe));
		}
		return tiposCuentasPort;
	}

	public DatTotalesHistorico getTotalHistoricoFromResponse(HistoricoSaldosType.Totales totalType,
			DatInfoAgregada infoAgregada, DatInforme informe) {
		DatTotalesHistorico totalHistorico = new DatTotalesHistorico();
		totalHistorico.setCEmp(informe.getCEmp());
		totalHistorico.setCuentasConsideradas(new BigDecimal(totalType.getCuentasConsideradas()));
		totalHistorico.setFecha(AdapterUtil.toDate(totalType.getFecha()));
		totalHistorico.setDatInfoAgregada(infoAgregada);
		totalHistorico.setDatInforme(informe);
		totalHistorico.setSaldo(new BigDecimal(totalType.getSaldo()));
		totalHistorico.setTotalCuentas(new BigDecimal(totalType.getTotalCuentas()));
		return totalHistorico;
	}

	public List<DatTotalesHistorico> getTotalesHistoricosFromResponse(List<HistoricoSaldosType.Totales> totalesType,
			DatInfoAgregada infoAgregada, DatInforme informe) {
		List<DatTotalesHistorico> totalesHistoricos = new ArrayList<DatTotalesHistorico>();
		for (HistoricoSaldosType.Totales totalType : totalesType) {
			totalesHistoricos.add(getTotalHistoricoFromResponse(totalType, infoAgregada, informe));
		}
		return totalesHistoricos;
	}

	public DatTotalesTipoCuenta getTotalTipoCuentaFromResponse(TotalesType.TipoCuenta tipoCuentaType,
			DatInfoAgregada infoAgregada, DatInforme informe) {
		DatTotalesTipoCuenta totalesTipoCuenta = new DatTotalesTipoCuenta();
		if (tipoCuentaType.getCalidadDeudor() != null) {
			totalesTipoCuenta.setCalidadDeudor(tipoCuentaType.getCalidadDeudor().toUpperCase());
		}
		totalesTipoCuenta.setCEmp(informe.getCEmp());
		totalesTipoCuenta.setCodigoTipo(tipoCuentaType.getCodigoTipo());
		totalesTipoCuenta.setCuota(new BigDecimal(tipoCuentaType.getCuota()));
		totalesTipoCuenta.setCupo(new BigDecimal(tipoCuentaType.getCupo()));
		totalesTipoCuenta.setDatInfoAgregada(infoAgregada);
		totalesTipoCuenta.setDatInforme(informe);
		totalesTipoCuenta.setSaldo(new BigDecimal(tipoCuentaType.getSaldo()));
		totalesTipoCuenta.setSaldoMora(new BigDecimal(tipoCuentaType.getSaldoMora()));
		if (tipoCuentaType.getTipo() != null) {
			totalesTipoCuenta.setTipo(tipoCuentaType.getTipo().toUpperCase());
		}
		return totalesTipoCuenta;
	}

	public List<DatTotalesTipoCuenta> getTotalesTipoCuentasFromResponse(List<TotalesType.TipoCuenta> tipoCuentasType,
			DatInfoAgregada infoAgregada, DatInforme informe) {
		List<DatTotalesTipoCuenta> totalesTipoCuentas = new ArrayList<DatTotalesTipoCuenta>();
		for (TotalesType.TipoCuenta tipoCuentaType : tipoCuentasType) {
			totalesTipoCuentas.add(getTotalTipoCuentaFromResponse(tipoCuentaType, infoAgregada, informe));
		}
		return totalesTipoCuentas;
	}

	public DatTotalesTotal getTotalTotalFromResponse(TotalesType.Total totalType, DatInfoAgregada infoAgregada,
			DatInforme informe) {
		DatTotalesTotal totalTotal = new DatTotalesTotal();
		if (totalType.getCalidadDeudor() != null) {
			totalTotal.setCalidadDeudor(totalType.getCalidadDeudor().toUpperCase());
		}
		totalTotal.setCEmp(informe.getCEmp());
		totalTotal.setCuota(new BigDecimal(totalType.getCuota()));
		totalTotal.setCupo(new BigDecimal(totalType.getCupo()));
		totalTotal.setDatInfoAgregada(infoAgregada);
		totalTotal.setDatInforme(informe);
		totalTotal.setParticipacion(new BigDecimal(totalType.getParticipacion()));
		totalTotal.setSaldo(new BigDecimal(totalType.getSaldo()));
		totalTotal.setSaldoMora(new BigDecimal(totalType.getSaldoMora()));
		return totalTotal;
	}

	public List<DatTotalesTotal> getTotalesTotalFromResponse(List<TotalesType.Total> totalesType,
			DatInfoAgregada infoAgregada, DatInforme informe) {
		List<DatTotalesTotal> totalesTotales = new ArrayList<DatTotalesTotal>();
		for (TotalesType.Total totalType : totalesType) {
			totalesTotales.add(getTotalTotalFromResponse(totalType, infoAgregada, informe));
		}
		return totalesTotales;
	}

	public DatTrimestreCheque getTrimestreChequeFromResponse(ChequesType.Trimestre trimestreType,
			DatInfoAgregada infoAgregada, DatInforme informe) {
		DatTrimestreCheque trimestreCheque = new DatTrimestreCheque();
		trimestreCheque.setCantidadDevueltos(new BigDecimal(trimestreType.getCantidadDevueltos()));
		trimestreCheque.setCantidadPagados(new BigDecimal(trimestreType.getCantidadPagados()));
		trimestreCheque.setCEmp(informe.getCEmp());
		trimestreCheque.setFecha(AdapterUtil.toDate(trimestreType.getFecha()));
		trimestreCheque.setDatInfoAgregada(infoAgregada);
		trimestreCheque.setDatInforme(informe);
		trimestreCheque.setValorDevueltos(new BigDecimal(trimestreType.getValorDevueltos()));
		trimestreCheque.setValorPagados(new BigDecimal(trimestreType.getValorPagados()));
		return trimestreCheque;
	}

	public List<DatTrimestreCheque> getTrimestreChequesFromResponse(List<ChequesType.Trimestre> trimestresType,
			DatInfoAgregada infoAgregada, DatInforme informe) {
		List<DatTrimestreCheque> trimestreCheques = new ArrayList<DatTrimestreCheque>();
		for (ChequesType.Trimestre trimestreType : trimestresType) {
			trimestreCheques.add(getTrimestreChequeFromResponse(trimestreType, infoAgregada, informe));
		}
		return trimestreCheques;
	}

	public DatTrimestreDeuda getTrimestreChequeFromResponse(EvolucionDeudaType.Trimestre trimestreType,
			DatInfoAgregada infoAgregada, DatInforme informe) {
		DatTrimestreDeuda trimestreDeuda = new DatTrimestreDeuda();
		trimestreDeuda.setAperturaCuentas(new BigDecimal(trimestreType.getAperturaCuentas()));
		trimestreDeuda.setCalificacion(trimestreType.getCalificacion());
		trimestreDeuda.setCEmp(informe.getCEmp());
		trimestreDeuda.setCierreCuentas(new BigDecimal(trimestreType.getCierreCuentas()));
		trimestreDeuda.setCuota(new BigDecimal(trimestreType.getCuota()));
		trimestreDeuda.setCupoTotal(new BigDecimal(trimestreType.getCupoTotal()));
		trimestreDeuda.setFecha(AdapterUtil.toDate(trimestreType.getFecha()));
		trimestreDeuda.setDatInfoAgregada(infoAgregada);
		trimestreDeuda.setDatInforme(informe);
		if (trimestreType.getMesesMoraMaxima() != null) {
			trimestreDeuda.setMesesMoraMaxima(new BigDecimal(trimestreType.getMesesMoraMaxima()));
		} else {
			trimestreDeuda.setMesesMoraMaxima(new BigDecimal(0));
		}
		trimestreDeuda.setMoraMaxima(trimestreType.getMoraMaxima());
		trimestreDeuda.setPorcentajeUso(new BigDecimal(trimestreType.getPorcentajeUso()));
		trimestreDeuda.setSaldo(new BigDecimal(trimestreType.getSaldo()));
		trimestreDeuda.setScore(new BigDecimal(trimestreType.getScore()));
		trimestreDeuda.setTotalAbiertas(new BigDecimal(trimestreType.getTotalAbiertas()));
		trimestreDeuda.setTotalCerradas(new BigDecimal(trimestreType.getTotalCerradas()));
		return trimestreDeuda;
	}

	public List<DatTrimestreDeuda> getTrimestreChequesFromResponseX(List<EvolucionDeudaType.Trimestre> trimestresType,
			DatInfoAgregada infoAgregada, DatInforme informe) {
		List<DatTrimestreDeuda> trimestresDeuda = new ArrayList<DatTrimestreDeuda>();
		for (EvolucionDeudaType.Trimestre trimestreType : trimestresType) {
			trimestresDeuda.add(getTrimestreChequeFromResponse(trimestreType, infoAgregada, informe));
		}
		return trimestresDeuda;
	}

	public List<DatTrimestreDeuMicrocred> getComportamientosEntFromServiceResponse(List<Object> trimestresType,
			DatEvolDeudaMicrocredito evolDeuda, DatInforme informe) {
		DatTrimestreDeuMicrocred trimestre;
		List<DatTrimestreDeuMicrocred> trimestres = new ArrayList<DatTrimestreDeuMicrocred>();
		for (Object trimestreType : trimestresType) {
			ElementNSImpl elementnsimpl = (ElementNSImpl) (trimestreType);
			trimestre = new DatTrimestreDeuMicrocred();
			trimestre.setCEmp(informe.getCEmp());
			String trimestreObtenido = elementnsimpl.getFirstChild().getTextContent();
			trimestre.setTrimestre(trimestreObtenido);
			trimestre.setDatEvolDeudaMicrocredito(evolDeuda);
			trimestre.setDatInforme(informe);
			trimestres.add(trimestre);
		}
		if (trimestres.isEmpty()) {
			return null;
		} else {
			return trimestres;
		}
	}

	public DatTrimestreHistorico getTrimestreHistoricoFromResponse(
			HistoricoSaldosType.TipoCuenta.Trimestre trimestreType, DatTipoCuentaHistorico tipoCuentaHistorico,
			DatInforme informe) {
		DatTrimestreHistorico trimestreHistorico = new DatTrimestreHistorico();
		trimestreHistorico.setCEmp(informe.getCEmp());
		trimestreHistorico.setCuentasConsideradas(new BigDecimal(trimestreType.getCuentasConsideradas()));
		trimestreHistorico.setFecha(AdapterUtil.toDate(trimestreType.getFecha()));
		trimestreHistorico.setSaldo(new BigDecimal(trimestreType.getSaldo()));
		trimestreHistorico.setDatTipoCuentaHistorico(tipoCuentaHistorico);
		trimestreHistorico.setDatInforme(informe);
		trimestreHistorico.setTotalCuentas(new BigDecimal(trimestreType.getTotalCuentas()));
		return trimestreHistorico;
	}

	public List<DatTrimestreHistorico> getTrimestresHistoricosFromResponse(
			List<HistoricoSaldosType.TipoCuenta.Trimestre> trimestresType, DatTipoCuentaHistorico tipoCuentaHistorico,
			DatInforme informe) {
		List<DatTrimestreHistorico> trimestresHitoricos = new ArrayList<DatTrimestreHistorico>();
		for (HistoricoSaldosType.TipoCuenta.Trimestre trimestreType : trimestresType) {
			trimestresHitoricos.add(getTrimestreHistoricoFromResponse(trimestreType, tipoCuentaHistorico, informe));
		}
		return trimestresHitoricos;
	}

	public DatTrimestreResEndeuda getTrimestreChequeFromResponse(ResumenEndeudamientoType.Trimestre trimestreType,
			DatInfoAgregada infoAgregada, DatInforme informe) {
		DatTrimestreResEndeuda trimestreEndeudamiento = new DatTrimestreResEndeuda();
		trimestreEndeudamiento.setFecha(AdapterUtil.toDate(trimestreType.getFecha()));
		trimestreEndeudamiento.setDatInfoAgregada(infoAgregada);
		trimestreEndeudamiento.setCEmp(informe.getCEmp());
		trimestreEndeudamiento.setDatInforme(informe);
		if (trimestreType.getSector() != null && !trimestreType.getSector().isEmpty()) {
			trimestreEndeudamiento.setDatCarteraSecResEnds(
					getSectoresResEndFromResponse(trimestreType.getSector(), trimestreEndeudamiento, informe));
		}
		return trimestreEndeudamiento;
	}

	public List<DatTrimestreResEndeuda> getTrimestreChequesFromResponseY(
			List<ResumenEndeudamientoType.Trimestre> trimestresType, DatInfoAgregada infoAgregada, DatInforme informe) {
		List<DatTrimestreResEndeuda> trimestresResEndeud = new ArrayList<DatTrimestreResEndeuda>();
		for (ResumenEndeudamientoType.Trimestre trimestreType : trimestresType) {
			trimestresResEndeud.add(getTrimestreChequeFromResponse(trimestreType, infoAgregada, informe));
		}
		return trimestresResEndeud;
	}

	public DatUsuario getSectorEndeudamientoActualFromResponse(TipoCuentaType.Usuario tipoCuentaType,
			DatTipoCuentaEndActual tipoCuentaEndActual, DatInforme informe) {
		DatUsuario usuario = new DatUsuario();
		usuario.setCEmp(informe.getCEmp());
		usuario.setDatInforme(informe);
		usuario.setDatTipoCuentaEndActual(tipoCuentaEndActual);
		if (tipoCuentaType.getTipoUsuario() != null) {
			usuario.setTipoUsuario(tipoCuentaType.getTipoUsuario().toUpperCase());
		}
		if (tipoCuentaType.getCuenta() != null && !tipoCuentaType.getCuenta().isEmpty()) {
			usuario.setDatCuentaUsuarios(
					getSectoresEndeudamientoActualFromServiceResponse(tipoCuentaType.getCuenta(), usuario, informe));
		}
		return usuario;
	}

	public List<DatUsuario> getSectoresEndeudamientoActualFromServiceResponse(
			List<TipoCuentaType.Usuario> tiposCuentasType, DatTipoCuentaEndActual tipoCuentaEndActual,
			DatInforme informe) {
		List<DatUsuario> usuarios = new ArrayList<DatUsuario>();
		for (TipoCuentaType.Usuario usuariType : tiposCuentasType) {
			usuarios.add(getSectorEndeudamientoActualFromResponse(usuariType, tipoCuentaEndActual, informe));
		}
		return usuarios;
	}

	public DatValor getSectorEndeudamientoActualFromResponse(SeriesType.Valores.Valor evolDeuda, DatSery sery,
			DatInforme informe) {
		DatValor valor = new DatValor();
		valor.setCEmp(informe.getCEmp());
		valor.setFecha(AdapterUtil.toDate(evolDeuda.getFecha()));
		valor.setDatSery(sery);
		valor.setDatInforme(informe);
		valor.setValor(new BigDecimal(evolDeuda.getValor()));
		return valor;
	}

	public List<DatValor> getSectoresEndeudamientoActualFromServiceResponse(List<SeriesType.Valores.Valor> evolsDeuda,
			DatSery sery, DatInforme informe) {
		List<DatValor> valores = new ArrayList<DatValor>();
		for (SeriesType.Valores.Valor valorType : evolsDeuda) {
			valores.add(getSectorEndeudamientoActualFromResponse(valorType, sery, informe));
		}
		return valores;
	}

}
