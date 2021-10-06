package hospital;
import java.util.ArrayList;

public class listaDePacientes {
	private ArrayList<Paciente>pacientes = new ArrayList<Paciente>();

	public void cadastrar (Paciente paciente){
	if (paciente != null){
	pacientes.add(paciente);}
	}
	public void remover (Paciente paciente){
	pacientes.removeIf((elemento)->elemento.getNomeCompleto().equalsIgnoreCase(paciente.getNomeCompleto()));
	}
	public Paciente buscar(Paciente paciente){
	for(Paciente elemento : this.pacientes){
	if(elemento.getNomeCompleto().equalsIgnoreCase(paciente.getNomeCompleto())){
	return elemento;
	}}
	return null;
	}
	public void editar (Paciente paciente){
	int indice = pacientes.indexOf(this.buscar(paciente));
	pacientes.set(indice,paciente);
	}
	public String listar(){
	StringBuilder builder = 
			new StringBuilder();
	for(Paciente paciente : this.pacientes){
	builder.append("Nome:"+paciente.getNomeCompleto()+"- Telefone:"+paciente.getTelefone()+"\n");
	}
	return builder.toString();
	}

}
