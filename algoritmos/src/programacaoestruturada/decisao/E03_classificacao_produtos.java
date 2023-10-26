package programacaoestruturada.decisao;

public class E03_classificacao_produtos {
	
	public static void main(String[] args) {
		
		int opcao = 4;
		
		switch(opcao) {
		
			case 1: System.out.println("Alimento não perecível"); break;
			
			case 2,3,4: System.out.println("Alimento perecível"); break;
			
			case 5,6: System.out.println("Vestuário"); break;
			
			case 7,8,9,10,11,12: System.out.println("Limpeza"); break;
		
			default: System.out.println("opção inválida");
		}
		
		System.out.println("continua...");
	}
}
