package revisao.exercicios;

import java.util.Scanner;

public class E10 {

	/*
	 * 10) Faça um algoritmo que leia a largura e altura de uma parede, calcule e
	 *	   mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
     *     sabendo que cada litro de tinta pinta uma área de 2 metros quadrados.
	 * */
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual a altura da parede?");
		
		double altura = scan.nextDouble();
		
		System.out.println("Qual a largura da parede?");
		
		double largura = scan.nextDouble();

		double area = altura * largura;
		
		double quantidadeDeTinta = (double) area / 2;
		
		System.out.printf("A quantidade necessária de tinta para pintar "
				+ "%.2f metros quadrados é %.2f litros",area, quantidadeDeTinta);
	
		scan.close();
	}
}
