package com.zaggo.repositories;

import com.zaggo.entities.Campo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CampoRepository extends JpaRepository<Campo, Long> {
    List<Campo> findByNomeContainingIgnoreCase(String nome);
}
