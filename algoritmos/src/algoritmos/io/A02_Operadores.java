package algoritmos.io;

/**
 * classe explicativa sobre os operadores
 * 
 * v: 1.0
 * 
 * @author: Osvaldo Souza
 * 
 * */
public class A02_Operadores {

	public static void main(String[] args) {
		
		//operadores aritméticos. (+ - * / %)
		/*
		int soma = 10 + 9;
		int subtracao = 100 - 81;
		int multiplicacao = 3 * 5;
		int divisao = 30/2;
		
		double media = (10 + 9 + 8) / 3.0;
		
		System.out.println(media);
		*/
		
		//operadores relacionais > >= < <= == !=
		//System.out.println((10 > 8) == (8 < 32));
		//System.out.println(30 < 100);
		//System.out.println(10 != 10);
		
		//operadores lógico & && | || 
		//System.out.println(false & false);
		//System.out.println(true | false);
		
		//operador ternário (teste lógico) ? (resposta verdadeira) : (resposta falso)
		int idade = 18;
		boolean passouNaProva = true, testeLogico = idade >= 18 && passouNaProva;
		
		String resposta = testeLogico ? "Pode dirigir" : "Não pode dirigir";
		
		System.out.println(resposta);
		
	}
}
