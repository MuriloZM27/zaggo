package com.zaggo.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Campo campo;

    @ManyToOne
    private Usuario usuario;

    private LocalDate data;
    private LocalTime horario;

    public Reserva() {
    }

    public Reserva(Long id, Campo campo, Usuario usuario, LocalDate data, LocalTime horario) {
        this.id = id;
        this.campo = campo;
        this.usuario = usuario;
        this.data = data;
        this.horario = horario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Campo getCampo() {
        return campo;
    }

    public void setCampo(Campo campo) {
        this.campo = campo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }
}