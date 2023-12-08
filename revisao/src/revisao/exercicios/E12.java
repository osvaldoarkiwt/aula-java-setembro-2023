package revisao.exercicios;

import java.util.Scanner;

public class E12 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto");
		
		double valor = leitor.nextDouble();
		
		double desconto = valor * 0.08;
		
		double valorFinal = valor - desconto;
		
		double valorF = valor - (valor * 0.08);

		System.out.println("O produto vai ser vendido por "+valorFinal+" reais.");
		
	}

}
