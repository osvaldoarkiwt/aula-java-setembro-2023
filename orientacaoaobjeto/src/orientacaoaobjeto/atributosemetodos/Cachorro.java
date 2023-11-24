package orientacaoaobjeto.atributosemetodos;

public class Cachorro {

	String nome;
	String cor;
	Integer idade;
	String comportamento;
	String raca;
	String porte;
	
	public Cachorro() {};
	
	public Cachorro(String nome,String cor, int idade, String comportamento, String raca, String porte) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
		this.comportamento = comportamento;
		this.raca = raca;
		this.porte = porte;
	}
	
	public void comer() {
		System.out.println("nhac");
	}
	
	public void dormir() {
		System.out.println("ZzZzZzZz");
	}
	
	public String latir() {
		
		comportamento = "nervoso";
		
		return "au au au";
	}
	
	public void morder() {
		System.out.println("nhoc");
	}
	
	@Override
	//modificador de acesso public
	public String toString() {
		return nome + " " + cor + " " + idade + " " + comportamento + " " + raca + " " + porte;
	}
}
