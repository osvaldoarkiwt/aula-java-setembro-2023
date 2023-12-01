package orientacaoaobjeto.atributosemetodos;

import java.util.ArrayList;
import java.util.List;

public class Veterinaria {

	public static void main(String[] args) {
					
		Cachorro c01 = new Cachorro("timtim","marrom",4,"dócil","caramelo","grande");
		
		Cachorro c02 = new Cachorro("bela","marrom",5,"dócil","labrador","grande");

		List<Cachorro> pets = new ArrayList<>();
		
		pets.add(c01);
		
		pets.add(c02);
		
		Cliente cl01 = new Cliente("1","Amanda",29,"13 de Maio","85999774455",
														"amanda@email.com",pets);
		
//		Cliente cl01 = new Cliente("1","Amanda",29,"13 de Maio","85999774455",
//											"amanda@email.com",Arrays.asList(c01));
		
		//System.out.println(cl01);
		
		System.out.println(cl01.getPetsZ());
		
		/*
		c01.nome = "timtim";
		c01.cor = "marrom";
		c01.idade = 4;
		c01.porte = "grande";
		c01.comportamento = "dócil";
		c01.raca = "caramelo";
		
		System.out.println(c01.comportamento);
		
		System.out.println(c01.latir());		
		
		System.out.println(c01.comportamento);
		c01.comer();
		c01.dormir();
		*/
	}
}
