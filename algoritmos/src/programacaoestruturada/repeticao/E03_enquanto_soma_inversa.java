package programacaoestruturada.repeticao;

public class E03_enquanto_soma_inversa {
	
	public static void main(String[] args) {
		
		int contador = 100; 
		double somatorio = 0;
		//1 + 1/2 + 1/3 + 1/4 ... 1/100 
		while(contador>0) {
			
			somatorio+= 1.0/ contador ; 
			
			contador--;
		}

		System.out.println(somatorio);
	}

}
