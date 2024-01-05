package orientacaoaobjeto.heranca;

public class Paciente extends Pessoa{
	
	private String matricula;
	
	public Paciente(String matricula,String cpf, String nome, String endereco, String telefone){
		super(cpf, nome, endereco, telefone);
		
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Paciente [matricula=" + matricula + 
						 " nome="+getNome()+
						 " cpf="+getCpf()+
						 " endereço="+getEndereco()+
						 " telefone="+getTelefone()+"]";
	}
}
