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
@Table(name = "DAT_PRESELECTA_SCORESMOTOR")
@NamedQuery(name = "DatPreScoreMotor.findAll", query = "SELECT d FROM DatPreScoreMotor d")
@XmlRootElement
public class DatPreScoreMotor {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_PRES_SCORE_ID_GENERATOR", sequenceName = "seq_scoresmotor_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_PRES_SCORE_ID_GENERATOR")
    @Column(name = "ID_SCORE")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;
    
    private BigDecimal PUNTAJE;

    private String CLASIFICACION;

    private String RAZON;
    
    private String TIPO;
    
    @ManyToOne
    @JoinColumn(name = "ID_CONSULTA")
    private DatPreselecta datPreselecta;

    public DatPreScoreMotor() {
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

	public BigDecimal getPUNTAJE() {
		return PUNTAJE;
	}

	public void setPUNTAJE(BigDecimal pUNTAJE) {
		PUNTAJE = pUNTAJE;
	}

	public String getCLASIFICACION() {
		return CLASIFICACION;
	}

	public void setCLASIFICACION(String cLASIFICACION) {
		CLASIFICACION = cLASIFICACION;
	}

	public String getRAZON() {
		return RAZON;
	}

	public void setRAZON(String rAZON) {
		RAZON = rAZON;
	}

	public String getTIPO() {
		return TIPO;
	}

	public void setTIPO(String tIPO) {
		TIPO = tIPO;
	}

	public DatPreselecta getDatPreselecta() {
		return datPreselecta;
	}

	public void setDatPreselecta(DatPreselecta datPreselecta) {
		this.datPreselecta = datPreselecta;
	}
    


}
 