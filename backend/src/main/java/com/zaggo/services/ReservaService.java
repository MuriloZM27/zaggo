package com.zaggo.services;

import com.zaggo.entities.Reserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {
    @Autowired
    private src.main.java.com.zaggo.repositories.ReservaRepository repo;

    public List<Reserva> listarPorUsuario(Long idUsuario) {
        return repo.findByUsuarioId(idUsuario);
    }

    public Reserva reservar(Reserva reserva) {
        return repo.save(reserva);
    }

    public void cancelar(Long idReserva) {
        repo.deleteById(idReserva);
    }
}