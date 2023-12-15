package revisao.exercicios;

import java.util.ArrayList;
import java.util.List;

public class E50P02 {

	public static void main(String[] args) {
		
		int  numerosMaioresQueCinco =0, numerosDivisiveisPorTres =0;
		
		List<Integer> lista = new ArrayList<>();
		
		int contador = 1;
		
		while(contador<=20) {
			
			int numero = (int) Math.round(Math.random()*9)+1;
			
			lista.add(numero);
			
			contador++;
		}
/*
		while(contador < 20) {
			System.out.print(lista.get(contador)+" ");
			
			if(lista.get(contador) > 5)
				numerosMaioresQueCinco++;
			
			if(lista.get(contador) % 3 == 0)
				numerosDivisiveisPorTres++;
			
			contador++;
		}
*/		
		for(Integer numero : lista) {
			if(numero > 5)
				numerosMaioresQueCinco++;
			
			if(numero % 3 == 0)
				numerosDivisiveisPorTres++;
			
			System.out.print(numero+" ");
		}
		
		System.out.println("\nnúmeros maiores do que cinco: "+numerosMaioresQueCinco);
		
		System.out.println("números divísiveis por três: "+numerosDivisiveisPorTres);
		
	}

}
