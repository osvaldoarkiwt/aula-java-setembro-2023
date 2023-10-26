package programacaoestruturada.decisao;

import java.util.Scanner;

public class E05_estacionamento {

	public static void main(String[] args) {
 
		Scanner leitor = new Scanner(System.in);

		int horaEntrada = 0, minutoEntrada = 0, horaSaida = 0, minutoSaida = 0, custo = 0;
		
		System.out.println("Digite a hora de entrada");
		horaEntrada = leitor.nextInt();
		
		System.out.println("Digite o minuto de entrada");
		minutoEntrada = leitor.nextInt();
		
		System.out.println("Digite a hora de saída");
		horaSaida = leitor.nextInt();
		
		System.out.println("Digite o minuto de saída");
		minutoSaida = leitor.nextInt();

		int pag = horaSaida - horaEntrada;
		
		if(minutoSaida - minutoEntrada > 0) {
			pag++;	
		}
		
		if(pag == 1) {
			custo = 4;
		}else if(pag == 2){
			custo = 6;
		}else if(pag > 2){
			custo = 6 + 1 * (pag -2); 
		}

		System.out.printf("O custo do estacionamento foi : %d",custo);
	}
}
