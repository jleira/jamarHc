package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * The persistent class for the DAT_SCORE database table.
 *
 */
@Entity
@Table(name = "DAT_SCORE")
@NamedQuery(name = "DatScore.findAll", query = "SELECT d FROM DatScore d")
@XmlRootElement
public class DatScore implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_SCORE_ID_GENERATOR", sequenceName = "SQ_DAT_SCORE")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_SCORE_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    private String clasificacion;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    @Column(name = "NOMBRE_SCORE")
    private String nombreScore;

    private BigDecimal poblacion;

    private BigDecimal puntaje;

    private String tipo;

    //bi-directional many-to-one association to DatRazon
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datScore")
    private List<DatRazon> datRazons;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    public DatScore() {
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

    public String getClasificacion() {
        return this.clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombreScore() {
        return this.nombreScore;
    }

    public void setNombreScore(String nombreScore) {
        this.nombreScore = nombreScore;
    }

    public BigDecimal getPoblacion() {
        return this.poblacion;
    }

    public void setPoblacion(BigDecimal poblacion) {
        this.poblacion = poblacion;
    }

    public BigDecimal getPuntaje() {
        return this.puntaje;
    }

    public void setPuntaje(BigDecimal puntaje) {
        this.puntaje = puntaje;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @XmlTransient
    public List<DatRazon> getDatRazons() {
        return this.datRazons;
    }

    public void setDatRazons(List<DatRazon> datRazons) {
        this.datRazons = datRazons;
    }

    public DatRazon addDatRazon(DatRazon datRazon) {
        getDatRazons().add(datRazon);
        datRazon.setDatScore(this);

        return datRazon;
    }

    public DatRazon removeDatRazon(DatRazon datRazon) {
        getDatRazons().remove(datRazon);
        datRazon.setDatScore(null);

        return datRazon;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

}
