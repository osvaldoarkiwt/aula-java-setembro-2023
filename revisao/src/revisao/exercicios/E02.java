package revisao.exercicios;

import java.util.Scanner;

public class E02 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Qual é o seu nome?");
		
		String nome = leitor.nextLine();
		
		System.out.printf("Olá %s, é um prazer te conhecer\n",nome);
		
		leitor.close();

	}

}
