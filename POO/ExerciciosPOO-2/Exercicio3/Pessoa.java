package Exercicio3;

public class Pessoa {

	private String nome;
	
	private Endereco endereco;
	
	private String numero;

	public Pessoa(String nome, Endereco endereco, String numero) {
		this.nome = nome;
		this.endereco = endereco;
		this.numero = numero;
	}

	public Endereco consultaEndereco() {
		return endereco;
	}

	public String consultaNome() {
		return nome;
	}
	
}
