package secao03;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// tendo como dados de entrada a altura de uma pessoa, construa um algoritimo que calcule seu peso
		// ideal usando a seguinte formula: (72,7 * altura) - 58
		float altura, peso_ideal;
		Scanner teclado = new Scanner(System.in);
		// pontos flutuantes = float - double
		
		System.out.println("qual a sua altura? ");
		altura = teclado.nextFloat();
		
		peso_ideal = (float)(altura * 72.7) - 58;  //cast
		System.out.printf("seu peso ideal seria de %.2f", peso_ideal);
		
		teclado.close();		
	}

}
