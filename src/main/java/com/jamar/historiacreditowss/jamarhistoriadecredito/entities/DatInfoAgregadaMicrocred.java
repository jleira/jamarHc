package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * The persistent class for the DAT_INFO_AGREGADA_MICROCRED database table.
 *
 */
@Entity
@Table(name = "DAT_INFO_AGREGADA_MICROCRED")
@NamedQuery(name = "DatInfoAgregadaMicrocred.findAll", query = "SELECT d FROM DatInfoAgregadaMicrocred d")
@XmlRootElement
public class DatInfoAgregadaMicrocred implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_INFO_AGREGADA_MICROCRED_ID_GENERATOR", sequenceName = "SQ_DAT_INFO_AGREGADA_MICROCRED")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_INFO_AGREGADA_MICROCRED_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    @Column(name = "RES_VEC_SAL_MORAS_POS_SEC_COO")
    private String resVecSalMorasPosSecCoo;

    @Column(name = "RES_VEC_SAL_MORAS_POS_SEC_FIN")
    private String resVecSalMorasPosSecFin;

    @Column(name = "RES_VEC_SAL_MORAS_POS_SEC_REAL")
    private String resVecSalMorasPosSecReal;

    @Column(name = "RES_VEC_SAL_MORAS_POS_SEC_TEL")
    private String resVecSalMorasPosSecTel;

    //bi-directional many-to-one association to DatComportamientoEntidade
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInfoAgregadaMicrocred")
    private List<DatComportamientoEntidade> datComportamientoEntidades;

    //bi-directional many-to-one association to DatEvolDeudaMicrocredito
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInfoAgregadaMicrocred")
    private List<DatEvolDeudaMicrocredito> datEvolDeudaMicrocreditos;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatResumenPerfilGeneral
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInfoAgregadaMicrocred")
    private List<DatResumenPerfilGeneral> datResumenPerfilGenerals;

    //bi-directional many-to-one association to DatSaldosYMora
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInfoAgregadaMicrocred")
    private List<DatSaldosYMora> datSaldosYMoras;

    //bi-directional many-to-one association to DatSectorAnalisisVectore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInfoAgregadaMicrocred")
    private List<DatSectorAnalisisVectore> datSectorAnalisisVectores;

    //bi-directional many-to-one association to DatSectorEndeudaActual
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInfoAgregadaMicrocred")
    private List<DatSectorEndeudaActual> datSectorEndeudaActuals;

    //bi-directional many-to-one association to DatSery
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datInfoAgregadaMicrocred")
    private List<DatSery> datSeries;

    public DatInfoAgregadaMicrocred() {
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

    public String getResVecSalMorasPosSecCoo() {
        return this.resVecSalMorasPosSecCoo;
    }

    public void setResVecSalMorasPosSecCoo(String resVecSalMorasPosSecCoo) {
        this.resVecSalMorasPosSecCoo = resVecSalMorasPosSecCoo;
    }

    public String getResVecSalMorasPosSecFin() {
        return this.resVecSalMorasPosSecFin;
    }

    public void setResVecSalMorasPosSecFin(String resVecSalMorasPosSecFin) {
        this.resVecSalMorasPosSecFin = resVecSalMorasPosSecFin;
    }

    public String getResVecSalMorasPosSecReal() {
        return this.resVecSalMorasPosSecReal;
    }

    public void setResVecSalMorasPosSecReal(String resVecSalMorasPosSecReal) {
        this.resVecSalMorasPosSecReal = resVecSalMorasPosSecReal;
    }

    public String getResVecSalMorasPosSecTel() {
        return this.resVecSalMorasPosSecTel;
    }

    public void setResVecSalMorasPosSecTel(String resVecSalMorasPosSecTel) {
        this.resVecSalMorasPosSecTel = resVecSalMorasPosSecTel;
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
        datComportamientoEntidade.setDatInfoAgregadaMicrocred(this);

        return datComportamientoEntidade;
    }

    public DatComportamientoEntidade removeDatComportamientoEntidade(DatComportamientoEntidade datComportamientoEntidade) {
        getDatComportamientoEntidades().remove(datComportamientoEntidade);
        datComportamientoEntidade.setDatInfoAgregadaMicrocred(null);

        return datComportamientoEntidade;
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
        datEvolDeudaMicrocredito.setDatInfoAgregadaMicrocred(this);

        return datEvolDeudaMicrocredito;
    }

    public DatEvolDeudaMicrocredito removeDatEvolDeudaMicrocredito(DatEvolDeudaMicrocredito datEvolDeudaMicrocredito) {
        getDatEvolDeudaMicrocreditos().remove(datEvolDeudaMicrocredito);
        datEvolDeudaMicrocredito.setDatInfoAgregadaMicrocred(null);

        return datEvolDeudaMicrocredito;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
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
        datResumenPerfilGeneral.setDatInfoAgregadaMicrocred(this);

        return datResumenPerfilGeneral;
    }

    public DatResumenPerfilGeneral removeDatResumenPerfilGeneral(DatResumenPerfilGeneral datResumenPerfilGeneral) {
        getDatResumenPerfilGenerals().remove(datResumenPerfilGeneral);
        datResumenPerfilGeneral.setDatInfoAgregadaMicrocred(null);

        return datResumenPerfilGeneral;
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
        datSaldosYMora.setDatInfoAgregadaMicrocred(this);

        return datSaldosYMora;
    }

    public DatSaldosYMora removeDatSaldosYMora(DatSaldosYMora datSaldosYMora) {
        getDatSaldosYMoras().remove(datSaldosYMora);
        datSaldosYMora.setDatInfoAgregadaMicrocred(null);

        return datSaldosYMora;
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
        datSectorAnalisisVectore.setDatInfoAgregadaMicrocred(this);

        return datSectorAnalisisVectore;
    }

    public DatSectorAnalisisVectore removeDatSectorAnalisisVectore(DatSectorAnalisisVectore datSectorAnalisisVectore) {
        getDatSectorAnalisisVectores().remove(datSectorAnalisisVectore);
        datSectorAnalisisVectore.setDatInfoAgregadaMicrocred(null);

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
        datSectorEndeudaActual.setDatInfoAgregadaMicrocred(this);

        return datSectorEndeudaActual;
    }

    public DatSectorEndeudaActual removeDatSectorEndeudaActual(DatSectorEndeudaActual datSectorEndeudaActual) {
        getDatSectorEndeudaActuals().remove(datSectorEndeudaActual);
        datSectorEndeudaActual.setDatInfoAgregadaMicrocred(null);

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
        datSery.setDatInfoAgregadaMicrocred(this);

        return datSery;
    }

    public DatSery removeDatSery(DatSery datSery) {
        getDatSeries().remove(datSery);
        datSery.setDatInfoAgregadaMicrocred(null);

        return datSery;
    }

}
