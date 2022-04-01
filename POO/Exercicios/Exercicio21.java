package Exercicios;

public class Exercicio21 {

	public static void main(String[] args) {
		int [] vetor = retornaVetorPopulado(15);
	
		double [] raizQuadrada =  new double [15];
		
		for(int i = 0; i < raizQuadrada.length; i++) {
			raizQuadrada[i] = Math.sqrt(vetor[i]);
		}
		
		System.out.println("Vetor raiz quadrada baseado no digitado: ");
		printaVetor(raizQuadrada);
	}
	
	public static void printaVetor(double [] vetor) {
		for(double numero : vetor) {
			System.out.print(String.format("%.02f", numero) + " |");
		}
	}
	
	
	public static int[] retornaVetorPopulado(int tamanho) {
	
		int [] vetor = new int [tamanho];
		
		for(int i = 0; i < vetor.length; i ++) {
			System.out.println("vetor posicao [" + (i + 1) + "]:");
			
			if(vetor[i] < 0) {
				vetor[i] = -1;
				continue;
			}
			
			vetor[i]= UtilExercicios.entrada.nextInt();
		}
		return vetor;
	}
}
