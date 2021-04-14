package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the Dat_Experian_Arboles_Dictum database table.
 *
 */ 
@Entity
@Table(name = "Dat_Experian_Arboles_Dictum")
@NamedQuery(name = "DatArbolesDictum.findAll", query = "SELECT d FROM DatArbolesDictum d")
@XmlRootElement
public class DatArbolesDictum implements Serializable {
	
    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_EXP_ARBOLES_DICTUM_ID_GENERATOR", sequenceName = "Seq_DatArbolesDictum_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_EXP_ARBOLES_DICTUM_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    private String N_IDE;

    public String getN_IDE() {
		return N_IDE;
	}

	public void setN_IDE(String n_IDE) {
		N_IDE = n_IDE;
	}

	private String ACIERTA_MASTER;
    private String NODO;
    private String NIVEL_DE_RIESGO;

    private String CO01MOR081RO;
    private String CO02END015CB;
    private String CO02NUM056CB;
    private String CO01END009RO;
    private String CO01END015RO;
    private String CO01END071RO;
    private String CO01END076RO;
    private String MARCADATA;
    private String DECISION;
    private float CUPO_PERFIL;
    private String FILTRO;
    private String NUM_FILTRO;
    private String EXCEPCION;
    private String PERFIL_CLIENTE;

    @Column(name = "MMAX_CC_DR_ULT_6M_SIN_REAL")
    private String MORA_CC_DR_ULT_6M_SIN_REAL;

    private String MORA_CC_DR_ULT_6M_REAL;
    
    private String MORA_CC_DR_ULT_6M_TODO;
    
    @Column(name = "MMAX_CC_DR_ULT_12M_SIN_RE")
    private String MORA_MAX_CC_DR_ULT_12M_SIN_REAL;
    
    @Column(name = "MMAXCC_DR_ULT_12M_REAL")
    private String MORA_MAX_CC_DR_ULT_12M_REAL;
    
    @Column(name = "MMAX_CC_DR_ULT_12M_TODO")
    private String MORA_MAX_CC_DR_ULT_12M_TODO;
    
    private String OBLIG_ABIERTAS;
    
    @Column(name = "OBL_CERR_ULT_12M_SIN_REAL")
    private String OBLIG_CERRADAS_ULT_12M_SIN_REAL;
    
    @Column(name = "OBLIG_CERR_ULT_12M_REAL")
    private String OBLIG_CERRADAS_ULT_12M_REAL;
    
    @Column(name = "OBLIG_CERR_ULT_12M_TODO")
    private String OBLIG_CERRADAS_ULT_12M_TODO;
    
    @Column(name = "M90_O_MAS_ULT_6M_SIN_REAL")
    private String MORA_90_O_MAS_ULT_6M_SIN_REAL;
    
    @Column(name = "MORA_90_O_MAS_ULT_6M_REAL")
    private String MORA_90_O_MAS_ULT_6M_REAL;
    
    @Column(name = "MORA_90_O_MAS_ULT_6M_TODO")
    private String MORA_90_O_MAS_ULT_6M_TODO;
    
    @Column(name = "MMAX_90MAS_ULT_12MSINREAL")
    private String MORA_MAX_90_O_MAS_ULT_12M_SIN_REAL;
    
    @Column(name = "MMAX_90_O_MAS_ULT_12M_REAL")
    private String MORA_MAX_90_O_MAS_ULT_12M_REAL;
    
    @Column(name = "MMAX_90_O_MAS_ULT_12M_TODO")
    private String MORA_MAX_90_O_MAS_ULT_12M_TODO;
    
    private String MORA_AL_DIA_ULT_12M;
        private String MORA_ACTUAL_SIN_REAL;
    private String MORA_ACTUAL_REAL;
    private String MORA_ACTUAL_TODO;
    private String OBLIG_ABIERTAS_SIN_MORAS;    
    private String OBLIG_TDC;
    private String CUPO_TDC;
    private Float PORC_ESTIMADO;
    private Float FACTOR;
    
    @Column(name = "MOR30_O_60_ULT_6M_SIN_REAL")
    private String MORA_30_O_60_ULT_6M_SIN_REAL;
    
    private String MORA_30_O_60_ULT_6M_REAL;
    
    @Column(name = "MMAX_3060ULT12M_SIN_REAL")
    private String MORA_MAX_30_O_60_ULT_12M_SIN_REAL;
    
    @Column(name = "MMAX_30_O_60_ULT_12M_REAL")
    private String MORA_MAX_30_O_60_ULT_12M_REAL;
    
    private String OBLIG_ABIERTAS_SIN_REAL;
    
    @Column(name = "MOR60MAS_ULT_12M_SIN_REAL")
    private String MORA_60_O_MAS_ULT_12M_SIN_REAL;
    
    @Column(name = "MORA60_O_MAS_ULT_12M_REAL")
    private String MORA_60_O_MAS_ULT_12M_REAL;
    
    @Column(name = "MORA60_O_MAS_ULT_12M_TODO")
    private String MORA_60_O_MAS_ULT_12M_TODO;
    
    @Column(name = "MORA60MAS_ULT_6M_SIN_REAL")
    private String MORA_60_O_MAS_ULT_6M_SIN_REAL;
    
    @Column(name = "MORA_60_O_MAS_ULT_6M_REAL")
    private String MORA_60_O_MAS_ULT_6M_REAL;
    
    @Column(name = "MORA_60_O_MAS_ULT_6M_TODO")
    private String MORA_60_O_MAS_ULT_6M_TODO;
    
    private String CLIENTES_OBLIG_CREDIJAMAR;
    
    private String TIPO_CLIENTE;
    
    @Column(name = "FECHA_CONSULTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaconsulta;

    
    

	//bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    public DatArbolesDictum() {
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getcEmp() {
		return cEmp;
	}

	public void setcEmp(String cEmp) {
		this.cEmp = cEmp;
	}

	public String getACIERTA_MASTER() {
		return ACIERTA_MASTER;
	}

	public void setACIERTA_MASTER(String aCIERTA_MASTER) {
		ACIERTA_MASTER = aCIERTA_MASTER;
	}

	public String getNODO() {
		return NODO;
	}

	public void setNODO(String nODO) {
		NODO = nODO;
	}

	public String getNIVEL_DE_RIESGO() {
		return NIVEL_DE_RIESGO;
	}

	public void setNIVEL_DE_RIESGO(String nIVEL_DE_RIESGO) {
		NIVEL_DE_RIESGO = nIVEL_DE_RIESGO;
	}

	public String getCO01MOR081RO() {
		return CO01MOR081RO;
	}

	public void setCO01MOR081RO(String cO01MOR081RO) {
		CO01MOR081RO = cO01MOR081RO;
	}

	public String getCO02END015CB() {
		return CO02END015CB;
	}

	public void setCO02END015CB(String cO02END015CB) {
		CO02END015CB = cO02END015CB;
	}

	public String getCO02NUM056CB() {
		return CO02NUM056CB;
	}

	public void setCO02NUM056CB(String cO02NUM056CB) {
		CO02NUM056CB = cO02NUM056CB;
	}

	public String getCO01END009RO() {
		return CO01END009RO;
	}

	public void setCO01END009RO(String cO01END009RO) {
		CO01END009RO = cO01END009RO;
	}

	public String getCO01END015RO() {
		return CO01END015RO;
	}

	public void setCO01END015RO(String cO01END015RO) {
		CO01END015RO = cO01END015RO;
	}

	public String getCO01END071RO() {
		return CO01END071RO;
	}

	public void setCO01END071RO(String cO01END071RO) {
		CO01END071RO = cO01END071RO;
	}

	public String getCO01END076RO() {
		return CO01END076RO;
	}

	public void setCO01END076RO(String cO01END076RO) {
		CO01END076RO = cO01END076RO;
	}

	public String getMARCADATA() {
		return MARCADATA;
	}

	public void setMARCADATA(String mARCADATA) {
		MARCADATA = mARCADATA;
	}

	public String getDECISION() {
		return DECISION;
	}

	public void setDECISION(String dECISION) {
		DECISION = dECISION;
	}

	public float getCUPO_PERFIL() {
		return CUPO_PERFIL;
	}

	public void setCUPO_PERFIL(float cUPO_PERFIL) {
		CUPO_PERFIL = cUPO_PERFIL;
	}

	public String getFILTRO() {
		return FILTRO;
	}

	public void setFILTRO(String fILTRO) {
		FILTRO = fILTRO;
	}

	public String getNUM_FILTRO() {
		return NUM_FILTRO;
	}

	public void setNUM_FILTRO(String nUM_FILTRO) {
		NUM_FILTRO = nUM_FILTRO;
	}

	public String getEXCEPCION() {
		return EXCEPCION;
	}

	public void setEXCEPCION(String eXCEPCION) {
		EXCEPCION = eXCEPCION;
	}

	public String getPERFIL_CLIENTE() {
		return PERFIL_CLIENTE;
	}

	public void setPERFIL_CLIENTE(String pERFIL_CLIENTE) {
		PERFIL_CLIENTE = pERFIL_CLIENTE;
	}

	public String getMORA_CC_DR_ULT_6M_SIN_REAL() {
		return MORA_CC_DR_ULT_6M_SIN_REAL;
	}

	public void setMORA_CC_DR_ULT_6M_SIN_REAL(String mORA_CC_DR_ULT_6M_SIN_REAL) {
		MORA_CC_DR_ULT_6M_SIN_REAL = mORA_CC_DR_ULT_6M_SIN_REAL;
	}

	public String getMORA_CC_DR_ULT_6M_REAL() {
		return MORA_CC_DR_ULT_6M_REAL;
	}

	public void setMORA_CC_DR_ULT_6M_REAL(String mORA_CC_DR_ULT_6M_REAL) {
		MORA_CC_DR_ULT_6M_REAL = mORA_CC_DR_ULT_6M_REAL;
	}

	public String getMORA_CC_DR_ULT_6M_TODO() {
		return MORA_CC_DR_ULT_6M_TODO;
	}

	public void setMORA_CC_DR_ULT_6M_TODO(String mORA_CC_DR_ULT_6M_TODO) {
		MORA_CC_DR_ULT_6M_TODO = mORA_CC_DR_ULT_6M_TODO;
	}

	public String getMORA_MAX_CC_DR_ULT_12M_SIN_REAL() {
		return MORA_MAX_CC_DR_ULT_12M_SIN_REAL;
	}

	public void setMORA_MAX_CC_DR_ULT_12M_SIN_REAL(String mORA_MAX_CC_DR_ULT_12M_SIN_REAL) {
		MORA_MAX_CC_DR_ULT_12M_SIN_REAL = mORA_MAX_CC_DR_ULT_12M_SIN_REAL;
	}

	public String getMORA_MAX_CC_DR_ULT_12M_REAL() {
		return MORA_MAX_CC_DR_ULT_12M_REAL;
	}

	public void setMORA_MAX_CC_DR_ULT_12M_REAL(String mORA_MAX_CC_DR_ULT_12M_REAL) {
		MORA_MAX_CC_DR_ULT_12M_REAL = mORA_MAX_CC_DR_ULT_12M_REAL;
	}

	public String getMORA_MAX_CC_DR_ULT_12M_TODO() {
		return MORA_MAX_CC_DR_ULT_12M_TODO;
	}

	public void setMORA_MAX_CC_DR_ULT_12M_TODO(String mORA_MAX_CC_DR_ULT_12M_TODO) {
		MORA_MAX_CC_DR_ULT_12M_TODO = mORA_MAX_CC_DR_ULT_12M_TODO;
	}

	public String getOBLIG_ABIERTAS() {
		return OBLIG_ABIERTAS;
	}

	public void setOBLIG_ABIERTAS(String oBLIG_ABIERTAS) {
		OBLIG_ABIERTAS = oBLIG_ABIERTAS;
	}

	public String getOBLIG_CERRADAS_ULT_12M_SIN_REAL() {
		return OBLIG_CERRADAS_ULT_12M_SIN_REAL;
	}

	public void setOBLIG_CERRADAS_ULT_12M_SIN_REAL(String oBLIG_CERRADAS_ULT_12M_SIN_REAL) {
		OBLIG_CERRADAS_ULT_12M_SIN_REAL = oBLIG_CERRADAS_ULT_12M_SIN_REAL;
	}

	public String getOBLIG_CERRADAS_ULT_12M_REAL() {
		return OBLIG_CERRADAS_ULT_12M_REAL;
	}

	public void setOBLIG_CERRADAS_ULT_12M_REAL(String oBLIG_CERRADAS_ULT_12M_REAL) {
		OBLIG_CERRADAS_ULT_12M_REAL = oBLIG_CERRADAS_ULT_12M_REAL;
	}

	public String getOBLIG_CERRADAS_ULT_12M_TODO() {
		return OBLIG_CERRADAS_ULT_12M_TODO;
	}

	public void setOBLIG_CERRADAS_ULT_12M_TODO(String oBLIG_CERRADAS_ULT_12M_TODO) {
		OBLIG_CERRADAS_ULT_12M_TODO = oBLIG_CERRADAS_ULT_12M_TODO;
	}

	public String getMORA_90_O_MAS_ULT_6M_SIN_REAL() {
		return MORA_90_O_MAS_ULT_6M_SIN_REAL;
	}

	public void setMORA_90_O_MAS_ULT_6M_SIN_REAL(String mORA_90_O_MAS_ULT_6M_SIN_REAL) {
		MORA_90_O_MAS_ULT_6M_SIN_REAL = mORA_90_O_MAS_ULT_6M_SIN_REAL;
	}

	public String getMORA_90_O_MAS_ULT_6M_REAL() {
		return MORA_90_O_MAS_ULT_6M_REAL;
	}

	public void setMORA_90_O_MAS_ULT_6M_REAL(String mORA_90_O_MAS_ULT_6M_REAL) {
		MORA_90_O_MAS_ULT_6M_REAL = mORA_90_O_MAS_ULT_6M_REAL;
	}

	public String getMORA_90_O_MAS_ULT_6M_TODO() {
		return MORA_90_O_MAS_ULT_6M_TODO;
	}

	public void setMORA_90_O_MAS_ULT_6M_TODO(String mORA_90_O_MAS_ULT_6M_TODO) {
		MORA_90_O_MAS_ULT_6M_TODO = mORA_90_O_MAS_ULT_6M_TODO;
	}

	public String getMORA_MAX_90_O_MAS_ULT_12M_SIN_REAL() {
		return MORA_MAX_90_O_MAS_ULT_12M_SIN_REAL;
	}

	public void setMORA_MAX_90_O_MAS_ULT_12M_SIN_REAL(String mORA_MAX_90_O_MAS_ULT_12M_SIN_REAL) {
		MORA_MAX_90_O_MAS_ULT_12M_SIN_REAL = mORA_MAX_90_O_MAS_ULT_12M_SIN_REAL;
	}

	public String getMORA_MAX_90_O_MAS_ULT_12M_REAL() {
		return MORA_MAX_90_O_MAS_ULT_12M_REAL;
	}

	public void setMORA_MAX_90_O_MAS_ULT_12M_REAL(String mORA_MAX_90_O_MAS_ULT_12M_REAL) {
		MORA_MAX_90_O_MAS_ULT_12M_REAL = mORA_MAX_90_O_MAS_ULT_12M_REAL;
	}

	public String getMORA_MAX_90_O_MAS_ULT_12M_TODO() {
		return MORA_MAX_90_O_MAS_ULT_12M_TODO;
	}

	public void setMORA_MAX_90_O_MAS_ULT_12M_TODO(String mORA_MAX_90_O_MAS_ULT_12M_TODO) {
		MORA_MAX_90_O_MAS_ULT_12M_TODO = mORA_MAX_90_O_MAS_ULT_12M_TODO;
	}

	public String getMORA_AL_DIA_ULT_12M() {
		return MORA_AL_DIA_ULT_12M;
	}

	public void setMORA_AL_DIA_ULT_12M(String mORA_AL_DIA_ULT_12M) {
		MORA_AL_DIA_ULT_12M = mORA_AL_DIA_ULT_12M;
	}

	public String getMORA_ACTUAL_SIN_REAL() {
		return MORA_ACTUAL_SIN_REAL;
	}

	public void setMORA_ACTUAL_SIN_REAL(String mORA_ACTUAL_SIN_REAL) {
		MORA_ACTUAL_SIN_REAL = mORA_ACTUAL_SIN_REAL;
	}

	public String getMORA_ACTUAL_REAL() {
		return MORA_ACTUAL_REAL;
	}

	public void setMORA_ACTUAL_REAL(String mORA_ACTUAL_REAL) {
		MORA_ACTUAL_REAL = mORA_ACTUAL_REAL;
	}

	public String getMORA_ACTUAL_TODO() {
		return MORA_ACTUAL_TODO;
	}

	public void setMORA_ACTUAL_TODO(String mORA_ACTUAL_TODO) {
		MORA_ACTUAL_TODO = mORA_ACTUAL_TODO;
	}

	public String getOBLIG_ABIERTAS_SIN_MORAS() {
		return OBLIG_ABIERTAS_SIN_MORAS;
	}

	public void setOBLIG_ABIERTAS_SIN_MORAS(String oBLIG_ABIERTAS_SIN_MORAS) {
		OBLIG_ABIERTAS_SIN_MORAS = oBLIG_ABIERTAS_SIN_MORAS;
	}

	public String getOBLIG_TDC() {
		return OBLIG_TDC;
	}

	public void setOBLIG_TDC(String oBLIG_TDC) {
		OBLIG_TDC = oBLIG_TDC;
	}

	public String getCUPO_TDC() {
		return CUPO_TDC;
	}

	public void setCUPO_TDC(String cUPO_TDC) {
		CUPO_TDC = cUPO_TDC;
	}

	public Float getPORC_ESTIMADO() {
		return PORC_ESTIMADO;
	}

	public void setPORC_ESTIMADO(Float pORC_ESTIMADO) {
		PORC_ESTIMADO = pORC_ESTIMADO;
	}

	public Float getFACTOR() {
		return FACTOR;
	}

	public void setFACTOR(Float fACTOR) {
		FACTOR = fACTOR;
	}

	public String getMORA_30_O_60_ULT_6M_SIN_REAL() {
		return MORA_30_O_60_ULT_6M_SIN_REAL;
	}

	public void setMORA_30_O_60_ULT_6M_SIN_REAL(String mORA_30_O_60_ULT_6M_SIN_REAL) {
		MORA_30_O_60_ULT_6M_SIN_REAL = mORA_30_O_60_ULT_6M_SIN_REAL;
	}

	public String getMORA_30_O_60_ULT_6M_REAL() {
		return MORA_30_O_60_ULT_6M_REAL;
	}

	public void setMORA_30_O_60_ULT_6M_REAL(String mORA_30_O_60_ULT_6M_REAL) {
		MORA_30_O_60_ULT_6M_REAL = mORA_30_O_60_ULT_6M_REAL;
	}

	public String getMORA_MAX_30_O_60_ULT_12M_SIN_REAL() {
		return MORA_MAX_30_O_60_ULT_12M_SIN_REAL;
	}

	public void setMORA_MAX_30_O_60_ULT_12M_SIN_REAL(String mORA_MAX_30_O_60_ULT_12M_SIN_REAL) {
		MORA_MAX_30_O_60_ULT_12M_SIN_REAL = mORA_MAX_30_O_60_ULT_12M_SIN_REAL;
	}

	public String getMORA_MAX_30_O_60_ULT_12M_REAL() {
		return MORA_MAX_30_O_60_ULT_12M_REAL;
	}

	public void setMORA_MAX_30_O_60_ULT_12M_REAL(String mORA_MAX_30_O_60_ULT_12M_REAL) {
		MORA_MAX_30_O_60_ULT_12M_REAL = mORA_MAX_30_O_60_ULT_12M_REAL;
	}

	public String getOBLIG_ABIERTAS_SIN_REAL() {
		return OBLIG_ABIERTAS_SIN_REAL;
	}

	public void setOBLIG_ABIERTAS_SIN_REAL(String oBLIG_ABIERTAS_SIN_REAL) {
		OBLIG_ABIERTAS_SIN_REAL = oBLIG_ABIERTAS_SIN_REAL;
	}

	public String getMORA_60_O_MAS_ULT_12M_SIN_REAL() {
		return MORA_60_O_MAS_ULT_12M_SIN_REAL;
	}

	public void setMORA_60_O_MAS_ULT_12M_SIN_REAL(String mORA_60_O_MAS_ULT_12M_SIN_REAL) {
		MORA_60_O_MAS_ULT_12M_SIN_REAL = mORA_60_O_MAS_ULT_12M_SIN_REAL;
	}

	public String getMORA_60_O_MAS_ULT_12M_REAL() {
		return MORA_60_O_MAS_ULT_12M_REAL;
	}

	public void setMORA_60_O_MAS_ULT_12M_REAL(String mORA_60_O_MAS_ULT_12M_REAL) {
		MORA_60_O_MAS_ULT_12M_REAL = mORA_60_O_MAS_ULT_12M_REAL;
	}

	public String getMORA_60_O_MAS_ULT_12M_TODO() {
		return MORA_60_O_MAS_ULT_12M_TODO;
	}

	public void setMORA_60_O_MAS_ULT_12M_TODO(String mORA_60_O_MAS_ULT_12M_TODO) {
		MORA_60_O_MAS_ULT_12M_TODO = mORA_60_O_MAS_ULT_12M_TODO;
	}

	public String getMORA_60_O_MAS_ULT_6M_SIN_REAL() {
		return MORA_60_O_MAS_ULT_6M_SIN_REAL;
	}

	public void setMORA_60_O_MAS_ULT_6M_SIN_REAL(String mORA_60_O_MAS_ULT_6M_SIN_REAL) {
		MORA_60_O_MAS_ULT_6M_SIN_REAL = mORA_60_O_MAS_ULT_6M_SIN_REAL;
	}

	public String getMORA_60_O_MAS_ULT_6M_REAL() {
		return MORA_60_O_MAS_ULT_6M_REAL;
	}

	public void setMORA_60_O_MAS_ULT_6M_REAL(String mORA_60_O_MAS_ULT_6M_REAL) {
		MORA_60_O_MAS_ULT_6M_REAL = mORA_60_O_MAS_ULT_6M_REAL;
	}

	public String getMORA_60_O_MAS_ULT_6M_TODO() {
		return MORA_60_O_MAS_ULT_6M_TODO;
	}

	public void setMORA_60_O_MAS_ULT_6M_TODO(String mORA_60_O_MAS_ULT_6M_TODO) {
		MORA_60_O_MAS_ULT_6M_TODO = mORA_60_O_MAS_ULT_6M_TODO;
	}

	public String getCLIENTES_OBLIG_CREDIJAMAR() {
		return CLIENTES_OBLIG_CREDIJAMAR;
	}

	public void setCLIENTES_OBLIG_CREDIJAMAR(String cLIENTES_OBLIG_CREDIJAMAR) {
		CLIENTES_OBLIG_CREDIJAMAR = cLIENTES_OBLIG_CREDIJAMAR;
	}

	public String getTIPO_CLIENTE() {
		return TIPO_CLIENTE;
	}

	public void setTIPO_CLIENTE(String tIPO_CLIENTE) {
		TIPO_CLIENTE = tIPO_CLIENTE;
	}


	public DatInforme getDatInforme() {
		return datInforme;
	}

	public void setDatInforme(DatInforme datInforme) {
		this.datInforme = datInforme;
	}

    public Date getFechaconsulta() {
		return fechaconsulta;
	}

	public void setFechaconsulta(Date fechaconsulta) {
		this.fechaconsulta = fechaconsulta;
	}


}
