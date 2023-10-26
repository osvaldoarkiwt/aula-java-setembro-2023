package programacaoestruturada.repeticao;

public class E01_enquanto_somatorio {

	public static void main(String[] args) {
		
		int contador = 100, somatorio = 0;
		
		while(contador>0) {
			
			somatorio+= contador; 
			
			contador--;
		}

		System.out.println(somatorio);
	}
}
