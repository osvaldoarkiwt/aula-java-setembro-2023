package orientacaoaobjeto.exerciciorevisao;

public class ContaCorrente {
	
	protected Double saldo;
	
	public ContaCorrente() {}
	
	public ContaCorrente(Double saldo) {
		this.saldo = saldo;
	}

	public void depositar(Double valor) {
		saldo+=valor;
	}
	
	public void sacar(Double valor) {
		if(valor<=saldo) {
			saldo-=valor;
		}else {
			
			System.err.println("Saldo insuficiente");
		}
	}
	
	public void transferir(ContaCorrente conta, Double valor ) {
		
		if(valor>saldo) {
			System.err.println("saldo insuficiente");
		}else {			
			sacar(valor);
			conta.depositar(valor);
		}
		
	}
	
	public void verSaldo() {
		System.out.println("O seu saldo é: R$ "+saldo+" reais");
	}
}
