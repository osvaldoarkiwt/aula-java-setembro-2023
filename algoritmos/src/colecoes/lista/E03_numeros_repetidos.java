package colecoes.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E03_numeros_repetidos {

	//Crie uma lista que receba todos os números da lista abaixo que se repetem
	//numeros = {3,4,5,9,10,3,15,9,11,13,10,3}
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(3,4,5,9,10,3,15,9,11,13,10,3);

		List<Integer> repetidos = new ArrayList<>();
		
		for(int indice = 0; indice < numeros.size()-1; indice++) {
			
			for(int proximo = indice+1; proximo < numeros.size(); proximo++) {
				
				boolean condicao01 = numeros.get(indice) == numeros.get(proximo);
				
				boolean condicao02 = repetidos.contains(numeros.get(indice));
				
				if(condicao01 && !condicao02)
						repetidos.add(numeros.get(indice));
			}
		}
		
		System.out.println(repetidos);
	}
}
