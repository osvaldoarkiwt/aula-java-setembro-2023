package colecoes.lista;

import java.util.ArrayList;
import java.util.Arrays;

public class Lista {

	public static void main(String[] args) {
		//List [x] / Set / Map
		
		ArrayList<String> alunos = new ArrayList<>();
		/*
		alunos.add("Elenilson");
		alunos.add("Saulo");		
		alunos.add("Iury");
		*/
		alunos.addAll(Arrays.asList("Elenilson","Saulo","Iury"));
		
		alunos.add("Caio");
		alunos.add("Patrícia");
		
		alunos.remove(alunos.size()-1);
		alunos.remove("Caio");
		
		alunos.removeAll(Arrays.asList("Iury","Elenilson"));
		
		alunos.clear();
		
		alunos.add("Wellington");
		//substituí
		alunos.set(0, "Lua");
		//aloca no indice desejado. obs: não pode ser maior que o tamanho da lista.
		alunos.add(0, "Márcia");
		
		System.out.println(alunos.contains("Lua"));
		
		System.out.println(alunos.containsAll(Arrays.asList("Saulo","Elenilson")));
		//retorna o índice de um elemento
		System.out.println(alunos.indexOf("Lua"));
		//retorna o índice da última ocorrência do objeto
		System.out.println(alunos.lastIndexOf("Mácia"));
		
		//System.out.println(alunos.size());
		
		//System.out.println(alunos.isEmpty());
		
		for(int indice = 0; indice < alunos.size(); indice++) {
			//System.out.println(alunos.get(indice));
		}
		
		for(String aluno : alunos) {
			System.out.println(aluno);
		}
	}
}
