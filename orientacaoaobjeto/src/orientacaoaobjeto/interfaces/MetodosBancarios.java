package orientacaoaobjeto.interfaces;

public interface MetodosBancarios {
	
	public void depositar(Double valor);
	public void sacar(Double valor);
	public void transferir(ContaCorrente conta, Double valor);
	public void transferir(ContaEspecial conta, Double valor);
}
