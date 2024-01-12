package algoritmos.listas;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ExplicacaoLista {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1,2,3);
		
		List<Integer> numerosCopia = new LinkedList<>();
		/*
		numeros.add(10);
		numeros.add(3);
		numeros.add(5);
		numeros.add(7);
		*/
		numerosCopia = numeros;
		numerosCopia.sort((a,b)-> b -a);
		
		System.out.println(numeros);
	}

}
