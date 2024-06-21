package com.projeto.rest.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.rest.domain.model.Turma;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long>{

}
