package exerciciointerface.agenda.dominio;

import exerciciointerface.dominio.Contato;

public abstract class ContatoTelefone implements Contato{

	private String nome;
	private String contato;
	protected String tipo;
	
	public ContatoTelefone(String nome, String contato) {
		this.nome = nome;
		this.contato = contato;
	}
	
	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public String getContato() {
		return contato;
	}

	@Override
	public String getTipo() {
		return tipo;
	};

}
