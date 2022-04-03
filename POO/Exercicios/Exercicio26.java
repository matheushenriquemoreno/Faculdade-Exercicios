package Exercicios;

public class Exercicio26 {
	
	public static void main(String[] args) {
		
		int [] vetor = new int[10];
		
		for(int i = 0 ; i < vetor.length; i++) {
			System.out.println("popule o vetor na posição: ["+ i + "]");
			int numeroApersistir = UtilExercicios.entrada.nextInt();
			
			if(i == 0) {
				vetor[i] = numeroApersistir;
				continue;
			}

			for(int j = 0 ; j < vetor.length; j++) {
				
				while(vetor[j] == numeroApersistir) {
					System.out.println("Erro valor ja existente no vetor!!");
					System.out.println("digite um novo numero para a posição: ["+ i + "]");
					numeroApersistir = UtilExercicios.entrada.nextInt();
					
					j = 0; // aqui reinicio a verificação. 
				}
			}
			
			vetor[i] = numeroApersistir; // so persisto o dado no vetor apos o while verificar se não tem nenhum numero igual
		}
		
		System.out.println("Vetor digitado: ");
		Exercicio27.printaVetor(vetor); // utilizo uma função ja criada em um exercicio pra obter reaproveitamento de codigo.
	}
}
