package com.projeto.rest.domain.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.projeto.rest.domain.model.Aluno;
import com.projeto.rest.domain.repository.AlunoRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AlunoService {

	private AlunoRepository alunoRepository;
	
	public List<Aluno> buscarAlunos(){
		return alunoRepository.findAll();
	}
	
	public Aluno buscarAlunoPeloId(Long id) {
		return alunoRepository.findById(id).orElse(null);
	}
	
	public Aluno buscarAlunoPeloNome(String nome) {
		return alunoRepository.findByNomeStartingWith(nome).orElse(null);
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
	
	public void deletarAluno(Long alunoId) {
	
		Aluno aluno = buscarAlunoPeloId(alunoId);
		
		if(aluno != null) {
			alunoRepository.delete(aluno);
		}else {
			System.err.println("O aluno "+alunoId+" não existe");
		}
	}
}
