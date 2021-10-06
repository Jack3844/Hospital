package hospital;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		listaDePacientes pacientes = new listaDePacientes();
		listaDeMedicos medicos = new listaDeMedicos();
		listaDeInternacao internacao = new listaDeInternacao();
		
		Paciente julia = new Paciente ("julia",456489);
		Paciente maria = new Paciente ("maria",489158);
		Medico joao = new Medico (123,"joao mario",68456);
		Medico matheus = new Medico(321,"matheus vigario",44321);
		Internacao internacao1 = new Internacao(julia,joao,LocalDate.now());
		Internacao internacao2 = new Internacao(maria,matheus,LocalDate.now());
		
		pacientes.cadastrar(julia);
		pacientes.cadastrar(maria);
		medicos.cadastrar(joao);
		medicos.cadastrar(matheus);
		internacao.cadastrar(internacao1);
		internacao.cadastrar(internacao2);
		
		System.out.println(pacientes.listar());
		System.out.println(medicos.listar());
		System.out.println(internacao.listar());
	
	}

}
