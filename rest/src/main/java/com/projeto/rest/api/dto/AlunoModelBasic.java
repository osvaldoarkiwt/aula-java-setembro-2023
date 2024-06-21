package com.projeto.rest.api.dto;

import com.projeto.rest.domain.model.Endereco;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AlunoModelBasic {

	private Long id;
	private String nome;
	private Endereco endereco;
}
