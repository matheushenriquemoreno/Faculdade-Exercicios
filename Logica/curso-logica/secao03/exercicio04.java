package secao03;

import java.util.Scanner;

public class exercicio04 {
	public static void main(String[] args) {
	    // variaveis
		int num1, num2, soma;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("escreva o primeiro numero: ");
		num1 = teclado.nextInt();
		
		System.out.println("escreva o segundo numero:");
		num2 = teclado.nextInt();
		
		// processamento
		soma = (num1 + num2);
		
		//saida
		System.out.println("A soma é " + soma);
		teclado.close();
		
	}

}
