package Exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio27 {
 
	public static void main(String[] args) {
	
		int limiteInferior, limiteSuperior;
		
		System.out.println("Digite o limite superior: ");
		limiteSuperior = UtilExercicios.entrada.nextInt();
		
		do {
		 System.out.println("Digite o limite inferior: ");
		 limiteInferior = UtilExercicios.entrada.nextInt();
	    }while(limiteInferior > limiteSuperior);
		
		int[] vetorA = retornaVetor(10,limiteInferior,limiteSuperior);
		int[] vetorB = retornaVetor(10,limiteInferior,limiteSuperior);
		
		System.out.println("Vetor A: ");
		printaVetor(vetorA);
		System.out.println("Vetor B: ");
		printaVetor(vetorB);
		
		System.out.println("Vetor soma: ");
		int [] soma = retornaSomaDoisVetores(vetorA, vetorB);
		printaVetor(soma);
		
		System.out.println("Vetor intersecao: ");
		int [] intersecao = retornaIntersecaoDoisVetores(vetorA, vetorB);
		printaVetor(intersecao,true);
		
		System.out.println("Vetor diferenca: ");
		int [] diferenca = retornaDiferencaDoisVetores(vetorA, vetorB);
		printaVetor(diferenca,true);
		
		System.out.println("Vetor intercalacao: ");
		int [] intercalacao = retornaIntercalacaoDoisVetores(vetorA, vetorB);
		printaVetor(intercalacao);
		
	}
	
	public static int[] retornaSomaDoisVetores(int[] vetor1,int [] vetor2) {
		
		int tamanho = vetor1.length == vetor2.length ? vetor1.length: 0; 
		int[] vetorSoma = new int[tamanho];

		for(int i = 0; i < vetorSoma.length; i++) {
			vetorSoma[i] = vetor1[i] + vetor2[i];
		}
		
		return vetorSoma;
	}
	
	public static int[] retornaIntersecaoDoisVetores(int[] vetor1,int [] vetor2) {
		
		int tamanho = vetor1.length == vetor2.length ? vetor1.length: 0; 
		int[] vetorIntersecao = new int[tamanho];
		
		for(int i = 0; i < vetorIntersecao.length; i++) {			
			for (int j = 0; j < vetorIntersecao.length; j++) {
				if(vetor1[i] == vetor2[j]) {
					vetorIntersecao[i] = vetor1[i];
				}
			}
		}

		return vetorIntersecao;
	}
	
	public static int[] retornaDiferencaDoisVetores(int[] vetor1,int [] vetor2) {
		
		int tamanho = vetor1.length == vetor2.length ? vetor1.length: 0; 
		int[] vetorDiferenca = new int[tamanho];
		
		for(int i = 0; i < vetorDiferenca.length; i++) {			
			boolean ehDiferenca = true;
			for (int j = 0; j < vetorDiferenca.length; j++) {
				if(vetor1[i] == vetor2[j]) {
					ehDiferenca = false;
				}
			}
			if(ehDiferenca) {
				vetorDiferenca[i] = vetor1[i];
			}
		}
		
		return vetorDiferenca;
	}
	
	public static int[] retornaIntercalacaoDoisVetores(int[] vetor1,int [] vetor2) {
		
		int tamanho = vetor1.length == vetor2.length ? vetor1.length: 0; 
		int[] vetorIntercalacao = new int[tamanho * 2];
		
		int contadorA = 0;
		int contadorb = 1;
		
		for(int i = 0; i < vetor1.length; i++) {			
			vetorIntercalacao[contadorA] = vetor1[i];
			vetorIntercalacao[contadorb]= vetor2[i];
			contadorA += 2;
			contadorb += 2;
		}
		
		return vetorIntercalacao;
	}
	
	public static int[] retornaVetor(int tamanho, int limiteInferior, int limiteSuperior) {
		int vetor[] = new int[tamanho];
		
		for(int i = 0; i < tamanho; i++) {
			vetor[i] = sorteia(limiteInferior,limiteSuperior);
		}
		
		return vetor;
	}
	
	public static void printaVetor(int[] vetor) {
		for(int numero : vetor) {
			 System.out.print("| " + numero + " ");
		}
		System.out.println();
	}
	
	public static void printaVetor(int[] vetor,boolean mostraZero) {
		for(int numero : vetor) {
			if(numero != 0 && mostraZero)
			 System.out.print("| " + numero + " ");
		}
		System.out.println();
	}
	
	public static int sorteia(int limiteInferior, int limiteSuperior) {
		Random random = new Random();
		return random.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
	}
}
