package com.testo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testo.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
	
	
}
