package programacaoestruturada.repeticao;

import java.util.Scanner;

public class E04_enquando_primo {

	public static void main(String[] args) {
	
		int contador = 0, divisor = 1, numero = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um número");
		numero = leitor.nextInt();
		
		while(divisor<=numero) {
			
			if(numero % divisor == 0) contador++;
			
			divisor++;			
		}
		
		String resposta = contador <= 2 && contador > 0? "é primo" : "não é primo"; 
		
		System.out.println(resposta+" contador: "+contador);
	}
}
