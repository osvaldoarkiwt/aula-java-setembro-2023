package algoritmos.io;

public class A02_E03_maior_de_tres {

	public static void main(String[] args) {
	
		int n01 = 1, n02 = 10, n03 = 100;
		
		int r01 = n01 >= n02 ? n01 : n02;
		
		int r02 = r01 >= n03 ? r01 : n03;
		
		System.out.println(r02);

	}
}
