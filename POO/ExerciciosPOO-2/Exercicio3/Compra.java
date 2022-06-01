package Exercicio3;

public class Compra {
	
	private Pessoa pessoa;
	
	private Produto produto;

	public Compra () {}
	
	public void comprar(Pessoa pessoa, Produto produto) {
		this.pessoa = pessoa;
		this.produto = produto;
	}
	
	public String verificaCompra() {
		return "Usuario : " + pessoa.consultaNome() + " Comprou o produto " + produto.consultaNome();
	}
}