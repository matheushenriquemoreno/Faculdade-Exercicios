package Exercicio5;

public class EstoqueTeste {

	public static void main(String[] args) {
		
		Estoque produto1 = new Estoque("Impressoa Jato de tinta", 13, 6);
		Estoque produto2 = new Estoque("monitor LCD 17 polegadas", 11, 13);
		Estoque produto3 = new Estoque("Impressoa Jato de tinta", 6, 2);
		
		System.out.println("Produto 1\n" + produto1.mostra());
		System.out.println("\nProduto 2\n" + produto1.mostra());
		System.out.println("\nProduto 3\n" + produto1.mostra());
		
		produto1.darBaixa(5);
		produto2.repor(7);
		produto3.darBaixa(4);
		
		System.out.println("\nPrecisa repor produto 1 = " + produto1.precisaRepor());
		System.out.println("Precisa repor produto 1 = " + produto2.precisaRepor());
		System.out.println("Precisa repor produto 1 = " + produto3.precisaRepor());
		
		System.out.println("\nProduto 1\n" + produto1.mostra());
		System.out.println("\nProduto 2\n" + produto2.mostra());
		System.out.println("\nProduto 3\n" + produto3.mostra());
	}
}
