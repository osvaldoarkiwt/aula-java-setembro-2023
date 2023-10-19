package programacaoestruturada;

public class E02_media {
	/*
	 * receba duas notas e calcule a média
	 * 
	 * se a média for maior ou igual a 7 >>> passou
	 * 
	 * se a média for maior ou igual a 3 e menor do que 7 >>> recuperação
	 * 
	 * se a média for menor do que 3 >>> reprovado
	 * 
	 * */
	public static void main(String[] args) {
		
		double nota01 = 10, nota02 = 4, media = 0; 
		
		boolean notaValida = nota01 >= 0 && nota01 <= 10 && nota02 >= 0 && nota02 <= 10;
		
		media = (nota01 + nota02) / 2;
		
		if(media >= 7 && notaValida) {
			System.out.println("passou");
			
		}else if(media >= 3 && media < 7 && notaValida) {
			System.out.println("em recuperação");
			
		}else if(media < 3 && notaValida) {
			System.out.println("reprovado");
		
		}else {
			System.out.println("notas inválidas");
		}
		
	}

}
