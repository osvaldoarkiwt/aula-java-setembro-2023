package com.projeto.rest.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.projeto.rest.domain.model.Professor;
import com.projeto.rest.domain.repository.ProfessorRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProfessorService {

	private ProfessorRepository repository;
	
	public List<Professor> listarProfessores(){
		return repository.findAll();
	}
	
	public Professor buscarProfessorPeloId(Long id){
		return repository.findById(id).orElse(null);
	}
	
	public Professor salvarProfessor(Professor professor) {
		return repository.save(professor);
	}
	
	public void deletarProfessor(Long id) {
		Professor professor = buscarProfessorPeloId(id);
		
		if(professor != null) {
			repository.delete(professor);
		}
	}
}
