package Exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Um codigo");
		int codigo = entrada.nextInt();

		VerificaEinformaProduto(codigo);

	}

	public static void VerificaEinformaProduto(int codigo) {
		switch (codigo) {
		case 1:
			System.out.println("Alimento n�o-perec�vel");
			break;
		case 2, 3, 4:
			System.out.println("Alimento perec�vel");
			break;
		case 5, 6:
			System.out.println("Vestu�rio");
			break;
		case 7:
			System.out.println("Higiene pessoal");
			break;
		case 8, 9, 10, 11, 12, 13, 14, 15:
			System.out.println("Limpeza e utens�lios dom�sticos");
			break;
		default:
			System.out.println("Inv�lido");
			break;
		}
	}
}
