package revisao.exercicios;

import java.util.Scanner;

public class E06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número!");
		
		int numero = scan.nextInt();
		/*
		System.out.println(--numero);
		
		numero+=2;
		
		System.out.println(numero);
		*/
		
		int antecessor = numero - 1, sucessor = numero + 1;
		
		System.out.printf("O antecessor %d de é igual a %d\n",numero,antecessor);
				
		System.out.printf("O sucessor %d de é igual a %d",numero,sucessor);
		
		scan.close();
		
	}

}
