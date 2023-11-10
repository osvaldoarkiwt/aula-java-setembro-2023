package programacaoestruturada.repeticao;

public class LacoFor {

	public static void main(String[] args) {
	
		
		double somador=0;
		
		for(int contador = 1; contador<=100;contador++) {
			
			somador += 1.0/contador;
			
			//System.out.println(contador);
		}
		
		System.out.println(somador);
	}
}
