package Exercicio2;

public class Filme {
	
	private String titulo;
	private Diretor diretor;
	private Ator atorPrincipal;
	private Ator atrizPrincipal;
	
	public Filme(String titulo, Diretor diretor, Ator atorPrincipal, Ator atrizPrincipal) {
		this.titulo = titulo;
		this.diretor = diretor;
		this.atorPrincipal = atorPrincipal;
		this.atrizPrincipal = atrizPrincipal;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Diretor getDiretor() {
		return diretor;
	}
	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}
	public Ator getAtorPrincipal() {
		return atorPrincipal;
	}
	public void setAtorPrincipal(Ator atorPrincipal) {
		this.atorPrincipal = atorPrincipal;
	}
	public Ator getAtrizPrincipal() {
		return atrizPrincipal;
	}
	public void setAtrizPrincipal(Ator atrizPrincipal) {
		this.atrizPrincipal = atrizPrincipal;
	}
	
	@Override
	public String toString() {
		return "Titulo: " + this.titulo +
			   "\nNome do Diretor: "  + this.diretor.getNome() +
			   "\nNome do Ator principal: " + this.atorPrincipal.getNome() +
			   "\nNome da Atriz principal: " + this.atrizPrincipal.getNome();
	}
}