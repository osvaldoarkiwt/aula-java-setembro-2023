package algoritmos.exercicios01;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class E02_Idade {

	public static void main(String[] args) {
	
		int idade = 0,anoNascimento = 0,anoAtual = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o ano do nascimento");
		anoNascimento = leitor.nextInt();
		
		System.out.println("Digite o ano atual");
		anoAtual = leitor.nextInt();
		
		idade = anoAtual - anoNascimento;
		
		System.out.println("A idade em anos é: "+idade);
		
		System.out.println("A idade em meses é: "+(idade*12));
		
		System.out.println("A idade em dias é: "+(idade*365+(idade/4)));
	}
}
