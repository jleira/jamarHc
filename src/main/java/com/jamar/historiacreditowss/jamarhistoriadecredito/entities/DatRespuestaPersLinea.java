package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the DAT_RESPUESTA_PERS_LINEA database table.
 *
 */
@Entity
@Table(name = "DAT_RESPUESTA_PERS_LINEA")
@NamedQuery(name = "DatRespuestaPersLinea.findAll", query = "SELECT d FROM DatRespuestaPersLinea d")
@XmlRootElement
public class DatRespuestaPersLinea implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_RESPUESTA_PERS_LINEA_ID_GENERATOR", sequenceName = "SQ_DAT_RESPUESTA_PERS_LINEA")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_RESPUESTA_PERS_LINEA_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    private BigDecimal consecutivo;

    private String valor;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    public DatRespuestaPersLinea() {
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

    public BigDecimal getConsecutivo() {
        return this.consecutivo;
    }

    public void setConsecutivo(BigDecimal consecutivo) {
        this.consecutivo = consecutivo;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}
