package com.projeto.rest.api.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.rest.domain.model.Aluno;
import com.projeto.rest.domain.model.filter.AlunoFilter;
import com.projeto.rest.domain.service.AlunoService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/alunos")
@AllArgsConstructor
public class AlunoController {

	private AlunoService alunoService;
	
	@GetMapping()
	public ResponseEntity<List<Aluno>> retornarAlunos(AlunoFilter filtro){
		List<Aluno> alunos = alunoService.buscarAlunos(filtro);
		
		return alunos == null ? ResponseEntity.notFound().build() : 
								ResponseEntity.ok(alunos);
	}
	
	@GetMapping("/{alunoId}")
	public ResponseEntity<Aluno> retornarAlunoPeloId(@PathVariable Long alunoId) {
		
		Aluno aluno = alunoService.buscarAlunoPeloId(alunoId);
		
		return aluno == null ? ResponseEntity.notFound().build() :
							   ResponseEntity.ok(aluno);
	}
	/*
	@GetMapping("/{id}/turma")
	public String retornaTurmaDoAluno(@PathVariable Long id) {
		return alunoService.buscarTurmasPeloAlunoId(id);
	}
	*/
	@GetMapping("/nome/{alunoNome}")
	public ResponseEntity<Aluno> retornarAlunoPeloNome(@PathVariable String alunoNome) {
		
		Aluno aluno = alunoService.buscarAlunoPeloNome(alunoNome);
		
		return ResponseEntity.ok(aluno);
	}
	
	@GetMapping("/like")
	public ResponseEntity<List<Aluno>> retornarAlunoPeloNomeLike(@RequestParam("nome") String nome) {
		
		List<Aluno> aluno = alunoService.buscarAlunoPeloNomeLike(nome);
		
		return ResponseEntity.ok(aluno);
	}
	
	@PostMapping()
	public ResponseEntity<Aluno> adicionarAluno(@RequestBody Aluno aluno) {
		
		Aluno alunoResposta = alunoService.adicionarAluno(aluno);
		
		return ResponseEntity.ok(alunoResposta);
	}
	
	@PostMapping("/lista")
	public List<Aluno> adicionarAlunos(@RequestBody List<Aluno> alunos){
		return alunoService.adicionarAlunos(alunos);
	}
	
	@DeleteMapping("/{alunoId}")
	//@ResponseStatus(HttpStatus.NO_CONTENT)
	public ResponseEntity<Aluno> deletarAluno(@PathVariable Long alunoId) {
		Aluno aluno = alunoService.deletarAluno(alunoId);
		
		return aluno == null ? ResponseEntity.notFound().build() : ResponseEntity.noContent().build();
	}
}
