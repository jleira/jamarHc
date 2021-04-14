package com.jamar.historiacreditowss.jamarhistoriadecredito.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the DAT_CONFIGURACION_RESPUESTA database table.
 *
 */
@Entity
@Table(name = "DAT_CONFIGURACION_RESPUESTA")
@NamedQuery(name = "DatConfiguracionRespuesta.findAll", query = "SELECT d FROM DatConfiguracionRespuesta d")
public class DatConfiguracionRespuesta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(allocationSize = 1, name = "DAT_CONFIGURACION_RESPUESTA_CODIGO_GENERATOR", sequenceName = "SQ_DAT_CONFIGURACION_RESPUESTA")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DAT_CONFIGURACION_RESPUESTA_CODIGO_GENERATOR")
    private long codigo;

    @Column(name = "ESTADO")
    private String estado;

    @Column(name = "C_EMP")
    private String cEmp;

    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_BORRADO")
    private Date fechaBorrado;

    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_CREACION")
    private Date fechaCreacion;

    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_MODIFICACION")
    private Date fechaModificacion;

    @Column(name = "MENSAJE")
    private String mensaje;

    @Column(name = "USUARIO_BORRADO")
    private String usuarioBorrado;

    @Column(name = "USUARIO_CREACION")
    private String usuarioCreacion;

    @Column(name = "USUARIO_MODIFICACION")
    private String usuarioModificacion;

    public DatConfiguracionRespuesta() {
    }

    public long getCodigo() {
        return this.codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaBorrado() {
        return this.fechaBorrado;
    }

    public void setFechaBorrado(Date fechaBorrado) {
        this.fechaBorrado = fechaBorrado;
    }

    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaModificacion() {
        return this.fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getMensaje() {
        return this.mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getUsuarioBorrado() {
        return this.usuarioBorrado;
    }

    public void setUsuarioBorrado(String usuarioBorrado) {
        this.usuarioBorrado = usuarioBorrado;
    }

    public String getUsuarioCreacion() {
        return this.usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    public String getUsuarioModificacion() {
        return this.usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    public String getcEmp() {
        return cEmp;
    }

    public void setcEmp(String cEmp) {
        this.cEmp = cEmp;
    }

}
