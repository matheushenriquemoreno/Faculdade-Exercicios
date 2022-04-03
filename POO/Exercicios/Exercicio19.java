package Exercicios;

public class Exercicio19 {
	
	public static void main(String[] args) {
		
		System.out.print("digite a quantidade de linha para a piramide de asteriscos: ");
		int quantidadeLinha = UtilExercicios.entrada.nextInt();
		
		for (int x = 1; x < quantidadeLinha; x++) {
			for (int y = 0 ; y < x ; y++){
				System.out.print("*");
				}
			System.out.print("\n");
		}
		
		for(int i = quantidadeLinha; i > 0; i--) {
			for(int y = 0; y < i; y++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}	
	}
}
