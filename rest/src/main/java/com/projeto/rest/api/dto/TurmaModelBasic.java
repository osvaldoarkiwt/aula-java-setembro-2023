package com.projeto.rest.api.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TurmaModelBasic {

	private Long id;
	private String nome;
	List<AlunoModelBasic> alunos;
}
