package exerciciointerface.agenda.dominio;

public class ContatoComercial extends ContatoTelefone{

	public ContatoComercial(String nome, String contato) {
		super(nome,contato);
		
		tipo = "comercial";
	}
}
