package Exercicio2;

import java.util.ArrayList;

public class CadastroFilme {
		
	private static ArrayList<Ator> atores;
	private static ArrayList<Ator> atrizes;
	private static ArrayList<Filme> filmes;
	private static ArrayList<Diretor> diretores;
	
	public CadastroFilme() {
		atores = new ArrayList<Ator>();
		atrizes = new ArrayList<Ator>();
		filmes = new ArrayList<Filme>();
		diretores = new ArrayList<Diretor>();
		populandoEntidades();
	}
	
	public void populandoEntidades() {
		
		atores.add(new Ator("Carlos", 35));
		atores.add(new Ator("Rodrigo", 34,2));
		atores.add(new Ator("Fernando", 33));
		atores.add(new Ator("Matheus", 32,1));
		
		atrizes.add( new Ator("Ana", 28, 2));
		atrizes.add( new Ator("Adrielly", 22));
		atrizes.add( new Ator("Fernanda", 39,3));
		atrizes.add( new Ator("Gabriela", 21, 1));
		
		diretores.add(new Diretor("Sergio", false));
		diretores.add(new Diretor("Geovani", true));
		diretores.add(new Diretor("Arnalde", false));
		diretores.add(new Diretor("Fransisco", true));
		
		filmes.add(new Filme("Senhor dos aneis", diretores.get(0), atores.get(0), atrizes.get(0)));
		filmes.add(new Filme("Harry Potter", diretores.get(1), atores.get(1), atrizes.get(1)));
		filmes.add(new Filme("Velozes e furiosos", diretores.get(2), atores.get(2), atrizes.get(2)));
		filmes.add(new Filme("Vingadores", diretores.get(3), atores.get(3), atrizes.get(3)));
		
		diretores.get(0).setFilmePrincipal(filmes.get(0));
		diretores.get(1).setFilmePrincipal(filmes.get(1));
		diretores.get(2).setFilmePrincipal(filmes.get(2));
		diretores.get(3).setFilmePrincipal(filmes.get(3));
		
	}

	public void buscaFilme(String titulo) {
		filmes.stream().filter(filme -> filme.getTitulo().equalsIgnoreCase(titulo)).forEach(filme -> System.out.println(filme));
	}
	
	public boolean insereFilme(Filme filmeInserir) {
		for (Filme filme : filmes) {
			
			if(filme.getTitulo().equalsIgnoreCase(filmeInserir.getTitulo())) {
				return false;
			}
		}
		
		filmes.add(filmeInserir);
		
		return true;
	}
	
	public void buscaDiretoresVencedoresDeoscars(){
		diretores.stream().filter(diretores -> diretores.isGanhadorOscar())
			.forEach(diretor -> mostraDiretor(diretor));
	}
	
	public void mostraDiretor(Diretor diretor) {
		System.out.println(
				diretor + 
				"\nAtor principal: " + diretor.getFilmePrincipal().getAtorPrincipal().getNome() +
				"\nAtriz principal: " + diretor.getFilmePrincipal().getAtrizPrincipal().getNome() +
				"\n"
				);
	}
	
	public void mostraFilmes() {
		filmes.forEach(filme -> System.out.println(filme + "\n"));
	}
	
	// Parte 1 exercicio.
	public void cadastraFilme() {
		Ator carlos = new Ator("Carlos", 35);
		Ator ana = new Ator("ana", 28, 2);
		Diretor sergio = new Diretor("Sergio", false);
		
		Filme filme = new Filme("Senhor dos aneis", sergio, carlos, ana);
		
		mostraDadosFilmeCadastrado(filme);
		
		System.out.println();
	}
	
	public void mostraDadosFilmeCadastrado(Filme filme) {
		System.out.println(filme);
		System.out.println("Descição diretor. \n" + filme.getDiretor());
	}

}
