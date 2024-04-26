package com.projeto.rest.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.rest.domain.model.Aluno;
import com.projeto.rest.domain.service.AlunoService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/alunos")
@AllArgsConstructor
public class AlunoController {

	private AlunoService alunoService;
	
	@GetMapping()
	public List<Aluno> retornarAlunos(){
		return alunoService.buscarAlunos();
	}
	
	@GetMapping("/{alunoId}")
	public Aluno retornarAlunoPeloId(@PathVariable Long alunoId) {
		
		return alunoService.buscarAlunoPeloId(alunoId);
	}
	
	@GetMapping("/nome/{alunoNome}")
	public Aluno retornarAlunoPeloNome(@PathVariable String alunoNome) {
		return alunoService.buscarAlunoPeloNome(alunoNome);
	}
	
	@PostMapping
	public Aluno adicionarAluno(@RequestBody Aluno aluno) {
		return alunoService.adicionarAluno(aluno);
	}
	
	@PostMapping("/lista")
	public List<Aluno> adicionarAlunos(@RequestBody List<Aluno> alunos){
		return alunoService.adicionarAlunos(alunos);
	}
	
	@DeleteMapping("/{alunoId}")
	public void deletarAluno(@PathVariable Long alunoId) {
		alunoService.deletarAluno(alunoId);
	}
}
