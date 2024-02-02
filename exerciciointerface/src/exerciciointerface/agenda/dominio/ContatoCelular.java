package exerciciointerface.agenda.dominio;

public class ContatoCelular extends ContatoTelefone{

	public ContatoCelular(String nome, String contato) {
		super(nome,contato);
		tipo = "celular"; 
	}	
}
