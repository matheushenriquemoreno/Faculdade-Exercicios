package Exercicio5;

public class Estoque {
	
	private String nome;
	private int qtdAtual;
	private int qtdMinima;
	
	public Estoque() {}
	
	public Estoque(String nome, int qtdAtual, int qtdMinima) {
		this.nome = nome;
		this.qtdAtual = qtdAtual;
		this.qtdMinima = qtdMinima;
	}

	public void mudarNome(String nome) {
		this.nome = nome;
	}

	public void repor(int qtd) {
		this.qtdAtual += qtd;
	}

	public void mudarQtdMinima(int qtdMinima) {
		if(validaQuantidade(this.qtdMinima, qtdMinima)) {
			this.qtdMinima = qtdMinima;
		}
		else {
			System.out.println("Erro valor não valido para quantidade minima");
		}
	}

	public void darBaixa(int qtd) {
		if(validaQuantidade(this.qtdAtual, qtd)) {
			this.qtdAtual -= qtd;	
		}
		else {
			System.out.println("Erro! quantidade atual menor que o valor retirado");
		}
	}
	
	public boolean precisaRepor() {
		return this.qtdAtual <= this.qtdMinima;
	}	
	
	public String mostra() {
		return "Nome produto: " + this.nome + " \nQuantidade mínima: " + this.qtdMinima +" \nQuantidade atual: " + this.qtdAtual;
	}
	
	private boolean validaQuantidade(int quantidade, int valorARetirar) {
		if(quantidade - valorARetirar <= 0){
			return false;
		}
		return true;
	}
	
}
