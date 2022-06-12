package Exercicio6;

import java.util.ArrayList;

public class Agenda {
	
	private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public void armazenaPessoa(String nome, double altura, int idade) {
		pessoas.add(new Pessoa(nome, altura, idade));
	}
	 	
	public void removePessoa(String nome) {
		int indicePessoaRemover = buscaPessoa(nome);
		
		pessoas.remove(indicePessoaRemover);
	}
	
	public int buscaPessoa(String nome) {
		for(int i = 0; i < pessoas.size(); i++) {
			Pessoa pessoa = pessoas.get(i);
			if(pessoa.getNome().equalsIgnoreCase(nome)) {
				return i;
			}
		}
		return 0;
	}
	
	public void imprimeAgenda() {
		pessoas.forEach(pessoa -> System.out.println(pessoa));
	}

	public void ImprimePessoa(int index) {
		Pessoa pessoa = pessoas.get(index);
		System.out.println(pessoa);
	}
}