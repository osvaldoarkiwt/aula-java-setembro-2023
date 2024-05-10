package com.projeto.rest.domain.service;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.projeto.rest.domain.model.Aluno;
import com.projeto.rest.domain.model.filter.AlunoFilter;
import com.projeto.rest.domain.repository.AlunoRepository;
import com.projeto.rest.domain.repository.spec.AlunoSpec;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AlunoService {

	private AlunoRepository alunoRepository;
	
	public List<Aluno> buscarAlunos(AlunoFilter filtro){
			
		return alunoRepository.findAll(AlunoSpec.usandoFiltro(filtro));
	}
	
	public Aluno buscarAlunoPeloId(Long id) {
		return alunoRepository.findById(id).orElse(null);
	}
	
	public Aluno buscarAlunoPeloNome(String nome) {
		return alunoRepository.findByNomeStartingWith(nome).orElse(null);
	}
	
	public List<Aluno> buscarAlunoPeloNomeLike(String nome) {
		return alunoRepository.encontrePeloNome(nome);
	}
	
	public Aluno adicionarAluno(Aluno aluno) {
		return alunoRepository.save(aluno);
	}
	
	public List<Aluno> adicionarAlunos(List<Aluno> alunos){
		//return alunos.stream().map(alunoRepository::save).collect(Collectors.toList());
		
		return alunos.stream().map(aluno -> alunoRepository.save(aluno))
								.collect(Collectors.toList());
		
		/*
		List<Aluno> resposta = new ArrayList<>();
		
		for(Aluno aluno : alunos) {
			
			alunoRepository.save(aluno);
			
			resposta.add(aluno);
		}
		
		return resposta;
		*/
	}
	
	public Aluno deletarAluno(Long alunoId) {
	
		Aluno aluno = buscarAlunoPeloId(alunoId);
		
		if(aluno != null) {
			//alunoRepository.delete(aluno);
			
			aluno.setDeletedAt(OffsetDateTime.now());
			
			alunoRepository.save(aluno);
			
		}else {
			System.err.println("O aluno "+alunoId+" não existe");
		}
		
		return aluno;
	}
}
