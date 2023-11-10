package algoritmos.vetores;

public class E02_for_melhorado_01 {

	public static void main(String[] args) {
		
		int soma = 0;
		int numeros[]  = {1,2,3,4,5,6,7,8,9,10};

		
		for(int numero : numeros) {
			if(numero % 2 == 0)
				soma += numero;
		}
		
		System.out.println(soma);
		

	}

}
