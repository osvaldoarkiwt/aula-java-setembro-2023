package orientacaoaobjeto.heranca;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import orientacaoaobjeto.heranca.enums.Especialidade;

public class Consulta {
	
	
	
	private Long id = 0L;
	private Especialidade especialidade;
	private Paciente paciente;
	private Medico medico;
	private LocalDate data;
	private LocalTime hora;
	
	
	public Consulta() {}
	
	public Consulta(Long id,Especialidade especialidade,
									Paciente paciente, Medico medico, 
									LocalDate data,LocalTime hora) {
		this.id = id;
		this.especialidade = especialidade;
		this.paciente = paciente;
		this.medico = medico;
		this.data = data;
		this.hora = hora;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Especialidade getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	
	
	@Override
	public String toString() {
		return "Consulta [id=" + id + ", especialidade=" + especialidade + ", paciente=" + paciente + ", medico="
				+ medico + ", data=" + data + ", hora=" + hora + "]";
	}
}
