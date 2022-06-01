package Exercicio4;

import java.util.Random;

public class Pessoa {
	
	private String nome;
	
	private char sexo;
	
	private Data dataNascimento;
	
	private Endereco endereco;
	
	private Dado meuDadoDe6faces;
	
	private Dado meuDadoDe8faces;

	public Pessoa(String nome, char sexo, Data dataNascimento, Endereco endereco) {
		this.nome = nome;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.meuDadoDe6faces = new Dado(6);
		this.meuDadoDe8faces = new Dado(8);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Data getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Data dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Dado getMeuDadoDe6faces() {
		return meuDadoDe6faces;
	}

	public Dado getMeuDadoDe8faces() {
		return meuDadoDe8faces;
	}
	
	public int jogarDadoDe6Faces() {
		
		Random randon = new Random();
		
		return randon.nextInt(6)+1;
	}
	
	public int jogarDadoDe8Faces() {
		
		Random randon = new Random();
		
		return randon.nextInt(8)+1;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + " Sexo: " +  this.sexo + " Data Nascimento " + this.dataNascimento.toString()
		+ " \nEndereco: \n" + this.endereco.toString(); 
	}
}