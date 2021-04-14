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
@Table(name = "DAT_PRESELECTA_RESP_PERS")
@NamedQuery(name = "DatPreRespPersonalizada.findAll", query = "SELECT d FROM DatPreRespPersonalizada d")
@XmlRootElement
public class DatPreRespPersonalizada {

	
    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_PRES_RESP_PERS_ID_GENERATOR", sequenceName = "seq_dat_pres_resp_pers_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_PRES_RESP_PERS_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;
    
    private String NOMBRE;

    private String VALOR;

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

	public String getNOMBRE() {
		return NOMBRE;
	}

	public void setNOMBRE(String nOMBRE) {
		NOMBRE = nOMBRE;
	}

	public String getVALOR() {
		return VALOR;
	}

	public void setVALOR(String vALOR) {
		VALOR = vALOR;
	}

	public DatPreselecta getDatPreselecta() {
		return datPreselecta;
	}

	public void setDatPreselecta(DatPreselecta datPreselecta) {
		this.datPreselecta = datPreselecta;
	}

	//bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_CONSULTA")
    private DatPreselecta datPreselecta;

    public DatPreRespPersonalizada() {
    }

}
