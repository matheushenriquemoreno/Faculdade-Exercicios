package Exercicios;

public class Exercicio16 {

	public static void main(String[] args) {
		
		System.out.println("digite um numero: ");
		int numero = UtilExercicios.entrada.nextInt();
		
		for(int i = 1; i <= numero; i ++) {
			int contador = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					contador++;
				}
			}
			if(contador == 2) { 
				System.out.println(i);
			}
		}
	}
}
