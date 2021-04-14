package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * The persistent class for the DAT_INFO_AGREGADA database table.
 *
 */
@Entity
@Table(name = "DAT_INFO_AGREGADA")
@NamedQuery(name = "DatInfoAgregada.findAll", query = "SELECT d FROM DatInfoAgregada d")
@XmlRootElement
public class DatInfoAgregada implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_INFO_AGREGADA_ID_GENERATOR", sequenceName = "SQ_DAT_INFO_AGREGADA")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_INFO_AGREGADA_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    @Column(name = "EVOL_DEU_ANA_PROM_APE_CUEN")
    private BigDecimal evolDeuAnaPromApeCuen;

    @Column(name = "EVOL_DEU_ANA_PROM_CALIFICACION")
    private BigDecimal evolDeuAnaPromCalificacion;

    @Column(name = "EVOL_DEU_ANA_PROM_CIER_CUE")
    private BigDecimal evolDeuAnaPromCierCue;

    @Column(name = "EVOL_DEU_ANA_PROM_CUOTA")
    private BigDecimal evolDeuAnaPromCuota;

    @Column(name = "EVOL_DEU_ANA_PROM_CUPO_TOT")
    private BigDecimal evolDeuAnaPromCupoTot;

    @Column(name = "EVOL_DEU_ANA_PROM_MORA_MAX")
    private BigDecimal evolDeuAnaPromMoraMax;

    @Column(name = "EVOL_DEU_ANA_PROM_PORC_USO")
    private BigDecimal evolDeuAnaPromPorcUso;

    @Column(name = "EVOL_DEU_ANA_PROM_SALDO")
    private BigDecimal evolDeuAnaPromSaldo;

    @Column(name = "EVOL_DEU_ANA_PROM_SCORE")
    private BigDecimal evolDeuAnaPromScore;

    @Column(name = "EVOL_DEU_ANA_PROM_TOT_ABI")
    private BigDecimal evolDeuAnaPromTotAbi;

    @Column(name = "EVOL_DEU_ANA_PROM_TOT_CERR")
    private BigDecimal evolDeuAnaPromTotCerr;

    @Column(name = "RES_PRIN_ACU_A_LA_FECHA")
    private BigDecimal resPrinAcuALaFecha;

    @Temporal(TemporalType.DATE)
    @Column(name = "RES_PRIN_ANTIGUEDAD_DESDE")
    private Date resPrinAntiguedadDesde;

    @Column(name = "RES_PRIN_CON_ULT_6MES")
    private BigDecimal resPrinConUlt6mes;

    @Column(name = "RES_PRIN_CRED_ACT_NEG")
    private BigDecimal resPrinCredActNeg;

    @Column(name = "RES_PRIN_CREDITOS_CERRADOS")
    private BigDecimal resPrinCreditosCerrados;

    @Column(name = "RES_PRIN_CREDITOS_VIGENTES")
    private BigDecimal resPrinCreditosVigentes;

    @Column(name = "RES_PRIN_CUE_AB_AHOCCB")
    private BigDecimal resPrinCueAbAhoccb;

    @Column(name = "RES_PRIN_CUE_CERR_AHOCCB")
    private BigDecimal resPrinCueCerrAhoccb;

    @Column(name = "RES_PRIN_HIST_NEG_ULT_12MESES")
    private BigDecimal resPrinHistNegUlt12meses;

    @Column(name = "RES_PRIN_RECLAMOS_VIG")
    private BigDecimal resPrinReclamosVig;

    @Column(name = "SALDOS_CUOTA_MENSUAL")
    private BigDecimal saldosCuotaMensual;

    @Column(name = "SALDOS_SALDO_CREDITO_MAS_ALTO")
    private BigDecimal saldosSaldoCreditoMasAlto;

    @Column(name = "SALDOS_SALDO_M30")
    private BigDecimal saldosSaldoM30;

    @Column(name = "SALDOS_SALDO_M60")
    private BigDecimal saldosSaldoM60;

    @Column(name = "SALDOS_SALDO_M90")
    private BigDecimal saldosSaldoM90;

    @Column(name = "SALDOS_SALDO_TOTAL")
    private BigDecimal saldosSaldoTotal;

    @Column(name = "SALDOS_SALDO_TOTAL_EN_MORA")
    private BigDecimal saldosSaldoTotalEnMora;

    //bi-directional many-to-one association to DatComportamiento
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInfoAgregada")
    private List<DatComportamiento> datComportamientos;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatSaldosMe
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInfoAgregada")
    private List<DatSaldosMe> datSaldosMes;

    //bi-directional many-to-one association to DatSaldosSector
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInfoAgregada")
    private List<DatSaldosSector> datSaldosSectors;

    //bi-directional many-to-one association to DatTipoCuentaHistorico
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInfoAgregada")
    private List<DatTipoCuentaHistorico> datTipoCuentaHistoricos;

    //bi-directional many-to-one association to DatTipoCuentaPortafolio
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInfoAgregada")
    private List<DatTipoCuentaPortafolio> datTipoCuentaPortafolios;

    //bi-directional many-to-one association to DatTotalesHistorico
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInfoAgregada")
    private List<DatTotalesHistorico> datTotalesHistoricos;

    //bi-directional many-to-one association to DatTotalesTipoCuenta
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInfoAgregada")
    private List<DatTotalesTipoCuenta> datTotalesTipoCuentas;

    //bi-directional many-to-one association to DatTotalesTotal
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInfoAgregada")
    private List<DatTotalesTotal> datTotalesTotals;

    //bi-directional many-to-one association to DatTrimestreCheque
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInfoAgregada")
    private List<DatTrimestreCheque> datTrimestreCheques;

    //bi-directional many-to-one association to DatTrimestreDeuda
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInfoAgregada")
    private List<DatTrimestreDeuda> datTrimestreDeudas;

    //bi-directional many-to-one association to DatTrimestreResEndeuda
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInfoAgregada")
    private List<DatTrimestreResEndeuda> datTrimestreResEndeudas;

    public DatInfoAgregada() {
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

    public BigDecimal getEvolDeuAnaPromApeCuen() {
        return this.evolDeuAnaPromApeCuen;
    }

    public void setEvolDeuAnaPromApeCuen(BigDecimal evolDeuAnaPromApeCuen) {
        this.evolDeuAnaPromApeCuen = evolDeuAnaPromApeCuen;
    }

    public BigDecimal getEvolDeuAnaPromCalificacion() {
        return this.evolDeuAnaPromCalificacion;
    }

    public void setEvolDeuAnaPromCalificacion(BigDecimal evolDeuAnaPromCalificacion) {
        this.evolDeuAnaPromCalificacion = evolDeuAnaPromCalificacion;
    }

    public BigDecimal getEvolDeuAnaPromCierCue() {
        return this.evolDeuAnaPromCierCue;
    }

    public void setEvolDeuAnaPromCierCue(BigDecimal evolDeuAnaPromCierCue) {
        this.evolDeuAnaPromCierCue = evolDeuAnaPromCierCue;
    }

    public BigDecimal getEvolDeuAnaPromCuota() {
        return this.evolDeuAnaPromCuota;
    }

    public void setEvolDeuAnaPromCuota(BigDecimal evolDeuAnaPromCuota) {
        this.evolDeuAnaPromCuota = evolDeuAnaPromCuota;
    }

    public BigDecimal getEvolDeuAnaPromCupoTot() {
        return this.evolDeuAnaPromCupoTot;
    }

    public void setEvolDeuAnaPromCupoTot(BigDecimal evolDeuAnaPromCupoTot) {
        this.evolDeuAnaPromCupoTot = evolDeuAnaPromCupoTot;
    }

    public BigDecimal getEvolDeuAnaPromMoraMax() {
        return this.evolDeuAnaPromMoraMax;
    }

    public void setEvolDeuAnaPromMoraMax(BigDecimal evolDeuAnaPromMoraMax) {
        this.evolDeuAnaPromMoraMax = evolDeuAnaPromMoraMax;
    }

    public BigDecimal getEvolDeuAnaPromPorcUso() {
        return this.evolDeuAnaPromPorcUso;
    }

    public void setEvolDeuAnaPromPorcUso(BigDecimal evolDeuAnaPromPorcUso) {
        this.evolDeuAnaPromPorcUso = evolDeuAnaPromPorcUso;
    }

    public BigDecimal getEvolDeuAnaPromSaldo() {
        return this.evolDeuAnaPromSaldo;
    }

    public void setEvolDeuAnaPromSaldo(BigDecimal evolDeuAnaPromSaldo) {
        this.evolDeuAnaPromSaldo = evolDeuAnaPromSaldo;
    }

    public BigDecimal getEvolDeuAnaPromScore() {
        return this.evolDeuAnaPromScore;
    }

    public void setEvolDeuAnaPromScore(BigDecimal evolDeuAnaPromScore) {
        this.evolDeuAnaPromScore = evolDeuAnaPromScore;
    }

    public BigDecimal getEvolDeuAnaPromTotAbi() {
        return this.evolDeuAnaPromTotAbi;
    }

    public void setEvolDeuAnaPromTotAbi(BigDecimal evolDeuAnaPromTotAbi) {
        this.evolDeuAnaPromTotAbi = evolDeuAnaPromTotAbi;
    }

    public BigDecimal getEvolDeuAnaPromTotCerr() {
        return this.evolDeuAnaPromTotCerr;
    }

    public void setEvolDeuAnaPromTotCerr(BigDecimal evolDeuAnaPromTotCerr) {
        this.evolDeuAnaPromTotCerr = evolDeuAnaPromTotCerr;
    }

    public BigDecimal getResPrinAcuALaFecha() {
        return this.resPrinAcuALaFecha;
    }

    public void setResPrinAcuALaFecha(BigDecimal resPrinAcuALaFecha) {
        this.resPrinAcuALaFecha = resPrinAcuALaFecha;
    }

    public Date getResPrinAntiguedadDesde() {
        return this.resPrinAntiguedadDesde;
    }

    public void setResPrinAntiguedadDesde(Date resPrinAntiguedadDesde) {
        this.resPrinAntiguedadDesde = resPrinAntiguedadDesde;
    }

    public BigDecimal getResPrinConUlt6mes() {
        return this.resPrinConUlt6mes;
    }

    public void setResPrinConUlt6mes(BigDecimal resPrinConUlt6mes) {
        this.resPrinConUlt6mes = resPrinConUlt6mes;
    }

    public BigDecimal getResPrinCredActNeg() {
        return this.resPrinCredActNeg;
    }

    public void setResPrinCredActNeg(BigDecimal resPrinCredActNeg) {
        this.resPrinCredActNeg = resPrinCredActNeg;
    }

    public BigDecimal getResPrinCreditosCerrados() {
        return this.resPrinCreditosCerrados;
    }

    public void setResPrinCreditosCerrados(BigDecimal resPrinCreditosCerrados) {
        this.resPrinCreditosCerrados = resPrinCreditosCerrados;
    }

    public BigDecimal getResPrinCreditosVigentes() {
        return this.resPrinCreditosVigentes;
    }

    public void setResPrinCreditosVigentes(BigDecimal resPrinCreditosVigentes) {
        this.resPrinCreditosVigentes = resPrinCreditosVigentes;
    }

    public BigDecimal getResPrinCueAbAhoccb() {
        return this.resPrinCueAbAhoccb;
    }

    public void setResPrinCueAbAhoccb(BigDecimal resPrinCueAbAhoccb) {
        this.resPrinCueAbAhoccb = resPrinCueAbAhoccb;
    }

    public BigDecimal getResPrinCueCerrAhoccb() {
        return this.resPrinCueCerrAhoccb;
    }

    public void setResPrinCueCerrAhoccb(BigDecimal resPrinCueCerrAhoccb) {
        this.resPrinCueCerrAhoccb = resPrinCueCerrAhoccb;
    }

    public BigDecimal getResPrinHistNegUlt12meses() {
        return this.resPrinHistNegUlt12meses;
    }

    public void setResPrinHistNegUlt12meses(BigDecimal resPrinHistNegUlt12meses) {
        this.resPrinHistNegUlt12meses = resPrinHistNegUlt12meses;
    }

    public BigDecimal getResPrinReclamosVig() {
        return this.resPrinReclamosVig;
    }

    public void setResPrinReclamosVig(BigDecimal resPrinReclamosVig) {
        this.resPrinReclamosVig = resPrinReclamosVig;
    }

    public BigDecimal getSaldosCuotaMensual() {
        return this.saldosCuotaMensual;
    }

    public void setSaldosCuotaMensual(BigDecimal saldosCuotaMensual) {
        this.saldosCuotaMensual = saldosCuotaMensual;
    }

    public BigDecimal getSaldosSaldoCreditoMasAlto() {
        return this.saldosSaldoCreditoMasAlto;
    }

    public void setSaldosSaldoCreditoMasAlto(BigDecimal saldosSaldoCreditoMasAlto) {
        this.saldosSaldoCreditoMasAlto = saldosSaldoCreditoMasAlto;
    }

    public BigDecimal getSaldosSaldoM30() {
        return this.saldosSaldoM30;
    }

    public void setSaldosSaldoM30(BigDecimal saldosSaldoM30) {
        this.saldosSaldoM30 = saldosSaldoM30;
    }

    public BigDecimal getSaldosSaldoM60() {
        return this.saldosSaldoM60;
    }

    public void setSaldosSaldoM60(BigDecimal saldosSaldoM60) {
        this.saldosSaldoM60 = saldosSaldoM60;
    }

    public BigDecimal getSaldosSaldoM90() {
        return this.saldosSaldoM90;
    }

    public void setSaldosSaldoM90(BigDecimal saldosSaldoM90) {
        this.saldosSaldoM90 = saldosSaldoM90;
    }

    public BigDecimal getSaldosSaldoTotal() {
        return this.saldosSaldoTotal;
    }

    public void setSaldosSaldoTotal(BigDecimal saldosSaldoTotal) {
        this.saldosSaldoTotal = saldosSaldoTotal;
    }

    public BigDecimal getSaldosSaldoTotalEnMora() {
        return this.saldosSaldoTotalEnMora;
    }

    public void setSaldosSaldoTotalEnMora(BigDecimal saldosSaldoTotalEnMora) {
        this.saldosSaldoTotalEnMora = saldosSaldoTotalEnMora;
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
        datComportamiento.setDatInfoAgregada(this);

        return datComportamiento;
    }

    public DatComportamiento removeDatComportamiento(DatComportamiento datComportamiento) {
        getDatComportamientos().remove(datComportamiento);
        datComportamiento.setDatInfoAgregada(null);

        return datComportamiento;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
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
        datSaldosMe.setDatInfoAgregada(this);

        return datSaldosMe;
    }

    public DatSaldosMe removeDatSaldosMe(DatSaldosMe datSaldosMe) {
        getDatSaldosMes().remove(datSaldosMe);
        datSaldosMe.setDatInfoAgregada(null);

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
        datSaldosSector.setDatInfoAgregada(this);

        return datSaldosSector;
    }

    public DatSaldosSector removeDatSaldosSector(DatSaldosSector datSaldosSector) {
        getDatSaldosSectors().remove(datSaldosSector);
        datSaldosSector.setDatInfoAgregada(null);

        return datSaldosSector;
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
        datTipoCuentaHistorico.setDatInfoAgregada(this);

        return datTipoCuentaHistorico;
    }

    public DatTipoCuentaHistorico removeDatTipoCuentaHistorico(DatTipoCuentaHistorico datTipoCuentaHistorico) {
        getDatTipoCuentaHistoricos().remove(datTipoCuentaHistorico);
        datTipoCuentaHistorico.setDatInfoAgregada(null);

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
        datTipoCuentaPortafolio.setDatInfoAgregada(this);

        return datTipoCuentaPortafolio;
    }

    public DatTipoCuentaPortafolio removeDatTipoCuentaPortafolio(DatTipoCuentaPortafolio datTipoCuentaPortafolio) {
        getDatTipoCuentaPortafolios().remove(datTipoCuentaPortafolio);
        datTipoCuentaPortafolio.setDatInfoAgregada(null);

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
        datTotalesHistorico.setDatInfoAgregada(this);

        return datTotalesHistorico;
    }

    public DatTotalesHistorico removeDatTotalesHistorico(DatTotalesHistorico datTotalesHistorico) {
        getDatTotalesHistoricos().remove(datTotalesHistorico);
        datTotalesHistorico.setDatInfoAgregada(null);

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
        datTotalesTipoCuenta.setDatInfoAgregada(this);

        return datTotalesTipoCuenta;
    }

    public DatTotalesTipoCuenta removeDatTotalesTipoCuenta(DatTotalesTipoCuenta datTotalesTipoCuenta) {
        getDatTotalesTipoCuentas().remove(datTotalesTipoCuenta);
        datTotalesTipoCuenta.setDatInfoAgregada(null);

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
        datTotalesTotal.setDatInfoAgregada(this);

        return datTotalesTotal;
    }

    public DatTotalesTotal removeDatTotalesTotal(DatTotalesTotal datTotalesTotal) {
        getDatTotalesTotals().remove(datTotalesTotal);
        datTotalesTotal.setDatInfoAgregada(null);

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
        datTrimestreCheque.setDatInfoAgregada(this);

        return datTrimestreCheque;
    }

    public DatTrimestreCheque removeDatTrimestreCheque(DatTrimestreCheque datTrimestreCheque) {
        getDatTrimestreCheques().remove(datTrimestreCheque);
        datTrimestreCheque.setDatInfoAgregada(null);

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
        datTrimestreDeuda.setDatInfoAgregada(this);

        return datTrimestreDeuda;
    }

    public DatTrimestreDeuda removeDatTrimestreDeuda(DatTrimestreDeuda datTrimestreDeuda) {
        getDatTrimestreDeudas().remove(datTrimestreDeuda);
        datTrimestreDeuda.setDatInfoAgregada(null);

        return datTrimestreDeuda;
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
        datTrimestreResEndeuda.setDatInfoAgregada(this);

        return datTrimestreResEndeuda;
    }

    public DatTrimestreResEndeuda removeDatTrimestreResEndeuda(DatTrimestreResEndeuda datTrimestreResEndeuda) {
        getDatTrimestreResEndeudas().remove(datTrimestreResEndeuda);
        datTrimestreResEndeuda.setDatInfoAgregada(null);

        return datTrimestreResEndeuda;
    }

}
