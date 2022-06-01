package Exercicio2;

public class Ator {
		
	private String nome;
	private int idade;
	private int numeroOscars;
	
	public Ator(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public Ator(String nome, int idade, int numeroOscars) {
		this(nome, idade);
		this.numeroOscars = numeroOscars;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getNumeroOscars() {
		return numeroOscars;
	}
	public void setNumeroOscars(int numeroOscars) {
		this.numeroOscars = numeroOscars;
	}	
}