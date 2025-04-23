package com.corhuila.app_movil_g2.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "reserva")
public class Reserva extends ABaseEntity {

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "fecha_hora_id", nullable = false)
    private FechaHora fechaHora;

    @ManyToOne
    @JoinColumn(name = "mesa_id")
    private Mesa mesa;


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public FechaHora getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(FechaHora fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
}
