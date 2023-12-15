package revisao.exercicios;

import java.util.Scanner;

public class E80 {

	/*
	 * 80) Faça um algoritmo que preencha um vetor de 30 posições com números entre 1 e
	   15 sorteados pelo computador. Depois disso, peça para o usuário digitar um
	   número (chave) e seu programa deve mostrar em que posições essa chave foi
 	   encontrada. Mostre também quantas vezes a chave foi sorteada.
	 * 
	 * */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int contador = 0,quantidadeDeVezesQueRepetiu =0;
		int[] vetor = new int[30];
		
		while(contador<30) {
			vetor[contador] = (int) Math.round(Math.random()*14)+1;
		
			contador++;
		}

		System.out.println("Escolha um número: ");
		int numero = leitor.nextInt();
		contador = 0;
		
		while(contador<30) {
			
			System.out.print(vetor[contador]+" ");
			
			contador++;
		}
		
		contador = 0;
		
		System.out.println();
		
		while(contador<30) {
			
			if(vetor[contador] == numero) {
				System.out.print("posição: "+contador+" ");
				quantidadeDeVezesQueRepetiu++;
			}
			
			contador++;
		}
	
		System.out.println("o número: "+numero+" repetiu-se "+quantidadeDeVezesQueRepetiu+" vezes");
	}
}
