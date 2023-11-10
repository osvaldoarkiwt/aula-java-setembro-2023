package algoritmos.vetores;

public class E03_for_melhorado_02 {

	public static void main(String[] args) {
		
		int soma = 0;
		int contador = 0;
		int numeros[]  = new int[100];
		
		for(int numero : numeros) {
			
			numero = contador +1;
			
			numeros[contador] = numero;
			
			if(numero % 2 == 0)
				soma += numero;
			
			contador++;
		}
		
		System.out.println(soma);
		
		System.out.println(numeros[98]);

	}

}
