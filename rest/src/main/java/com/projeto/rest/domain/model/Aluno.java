package com.projeto.rest.domain.model;

import java.time.OffsetDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
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
	
	
	//@ManyToMany
	//@JoinTable(name="aluno_disciplina",
	//		   joinColumns = @JoinColumn(name="aluno_id"),
	//		   inverseJoinColumns = @JoinColumn(name="disciplina_id"))
	//@JsonBackReference
	//private List<Disciplina> disciplinas;
	
	//@ManyToOne
	//@JsonBackReference
	//@JoinColumn(name="turma_id")
	//private Turma turma;
	
	private OffsetDateTime deletedAt;
}
