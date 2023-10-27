package programacaoestruturada.repeticao;

public class FacaEnquanto {

	public static void main(String[] args) {
	
		int contador = 1, somatorio = 0;
		
		do {
			
			somatorio+=contador;
			
			contador++;
			
		}while(contador <=100);
		
		System.out.println(somatorio);
	}
}
