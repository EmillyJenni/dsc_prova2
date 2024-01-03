package com.example.prova02.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.prova02.domain.paciente.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    Optional<Paciente> findByCpf(String cpf);
}