package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int a = entrada.nextInt();

		System.out.println("Digite outro numero: ");
		int b = entrada.nextInt();

		if (a % b == 0) {
			System.out.println(a + " e Divisivel por " + b);
		} else {
			System.out.println(a + " não e Divisivel por " + b);
		}

		entrada.close();
	}
}
