package programacaoestruturada.recursividade;

public class Fatorial {

	public static void main(String[] args) {
		
		System.out.println(fat(6));

	}

	public static int fat(int numero) {
		if(numero == 1) return 1;
		else
			return numero * fat(numero-1);
	}
	
	public static int soma(int numero) {
		if(numero == 1) return 1;
		else
			return numero * fat(numero-1);
	}
}
