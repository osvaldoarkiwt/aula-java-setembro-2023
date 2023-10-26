package programacaoestruturada.decisao;

import java.util.Scanner;

public class E02_media {
	/*
	 * receba duas notas e calcule a média
	 * 
	 * se a média for maior ou igual a 7 >>> passou
	 * 
	 * se a média for maior ou igual a 3 e menor do que 7 >>> recuperação
	 * 
	 * se a média for menor do que 3 >>> reprovado
	 * 
	 * */
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double nota01 = 0, nota02 = 0, media = 0, notaRecuperacao = 0; 
		
		System.out.println("digite a primeira nota");
		nota01 = leitor.nextDouble();
		
		System.out.println("digite a segunda nota");		
		nota02 = leitor.nextDouble();
		
		boolean notaValida = nota01 >= 0 && nota01 <= 10 && nota02 >= 0 && nota02 <= 10;

		media = (nota01 + nota02) / 2;
		
		if(media >= 7 && notaValida) {
			System.out.println("passou");
			
		}else if(media >= 3 && media < 7 && notaValida) {
			System.out.println("em recuperação");
			
			String resposta = "";
			
			System.out.println("digite a nota da recuperação");
			
			notaRecuperacao = leitor.nextDouble();
									
			if(notaRecuperacao < 0 && notaRecuperacao > 10 ) { 
				resposta = "nota inválida";
			}else {
				resposta = notaRecuperacao >= 6 ? "Aprovado" : "Reprovado";
			}
			
			System.out.println(resposta);
			
		}else if(media < 3 && notaValida) {
			System.out.println("reprovado");
		
		}else {
			System.out.println("notas inválidas");
		}
	
		leitor.close();
	}

}
