package com.projeto.rest.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.rest.domain.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{

	public Optional<Aluno> findByNomeStartingWith(String nome);
}
