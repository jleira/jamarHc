package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * The persistent class for the DAT_CUENTA_ANALISIS_VECTORES database table.
 *
 */
@Entity
@Table(name = "DAT_CUENTA_ANALISIS_VECTORES")
@NamedQuery(name = "DatCuentaAnalisisVectore.findAll", query = "SELECT d FROM DatCuentaAnalisisVectore d")
@XmlRootElement
public class DatCuentaAnalisisVectore implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_CUENTA_ANALISIS_VECTORES_ID_GENERATOR", sequenceName = "SQ_CUENTA_ANALISIS_VECTORES")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_CUENTA_ANALISIS_VECTORES_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    @Column(name = "CONTIENE_DATOS")
    private String contieneDatos;

    private String entidad;

    private String estado;

    @Column(name = "NUMERO_CUENTA")
    private String numeroCuenta;

    @Column(name = "TIPO_CUENTA")
    private String tipoCuenta;

    //bi-directional many-to-one association to DatCaracterFecha
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "datCuentaAnalisisVectore")
    private List<DatCaracterFecha> datCaracterFechas;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    //bi-directional many-to-one association to DatSectorAnalisisVectore
    @ManyToOne
    @JoinColumn(name = "ID_SECTOR_ANALISIS_VECTORES")
    private DatSectorAnalisisVectore datSectorAnalisisVectore;

    public DatCuentaAnalisisVectore() {
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

    public String getContieneDatos() {
        return this.contieneDatos;
    }

    public void setContieneDatos(String contieneDatos) {
        this.contieneDatos = contieneDatos;
    }

    public String getEntidad() {
        return this.entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTipoCuenta() {
        return this.tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    @XmlTransient
    public List<DatCaracterFecha> getDatCaracterFechas() {
        return this.datCaracterFechas;
    }

    public void setDatCaracterFechas(List<DatCaracterFecha> datCaracterFechas) {
        this.datCaracterFechas = datCaracterFechas;
    }

    public DatCaracterFecha addDatCaracterFecha(DatCaracterFecha datCaracterFecha) {
        getDatCaracterFechas().add(datCaracterFecha);
        datCaracterFecha.setDatCuentaAnalisisVectore(this);

        return datCaracterFecha;
    }

    public DatCaracterFecha removeDatCaracterFecha(DatCaracterFecha datCaracterFecha) {
        getDatCaracterFechas().remove(datCaracterFecha);
        datCaracterFecha.setDatCuentaAnalisisVectore(null);

        return datCaracterFecha;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

    public DatSectorAnalisisVectore getDatSectorAnalisisVectore() {
        return this.datSectorAnalisisVectore;
    }

    public void setDatSectorAnalisisVectore(DatSectorAnalisisVectore datSectorAnalisisVectore) {
        this.datSectorAnalisisVectore = datSectorAnalisisVectore;
    }

}
