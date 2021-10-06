package hospital;
import java.util.ArrayList;
public class listaDeInternacao {
	private ArrayList<Internacao>internacao = new ArrayList<Internacao>();
	private boolean removeIf;
	
	public void cadastrar(Internacao intenacao) {
		if(internacao !=null) {
			internacao.add(intenacao);
		}
	}
	public void remover (Internacao intenacao) {
		internacao.removeIf((elemento)->elemento.getObservacoes() == (intenacao.getObservacoes()));
	}
	public Internacao buscar (Internacao intenacao) {
		for (Internacao elemento:this.internacao) { 
				if(elemento.getObservacoes()== intenacao.getObservacoes()) {
					return elemento;
			}
		}
		return null;
	}
	public void editar(Internacao intenacao) {
		int indice = internacao.indexOf(this.buscar(intenacao));{
			internacao.set(indice, intenacao);
		}
	}
		public String listar() {
			StringBuilder builder = new StringBuilder();
			for(Internacao intenacao:this.internacao) {
				builder.append(intenacao.toString());
			}
			return builder.toString();
		}
}
