package com.zaggo.services;

import com.zaggo.entities.Campo;
import com.zaggo.repositories.CampoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampoService {
    @Autowired
    private CampoRepository repo;

    public List<Campo> listarCampos(String busca) {
        if (busca != null && !busca.isEmpty()) {
            return repo.findByNomeContainingIgnoreCase(busca);
        }
        return repo.findAll();
    }
}