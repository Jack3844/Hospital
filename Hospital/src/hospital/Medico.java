package hospital;

public class Medico {

	private int crm;
	private String nomeCompleto;
	private int telefoneContato;
	private Endereco endreco;
	
	public Medico(int crm, String nomeCompleto, int telefoneContato) {
		this.crm = crm;
		this.nomeCompleto = nomeCompleto;
		this.telefoneContato = telefoneContato;
	}
	public int getTelefoneContato() {
		return telefoneContato;
	}
	public void setTelefoneContato(int telefoneContato) {
		this.telefoneContato = telefoneContato;
	}
	public Endereco getEndreco() {
		return endreco;
	}
	public void setEndreco(Endereco endreco) {
		this.endreco = endreco;
	}
	public int getCrm() {
		return crm;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	@Override
	public String toString() {
		return String.format("%s CRM:%d Telefone:%d",this.nomeCompleto,this.crm,this.telefoneContato);
		
	}
	
}
