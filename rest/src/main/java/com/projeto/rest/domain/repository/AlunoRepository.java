package com.projeto.rest.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.projeto.rest.domain.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>, JpaSpecificationExecutor<Aluno>{

	public Optional<Aluno> findByNomeStartingWith(String nome);
	
	@Query(value = "SELECT a.* FROM alunos a WHERE a.nome ILIKE %:nome%",nativeQuery = true)
	public List<Aluno> encontrePeloNome(String nome);
}
