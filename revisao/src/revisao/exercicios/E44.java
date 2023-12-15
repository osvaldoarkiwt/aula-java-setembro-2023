package revisao.exercicios;

import java.util.Scanner;

public class E44 {

	public static void main(String[] args) {
	
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número");
		int primeiro = leitor.nextInt();
		
		System.out.println("Digite o segundo número");
		int segundo = leitor.nextInt();

		System.out.println("Digite o incremento");
		int incremento = leitor.nextInt();
		
		
		
		System.out.print("Contagem: ");
		
		if(segundo > primeiro) {
			
			while(primeiro < segundo) {
				
				System.out.print(primeiro+" ");
				
				primeiro+=incremento;
			}
		}else {
			primeiro--;
			
			while(primeiro >= segundo) {
				
				System.out.print(primeiro+" ");
				
				primeiro-=incremento;
			}
		}
		
		
		
		System.out.println(" Acabou!");
	}
}
