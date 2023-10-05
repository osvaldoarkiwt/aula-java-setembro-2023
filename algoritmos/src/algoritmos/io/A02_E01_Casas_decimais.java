package algoritmos.io;

/*
 * receba um número com três casas decimais e separe cada uma delas.
 * 
 * 
 * */
public class A02_E01_Casas_decimais {

	public static void main(String[] args) {
	
		int numero = 349;
		
		int unidade = numero % 10;
		
		int dezena = numero % 100/ 10;
		
		int centena = numero/100;
		
		System.out.println("centena: "+centena);
		System.out.println("dezena: "+dezena);
		System.out.println("unidade: "+unidade);
		
	}
}
