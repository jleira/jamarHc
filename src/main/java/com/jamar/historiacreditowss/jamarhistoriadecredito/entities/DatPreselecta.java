package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "dat_preselecta")
@NamedQuery(name = "DatPreselecta.findAll", query = "SELECT d FROM DatPreselecta d")
@XmlRootElement
public class DatPreselecta {
    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_PRESLECTA_SEQ_GENERATOR", sequenceName = "seq_dat_preselecta_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_PRESLECTA_SEQ_GENERATOR")
    private long id;
    
    
    private long CONSULTA_ID;

    private String N_IDE;
    
    private String APELLIDO;
    
    private String USUARIO;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_CONSULTA")
    private Date fechaConsulta;

    private String RESPUESTA;

    @Column(name = "C_EMP")
    private String cEmp;

    
    //bi-directional many-to-one association to DatRespuestaPersLinea
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datPreselecta")
    private List<DatPreRespPersonalizada> datRespuestaPersPres;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datPreselecta")
    private List<DatPreScoreMotor> datPrescoremotor;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datPreselecta")
    private List<DatPreNaturalNacional> datPresNatnac;
    
    
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Long getCONSULTA_ID() {
		return CONSULTA_ID;
	}

	public void setCONSULTA_ID(Long long1) {
		CONSULTA_ID = long1;
	}

	public String getN_IDE() {
		return N_IDE;
	}

	public void setN_IDE(String n_IDE) {
		N_IDE = n_IDE;
	}

	public String getAPELLIDO() {
		return APELLIDO;
	}

	public void setAPELLIDO(String aPELLIDO) {
		APELLIDO = aPELLIDO;
	}

	public String getUSUARIO() {
		return USUARIO;
	}

	public void setUSUARIO(String uSUARIO) {
		USUARIO = uSUARIO;
	}

	public Date getFechaConsulta() {
		return fechaConsulta;
	}

	public void setFechaConsulta(Date fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}

	public String getRESPUESTA() {
		return RESPUESTA;
	}

	public void setRESPUESTA(String rESPUESTA) {
		RESPUESTA = rESPUESTA;
	}

	public String getcEmp() {
		return cEmp;
	}

	public void setcEmp(String cEmp) {
		this.cEmp = cEmp;
	}

    
    @XmlTransient
    public List<DatPreRespPersonalizada> getDatPreRespPersonalizada() {
        return this.datRespuestaPersPres;
    }

    public void setDatPreRespPersonalizada(List<DatPreRespPersonalizada> datPreRespPersonalizada) {
        this.datRespuestaPersPres = datPreRespPersonalizada;
    }

    public DatPreRespPersonalizada addDatPreRespPersonalizada(DatPreRespPersonalizada datRespuestaPersLinea) {
    	getDatPreRespPersonalizada().add(datRespuestaPersLinea);
        datRespuestaPersLinea.setDatPreselecta(this);

        return datRespuestaPersLinea;
    }

    public DatPreRespPersonalizada removeDatPreRespPersonalizada(DatPreRespPersonalizada datRespuestaPersLinea) {
    	getDatPreRespPersonalizada().remove(datRespuestaPersLinea);
        datRespuestaPersLinea.setDatPreselecta(null);

        return datRespuestaPersLinea;
    }

    
    @XmlTransient
    public List<DatPreScoreMotor> getDatPreScoreMotor() {
        return this.datPrescoremotor;
    }

    public void setDatPreScoreMotor(List<DatPreScoreMotor> datPreRespPersonalizada) {
        this.datPrescoremotor = datPreRespPersonalizada;
    }

    public DatPreScoreMotor addDatPreScoreMotor(DatPreScoreMotor datRespuestaPersLinea) {
    	getDatPreScoreMotor().add(datRespuestaPersLinea);
        datRespuestaPersLinea.setDatPreselecta(this);

        return datRespuestaPersLinea;
    }

    public DatPreScoreMotor removeDatPreScoreMotor(DatPreScoreMotor datRespuestaPersLinea) {
    	getDatPreScoreMotor().remove(datRespuestaPersLinea);
        datRespuestaPersLinea.setDatPreselecta(null);

        return datRespuestaPersLinea;
    }
    
    @XmlTransient
    public List<DatPreNaturalNacional> getDatPreNaturalNacional() {
        return this.datPresNatnac;
    }

    public void setDatPreNaturalNacional(List<DatPreNaturalNacional> datPrenatnac) {
        this.datPresNatnac = datPrenatnac;
    }

    public DatPreNaturalNacional addDatPreNaturalNacional(DatPreNaturalNacional datPrenatnac) {
    	getDatPreNaturalNacional().add(datPrenatnac);
    	datPrenatnac.setDatPreselecta(this);

        return datPrenatnac;
    }

    public DatPreNaturalNacional removeDatPreScoreMotor(DatPreNaturalNacional datPrenatnac) {
    	getDatPreNaturalNacional().remove(datPrenatnac);
    	datPrenatnac.setDatPreselecta(null);

        return datPrenatnac;
    }

}
