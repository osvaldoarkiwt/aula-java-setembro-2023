package programacaoestruturada.repeticao;

import java.util.Scanner;

public class E06_fatorial_for {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um número");
		
		int dado = leitor.nextInt();
		
		int resultado = 1;
		
		for(int numero = dado; numero > 0; numero--) {
			resultado *= numero;
		}
		
		System.out.println(resultado);
		
		leitor.close();
	}

}
