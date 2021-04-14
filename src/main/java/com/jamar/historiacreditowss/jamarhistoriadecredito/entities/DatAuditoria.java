package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the DAT_AUDITORIA database table.
 *
 */
@Entity
@Table(name = "DAT_AUDITORIA")
@NamedQuery(name = "DatAuditoria.findAll", query = "SELECT d FROM DatAuditoria d")
public class DatAuditoria implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_AUDITORIA_IDTRANSACCION_GENERATOR", sequenceName = "SQ_DAT_AUDITORIA")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_AUDITORIA_IDTRANSACCION_GENERATOR")
    @Column(name = "ID_TRANSACCION")
    private Long idTransaccion;
    @Basic(optional = false)
    @Column(name = "C_EMP")
    private String cEmp;
    @Column(name = "CONTROL")
    private Integer control;
    @Column(name = "FECHA_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicio;
    @Column(name = "ORIGEN")
    private String origen;
    @Column(name = "PRODUCTO")
    private String producto;
    @Column(name = "TIPO_IDENTIFICACION")
    private String tipoIdentificacion;
    @Column(name = "NUMERO_IDENTIFICACION")
    private String numeroIdentificacion;
    @Column(name = "PRIMER_APELLIDO")
    private String primerApellido;
    @Column(name = "USUARIO")
    private String usuario;

    public DatAuditoria() {
    }

    public DatAuditoria(Long idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public Long getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(Long idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getCEmp() {
        return cEmp;
    }

    public void setCEmp(String cEmp) {
        this.cEmp = cEmp;
    }

    public Integer getControl() {
        return control;
    }

    public void setControl(Integer control) {
        this.control = control;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTransaccion != null ? idTransaccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DatAuditoria)) {
            return false;
        }
        DatAuditoria other = (DatAuditoria) object;
        return !((this.idTransaccion == null && other.idTransaccion != null) || (this.idTransaccion != null && !this.idTransaccion.equals(other.idTransaccion)));
    }

    @Override
    public String toString() {
        return "co.com.datacredito.webservices.historiacreditows.entities.DatAuditoria[ idTransaccion=" + idTransaccion + " ]";
    }
}
