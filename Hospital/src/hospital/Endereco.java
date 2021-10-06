  package hospital;

public class Endereco {
	private String rua;
	private String numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	
	public Endereco(String rua, String numero, String bairro, String cidade, String estado, String cep) {
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}
	public String getRua() {
		return this.rua;
	} 
	public String getNumero() {
		return this.numero;
	}
	public String getBairro() {
		return this.bairro;
	}
	public String getCidade() {
		return this.cidade;
	}
	public String getEstado() {
		return this.estado;
	}
	public String getCep() {
		return this.cep;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
		
}


