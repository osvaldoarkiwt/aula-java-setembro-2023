package algoritmos.io;

public class A02_E02_maior_entre_dois_numeros {

	public static void main(String[] args) {
	
		int n01 = 4, n02 = 25, n03 = 3;
		
		int m = ((n01 + n02) + Math.abs(n01 - n02)) / 2;

		int maior = ((m + n03) + Math.abs(m - n03)) /2;
		
		System.out.println(maior);		
	}
}
