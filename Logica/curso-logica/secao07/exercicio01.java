package secao07;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
	 //variaveis
		int n, maior = 0;
		Scanner teclado = new Scanner(System.in);
		// entrada
		System.out.println("informe o primeiro numero: ");
		n = teclado.nextInt();
		
		
		
		while(n != 0) {
			if( n > maior) {
			maior = n;	
			}
			System.out.println("informe um numero: ");
			n = teclado.nextInt();
		}
     System.out.println("o maior numero e " + maior);
	}

}
