package hospital;

import java.time.LocalDate;

public class Internacao {
	private Medico medico;
	private Paciente paciente;
	private String observa��es;
	private LocalDate dataInterna�ao;
	private LocalDate dataAlta;
	
	public Internacao(Paciente paciente,Medico medico) {
		this.paciente = paciente;
		this.medico = medico;
		this.dataInterna�ao = LocalDate.now();
	}
	
	public Internacao(Paciente paciente,Medico medico,LocalDate dataInternacao) {
		this.paciente = paciente;
		this.medico = medico;
		this.dataInterna�ao = dataInternacao;
	}
		
	public String getObservacoes() {
		return this.observa��es;
	}
	public LocalDate getDataInterna�ao() {
		return this.dataInterna�ao;
	}
	public LocalDate getDataAlta() {
		return this.dataAlta;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public void setObservacoes(String observa��es) {
		this.observa��es = observa��es;
	}
	public void setDataAlta(LocalDate dataAlta) {
		this.dataAlta = dataAlta;
	}
	@Override
	public String toString() {
		return String.format("Paciente:%s foi atendido pelo medico: %s internado no dia: %s\n",this.paciente,this.medico,this.dataInterna�ao);
		
	}
	}
