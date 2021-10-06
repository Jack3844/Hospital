package hospital;
import java.util.ArrayList;
public class listaDeMedicos {
	private ArrayList<Medico>medicos = new ArrayList<Medico>();

	public void cadastrar (Medico medico){
	if (medico != null){
	medicos.add(medico);}
	}
	public void remover (Medico medico){
	medicos.removeIf((elemento)->elemento.getNomeCompleto().equalsIgnoreCase(medico.getNomeCompleto()));
	}
	public Medico buscar(Medico medico){
	for(Medico elemento : medicos){
	if(elemento.getNomeCompleto().equalsIgnoreCase(medico.getNomeCompleto())){
	return elemento;
	}}
	return null;
	}
	public void editar (Medico medico){
	int indice = medicos.indexOf(this.buscar(medico));
	medicos.set(indice,medico);
	}
	public String listar(){
	StringBuilder builder =new StringBuilder();
	for(Medico medico : this.medicos){
	builder.append("Nome:"+medico.getNomeCompleto()+"- Telefone:"+medico.getTelefoneContato()+"\n");
	}
	return builder.toString();
	}

}
