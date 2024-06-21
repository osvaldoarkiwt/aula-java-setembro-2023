package com.projeto.rest.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.rest.api.dto.TurmaModelBasic;
import com.projeto.rest.domain.model.Turma;
import com.projeto.rest.domain.service.TurmaService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/turmas")
public class TurmaController {

	
	private TurmaService servico;
	
	@GetMapping
	public List<Turma> listarTodos(){
		return servico.listarTodos();
	}
	
	@GetMapping("/dto")
	public List<TurmaModelBasic> listarTodosModel(){
		return servico.listarTodos2();
	}
	
	@GetMapping("/{turmaId}")
	public Turma listarTurmaPeloId(@PathVariable Long turmaId) {
		return servico.encontrarTurmaPeloId(turmaId).get();
	}
}
