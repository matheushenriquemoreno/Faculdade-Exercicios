package Exercicio3;

public class Produto {

	private int codigo;
	
	private String nome;

	public Produto(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public String consultaNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Codigo: " + this.codigo + ". Nome: " + this.nome;
	}
	
}
