package programacaoestruturada;

import java.util.Scanner;

public class E01_idades {

	public static void main(String[] args) {
	
		Scanner leitor = new Scanner(System.in);
		
		int idade = leitor.nextInt();
		
		if(idade<=13) {
			System.out.println("criança");
		}	
		else if(idade>13 && idade <=20) {
			System.out.println("adolescente");
		}
		else {
			System.out.println("adulto");
		}
		
		leitor.close();
	}
}
