package orientacaoaobjeto.interfaces.exercicios;

public class TesteGeometria {

	public static void main(String[] args) {

		FiguraGeometrica[] lista = {new Quadrado(7),new Retangulo(4,3),new Circulo(6)};
		
		for(FiguraGeometrica item : lista) {
			System.out.println(item.calculaArea());
		}

	}
}
