package Exercicio4;

public class Invoice {

	private int numeroItem;
	
	private String descricao;
	
	private int quantidadeItens;
	
	private double precoUnitario;
	
	public Invoice(int numeroItem, String descicao, int quantidadeItens, double precoUnitario) {
		
		this.numeroItem = numeroItem;
		this.descricao = descicao;
		this.quantidadeItens = quantidadeItens <= 0 ? 0 : quantidadeItens;
		this.precoUnitario = precoUnitario <= 0 ? 0.0 : precoUnitario;
	}

	public int getNumeroItem() {
		return numeroItem;
	}

	public void setNumeroItem(int numeroItem) {
		this.numeroItem = numeroItem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descicao) {
		this.descricao = descicao;
	}

	public int getQuantidadeComprada() {
		return quantidadeItens;
	}

	public void setQuantidadeComprada(int quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	
	public double getInvoiceAmount() {
		return this.quantidadeItens * this.precoUnitario;
	}	
	
	@Override
	public String toString() {
		return "Numero Item: " + this.numeroItem + 
				". \nDescrição: " + this.descricao + 
				". \nQuantidade de itens: " + this.quantidadeItens + 
				". \nPreço: " + this.precoUnitario;  
	}
}