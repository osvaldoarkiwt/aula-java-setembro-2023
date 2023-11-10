package algoritmos.listas;

import java.util.Arrays;
import java.util.List;

public class ExplicacaoLista {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(52,71,8,15,29,13,60,99);

		numeros.sort((a,b)-> b - a);
		
		for(int numero : numeros) {
			System.out.print(numero+" ");
		}
		
	}

}
