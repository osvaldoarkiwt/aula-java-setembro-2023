package orientacaoaobjeto.interfaces.exercicios;

public class Quadrado implements FiguraGeometrica{

	private int lado;
	
	public Quadrado(int lado) {
		this.lado = lado;
	}
	
	@Override
	public Double calculaArea() {
		
		return Math.pow(lado, 2);
	}

}
