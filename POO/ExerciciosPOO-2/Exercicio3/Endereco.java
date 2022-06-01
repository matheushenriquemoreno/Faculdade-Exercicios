package Exercicio3;

public class Endereco {

	private String logradouro;
	
	private String cidade;
	
	private String estado;

	public Endereco(String logradouro, String cidade, String estado) {
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	public String consultaLogradouro() {
		return this.logradouro;
	}
}
