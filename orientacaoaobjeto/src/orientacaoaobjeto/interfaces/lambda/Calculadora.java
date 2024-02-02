package orientacaoaobjeto.interfaces.lambda;

public class Calculadora {

	public static void main(String[] args) {
	
		Operacao soma = (a,b) -> (double) (a + b);
		Operacao subtracao = (a,b) -> (double) (a - b);
		Operacao multiplicacao = (a,b) -> (double) (a * b);
		Operacao divisao = (a,b) -> (double) a / b;
		/*
		System.out.println(soma.calcular(12,15));
		System.out.println(subtracao.calcular(12,15));
		System.out.println(multiplicacao.calcular(12,15));
		System.out.println(divisao.calcular(12,15));
		*/
		System.out.println(efetuar(soma,12,15));
		System.out.println(efetuar(subtracao,12,15));
		System.out.println(efetuar(multiplicacao,12,15));
		System.out.println(efetuar(divisao,12,15));
		System.out.println(efetuar((a,b)-> Math.pow(a, b),2,5));
		
	}
	
	public static Double efetuar(Operacao op,int a, int b) {
		return op.calcular(a, b);
	}
}
