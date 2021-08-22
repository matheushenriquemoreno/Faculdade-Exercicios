package secao03;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		//declarando variaveis
		int quantidade_minima, quantidade_maxima;
		float estoque_medio;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("informe a quantidade minima do seu estoque: ");
		quantidade_minima = teclado.nextInt();
		
      System.out.println("informe a quantidade maxima do seu estoque; ");  // CRTL + BARRA DE ESPAÇO
      quantidade_maxima = teclado.nextInt();
      
      //processamento
      estoque_medio = (quantidade_minima + quantidade_maxima) / 2;
      
      //saida
      System.out.println("o estoque médio é " + estoque_medio);
      
      teclado.close();
    		  
	}

}
