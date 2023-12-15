package revisao.exercicios;

public class E52 {

	/*
	 * 52) Crie um algoritmo que leia a idade de 10 pessoas, mostrando no final:
		a) Qual é a média de idade do grupo
		b) Quantas pessoas tem mais de 18 anos
		c) Quantas pessoas tem menos de 5 anos
		d) Qual foi a maior idade lida 
	 * 
	 * */
	public static void main(String[] args) {
		
		int contador = 0, menoresQueCincoAnos =0, 
				maioresDeDezoito =0, maiorIdade =0;
		double media = 0;
		int[] vetor = new int[10];
		
		while(contador<10) {
			vetor[contador] = (int) Math.round(Math.random()*59)+1;
		
			contador++;
		}
		
		contador = 0;
		
		while(contador < 10) {
			System.out.print(vetor[contador]+" ");
			
			media+= vetor[contador];
			
			if(vetor[contador] > maiorIdade)
				maiorIdade = vetor[contador];
			
			if(vetor[contador] < 5)
				menoresQueCincoAnos++;
			
			if(vetor[contador] > 18)
				maioresDeDezoito++;
			
			contador++;
		}

		System.out.println("menores do que cinco anos: "+menoresQueCincoAnos);
		
		System.out.println("maiores do que dezoito anos: "+maioresDeDezoito);
		
		System.out.println("maior idade: "+maiorIdade);
		
		System.out.println("média: "+(media/(double)vetor.length));
	}
}
