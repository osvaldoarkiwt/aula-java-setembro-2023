package exerciciointerface.aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exerciciointerface.agenda.dominio.ContatoCelular;
import exerciciointerface.agenda.dominio.ContatoComercial;
import exerciciointerface.agenda.dominio.ContatoResidencial;
import exerciciointerface.agenda.dominio.ContatoTelefone;

public final class AplAgenda {
	private static final Scanner scanner = new Scanner(System.in);
	/** Onde são mantidos os contatos. */
	private static List<ContatoTelefone> contatos = new ArrayList();

	/** Adiciona um contato. */
	private static void adicionarContato(ContatoTelefone contato) {
		contatos.add(contato);
	}
	
	/** Obtém um contato, dado o índice. */
	private static ContatoTelefone obterContato(int indice) {
		if (indice < contatos.size())
			return (ContatoTelefone) contatos.get(indice);
		else
			return null;
	}

	/** Imprime todos os contatos e seus índices. */
	private static void imprimirContatos() {
		if (contatos.size() == 0)
			System.out.println("\tAgenda vazia.");
		else
			for (int i = 0; i < contatos.size(); i++) {
				ContatoTelefone contato = (ContatoTelefone) contatos.get(i);
				System.out.println("\t" + i + ": " + contato.getNome() + " (" + contato.getTipo() + ")");
			}
		System.out.println();
	}

	/** Lê do teclado. */
	private static String lerTeclado() {
		return scanner.nextLine();
	}

	/** Método main. */
	public static void main(String[] args) {
		System.out.println("Bem-vindo à Agenda.\n");
		System.out.println("Digite o comando. '?' para ajuda e 'S' para sair.");
		System.out.print("\n> ");
// Lê o comando.
		String comando = lerTeclado();
// Continua pedindo comandos até encontrar o comando S, de sair.
		while (!"S".equalsIgnoreCase(comando)) {
// Comando ?: ajuda.
			if ("?".equals(comando)) {
				System.out.println("\nCOMANDOS DISPONÍVEIS:\n" + " ?: Mostra esta lista de comandos;\n\n"
						+ " A: Mostra a agenda;\n" + " C: Mostra um contato da agenda;\n" + " S: Sai do programa;\n\n"
						+ "+T: Adiciona um telefone;\n");
			}
// Comando A: mostrar agenda.
			else if ("A".equalsIgnoreCase(comando)) {
				System.out.println("\nAGENDA:");
				imprimirContatos();
			}
// Comando C: mostrar contato.
			else if ("C".equalsIgnoreCase(comando)) {
				executarMostrarContato();
			}
// Comando +T: adicionar telefone.
			else if ("+T".equalsIgnoreCase(comando)) {
				executarAdicionarTelefone();
			}
// Lê o próximo comando.
			System.out.print("\n> ");
			comando = lerTeclado();
		}
	}

	/** Comando C: mostrar contato. */
	public static void executarMostrarContato() {
// Lê o índice.
		System.out.print("\nNúmero: ");

		String indice = lerTeclado();
//Verifica se é um número.
		if (indice.matches("[0-9]+")) {
//Converte para inteiro.
			int i = Integer.parseInt(indice);
//Verifica se o índice existe.
			if (i < contatos.size()) {
//Imprime o contato.
				ContatoTelefone contato = (ContatoTelefone) contatos.get(i);
				System.out.println(
						"\nNome: " + contato.getNome() + "\n" + contato.getTipo() + ": " + contato.getContato());
			}
//Não existe.
			else
				System.out.println("Agenda não contém item de número " + i);
		}
//Não é número.
		else
			System.out.println("Não é um número.");
	}

	/** Comando +T: adicionar telefone. */
	public static void executarAdicionarTelefone() {
	
		System.out.println("Digite o nome do contato");
		String nome = scanner.nextLine();
		System.out.println("Digite o telefone do contato");
		String telefone = scanner.nextLine();
		System.out.println("Digite o tipo do telefone.\n"
						 + "1-residencial\n"
						 + "2-comercial\n"
						 + "3-celular.");
		String op = scanner.nextLine();
		
		ContatoTelefone ct = null;
		
		switch(op) {
			case "1": ct = new ContatoResidencial(nome,telefone); break;
			case "2": ct = new ContatoComercial(nome,telefone); break;
			case "3": ct = new ContatoCelular(nome,telefone);break;
			default: System.out.println("opção invalida");
		}
		
		if(ct != null)
			adicionarContato(ct);
		else
			System.out.println("Erro ao Cadastrar o Contato");
	
	}
}
