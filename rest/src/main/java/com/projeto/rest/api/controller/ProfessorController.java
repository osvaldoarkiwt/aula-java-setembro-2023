package com.projeto.rest.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.rest.domain.model.Professor;
import com.projeto.rest.domain.service.ProfessorService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/professores")
public class ProfessorController {

	private ProfessorService service;
	
	@GetMapping
	public List<Professor> listarTodos() {
		return service.listarProfessores();
	}
}
