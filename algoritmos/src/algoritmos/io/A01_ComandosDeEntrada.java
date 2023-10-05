package algoritmos.io;

import java.util.Scanner;

public class A01_ComandosDeEntrada {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("digite o seu nome");
		String nome = leitor.nextLine();
		
		System.out.println("digite sua idade");
		int idade = leitor.nextInt();
		
		System.out.println("digite a sua altura");
		float altura = leitor.nextFloat();

		System.out.println("digite seu peso");
		double peso = leitor.nextDouble();
				
		System.out.println("é doador de sangue?");
		boolean ehDoador = leitor.nextBoolean();
		
		System.out.println("digite seu tipo sanguineo");
		char tipoSanguineo = leitor.next().charAt(0);
		
		System.out.println("digite o seu fator RH");
		char fatorRH = leitor.next().charAt(0);

		System.out.println("O nome digitado foi: "+nome);
		System.out.println("idade: "+idade);
		System.out.println("altura: "+altura);
		System.out.println("peso: "+peso);
		System.out.println("é doador de sangue: "+ehDoador);
		System.out.print("tipo sanguíneo: "+tipoSanguineo);
		System.out.println(fatorRH);
		leitor.close();
	}
}
