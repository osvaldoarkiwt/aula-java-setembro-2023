package orientacaoaobjeto.interfaces;

public class ContaEspecial extends ContaCorrente{

	private Double limite;
	
	public ContaEspecial() {}
	
	public ContaEspecial(Double saldo,Double limite) {
		super(saldo);
		this.limite = limite;
	}
	
	@Override
	public void sacar(Double valor){
		if(valor<=(saldo+limite)) {
			saldo-=valor;
		}else {
			System.err.println("saldo indisponível");
		}
	}
	
	@Override
	public void verSaldo() {
		System.out.println("O seu saldo é: R$ "+saldo);
		System.out.println("Você tem R$ "+saldo+" disponível para saque: "+(saldo+limite));
	}
}
