package hospital;

public class Paciente {
 private String nomeCompleto;
 private int rg;
 private int cpf;
 private int telefone;
 private Endereco endereco;


public Paciente(String nomeCompleto, int telefone) {
		this.nomeCompleto = nomeCompleto;
		this.telefone = telefone;
}	
public int getTelefone() {
	return telefone;
}
public void setTelefone(int telefone) {
	this.telefone = telefone;
}
public Endereco getEndereco() {
	return endereco;
}
public void setEndereco(Endereco endereco) {
	this.endereco = endereco;
}
public String getNomeCompleto() {
	return nomeCompleto;
}
public int getRg() {
	return rg;
}
public int getCpf() {
	return cpf;
}
@Override
public String toString() {
	return String.format("%s-Telefone:%d",this.nomeCompleto,this.telefone);
	
}
 
}
