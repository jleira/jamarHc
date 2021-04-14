package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the DAT_RESUMEN_PERFIL_GENERAL database table.
 *
 */
@Entity
@Table(name = "DAT_RESUMEN_PERFIL_GENERAL")
@NamedQuery(name = "DatResumenPerfilGeneral.findAll", query = "SELECT d FROM DatResumenPerfilGeneral d")
@XmlRootElement
public class DatResumenPerfilGeneral implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_RESUMEN_PERFIL_GENERAL_ID_GENERATOR", sequenceName = "SQ_DAT_RESUMEN_PERFIL_GENERAL")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_RESUMEN_PERFIL_GENERAL_ID_GENERATOR")
    private long id;

    @Temporal(TemporalType.DATE)
    @Column(name = "ANTIGUEDAD_DESDE")
    private Date antiguedadDesde;

    @Column(name = "C_EMP")
    private String cEmp;

    @Column(name = "CON_6MES")
    private BigDecimal con6mes;

    @Column(name = "CREDITOS_CERRADOS")
    private BigDecimal creditosCerrados;

    @Column(name = "CREDITOS_REESTRUCTURADOS")
    private BigDecimal creditosReestructurados;

    @Column(name = "CREDITOS_REFINANCIADOS")
    private BigDecimal creditosRefinanciados;

    @Column(name = "CREDITOS_VIGENTES")
    private BigDecimal creditosVigentes;

    private BigDecimal desacuerdos;

    @Column(name = "TIPO_SECTOR_PERFIL")
    private String tipoSectorPerfil;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatInfoAgregadaMicrocred
    @ManyToOne
    @JoinColumn(name = "ID_INFO_AGREGADA_MICROCREDITO")
    private DatInfoAgregadaMicrocred datInfoAgregadaMicrocred;

    public DatResumenPerfilGeneral() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getAntiguedadDesde() {
        return this.antiguedadDesde;
    }

    public void setAntiguedadDesde(Date antiguedadDesde) {
        this.antiguedadDesde = antiguedadDesde;
    }

    public String getCEmp() {
        return this.cEmp;
    }

    public void setCEmp(String cEmp) {
        this.cEmp = cEmp;
    }

    public BigDecimal getCon6mes() {
        return this.con6mes;
    }

    public void setCon6mes(BigDecimal con6mes) {
        this.con6mes = con6mes;
    }

    public BigDecimal getCreditosCerrados() {
        return this.creditosCerrados;
    }

    public void setCreditosCerrados(BigDecimal creditosCerrados) {
        this.creditosCerrados = creditosCerrados;
    }

    public BigDecimal getCreditosReestructurados() {
        return this.creditosReestructurados;
    }

    public void setCreditosReestructurados(BigDecimal creditosReestructurados) {
        this.creditosReestructurados = creditosReestructurados;
    }

    public BigDecimal getCreditosRefinanciados() {
        return this.creditosRefinanciados;
    }

    public void setCreditosRefinanciados(BigDecimal creditosRefinanciados) {
        this.creditosRefinanciados = creditosRefinanciados;
    }

    public BigDecimal getCreditosVigentes() {
        return this.creditosVigentes;
    }

    public void setCreditosVigentes(BigDecimal creditosVigentes) {
        this.creditosVigentes = creditosVigentes;
    }

    public BigDecimal getDesacuerdos() {
        return this.desacuerdos;
    }

    public void setDesacuerdos(BigDecimal desacuerdos) {
        this.desacuerdos = desacuerdos;
    }

    public String getTipoSectorPerfil() {
        return this.tipoSectorPerfil;
    }

    public void setTipoSectorPerfil(String tipoSectorPerfil) {
        this.tipoSectorPerfil = tipoSectorPerfil;
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

}
