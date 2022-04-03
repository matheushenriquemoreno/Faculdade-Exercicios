package Exercicios;

public class Exercicio23 {

	public static void main(String[] args) {

		int [] vetor = populaVetor(10);
		int [] vetorDivisiveis = populaVetor(5);
		
		for(int numero : vetor) {
			boolean printNumeroJaRepitiu = false;
			for(int i = 0; i < vetorDivisiveis.length; i++) {
				
				if(numero % vetorDivisiveis[i] == 0) {
					
					if(!printNumeroJaRepitiu){
						System.out.println("Número " + numero + ":");
						printNumeroJaRepitiu = true;
					}
					
					System.out.println("Divisivel por " + vetorDivisiveis[i] + " Na posição " + i);
				}
			}	
		}
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
