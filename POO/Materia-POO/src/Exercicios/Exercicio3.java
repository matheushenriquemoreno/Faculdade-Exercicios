package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o valor da compra: ");
		double valorCompra = entrada.nextDouble();

		while (CalculaVenda(valorCompra) == 0) {
			System.out.println("valor invalido Digite novamente: ");
			valorCompra = entrada.nextDouble();
		}

		System.out.println("Valor Venda = " + CalculaVenda(valorCompra));

		entrada.close();
	}

	public static double CalculaVenda(Double preco) {

		if (preco < 10.00 && preco > 0) {
			return preco * 0.7;
		} else if (preco >= 10 && preco < 30) {
			return preco * 0.5;
		} else if (preco >= 30 && preco < 50) {
			return preco * 0.4;
		} else if (preco >= 50) {
			return preco * 0.3;
		}
		return 0.0;
	}
}