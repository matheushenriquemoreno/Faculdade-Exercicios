package secao07;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int contador_total = 0, contador_sit1 = 0, contador_sit_2 = 0,
				contador_sit_3 = 0, contador_sit_4 = 0, indentificacao, defeito;
		
		System.out.println("informe a indetificação: ");
		
		indentificacao = teclado.nextInt();
		while(indentificacao != 0) {
			System.out.println("1 - necessita de esfera.");
			System.out.println("2 - necessita de limpeza.");
			System.out.println("3 necessita troca de cabo ou conector.");
			System.out.println("4 - quebrado ou inutilizado.");
			System.out.println("informe o defeito: ");
			defeito = teclado.nextInt();
			
			if(defeito == 1) {
				contador_sit1 = contador_sit1 + 1;
			}
			if(defeito == 2) { 
				contador_sit_2 = contador_sit_2 + 1;
			}
			if(defeito == 3) {
				contador_sit_3 = contador_sit_3 + 1;
			}
			if(defeito == 4) {
				contador_sit_4 = contador_sit_4 + 1;
			}
			contador_total = contador_total + 1;
			System.out.println("informe a indetificação: ");
			indentificacao = teclado.nextInt();
		}
		float p1, p2, p3, p4;
		p1 =((float) contador_sit1 /(float)contador_total) * (float)100.00;
		p2 =((float) contador_sit_2 /(float)contador_total) * (float)100.00;
		p3 =((float) contador_sit_3 /(float)contador_total) * (float)100.00;
		p4 =((float) contador_sit_4 /(float)contador_total) * (float)100.00;
		
		System.out.printf("Quantidade de mouses    %d\n", contador_total);
 		System.out.println("Situação \t\t\t\tquantidade \tPercentual ");
 		System.out.printf("1-Necessidade de esfera \t\t\t%d \t\t%.2f\n", contador_sit1, p1 );
 		System.out.printf("2-Necessidade de limpeza \t\t\t%d \t\t%.2f\n", contador_sit_2, p2 );
 		System.out.printf("3-Necessidade do cabo ou conector \t\t%d \t\t%.2f\n", contador_sit_3, p3 );
 		System.out.printf("4-Quebrado ou Inutilizavel \t\t\t%d \t\t%.2f\n", contador_sit_4, p4 );
 		
 		
 		
 		
		
		  
		

	}

}
