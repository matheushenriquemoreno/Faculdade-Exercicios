package Exercicios;

import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int linha = 1, linhaQuebra = 1, contador = 1; 
		
		System.out.print("digite a quantidade de linha para a piramide de asteriscos: ");
		int quantidadeLinha = entrada.nextInt();
		
		while(linha <= quantidadeLinha) { // comparo a a quantidade de linha executadas com a quantidade maxima.
			System.out.print("*");
			if(linhaQuebra == contador) { // verifico se o contador e do tamanho da linha que vai quebrar
				System.out.println();
				linha ++; // incremento a linha
				linhaQuebra = contador + linha; // a linha que quebra recebe o valor do contador que e a quantidade de vezes que o programa executa + a quantidade de linha que e pra executar.
			}
			
			contador++;
		}
	}
}
