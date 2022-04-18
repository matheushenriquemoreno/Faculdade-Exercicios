package secao06;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		// elabora um algoritimo que leia um numero.se positivo armazene-o em A se for negativo em B. no final mostrar o resultado. 

		int numero, a, b;
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("informe um numero: ");
		numero = teclado.nextInt();
		
		//processamento
		if(numero > 0) {
			a = numero;
			System.out.println(a);
		}else {
			b = numero;
			System.out.println(b);
		}
	
		teclado.close();
		
	}

}
