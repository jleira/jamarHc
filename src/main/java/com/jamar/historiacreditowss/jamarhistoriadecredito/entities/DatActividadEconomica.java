package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the DAT_ACTIVIDAD_ECONOMICA database table.
 *
 */
@Entity
@Table(name = "DAT_ACTIVIDAD_ECONOMICA")
@NamedQuery(name = "DatActividadEconomica.findAll", query = "SELECT d FROM DatActividadEconomica d")
@XmlRootElement
public class DatActividadEconomica implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_ACTIVIDAD_ECONOMICA_ID_GENERATOR", sequenceName = "SQ_DAT_ACTIVIDAD_ECONOMICA")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_ACTIVIDAD_ECONOMICA_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    private String ciiu;

    private String estado;

    private BigDecimal estrato;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    @Column(name = "ID_REGISTRO")
    private String idRegistro;

    @Column(name = "NIT_REPORTA")
    private String nitReporta;

    @Column(name = "RAZON_SOCIAL")
    private String razonSocial;

    private String tipo;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatNaturale
    @ManyToOne
    @JoinColumn(name = "ID_NATURAL")
    private DatNaturale datNaturale;

    public DatActividadEconomica() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCEmp() {
        return cEmp;
    }

    public void setCEmp(String cEmp) {
        this.cEmp = cEmp;
    }

    public String getCiiu() {
        return ciiu;
    }

    public void setCiiu(String ciiu) {
        this.ciiu = ciiu;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public BigDecimal getEstrato() {
        return estrato;
    }

    public void setEstrato(BigDecimal estrato) {
        this.estrato = estrato;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(String idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getNitReporta() {
        return nitReporta;
    }

    public void setNitReporta(String nitReporta) {
        this.nitReporta = nitReporta;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public DatInforme getDatInforme() {
        return datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

    public DatNaturale getDatNaturale() {
        return datNaturale;
    }

    public void setDatNaturale(DatNaturale datNaturale) {
        this.datNaturale = datNaturale;
    }
}
