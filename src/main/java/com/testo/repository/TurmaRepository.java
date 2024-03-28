package com.testo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testo.entities.Turma;

public interface TurmaRepository extends JpaRepository<Turma, Long> {
	
	
}