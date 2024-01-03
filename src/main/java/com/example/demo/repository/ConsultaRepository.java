package com.example.prova02.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.prova02.domain.consulta.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
}
