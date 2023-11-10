package algoritmos.vetores;

public class ExplicacaoVetores {

	public static void main(String[] args) {
	
		int novosClientes[] = new int[100];
		
		System.out.println(novosClientes[10]);
		
		Integer numeros[] = {1,2,3,3,45,4,5,6,7,null,null,null};
		
		numeros[6] = 60;
		
		numeros[11] = 101;
		
		numeros[2] = null;
		
		//System.out.println(numeros[5]+", "+numeros[6]+", "+numeros[7]);
		int somador = 0;
		/*
		for(int contador = 0; contador < numeros.length; contador++) {
			if(numeros[contador] != null) {
				
				somador+= numeros[contador];
			}
			
			System.out.println(numeros[contador]);
		}
		*/
		
		for(Integer numero : numeros) {
			if(numero != null ) 
				somador += numero;
		}
		
		System.out.println(somador);
	}
}
