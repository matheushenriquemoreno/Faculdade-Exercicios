package Exercicio3;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Teste {

	private static ArrayList<Produto> produtos = new ArrayList<Produto>();
	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		criaProdutos();
		
		Pessoa pessoa = criaPessoa();
				
		compraProduto(pessoa);
	}
	
	public static void compraProduto(Pessoa pessoa) {
		
		try {
		Compra compra = new Compra();
		
		mostraProdutos();
		
		System.out.println("Digite o Nome do produto selecionado:  ");
		String nomeProduto = entrada.nextLine();
		
		Produto produtoSelecionado = BuscaProdutoPeloNome(nomeProduto);
		
		compra.comprar(pessoa, produtoSelecionado);
		
		System.out.println(compra.verificaCompra());
		
		}catch (NoSuchElementException ex) {
			System.out.println("Nome do produto digitado errado!!!!");
			compraProduto(pessoa);
		}	
	}

	public static void mostraProdutos() {
		System.out.println("\nProdutos em estoque.");
		for(Produto produto : produtos) {
			System.out.println(produto);
			System.out.println("--------------------------------------------");
		}
	}
	
	public static Produto BuscaProdutoPeloNome(String nome) {
		return produtos.stream().filter(p -> p.consultaNome().equalsIgnoreCase(nome)).findFirst().get();
	}
	
	public static void criaProdutos() {
		produtos.add(new Produto(1112, "Bicicleta"));
		produtos.add(new Produto(1113, "Carrinho controle remoto"));
		produtos.add(new Produto(1114, "Jogo da velha"));
	}
	
	public static Pessoa criaPessoa() {
		
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("Digite seu numero para contato: ");
		String numero = entrada.nextLine();
		
		System.out.println("Cadastro de Endereço. ");
		System.out.println("Digite o longradouro ");
		String longradouro = entrada.nextLine();
		System.out.println("Digite a sua cidade: ");
		String cidade = entrada.nextLine();
		System.out.println("Digite seu estado: ");
		String estado = entrada.nextLine();
		
		return new Pessoa(nome, new Endereco(longradouro, cidade, estado), numero);
	}
}