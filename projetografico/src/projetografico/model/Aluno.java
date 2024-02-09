package projetografico.model;

public class Aluno {
	
	private String nome;
	private Integer idade;
	private String curso;
	
	public Aluno(String nome, Integer idade, String curso) {
		this.nome = nome;
		this.idade = idade;
		this.curso = curso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", curso=" + curso + "]";
	}
}
