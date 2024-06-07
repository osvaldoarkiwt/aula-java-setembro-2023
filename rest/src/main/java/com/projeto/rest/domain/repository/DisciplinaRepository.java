package com.projeto.rest.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.projeto.rest.domain.model.Disciplina;
import com.projeto.rest.domain.model.Professor;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long>, JpaSpecificationExecutor<Professor>{

	public List<Disciplina> findDisciplinaByProfessorId(Long id);
}
