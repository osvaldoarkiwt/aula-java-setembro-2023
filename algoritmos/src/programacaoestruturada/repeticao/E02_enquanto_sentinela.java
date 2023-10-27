package programacaoestruturada.repeticao;

import java.util.Scanner;

public class E02_enquanto_sentinela {

	public static void main(String[] args) {
		
		String resposta = "s";
		boolean continua = true;
		int contador = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		while(continua == true) {
			
			System.out.println(contador);
			
			System.out.println("Deseja continuar? (s/n)");
			resposta = leitor.nextLine();
			
			continua = false;
			
			if(!resposta.toLowerCase().equals("n")) continua = true;
			
			contador++;
		}
		leitor.close();
	}

}
