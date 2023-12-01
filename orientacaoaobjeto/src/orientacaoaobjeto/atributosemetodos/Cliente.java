package orientacaoaobjeto.atributosemetodos;

import java.util.List;
import java.util.Objects;

public class Cliente {
		
	String cpf;
	String nome;
	Integer idade;
	String endereco;
	String telefone;
	String email;
	List<Cachorro> pets;
	
	public Cliente() {}
	
	public Cliente(String cpf, String nome,Integer idade, String endereco,
										String telefone, String email,List<Cachorro> pets) {
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.pets = pets;
	}
	
	
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Cachorro> getPets() {
		return pets;
	}

	public void setPets(List<Cachorro> pets) {
		this.pets = pets;
	}
	
	//nome, idade e porte
	public String getPetsZ() {
		
		StringBuilder sb =new StringBuilder("\n");
		
		for(Cachorro cachorro : pets) {
			sb.append(cachorro.getNome()+" "+cachorro.getIdade()+" "+cachorro.getPorte()+"\n");
		}
		
		return sb.toString();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(cpf, other.cpf);
	}
	
	@Override
	public String toString() {
		return cpf+" "+nome+" "+idade+" "+endereco+" "+telefone+" "+email+" pet: "+getPets();
	}
}
