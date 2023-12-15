package revisao.exercicios;

import java.util.Scanner;

public class E32 {

	public static void main(String[] args) {
		
		int numeroAleatorio = numeroAleatorio();
		
		int numeroDoJogador =  numeroEscolhido();
		
		/*
		if(numeroDoJogador == numeroAleatorio) {
			System.out.println("Você venceu");
		}else {
			System.out.println("Você perdeu");
		}
		*/
		
		String resposta = numeroDoJogador == numeroAleatorio ? 
												"você venceu: "+numeroAleatorio 
												: "você perdeu: "
														+ ""+numeroAleatorio; 
		
		System.out.println(resposta);
		
	}

	public static int numeroEscolhido() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Escolha um número entre 1 e 5");
		int numero = leitor.nextInt();
		leitor.close();
		return numero;
	}
	
	public static int numeroAleatorio() {
		
		int numeroAleatorio = (int) Math.round(Math.random()*4+1);
		
		return numeroAleatorio;
	}
	
}
