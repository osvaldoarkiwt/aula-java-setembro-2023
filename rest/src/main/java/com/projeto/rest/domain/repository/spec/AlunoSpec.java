package com.projeto.rest.domain.repository.spec;

import java.util.ArrayList;

import org.springframework.data.jpa.domain.Specification;

import com.projeto.rest.domain.model.Aluno;
import com.projeto.rest.domain.model.filter.AlunoFilter;

import jakarta.persistence.criteria.Predicate;

public class AlunoSpec {

	private AlunoSpec(){}
	
	public static Specification<Aluno> usandoFiltro(AlunoFilter filtro){
		
		return (root,query,builder) ->{
			var predicates = new ArrayList<Predicate>();

	         if(filtro.getId() != null) {
	             predicates.add(builder.equal(root.get("id"), filtro.getId()));
	         }
			
	         if(filtro.getNome() != null) {
	             predicates.add(builder.like(builder.lower(root.get("nome")), "%" + filtro.getNome().toLowerCase() + "%"));
	         }
	         
	         if(filtro.getEndereco() != null) {
	             predicates.add(builder.like(builder.lower(root.get("endereco")), "%" + filtro.getEndereco().toLowerCase() + "%"));
	         }
	         	         
			return builder.and(predicates.toArray(new jakarta.persistence.criteria.Predicate[0]));
		};
	}
}
