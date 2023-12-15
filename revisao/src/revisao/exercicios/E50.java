package revisao.exercicios;

public class E50 {
	/*
	 * Desenvolva um programa que faça o sorteio de 20 números entre 0 e 10 e
	   mostre na tela:
		a) Quais foram os números sorteados
		b) Quantos números estão acima de 5
		c) Quantos números são divisíveis por 3
	 * 
	 * */
	public static void main(String[] args) {
		
		int contador = 0, numerosMaioresQueCinco =0, numerosDivisiveisPorTres =0;
		int[] vetor = new int[20];
		
		while(contador<20) {
			
			vetor[contador] = (int) Math.round(Math.random()*9)+1;
		
			contador++;
		}

		contador = 0;
		
		while(contador < 20) {
			System.out.print(vetor[contador]+" ");
			
			if(vetor[contador] > 5)
				numerosMaioresQueCinco++;
			
			if(vetor[contador] % 3 == 0)
				numerosDivisiveisPorTres++;
			
			contador++;
		}
		
		System.out.println("\nnúmeros maiores do que cinco: "+numerosMaioresQueCinco);
		
		System.out.println("números divísiveis por três: "+numerosDivisiveisPorTres);
	}

}
