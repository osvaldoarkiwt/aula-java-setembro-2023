package algoritmos.exercicios01;

import java.util.Scanner;

public class E01_CalculaSalario {

	public static void main(String[] args) {
		
		double salarioInicial,salarioFinal,porcentagem;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o salário inicial do funcionário");
		salarioInicial = leitor.nextDouble();
		
		System.out.println("Digite a porcentagem do aumento do salário do funcionário");
		porcentagem = leitor.nextDouble();
		
		salarioFinal = salarioInicial + (salarioInicial*porcentagem/100);

		System.out.println(salarioFinal);
		
		leitor.close();
	}
}
