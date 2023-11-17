package colecoes.lista;

import java.util.LinkedList;

public class LinkedListClasse {

	public static void main(String[] args) {
		
		LinkedList<Integer> lista = new LinkedList<>();
		
		lista.add(3);
		lista.add(5);
		lista.add(7);
		lista.add(9);
		
		lista.addFirst(2);
		lista.push(10);
		lista.addLast(16);
		
		System.out.println(lista.peek());
		
		System.out.println(lista);
		
		System.out.println(lista.poll());
		
		System.out.println(lista);
		
		System.out.println(lista.pollLast());

		System.out.println(lista);
	}
}
