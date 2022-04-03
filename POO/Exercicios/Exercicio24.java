package Exercicios;

public class Exercicio24 {

	public static void main(String[] args) {
		
		System.out.println("Digite um codigo para imrpimir o vetor: ");
		int codigo = UtilExercicios.entrada.nextInt();
		
		Double [] vetor = retornaVetorPopulado(10);
		
		switch(codigo) {
		case 1:
			UtilExercicios.printaVetor(vetor);
			break;
		case 2:
			printaVetorOnderInversa(vetor);
			break;
		default:
			System.out.println("Obrigado por vir ate a proxima.");
			break;
		}
	}

	public static void printaVetorOnderInversa(Double[] vetor) {
		for(int i = vetor.length - 1; i >= 0 ; i--) {
			System.out.print(vetor[i] + " | ");
		}
	}

	public static Double[] retornaVetorPopulado(int tamanho) {
		Double [] vetor = new Double [tamanho];
		
		for(int i = 0; i < vetor.length; i ++) {
			System.out.println("posicao [" + (i + 1) + "]:");
			vetor[i]= UtilExercicios.entrada.nextDouble();
		}
		return vetor;
	}
}