package exerciciointerface.agenda.dominio;

public class ContatoResidencial extends ContatoTelefone{

	public ContatoResidencial(String nome, String contato) {
		super(nome,contato);
		tipo = "residencial";
	}
}
