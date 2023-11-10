package programacaoestruturada.repeticao;

public class E07_soma_pares {

	public static void main(String[] args) {
		
		int soma = 0;
		
		for(int contador = 0; contador <= 100; contador +=2) {
				soma+= contador;
		}
		
		System.out.println(soma);
	}
}
