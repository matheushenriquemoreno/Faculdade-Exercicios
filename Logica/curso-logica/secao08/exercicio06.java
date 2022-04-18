package secao08;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		// variaveis
		float[] vetor = new float[5];
		int codigo;
		Scanner teclado = new Scanner(System.in);
		
        System.out.println("informe o codigo: ");
        codigo = teclado.nextInt();
        
        if(codigo != 0 && codigo <=2) {
        	for (int i = 0; i < 5; i++) {
				System.out.println("informe um numero real: ");
				vetor[i] = teclado.nextFloat();
			}
        	if(codigo == 1) {
        		for (int i = 0; i < 5; i++) {
        			System.out.println(vetor[i]);
				}
        	}
        	if(codigo == 2) {
        		for (int i = (vetor.length); i >=0; i--) {
        			System.out.println(vetor[i]);
					
				}
        	}
        		
        }
	}

}
