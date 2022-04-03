package Exercicios;

import java.util.Random;

public class Exercicio29 {

	public static void main(String[] args) {
		
		int [] vetor = new int [1000];
		
		int limiteInferior, limiteSuperior;
		
		System.out.println("Digite o limite superior: ");
		limiteSuperior = UtilExercicios.entrada.nextInt();
		
		do {
		 System.out.println("Digite o limite inferior: ");
		 limiteInferior = UtilExercicios.entrada.nextInt();
	    }while(limiteInferior > limiteSuperior);
		

		for(int i = 0; i < vetor.length; i ++) {
			
			int numeroAleatorio = sorteia(limiteInferior,limiteSuperior);
			
			if(i == 0) {
				vetor[i] = numeroAleatorio;
				continue;
			}
			
			for(int j = 0; j < vetor.length; j++) {
				while(vetor[j] == numeroAleatorio) {
					numeroAleatorio = sorteia(limiteInferior,limiteSuperior);
					
					j = 0;
				}
			}
			
			vetor[i] = numeroAleatorio;
			
		}
		
		int contadorQuebraLinha = 25;
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + "|");
			if(i == contadorQuebraLinha) {
				System.out.println();
				contadorQuebraLinha += 25;
			}
		}
	}

	public static int sorteia(int limiteInferior, int limiteSuperior) {
		Random random = new Random();
		return random.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
	}
}
