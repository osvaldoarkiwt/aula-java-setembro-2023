package algoritmos.vetores;

public class ExplicacaoMatriz {

	public static void main(String[] args) {
		
		int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		int soma = 0;
		
		for(int linha = 0; linha < matrix.length;linha++) {
			
			for(int coluna = 0; coluna < matrix[linha].length;coluna++) {
				System.out.print(matrix[linha][coluna]+" ");
				
				if(linha == coluna) {
					soma += matrix[linha][coluna];
				}
			}			
			System.out.println();
		}
		System.out.println("soma: "+soma);
	}
}
