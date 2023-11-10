package algoritmos.vetores;

public class E01_bubble_sort {

	public static void main(String[] args) {
		
		int vetor[] = {52,71,8,15,29,13,60,99};
		
		for(int atual = 0;atual < vetor.length; atual++) {
			
			for(int proximo = atual + 1; proximo < vetor.length; proximo++) {
				
				if(vetor[proximo] < vetor[atual]) {
					
					int temp = vetor[atual];
					
					vetor[atual] = vetor[proximo];
					
					vetor[proximo] = temp;
				}
			}
		}

		/*
		for(int indice = 0; indice < vetor.length; indice++) {
			System.out.print(vetor[indice]+" ");
		}
		*/
		
		for(int numero : vetor) {
			System.out.print(numero+" ");
		}
	}

}
