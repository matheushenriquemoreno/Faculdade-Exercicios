package Exercicios;

import java.util.Scanner;

public class UtilExercicios {
	
	public static Scanner entrada = new Scanner(System.in);
	
	public static <T> void printaVetor (T vetor []) {
		for(T item : vetor) {
			System.out.print(item + " |");
		}
		System.out.println();
	}
	
	public static double verificaNota(double nota){
		while(nota < 0 || nota > 10) {
			System.out.println("Erro nota Invalida! Digite novamente: ");
			nota = entrada.nextDouble();
		}
		return nota;
	}
}
