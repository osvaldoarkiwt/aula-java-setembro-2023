package revisao.exercicios;

import java.util.Scanner;

public class E27 {

	/*
	 * Crie um programa que leia duas notas de um aluno e calcule a sua média,
	   mostrando uma mensagem no final, de acordo com a média atingida:
 		- Média até 4.9: REPROVADO
 		- Média entre 5.0 e 6.9: RECUPERAÇÃO
 		- Média 7.0 ou superior: APROVADO
	 * */
	
	public static void main(String[] args) {
		
		double nota01, nota02, media; 
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a 1ª nota");
		
		nota01 = leitor.nextDouble();
		
		System.out.println("Digite a 2ª nota");
		
		nota02 = leitor.nextDouble();
		
		media = (nota01 + nota02) / 2;
		
		boolean mediaValida = media >= 0 && media <=10;
		
		if(mediaValida && media < 5) {
			System.out.println("reprovado");
		} 
		else if(mediaValida && media >= 5 && media < 7) {
			System.out.println("recuperacao");
		}
		else if(mediaValida && media >= 7) {
			System.out.println("aprovado");
		}
		else {
			System.out.println("media inválida");
		}
	}
}
