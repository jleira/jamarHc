package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the DAT_EMPLEADOR database table.
 *
 */
@Entity
@Table(name = "DAT_EMPLEADOR")
@NamedQuery(name = "DatEmpleador.findAll", query = "SELECT d FROM DatEmpleador d")
@XmlRootElement
public class DatEmpleador implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_EMPLEADOR_ID_GENERATOR", sequenceName = "SQ_DAT_EMPLEADOR")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_EMPLEADOR_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    private String column1;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_INGRESO")
    private Date fechaIngreso;

    @Column(name = "ID_REGISTRO")
    private String idRegistro;

    private String nit;

    @Column(name = "NIT_REPORTA")
    private String nitReporta;

    private String nombre;

    @Column(name = "RAZON_SOCIAL")
    private String razonSocial;

    @Column(name = "TIPO_CONTRATO")
    private String tipoContrato;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatNaturale
    @ManyToOne
    @JoinColumn(name = "ID_NATURAL")
    private DatNaturale datNaturale;

    public DatEmpleador() {
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

    public String getColumn1() {
        return this.column1;
    }

    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFechaIngreso() {
        return this.fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getIdRegistro() {
        return this.idRegistro;
    }

    public void setIdRegistro(String idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getNit() {
        return this.nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNitReporta() {
        return this.nitReporta;
    }

    public void setNitReporta(String nitReporta) {
        this.nitReporta = nitReporta;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazonSocial() {
        return this.razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getTipoContrato() {
        return this.tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
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
