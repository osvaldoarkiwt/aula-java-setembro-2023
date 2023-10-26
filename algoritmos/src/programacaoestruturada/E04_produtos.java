package programacaoestruturada;

public class E04_produtos {

public static void main(String[] args) {
		
		double precoProduto = 100,taxa=0, precoParcela = 0;
		int opcao = 1, numeroParcelas = 1;
		
		switch(opcao) {
		
			case 1: taxa = -8; break;
			
			case 2: taxa = -4; break;
			
			case 3: numeroParcelas = 2; break;
			
			case 4: numeroParcelas = 4; taxa = 8; break;
		
			default: System.out.println("opção inválida");
		}
		double precoFinal = precoProduto+=(precoProduto*taxa/100);
		
		precoParcela = precoFinal/numeroParcelas;
		
		System.out.println(precoProduto);
		System.out.println(numeroParcelas);
		System.out.println(precoParcela);
		System.out.println(precoFinal);
	}
	
}
