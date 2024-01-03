package com.example.prova02.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.prova02.domain.medico.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
