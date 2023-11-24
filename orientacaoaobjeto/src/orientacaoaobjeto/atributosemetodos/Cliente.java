package orientacaoaobjeto.atributosemetodos;

public class Cliente {
		
	String cpf;
	String nome;
	Integer idade;
	String endereco;
	String telefone;
	String email;
	Cachorro cachorro;
	
	public Cliente() {}
	
	public Cliente(String cpf, String nome,Integer idade, String endereco, String telefone, String email,Cachorro cachorro) {
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.cachorro = cachorro;
	}
	
	@Override
	public String toString() {
		return cpf+" "+nome+" "+idade+" "+endereco+" "+telefone+" "+email+" pet: "+cachorro;
	}
}
