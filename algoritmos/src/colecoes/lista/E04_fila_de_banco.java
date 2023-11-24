package colecoes.lista;

import java.util.LinkedList;

public class E04_fila_de_banco {
	// CN = cliente normal, CP = cliente preferencial
	//Faça um algoritmo que simule a fila de um banco.
	// lista = {CN1, CN2, CN3, CN4}
	// atende C1, chega 2 CP, atende 1 CP e 1 CN e 1 CP.
	public static void main(String[] args) {
	
		LinkedList<String> fila = new LinkedList<>();
		
		fila.add("CN1");
		fila.add("CN2");
		fila.add("CN3");
		fila.add("CN4");
		
		mostrarFila(fila);
		
		String mensagem = "Atendendo: ";
		
		System.out.println(mensagem+fila.poll());
		
		mostrarFila(fila);
		
		fila.add(0,"CP1");
		fila.add(1,"CP2");
		
		mostrarFila(fila);
		
		System.out.println(mensagem+fila.poll());
		
		mostrarFila(fila);
		
		System.out.println(mensagem+fila.remove(1));
		
		mostrarFila(fila);
	}
	
	public static void mostrarFila(LinkedList<String> fila) {
		for(String cliente : fila) {
			System.out.print(cliente+" ");
		}
		System.out.println();
	}
}
