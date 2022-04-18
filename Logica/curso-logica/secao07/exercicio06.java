package secao07;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		int numero;
		Scanner teclado = new Scanner(System.in);
		
		
		
		System.out.println("informe um numero entre 1 e 100: ");
		numero = teclado.nextInt();
		
		while(numero < 1 || numero > 100) {
			System.out.println("informe um numero entre 1 e 100: ");
			numero = teclado.nextInt();
		}
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d X %d = %d\n", numero, i, (numero * i));
			
		}
	}

} 
