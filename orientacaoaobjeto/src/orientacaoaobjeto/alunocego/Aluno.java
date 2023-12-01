package orientacaoaobjeto.alunocego;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Aluno {
	
	private String matricula;
	private String nome;
	private LocalDate dataNascimento;
	private LocalDateTime dataMatricula;
	private String curso;
	
	public Aluno(String matricula, String nome, LocalDate dataNascimento, String curso) {
		
		this.matricula = matricula;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.dataMatricula = LocalDateTime.now();
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/uuuu");
		
		return dataNascimento.format(dtf);
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Integer getIdade() {
		
		//LocalDate hoje = LocalDate.now();
		
		//int idade = (int) dataNascimento.until(hoje,ChronoUnit.YEARS);
		
		// return idade;
		
		return (int) dataNascimento.until(LocalDate.now(),ChronoUnit.YEARS);
	}
	
	public String getDataMatricula() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/uuuu hh:mm:ss");
		
		return dataMatricula.format(dtf);
	}

	public String getDataVencimentoMatricula() {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/uuuu");	
		
		return dataMatricula.plusDays(7).format(dtf);
	}
	
	public void setDataMatricula(LocalDateTime dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(matricula, other.matricula);
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", dataNascimento=" + getDataNascimento()
				+ ", dataMatricula=" + getDataMatricula() + ", curso=" + curso + "]";
	}
}
