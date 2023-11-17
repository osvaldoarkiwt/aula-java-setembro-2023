package colecoes.lista;

import java.util.ArrayList;
import java.util.Arrays;

public class E02_quadrado_de_um_numero {

	//Crie uma lista que receba o quadrado dos números da lista abaixo
	//numeros = {2,3,6,7,9,11,15,16,20,21}
	//imprima as duas listas
	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.addAll(Arrays.asList(2,3,6,7,9,11,15,16,20,21));
		
		ArrayList<Integer> quadrado = new ArrayList<>();
		
		for(Integer numero : numeros) {
			
			quadrado.add(numero * numero);
		}
/*
		for(int n : numeros) {
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.println("----------------------------------------");
		
		for(int n : quadrado) {
			System.out.print(n+" ");
		}
*/
		
		System.out.println(numeros);
		System.out.println();
		System.out.println(quadrado);
		
	}

}
