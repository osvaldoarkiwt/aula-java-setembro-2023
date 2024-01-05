package orientacaoaobjeto.heranca;

import orientacaoaobjeto.heranca.enums.Especialidade;

public class Medico extends Pessoa{

	private String crm;
	private Especialidade especialidade;
	
	public Medico(String crm, Especialidade especialidade,String cpf, String nome, String endereco, String telefone) {
		super(cpf,nome,endereco,telefone);
		
		this.crm = crm;
		this.especialidade = especialidade;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getEspecialidade() {
		return especialidade.getDescricao();
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}
	
	@Override
	public String toString() {
		return "Médico [crm=" + crm + 
				", nome="+getNome()+
				", cpf="+getCpf()+
				", endereco="+getEndereco()+
				", telefone="+getTelefone()+
				", especialidade=" + getEspecialidade() + "]";
	}
}
