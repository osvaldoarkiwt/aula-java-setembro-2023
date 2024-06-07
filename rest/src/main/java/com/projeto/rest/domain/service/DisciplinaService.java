package com.projeto.rest.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.projeto.rest.domain.model.Disciplina;
import com.projeto.rest.domain.model.Professor;
import com.projeto.rest.domain.repository.DisciplinaRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DisciplinaService {

	private DisciplinaRepository repository;
	
	private ProfessorService professorService;
	
	public List<Disciplina> listarTodasDisciplinas(){
		return repository.findAll();
	}
	
	public List<Disciplina> listarTodasDisciplinasProfessorId(Long id){
		return repository.findDisciplinaByProfessorId(id);
	}
	
	public Disciplina listarDisciplinaId(Long id) {
		return repository.findById(id).orElse(null);
	}
	
	public Disciplina criarDisciplina(Disciplina disciplina) {
		return repository.save(disciplina);
	}
	
	public Disciplina cadastrarProfessorDisciplina(Long disciplinaId, Long professorId) {
		
		Disciplina disciplina = listarDisciplinaId(disciplinaId);
		
		Professor professor = professorService.buscarProfessorPeloId(professorId);
		
		disciplina.setProfessor(professor);
		
		return repository.save(disciplina);
	}
	
	public Disciplina removerProfessorDisciplina(Long disciplinaId, Long professorId) {
		return null;
	}
	
	public void deletarDisciplina(Long id) {
		Disciplina disciplina = listarDisciplinaId(id);
		
		if(disciplina != null) {
			repository.delete(disciplina);
		}
	}
}
