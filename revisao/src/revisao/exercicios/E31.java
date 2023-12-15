package revisao.exercicios;

import java.util.Scanner;

public class E31 {

	public static void main(String[] args) {
	
		String player = defineJogador();
		
		String cpu = defineCPU();
		
		defineVencedor(player,cpu);
		
	}
	
	public static String defineJogador() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Jo... Ken... Pô!");
		String player = leitor.nextLine().toLowerCase();
		leitor.close();
		
		return player;
	} 
	
	public static String defineCPU() {
		int numero = (int) Math.round(Math.random()*2)+1;
		String cpu="";
				
		switch(numero) {
			case 1: cpu = "pedra";	break;
			case 2: cpu = "papel";	break;
			case 3: cpu = "tesoura"; break;
			default: System.out.println("erro"); return "";
		}
		
		return cpu;
	}
	
	public static void defineVencedor(String player, String cpu) {
		boolean vitoria = player.equals("pedra") && cpu.equals("tesoura") ||
				  player.equals("papel") && cpu.equals("pedra") ||
				  player.equals("tesoura") && cpu.equals("papel");

		if(vitoria) {
			System.out.println(player+" x "+cpu);
			System.out.println("O jogador venceu");
		} 
		else if(player.equals(cpu)) {
			System.out.println(player+" x "+cpu);
			System.out.println("empate");
		}
		else {
			System.out.println(player+" x "+cpu);
			System.out.println("a máquina venceu. Exterminador do futuro");
		}
	}
}
