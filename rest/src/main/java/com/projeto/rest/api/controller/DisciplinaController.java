package com.projeto.rest.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.rest.domain.model.Disciplina;
import com.projeto.rest.domain.service.DisciplinaService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/disciplinas")
public class DisciplinaController {

	private DisciplinaService service;
	
	@GetMapping
	public List<Disciplina> listarDisciplinas(){
		return service.listarTodasDisciplinas();
	}
	
	@GetMapping("/professor/{profesorId}")
	public List<Disciplina> listarDisciplinasProfessorId(@PathVariable Long profesorId){
		return service.listarTodasDisciplinasProfessorId(profesorId);
	}
	
	@GetMapping("/{id}")
	public Disciplina listarDisciplinaPeloId(@PathVariable Long id) {
		return service.listarDisciplinaId(id);
	}
	
	@PostMapping
	public Disciplina cadastrarDisciplina(@RequestBody Disciplina disciplina) {
		return service.criarDisciplina(disciplina);
	}
	
	@PutMapping("/{id}/professor/{professorId}/add")
	public Disciplina cadastrarProfessorDisciplina(@PathVariable Long id, @PathVariable Long professorId) {
		return service.cadastrarProfessorDisciplina(id, professorId);
	}
	
	@PutMapping("{id}/professor/{professorId}/remove")
	public Disciplina removerProfessorDisciplina(@PathVariable Long id, @PathVariable Long professorId) {
		return service.removerProfessorDisciplina(id, professorId);
	}
	
	@DeleteMapping
	public void deletarDisciplina(@PathVariable Long id) {
		service.deletarDisciplina(id);
	}
}
