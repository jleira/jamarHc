package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the DAT_ESTADO_FINANCIERO database table.
 *
 */
@Entity
@Table(name = "DAT_ESTADO_FINANCIERO")
@NamedQuery(name = "DatEstadoFinanciero.findAll", query = "SELECT d FROM DatEstadoFinanciero d")
@XmlRootElement
public class DatEstadoFinanciero implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_ESTADO_FINANCIERO_ID_GENERATOR", sequenceName = "SQ_DAT_ESTADO_FINANCIERO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_ESTADO_FINANCIERO_ID_GENERATOR")
    private long id;

    private BigDecimal activos;

    @Column(name = "C_EMP")
    private String cEmp;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    @Column(name = "ID_REGISTRO")
    private String idRegistro;

    private BigDecimal ingresos;

    @Column(name = "NIT_REPORTA")
    private String nitReporta;

    private BigDecimal pasivos;

    @Column(name = "RAZON_SOCIAL")
    private String razonSocial;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatNaturale
    @ManyToOne
    @JoinColumn(name = "ID_NATURAL")
    private DatNaturale datNaturale;

    public DatEstadoFinanciero() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigDecimal getActivos() {
        return this.activos;
    }

    public void setActivos(BigDecimal activos) {
        this.activos = activos;
    }

    public String getCEmp() {
        return this.cEmp;
    }

    public void setCEmp(String cEmp) {
        this.cEmp = cEmp;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getIdRegistro() {
        return this.idRegistro;
    }

    public void setIdRegistro(String idRegistro) {
        this.idRegistro = idRegistro;
    }

    public BigDecimal getIngresos() {
        return this.ingresos;
    }

    public void setIngresos(BigDecimal ingresos) {
        this.ingresos = ingresos;
    }

    public String getNitReporta() {
        return this.nitReporta;
    }

    public void setNitReporta(String nitReporta) {
        this.nitReporta = nitReporta;
    }

    public BigDecimal getPasivos() {
        return this.pasivos;
    }

    public void setPasivos(BigDecimal pasivos) {
        this.pasivos = pasivos;
    }

    public String getRazonSocial() {
        return this.razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

    public DatNaturale getDatNaturale() {
        return this.datNaturale;
    }

    public void setDatNaturale(DatNaturale datNaturale) {
        this.datNaturale = datNaturale;
    }

}
