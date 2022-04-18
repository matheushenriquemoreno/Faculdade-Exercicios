package secao06;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// ler um  e verificar se ele e par ou impar. quando for par armazenar esse valor em p
		// se for impar armazela-lo em I.
		//exibir P e I no final do processamento.
		int numero, p = 0, i = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("informe um numero");
		numero = teclado.nextInt();
		
		//processamento
		if(numero %2 == 0) {
			p = numero;
		}else {
			i = numero;
		}
		System.out.println(p);
		System.out.println(i);
		teclado.close();
	}

}
