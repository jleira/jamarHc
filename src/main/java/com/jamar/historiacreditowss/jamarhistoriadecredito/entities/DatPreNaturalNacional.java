package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.math.BigDecimal;

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
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "DAT_PRESELECTA_NAT_NAC")
@NamedQuery(name = "DatPreNaturalNacional.findAll", query = "SELECT d FROM DatPreNaturalNacional d")
@XmlRootElement
public class DatPreNaturalNacional {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_PRES_NATNAC_ID_GENERATOR", sequenceName = "seq_dat_nat_nac_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_PRES_NATNAC_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;
    
//    private BigDecimal IDENTIFICACION;

    private BigDecimal EDADMIN;

    private BigDecimal EDADMAX;
    
    private String IDENTIFICACION;
    
    private String rut;

    
    public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	private String PRIMERAPELLIDO;
      
    private int GENERO;

    private String SEGUNDOAPELLIDO;
    
    private String VALIDADA;
    
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

	public BigDecimal getEDADMIN() {
		return EDADMIN;
	}

	public void setEDADMIN(BigDecimal bigDecimal) {
		EDADMIN = bigDecimal;
	}

	public BigDecimal getEDADMAX() {
		return EDADMAX;
	}

	public void setEDADMAX(BigDecimal eDADMAX) {
		EDADMAX = eDADMAX;
	}

	public String getIDENTIFICACION() {
		return IDENTIFICACION;
	}

	public void setIDENTIFICACION(String iDENTIFICACION) {
		IDENTIFICACION = iDENTIFICACION;
	}

	public String getPRIMERAPELLIDO() {
		return PRIMERAPELLIDO;
	}

	public void setPRIMERAPELLIDO(String pRIMERAPELLIDO) {
		PRIMERAPELLIDO = pRIMERAPELLIDO;
	}

	public int getGENERO() {
		return GENERO;
	}

	public void setGENERO(int gENERO) {
		GENERO = gENERO;
	}

	public String getSEGUNDOAPELLIDO() {
		return SEGUNDOAPELLIDO;
	}

	public void setSEGUNDOAPELLIDO(String sEGUNDOAPELLIDO) {
		SEGUNDOAPELLIDO = sEGUNDOAPELLIDO;
	}

	public String getVALIDADA() {
		return VALIDADA;
	}

	public void setVALIDADA(String vALIDADA) {
		VALIDADA = vALIDADA;
	}

	public String getNOMBRECOMPLETO() {
		return NOMBRECOMPLETO;
	}

	public void setNOMBRECOMPLETO(String nOMBRECOMPLETO) {
		NOMBRECOMPLETO = nOMBRECOMPLETO;
	}

	public String getNOMBRES() {
		return NOMBRES;
	}

	public void setNOMBRES(String nOMBRES) {
		NOMBRES = nOMBRES;
	}

	public DatPreselecta getDatPreselecta() {
		return datPreselecta;
	}

	public void setDatPreselecta(DatPreselecta datPreselecta) {
		this.datPreselecta = datPreselecta;
	}

	private String NOMBRECOMPLETO;
    
    private String NOMBRES;
     
    @ManyToOne
    @JoinColumn(name = "ID_CONSULTA")
    private DatPreselecta datPreselecta;

    public DatPreNaturalNacional() {
    }
}

 