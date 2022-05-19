package Exercicio4;

import java.util.Scanner;

public class InvoiceTeste {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o numero do produto: ");
		int numeroProduto = entrada.nextInt();
		System.out.println("Digite o nome do produto: ");
		String nomeProduto = entrada.next();
		System.out.println("Digite a quantidade de produtos: ");
		int qtdProdutos = entrada.nextInt();
		System.out.println("Digite o Valor unitario do produto:");
		double preco = entrada.nextDouble();
		
		Invoice produto = new Invoice(numeroProduto, nomeProduto, qtdProdutos, preco);
		
		System.out.println(produto);
		System.out.println("valor total: " + produto.getInvoiceAmount());
	}
}
