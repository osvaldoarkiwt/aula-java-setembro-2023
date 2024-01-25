package orientacaoaobjeto.exerciciorevisao;

public class TesteBanco {

	public static void main(String[] args) {
		
		ContaEspecial c = new ContaEspecial(100.0,300.0);
		
		Cliente cliente = new Cliente("José das Tapioca");

		cliente.setConta(c);
		
		cliente.getConta().sacar(200.0);
		
		cliente.getConta().verSaldo();
		
		cliente.getConta().sacar(300.0);
		
		cliente.getConta().verSaldo();
		
	}

}
