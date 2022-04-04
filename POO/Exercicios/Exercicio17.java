package Exercicios;

public class Exercicio17 {

	public static void main(String[] args) {
		int opcao;
		double saldo = 0.0, valor;
		int quantidadeItens;

		do {
			mostraMenu();
			System.out.println("\nInforme a opção desejada (0 - para sair): ");
			opcao = UtilExercicios.entrada.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Escolhido: Cachorro Quente");
				quantidadeItens = retornaQuantidade();
				valor = retornaValor(quantidadeItens,1.5);
				saldo += valor;
				break;
			case 2:
				System.out.println("Escolhido: Hamburguer");
				quantidadeItens = retornaQuantidade();
				valor = retornaValor(quantidadeItens,2.0);
				saldo += valor;
				break;
			case 3:
				System.out.println("Escolhido: Cheeseburguer");
				quantidadeItens = retornaQuantidade();
				valor = retornaValor(quantidadeItens,2.5);
				saldo += valor;
				break;
			case 4:
				System.out.println("Escolhido> Eggcheeseburguer");
				quantidadeItens = retornaQuantidade();
				valor = retornaValor(quantidadeItens,3);
				saldo += valor;
				break;
			case 5:
				System.out.println("Escolhido: Refrigerante");
				quantidadeItens = retornaQuantidade();
				valor = retornaValor(quantidadeItens,1.5);
				saldo += valor;
				break;
			case 0:
				System.out.println("Fim do pedido!");
				break;
			default:
				System.out.println("Opção inválida!");

			}

		} while (opcao != 0);
		
		System.out.println("Valor a ser pago: R$ " + saldo);
		System.out.println("Acerte no Caixa.");
	}
	
	public static double retornaValor(int quantidade, double preco) {
		return preco * quantidade;
	}
	
	public static void mostraMenu() {
		System.out.println("Produto\t\t\t Código \t\tPreço Unitário");
		System.out.println("Cachorro Quente\t\t\t 1 \t\t R$ 1.50");
		System.out.println("Hamburguer\t\t\t 2 \t\t R$ 2.00");
		System.out.println("Cheeseburguer\t\t\t 3 \t\t R$ 2.50");
		System.out.println("Eggcheeseburguer\t\t 4 \t\t R$ 3.00");
		System.out.println("Refrigerante\t\t\t 5 \t\t R$ 1.50");
	}

	public static int retornaQuantidade() {
		System.out.println("Informe a quantidade: ");
		int quantidadeItens = UtilExercicios.entrada.nextInt();

		return quantidadeItens;
	}

}
