package revisao.exercicios;

import java.util.Scanner;

public class E23 {

	public static void main(String[] args) {
	
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o seu nome, mas eu não vou nem usar");
		
		String nome = leitor.nextLine();
		
		System.out.println("Digite o seu sexo");
		
		String sexo = leitor.nextLine();
		
		System.out.println("Digite o valor do produto");

		double valor = leitor.nextDouble();
		
		double desconto = sexo.toLowerCase().equals("f")  ? 0.13 : 0.05;
		
		double valorFinal = valor - valor * desconto;
		
		System.out.println(valorFinal);
	}
}
