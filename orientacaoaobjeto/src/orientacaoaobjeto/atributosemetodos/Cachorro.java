package orientacaoaobjeto.atributosemetodos;

import java.util.Objects;

public class Cachorro {

	private String nome;
	private String cor;
	private Integer idade;
	private String comportamento;
	private String raca;
	private String porte;
	private Boolean vacinado = false;
	
	public Cachorro() {};
	
	public Cachorro(String nome,String cor, int idade, String comportamento, String raca, String porte) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
		this.comportamento = comportamento;
		this.raca = raca;
		this.porte = porte;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getComportamento() {
		return comportamento;
	}
	
	public void setComportamento(String comportamento) {
		this.comportamento = comportamento;
	}
	
	public String getRaca() {
		return raca;
	}
	
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public String getPorte() {
		return porte;
	}
	
	public void setPorte(String porte) {
		this.porte = porte;
	}
	
	public Boolean isVacinado() {
		return vacinado;
	}
	
	public void setVacinado(boolean vacinado) {
		this.vacinado = vacinado;
	}
	
	public void comer() {
		System.out.println("nhac");
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(nome, raca);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cachorro other = (Cachorro) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(raca, other.raca);
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
