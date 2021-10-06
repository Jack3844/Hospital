package hospital;

import java.time.LocalDate;

public class Internacao {
	private Medico medico;
	private Paciente paciente;
	private String observações;
	private LocalDate dataInternaçao;
	private LocalDate dataAlta;
	
	public Internacao(Paciente paciente,Medico medico) {
		this.paciente = paciente;
		this.medico = medico;
		this.dataInternaçao = LocalDate.now();
	}
	
	public Internacao(Paciente paciente,Medico medico,LocalDate dataInternacao) {
		this.paciente = paciente;
		this.medico = medico;
		this.dataInternaçao = dataInternacao;
	}
		
	public String getObservacoes() {
		return this.observações;
	}
	public LocalDate getDataInternaçao() {
		return this.dataInternaçao;
	}
	public LocalDate getDataAlta() {
		return this.dataAlta;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public void setObservacoes(String observações) {
		this.observações = observações;
	}
	public void setDataAlta(LocalDate dataAlta) {
		this.dataAlta = dataAlta;
	}
	@Override
	public String toString() {
		return String.format("Paciente:%s foi atendido pelo medico: %s internado no dia: %s\n",this.paciente,this.medico,this.dataInternaçao);
		
	}
	}
