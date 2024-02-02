package orientacaoaobjeto.interfaces.exercicios;

public class Circulo implements FiguraGeometrica{

	private int raio;
	
	public Circulo(int raio) {
		this.raio = raio;
	}
	
	@Override
	public Double calculaArea() {
		
		return Math.PI * Math.pow(raio, 2);
	}

}
