package programacaoestruturada.recursividade;

public class Soma {

	public static void main(String[] args) {
		
		System.out.println(soma(6));

	}

	public static int soma(int numero) {
		if(numero == 1) return 1;
		else
			return numero + soma(numero-1);
	}
}
