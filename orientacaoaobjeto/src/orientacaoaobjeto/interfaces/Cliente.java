package orientacaoaobjeto.interfaces;

public class Cliente {
	
	private String nome;
	
	private ContaCorrente conta;
	
	private ContaEspecial contaEsp;
	
	public Cliente() {}
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ContaCorrente getConta() {
		return conta;
	}
	
	public void setConta(ContaCorrente conta) {
		this.conta = conta;
	}

	public ContaEspecial getContaEsp() {
		return contaEsp;
	}

	public void setContaEsp(ContaEspecial contaEsp) {
		this.contaEsp = contaEsp;
	}

	public String toString() {
		return "Cliente [nome="+nome+"]";
	}

	
	
}
