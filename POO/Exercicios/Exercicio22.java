package Exercicios;

public class Exercicio22 {

	public static void main(String[] args) {
		int [] vetor = retornaVetorPopulado(10);
		int contador = 0;
		
		for(int i = 0 ; i < vetor.length; i ++) {
			if(vetor[i] > 25) {
				contador++;
			}
		}
		
		if(contador > 0) {
			System.out.println("Quantidade de numeros superiores a 25: " + contador);
			pritaValoresMaiorQue(25, vetor);
		}
		else {
			System.out.println("nenhum numero maior que 25!!");
		}
	}
	
	public static void pritaValoresMaiorQue(int valor, int [] vetor) {
		for(int i = 0 ; i < vetor.length; i ++) {
			if(vetor[i] > valor) {
				System.out.println("valor: " + vetor[i] + " Posição: " + (i+1));
			}
		}
	}
	
	public static int[] retornaVetorPopulado(int tamanho) {
	
		int [] vetor = new int [tamanho];
		
		for(int i = 0; i < vetor.length; i ++) {
			System.out.println("vetor posicao [" + (i + 1) + "]:");
			vetor[i]= UtilExercicios.entrada.nextInt();
		}
		return vetor;
	}

}
