package com.zaggo.controllers;

import com.zaggo.entities.Reserva;
import com.zaggo.services.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservas")
public class ReservaController {
    @Autowired
    private ReservaService service;

    @GetMapping("/usuario/{id}")
    public List<Reserva> porUsuario(@PathVariable Long id) {
        return service.listarPorUsuario(id);
    }

    @PostMapping
    public Reserva reservar(@RequestBody Reserva reserva) {
        return service.reservar(reserva);
    }

    @DeleteMapping("/{id}")
    public void cancelar(@PathVariable Long id) {
        service.cancelar(id);
    }
}