package colecoes.lista;

import java.util.ArrayList;
import java.util.Arrays;

public class E01_amigos_em_comum {

	//Temos duas listas:	
	//amigosTiago = {"Samantha","Carlos","Luciana","Abreu","Marcelo"}
	//amigosSara = {"Luana","Lívia","Samantha","Henrique","Jéssica","Carlos"}
	//criar uma lista que tenha apenas os amigos em comum entre Sara e Tiago.
	//imprimir as três listas em ordem alfabética.
	public static void main(String[] args) {
	
		ArrayList<String> amigosTiago = new ArrayList<>();
		
		amigosTiago.addAll(Arrays.asList("Samantha","Carlos","Luciana","Abreu","Marcelo"));
	
		ArrayList<String> amigosSara = new ArrayList<>();
		
		amigosSara.addAll(Arrays.asList("Luana","Lívia","Samantha","Henrique","Jéssica","Carlos"));
		
		ArrayList<String> amigosEmComum = new ArrayList<>();
		
		amigosEmComum.addAll(Arrays.asList("Samantha","Carlos","Luciana","Abreu","Marcelo"));
		
		for(String ad : amigosTiago) {
			
			if(!amigosSara.contains(ad)) {
				amigosEmComum.remove(ad);
				//System.out.println(ad);
			}
		}
		
		for(String at : amigosTiago) {
			System.out.print(at+" ");
		}
		
		System.out.println();
		
		for(String as : amigosSara) {
			System.out.print(as+" ");
		}
		
		System.out.println();
		
		for(String ac : amigosEmComum) {
			System.out.print(ac+" ");
		}
		
	}
}
