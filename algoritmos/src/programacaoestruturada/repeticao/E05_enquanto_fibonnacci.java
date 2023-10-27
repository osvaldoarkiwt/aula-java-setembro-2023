package programacaoestruturada.repeticao;

import java.util.Scanner;

public class E05_enquanto_fibonnacci {

	public static void main(String[] args) {
	
		int a = 1, b = 0, c = 0, contador = 1, numero = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Quantos números da sequência deseja mostrar?");
		numero = leitor.nextInt();
		
		while(contador<=numero) {
			
			c = a + b;
			a = b;
			b = c;
			
			System.out.println(c);
			
			contador++;
		}

	}
}
