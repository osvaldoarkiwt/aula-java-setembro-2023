package com.projeto.rest.api.dto;

import java.util.List;

import com.projeto.rest.domain.model.Endereco;

import lombok.Data;

@Data
public class ProfessorModelBasic {

	private Long id;
	
	private String nome;
	
	private Endereco endereco;
	
	private List<DisciplinaModelBasic> disciplinas;
}
