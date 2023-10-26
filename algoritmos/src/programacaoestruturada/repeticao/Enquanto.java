package programacaoestruturada.repeticao;

public class Enquanto {

	public static void main(String[] args) {
	
		int numero = 7, fat = 1;
		
		while(numero>0) {
			fat *= numero;
			
			numero--;
		}
		
		System.out.println(fat);
	}
}
