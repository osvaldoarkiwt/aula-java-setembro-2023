package com.projeto.rest.api.input;

import com.projeto.rest.domain.model.Endereco;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProfessorInput {

	private String nome;
	private Endereco endereco;
}
