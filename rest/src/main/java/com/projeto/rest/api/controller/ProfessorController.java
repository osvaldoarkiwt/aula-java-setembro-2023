package com.projeto.rest.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.rest.api.dto.ProfessorModelBasic;
import com.projeto.rest.api.input.ProfessorInput;
import com.projeto.rest.domain.service.ProfessorService;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/professores")
public class ProfessorController {

	private ProfessorService service;
	
	@GetMapping
	@Transactional
	public List<ProfessorModelBasic> listarTodos() {
		return service.listarProfessores();
	}
	
	@PostMapping
	public ProfessorModelBasic cadastrarProfessor(@RequestBody ProfessorInput input) {
		
		return service.salvarProfessor(input);
	}
}
