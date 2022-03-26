package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();

		if (idade > 65) {
			System.out.println("dispensado");
		} else if (idade <= 65 && idade >= 18) {
			System.out.println("obrigatório");
		} else if (idade == 16 || idade == 17) {
			System.out.println("facultativo");
		} else {
			System.out.println("não vota.");
		}

		entrada.close();
	}
}
