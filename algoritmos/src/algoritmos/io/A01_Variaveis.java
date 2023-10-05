package algoritmos.io;
/**
 * classe explicativa sobre as variáveis
 * 
 * v: 1.0
 * 
 * @author: Osvaldo Souza
 * 
 * */
public class A01_Variaveis {
	
	public static void main(String[] args) {
		
		//final String PRIMEIRO_NOME = "Osvaldo";
		
		String nome = "Osvaldo";
		int idade = 36;
		float altura = 1.63f;
		double peso = 79.2;
		boolean ehDoadorDeSangue = true;
		char tipoSanguineo = 'A';
		char fatorRh = '+';

		nome = "Souza";
		
		System.out.println("nome: "+nome);
		System.out.println("idade: "+idade);
		System.out.println("altura: "+altura);
		System.out.println("peso: "+peso);
		System.out.println("doador de sangue: "+ehDoadorDeSangue);
		System.out.print("tipo sanguineo: "+tipoSanguineo);
		System.out.println(fatorRh);
		
		System.out.printf("nome: %s\n"
				+ "idade: %d\n"
				+ "altura: %.2f\n"
				+ "peso: %.2f\n"
				+ "doador de sangue: %b\n"
				+ "tipo sanguíneo: %c%c"
				,nome,idade,altura,peso,ehDoadorDeSangue,tipoSanguineo,fatorRh);
	}
}
