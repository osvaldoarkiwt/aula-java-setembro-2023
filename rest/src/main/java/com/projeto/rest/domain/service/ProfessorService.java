package com.projeto.rest.domain.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.projeto.rest.api.dto.DisciplinaModelBasic;
import com.projeto.rest.api.dto.ProfessorModelBasic;
import com.projeto.rest.api.input.ProfessorInput;
import com.projeto.rest.domain.model.Professor;
import com.projeto.rest.domain.repository.ProfessorRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProfessorService {

	private ProfessorRepository repository;
	
	public List<ProfessorModelBasic> listarProfessores(){
		List<Professor> professores = repository.findAll();
		
		List<ProfessorModelBasic> professoresModel = new ArrayList<>();
		
		professores.stream().forEach(professor -> {
			ProfessorModelBasic p = new ProfessorModelBasic();
			
			p = permutaDeDados(professor);
			
			professoresModel.add(p);
		});
		
		return professoresModel;
	}
	
	public Professor buscarProfessorPeloId(Long id){
		return repository.findById(id).orElse(null);
	}
	
	public ProfessorModelBasic salvarProfessor(ProfessorInput input) {
		
		Professor professor = new Professor();
		
		professor.setNome(input.getNome());
		professor.setEndereco(input.getEndereco());
		
		repository.save(professor);
		
		ProfessorModelBasic p = permutaDeDados(professor);
		
		return p;
	}
	
	public void deletarProfessor(Long id) {
		Professor professor = buscarProfessorPeloId(id);
		
		if(professor != null) {
			repository.delete(professor);
		}
	}
	
	public ProfessorModelBasic permutaDeDados(Professor professor) {
		
		ProfessorModelBasic basico = new ProfessorModelBasic();
		
		List<DisciplinaModelBasic> disciplinaModel = new ArrayList<>();
		
		professor.getDisciplinas().stream().forEach(d -> {
			DisciplinaModelBasic dmb = new DisciplinaModelBasic();
			
			dmb.setId(d.getId());
			dmb.setDescricao(d.getDescricao());
			
			disciplinaModel.add(dmb);
		});
		
		
		basico.setId(professor.getId());
		basico.setNome(professor.getNome());
		basico.setEndereco(professor.getEndereco());
		basico.setDisciplinas(disciplinaModel);
		
		return basico;
	}
}
