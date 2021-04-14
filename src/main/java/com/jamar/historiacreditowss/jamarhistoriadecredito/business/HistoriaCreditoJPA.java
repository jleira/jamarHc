/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jamar.historiacreditowss.jamarhistoriadecredito.business;

import com.jamar.historiacreditowss.jamarhistoriadecredito.entities.*;
import com.jamar.historiacreditowss.jamarhistoriadecredito.repository.DatAuditoriaRepository;
import com.jamar.historiacreditowss.jamarhistoriadecredito.repository.DatInformeRepository;
import com.jamar.historiacreditowss.jamarhistoriadecredito.repository.DatPreselectaRepository;
import java.io.Serializable;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ruthford Jay Archbold
 * @since 2020-10-19
 * @version 3.0
 */
@Service
public class HistoriaCreditoJPA implements Serializable {

    @Autowired
    private DatAuditoriaRepository datAuditoriaRepository;

    @Autowired
    private DatInformeRepository datInformeRepository;

    @Autowired
    private DatPreselectaRepository datPreselectaRepository;

    public void create(DatInforme datInforme) throws Exception {
        long TInicio, TFin, tiempo; //Variables para determinar el tiempo de ejecución
        long TInicio2, TFin2, tiempo2; //Variables para determinar el tiempo de ejecución
        TInicio = System.currentTimeMillis();
        System.out.println("tiempo inicial seteado " + TInicio);

        if (datInforme.getDatActividadEconomicas() == null) {
            datInforme.setDatActividadEconomicas(new ArrayList<>());
        }
        if (datInforme.getDatAdjetivos() == null) {
            datInforme.setDatAdjetivos(new ArrayList<>());
        }
        if (datInforme.getDatAlertas() == null) {
            datInforme.setDatAlertas(new ArrayList<>());
        }
        if (datInforme.getDatCaracterFechas() == null) {
            datInforme.setDatCaracterFechas(new ArrayList<>());
        }
        if (datInforme.getDatCarteras() == null) {
            datInforme.setDatCarteras(new ArrayList<>());
        }
        if (datInforme.getDatCarteraSecResEnds() == null) {
            datInforme.setDatCarteraSecResEnds(new ArrayList<>());
        }
        if (datInforme.getDatCelulars() == null) {
            datInforme.setDatCelulars(new ArrayList<>());
        }
        if (datInforme.getDatComentarios() == null) {
            datInforme.setDatComentarios(new ArrayList<>());
        }
        if (datInforme.getDatComportamientos() == null) {
            datInforme.setDatComportamientos(new ArrayList<>());
        }
        if (datInforme.getDatComportamientoEntidades() == null) {
            datInforme.setDatComportamientoEntidades(new ArrayList<>());
        }
        if (datInforme.getDatCompEntComportamientos() == null) {
            datInforme.setDatCompEntComportamientos(new ArrayList<>());
        }
        if (datInforme.getDatConsultas() == null) {
            datInforme.setDatConsultas(new ArrayList<>());
        }
        if (datInforme.getDatCuentasClientes() == null) {
            datInforme.setDatCuentasClientes(new ArrayList<>());
        }
        if (datInforme.getDatCuentaAnalisisVectores() == null) {
            datInforme.setDatCuentaAnalisisVectores(new ArrayList<>());
        }
        if (datInforme.getDatCuentaUsuarios() == null) {
            datInforme.setDatCuentaUsuarios(new ArrayList<>());
        }
        if (datInforme.getDatDirecciones() == null) {
            datInforme.setDatDirecciones(new ArrayList<>());
        }
        if (datInforme.getDatEmails() == null) {
            datInforme.setDatEmails(new ArrayList<>());
        }
        if (datInforme.getDatEmpleadors() == null) {
            datInforme.setDatEmpleadors(new ArrayList<>());
        }
        if (datInforme.getDatEndeudamientoGlobals() == null) {
            datInforme.setDatEndeudamientoGlobals(new ArrayList<>());
        }
        if (datInforme.getDatEstadoCivils() == null) {
            datInforme.setDatEstadoCivils(new ArrayList<>());
        }
        if (datInforme.getDatEstadoFinancieros() == null) {
            datInforme.setDatEstadoFinancieros(new ArrayList<>());
        }
        if (datInforme.getDatEstadoPortafolios() == null) {
            datInforme.setDatEstadoPortafolios(new ArrayList<>());
        }
        if (datInforme.getDatEvolucionDeudaSectors() == null) {
            datInforme.setDatEvolucionDeudaSectors(new ArrayList<>());
        }
        if (datInforme.getDatEvolDeudaMicrocreditos() == null) {
            datInforme.setDatEvolDeudaMicrocreditos(new ArrayList<>());
        }
        if (datInforme.getDatEvolDeudaTipoCuentas() == null) {
            datInforme.setDatEvolDeudaTipoCuentas(new ArrayList<>());
        }
        if (datInforme.getDatEvolValorTrimestres() == null) {
            datInforme.setDatEvolValorTrimestres(new ArrayList<>());
        }
        if (datInforme.getDatFuerzaMayors() == null) {
            datInforme.setDatFuerzaMayors(new ArrayList<>());
        }
        if (datInforme.getDatIdentificacions() == null) {
            datInforme.setDatIdentificacions(new ArrayList<>());
        }
        if (datInforme.getDatInfoAgregadas() == null) {
            datInforme.setDatInfoAgregadas(new ArrayList<>());
        }
        if (datInforme.getDatInfoAgregadaMicrocreds() == null) {
            datInforme.setDatInfoAgregadaMicrocreds(new ArrayList<>());
        }
        if (datInforme.getDatJuridicas() == null) {
            datInforme.setDatJuridicas(new ArrayList<>());
        }
        if (datInforme.getDatLocalizacions() == null) {
            datInforme.setDatLocalizacions(new ArrayList<>());
        }
        if (datInforme.getDatMorasMaximas() == null) {
            datInforme.setDatMorasMaximas(new ArrayList<>());
        }
        if (datInforme.getDatNaturales() == null) {
            datInforme.setDatNaturales(new ArrayList<>());
        }
        if (datInforme.getDatNivelEstudios() == null) {
            datInforme.setDatNivelEstudios(new ArrayList<>());
        }
        if (datInforme.getDatObligacionesClientes() == null) {
            datInforme.setDatObligacionesClientes(new ArrayList<>());
        }
        if (datInforme.getDatOperInternacionales() == null) {
            datInforme.setDatOperInternacionales(new ArrayList<>());
        }
        if (datInforme.getDatParteDireccions() == null) {
            datInforme.setDatParteDireccions(new ArrayList<>());
        }
        if (datInforme.getDatPersonasACargos() == null) {
            datInforme.setDatPersonasACargos(new ArrayList<>());
        }
        if (datInforme.getDatProductosValores() == null) {
            datInforme.setDatProductosValores(new ArrayList<>());
        }
        if (datInforme.getDatRazons() == null) {
            datInforme.setDatRazons(new ArrayList<>());
        }
        if (datInforme.getDatReclamos() == null) {
            datInforme.setDatReclamos(new ArrayList<>());
        }
        if (datInforme.getDatRespuestaPersLineas() == null) {
            datInforme.setDatRespuestaPersLineas(new ArrayList<>());
        }
        if (datInforme.getDatDictum() == null) {
            datInforme.setDatDictum(new ArrayList<>());
        }
        if (datInforme.getDatArbolesDictum() == null) {
            datInforme.setDatArbolesDictum(new ArrayList<>());
        }
        if (datInforme.getDatResumenPerfilGenerals() == null) {
            datInforme.setDatResumenPerfilGenerals(new ArrayList<>());
        }
        if (datInforme.getDatSaldosMes() == null) {
            datInforme.setDatSaldosMes(new ArrayList<>());
        }
        if (datInforme.getDatSaldosSectors() == null) {
            datInforme.setDatSaldosSectors(new ArrayList<>());
        }
        if (datInforme.getDatSaldosYMoras() == null) {
            datInforme.setDatSaldosYMoras(new ArrayList<>());
        }
        if (datInforme.getDatScores() == null) {
            datInforme.setDatScores(new ArrayList<>());
        }
        if (datInforme.getDatSectorAnalisisVectores() == null) {
            datInforme.setDatSectorAnalisisVectores(new ArrayList<>());
        }
        if (datInforme.getDatSectorEndeudaActuals() == null) {
            datInforme.setDatSectorEndeudaActuals(new ArrayList<>());
        }
        if (datInforme.getDatSeries() == null) {
            datInforme.setDatSeries(new ArrayList<>());
        }
        if (datInforme.getDatSubtipos() == null) {
            datInforme.setDatSubtipos(new ArrayList<>());
        }
        if (datInforme.getDatTelefonos() == null) {
            datInforme.setDatTelefonos(new ArrayList<>());
        }
        if (datInforme.getDatTipoCuentaEndActuals() == null) {
            datInforme.setDatTipoCuentaEndActuals(new ArrayList<>());
        }
        if (datInforme.getDatTipoCuentaHistoricos() == null) {
            datInforme.setDatTipoCuentaHistoricos(new ArrayList<>());
        }
        if (datInforme.getDatTipoCuentaPortafolios() == null) {
            datInforme.setDatTipoCuentaPortafolios(new ArrayList<>());
        }
        if (datInforme.getDatTotalesHistoricos() == null) {
            datInforme.setDatTotalesHistoricos(new ArrayList<>());
        }
        if (datInforme.getDatTotalesTipoCuentas() == null) {
            datInforme.setDatTotalesTipoCuentas(new ArrayList<>());
        }
        if (datInforme.getDatTotalesTotals() == null) {
            datInforme.setDatTotalesTotals(new ArrayList<>());
        }
        if (datInforme.getDatTrimestreCheques() == null) {
            datInforme.setDatTrimestreCheques(new ArrayList<>());
        }
        if (datInforme.getDatTrimestreDeudas() == null) {
            datInforme.setDatTrimestreDeudas(new ArrayList<>());
        }
        if (datInforme.getDatTrimestreDeudaMicros() == null) {
            datInforme.setDatTrimestreDeudaMicros(new ArrayList<>());
        }
        if (datInforme.getDatTrimestreDeuMicrocreds() == null) {
            datInforme.setDatTrimestreDeuMicrocreds(new ArrayList<>());
        }
        if (datInforme.getDatTrimestreHistoricos() == null) {
            datInforme.setDatTrimestreHistoricos(new ArrayList<>());
        }
        if (datInforme.getDatTrimestreResEndeudas() == null) {
            datInforme.setDatTrimestreResEndeudas(new ArrayList<>());
        }
        if (datInforme.getDatUsuarios() == null) {
            datInforme.setDatUsuarios(new ArrayList<>());
        }
        if (datInforme.getDatValors() == null) {
            datInforme.setDatValors(new ArrayList<>());
        }

        datInformeRepository.save(datInforme);
    }

    public void create(DatAuditoria datAuditoria) throws Exception {
        datAuditoria.setFechaInicio(new java.util.Date());
        datAuditoriaRepository.save(datAuditoria);
    }

    public void create(DatPreselecta datAuditoria, DatAuditoria datAud) throws Exception {
        datAuditoria.setFechaConsulta(new java.util.Date());
        datAuditoria.setCONSULTA_ID(datAud.getIdTransaccion());
        datPreselectaRepository.save(datAuditoria);
    }

    public void merge(DatAuditoria datAuditoria) throws Exception {
        datAuditoria.setFechaFin(new java.util.Date());
        datAuditoriaRepository.save(datAuditoria);
    }

}
