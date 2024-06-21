package com.projeto.rest.domain.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.projeto.rest.api.dto.AlunoModelBasic;
import com.projeto.rest.api.dto.TurmaModelBasic;
import com.projeto.rest.domain.model.Aluno;
import com.projeto.rest.domain.model.Turma;
import com.projeto.rest.domain.repository.TurmaRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TurmaService {

	private TurmaRepository repositorio;
	
	
	public List<TurmaModelBasic> listarTodos2(){
		List<Turma> turmas = repositorio.findAll();
		
		List<TurmaModelBasic> turmasBasica = new ArrayList<>();
		
		turmas.stream().forEach( t -> {
			TurmaModelBasic resposta = new TurmaModelBasic();
			
			resposta.setId(t.getId());
			resposta.setNome(t.getNome());
			
			List<AlunoModelBasic> alunos = new ArrayList<>();
			
			t.getAlunos().stream().forEach( a -> {
				
				AlunoModelBasic aluno = new AlunoModelBasic();
				
				aluno.setId(a.getId());
				aluno.setNome(a.getNome());
				aluno.setEndereco(a.getEndereco());
				
				alunos.add(aluno);
			});
			
			resposta.setAlunos(alunos);
			
			turmasBasica.add(resposta);
		});
		
		return turmasBasica;
	}
	
	public List<Turma> listarTodos(){
		return repositorio.findAll();
	}
	
	public Optional<Turma> encontrarTurmaPeloId(Long id){
		return repositorio.findById(id);
	}
}
