package com.corhuila.app_movil_g2.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "fecha_hora")
public class FechaHora extends ABaseEntity {

    @Column(name = "fecha_hora", nullable = false)
    private LocalDateTime fechaHora;

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }
}
