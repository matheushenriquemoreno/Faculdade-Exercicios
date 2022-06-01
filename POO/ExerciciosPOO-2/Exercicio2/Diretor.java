package Exercicio2;

public class Diretor {
	
	private String nome;
	private boolean ganhadorOscar;
	private Filme filmePrincipal;

	public Diretor(String nome, boolean ganhadorOscar) {
		this.nome = nome;
		this.ganhadorOscar = ganhadorOscar;	
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isGanhadorOscar() {
		return ganhadorOscar;
	}
	public void setGanhadorOscar(boolean ganhadorOscar) {
		this.ganhadorOscar = ganhadorOscar;
	}
	public Filme getFilmePrincipal() {
		return filmePrincipal;
	}
	public void setFilmePrincipal(Filme filmePrincipal) {
		this.filmePrincipal = filmePrincipal;
	}
	
	@Override
	public String toString() {
			return "Nome Diretor: " + this.nome +
			      "\nFilme Principal: " + this.filmePrincipal.getTitulo();
	}
}