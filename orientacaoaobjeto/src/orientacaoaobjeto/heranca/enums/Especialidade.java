package orientacaoaobjeto.heranca.enums;

public enum Especialidade {
	
	NEUROLOGISTA("neurologista"),
	CARDIOLOGISTA("cardiologista"),
	DERMATOLOGISTA("dermatologista"),
	OFTALMOLOGISTA("oftalmologista"),
	CLINICO_GERAL("clínico geral");
	
	private String descricao;
	
	Especialidade(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
