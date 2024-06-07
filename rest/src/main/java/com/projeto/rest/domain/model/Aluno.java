package com.projeto.rest.domain.model;

import java.time.OffsetDateTime;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="alunos")
@NoArgsConstructor
@AllArgsConstructor
@Data
//@Getter
//@Setter
//@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Aluno {

	@Id
	//@EqualsAndHashCode.Include
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	
	@Embedded
	private Endereco endereco;
	
	private OffsetDateTime deletedAt;
}
