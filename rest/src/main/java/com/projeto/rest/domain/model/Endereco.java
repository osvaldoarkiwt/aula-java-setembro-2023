package com.projeto.rest.domain.model;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class Endereco {

	private String logradouro;
	private String numero;
	private String cep;
}
