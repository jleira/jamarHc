package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the DAT_PRODUCTOS_VALORES database table.
 *
 */
@Entity
@Table(name = "DAT_PRODUCTOS_VALORES")
@NamedQuery(name = "DatProductosValore.findAll", query = "SELECT d FROM DatProductosValore d")
@XmlRootElement
public class DatProductosValore implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_PRODUCTOS_VALORES_ID_GENERATOR", sequenceName = "SQ_DAT_PRODUCTOS_VALORES")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_PRODUCTOS_VALORES_ID_GENERATOR")
    private long id;

    @Column(name = "C_EMP")
    private String cEmp;

    private String clasificacion;

    private String producto;

    private String razon1;

    private String razon10;

    private String razon2;

    private String razon3;

    private String razon4;

    private String razon5;

    private String razon6;

    private String razon7;

    private String razon8;

    private String razon9;

    private String valor1;

    private String valor10;

    private String valor10smlv;

    private String valor1smlv;

    private String valor2;

    private String valor2smlv;

    private String valor3;

    private String valor3smlv;

    private String valor4;

    private String valor4smlv;

    private String valor5;

    private String valor5smlv;

    private String valor6;

    private String valor6smlv;

    private String valor7;

    private String valor7smlv;

    private String valor8;

    private String valor8smlv;

    private String valor9;

    private String valor9smlv;

    //bi-directional many-to-one association to DatInforme
    @ManyToOne
    @JoinColumn(name = "ID_INFORME")
    private DatInforme datInforme;

    public DatProductosValore() {
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

    public String getProducto() {
        return this.producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getRazon1() {
        return this.razon1;
    }

    public void setRazon1(String razon1) {
        this.razon1 = razon1;
    }

    public String getRazon10() {
        return this.razon10;
    }

    public void setRazon10(String razon10) {
        this.razon10 = razon10;
    }

    public String getRazon2() {
        return this.razon2;
    }

    public void setRazon2(String razon2) {
        this.razon2 = razon2;
    }

    public String getRazon3() {
        return this.razon3;
    }

    public void setRazon3(String razon3) {
        this.razon3 = razon3;
    }

    public String getRazon4() {
        return this.razon4;
    }

    public void setRazon4(String razon4) {
        this.razon4 = razon4;
    }

    public String getRazon5() {
        return this.razon5;
    }

    public void setRazon5(String razon5) {
        this.razon5 = razon5;
    }

    public String getRazon6() {
        return this.razon6;
    }

    public void setRazon6(String razon6) {
        this.razon6 = razon6;
    }

    public String getRazon7() {
        return this.razon7;
    }

    public void setRazon7(String razon7) {
        this.razon7 = razon7;
    }

    public String getRazon8() {
        return this.razon8;
    }

    public void setRazon8(String razon8) {
        this.razon8 = razon8;
    }

    public String getRazon9() {
        return this.razon9;
    }

    public void setRazon9(String razon9) {
        this.razon9 = razon9;
    }

    public String getValor1() {
        return this.valor1;
    }

    public void setValor1(String valor1) {
        this.valor1 = valor1;
    }

    public String getValor10() {
        return this.valor10;
    }

    public void setValor10(String valor10) {
        this.valor10 = valor10;
    }

    public String getValor10smlv() {
        return this.valor10smlv;
    }

    public void setValor10smlv(String valor10smlv) {
        this.valor10smlv = valor10smlv;
    }

    public String getValor1smlv() {
        return this.valor1smlv;
    }

    public void setValor1smlv(String valor1smlv) {
        this.valor1smlv = valor1smlv;
    }

    public String getValor2() {
        return this.valor2;
    }

    public void setValor2(String valor2) {
        this.valor2 = valor2;
    }

    public String getValor2smlv() {
        return this.valor2smlv;
    }

    public void setValor2smlv(String valor2smlv) {
        this.valor2smlv = valor2smlv;
    }

    public String getValor3() {
        return this.valor3;
    }

    public void setValor3(String valor3) {
        this.valor3 = valor3;
    }

    public String getValor3smlv() {
        return this.valor3smlv;
    }

    public void setValor3smlv(String valor3smlv) {
        this.valor3smlv = valor3smlv;
    }

    public String getValor4() {
        return this.valor4;
    }

    public void setValor4(String valor4) {
        this.valor4 = valor4;
    }

    public String getValor4smlv() {
        return this.valor4smlv;
    }

    public void setValor4smlv(String valor4smlv) {
        this.valor4smlv = valor4smlv;
    }

    public String getValor5() {
        return this.valor5;
    }

    public void setValor5(String valor5) {
        this.valor5 = valor5;
    }

    public String getValor5smlv() {
        return this.valor5smlv;
    }

    public void setValor5smlv(String valor5smlv) {
        this.valor5smlv = valor5smlv;
    }

    public String getValor6() {
        return this.valor6;
    }

    public void setValor6(String valor6) {
        this.valor6 = valor6;
    }

    public String getValor6smlv() {
        return this.valor6smlv;
    }

    public void setValor6smlv(String valor6smlv) {
        this.valor6smlv = valor6smlv;
    }

    public String getValor7() {
        return this.valor7;
    }

    public void setValor7(String valor7) {
        this.valor7 = valor7;
    }

    public String getValor7smlv() {
        return this.valor7smlv;
    }

    public void setValor7smlv(String valor7smlv) {
        this.valor7smlv = valor7smlv;
    }

    public String getValor8() {
        return this.valor8;
    }

    public void setValor8(String valor8) {
        this.valor8 = valor8;
    }

    public String getValor8smlv() {
        return this.valor8smlv;
    }

    public void setValor8smlv(String valor8smlv) {
        this.valor8smlv = valor8smlv;
    }

    public String getValor9() {
        return this.valor9;
    }

    public void setValor9(String valor9) {
        this.valor9 = valor9;
    }

    public String getValor9smlv() {
        return this.valor9smlv;
    }

    public void setValor9smlv(String valor9smlv) {
        this.valor9smlv = valor9smlv;
    }

    public DatInforme getDatInforme() {
        return this.datInforme;
    }

    public void setDatInforme(DatInforme datInforme) {
        this.datInforme = datInforme;
    }

}
