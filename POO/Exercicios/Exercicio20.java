package Exercicios;

public class Exercicio20 {

	public static void main(String[] args) {
		
		int [] vetor = populaVetor(10);
		
		int menor = vetor[0] , maior = vetor[0], posicaoMaior = 0, posicaoMenor = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			
			if(vetor[i] > maior) {
				maior = vetor[i];
				posicaoMaior = i;
			}
			
			if(vetor[i] < menor) {
				menor = vetor[i];
				posicaoMenor = i;
			}	
		}
		
		System.out.println("o Maior elemento do vetor e " + maior + " na posição " + posicaoMaior);
		System.out.println("o Menor elemento do vetor e " + menor + " na posição " + posicaoMenor);
	}
	
	public static int[] populaVetor(int tamanho) {
		int[] vetor = new int [tamanho];
		
		for(int i = 0 ; i < vetor.length; i++) {
			System.out.println("popule o vetor: ["+ i+ "]");
			vetor[i] = UtilExercicios.entrada.nextInt();
		}
		return vetor;
	}
}
