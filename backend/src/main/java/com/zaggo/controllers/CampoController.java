
package com.zaggo.controllers;

import com.zaggo.entities.Campo;
import com.zaggo.services.CampoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/campos")
public class CampoController {
    @Autowired
    private CampoService service;

    @GetMapping
    public List<Campo> listar(@RequestParam(required = false) String busca) {
        return service.listarCampos(busca);
    }
}