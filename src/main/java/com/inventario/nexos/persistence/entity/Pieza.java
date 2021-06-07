package com.inventario.nexos.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name="inventario")
public class Pieza {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="idpieza")
    private Integer idPieza;

    private String pieza;

    @ManyToOne
    @JoinColumn(name = "idnombre", insertable = false, updatable = false)
    private Usuario usuario;

    private Integer cantidad;

    @Column(name="fechainventario")
    private LocalDateTime fechaInventario;

    @Column(name="usuarioacargo")
    private String usuarioEncargado;

    @Column(name="idnombre")
    private Integer idUsuario;

    public Integer getIdPieza() {
        return idPieza;
    }

    public void setIdPieza(Integer idPieza) {
        this.idPieza = idPieza;
    }

    public String getPieza() {
        return pieza;
    }

    public void setPieza(String pieza) {
        this.pieza = pieza;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }



    public String getUsuarioEncargado() {
        return usuarioEncargado;
    }

    public void setUsuarioEncargado(String usuarioEncargado) {
        this.usuarioEncargado = usuarioEncargado;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public LocalDateTime getFechaInventario() {
        return fechaInventario;
    }

    public void setFechaInventario(LocalDateTime fechaInventario) {
        this.fechaInventario = fechaInventario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
