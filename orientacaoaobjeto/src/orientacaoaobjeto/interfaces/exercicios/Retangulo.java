package orientacaoaobjeto.interfaces.exercicios;

public class Retangulo implements FiguraGeometrica{

	private int base;
	private int altura;
	
	public Retangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public Double calculaArea() {
		
		return (double) base * altura;
	}
}
