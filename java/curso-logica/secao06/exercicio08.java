package secao06;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
	//fa�a um algoritimo que leia um numero inteiro e mostre uma mensagem indicando se este numero e par ou impar, e se � positivo ou negativo.	
	//variaveis
		Scanner teclado = new Scanner(System.in);
		int numero;
		
		System.out.println("informe um numero: ");
		numero = teclado.nextInt();
		
		
		if(numero % 2 ==0) {
			if(numero > 0) {
		     System.out.printf("o numero %d � par e positivo. \n", numero);
		}else {
			 System.out.printf("o numero %d � par � negativo. \n", numero);
		}
		}else {
			if(numero > 0) {
				 System.out.printf("o numero %d � impar e positivo. \n", numero);
			}else {
				 System.out.printf("o numero %d � impar � negativo. \n", numero);
			}
		}
       teclado.close();
	}

}
