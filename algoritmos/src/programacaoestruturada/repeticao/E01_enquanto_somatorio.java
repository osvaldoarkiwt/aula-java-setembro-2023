package programacaoestruturada.repeticao;

public class E01_enquanto_somatorio {

	public static void main(String[] args) {
		
		int contador = 100, somatorio = 0;
		//1 + 1/2 + 1/3 + 1/4 ... 1/100 
		while(contador>0) {
			
			somatorio+= contador; 
			
			contador--;
		}

		System.out.println(somatorio);
	}
}
