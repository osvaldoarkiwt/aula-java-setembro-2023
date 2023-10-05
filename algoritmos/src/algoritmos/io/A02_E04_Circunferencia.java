package algoritmos.io;

public class A02_E04_Circunferencia {

	public static void main(String[] args) {
		//Faça um programa que receba o raio de uma circunferência e calcule
		//seu cumprimento e a área.
		int raio = 2;
		
		double comprimento = 2 * raio * Math.PI;
		
		double area = Math.PI * Math.pow(raio, 2);

		System.out.println(comprimento);
		
		System.out.println(area);	
	}
}
