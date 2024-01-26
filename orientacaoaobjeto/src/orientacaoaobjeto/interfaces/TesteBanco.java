package orientacaoaobjeto.interfaces;

public class TesteBanco {

	public static void main(String[] args) {
		
		ContaEspecial c1 = new ContaEspecial(150.5,500.0);
		
		ContaCorrente c2 = new ContaCorrente(500.5);
		
		ContaEspecial c = new ContaEspecial(100.0,300.0);
		
		Cliente cliente = new Cliente("José das Tapioca");

		//c1.verSaldo();
		
		cliente.setConta(c);
		
		//cliente.getConta().sacar(200.0);
		
		//cliente.getConta().verSaldo();
		
		//cliente.getConta().sacar(300.0);
		
		//cliente.getConta().verSaldo();
		
		cliente.getConta().transferir(c2, 100.0);
		
		c2.verSaldo();
	}
}
