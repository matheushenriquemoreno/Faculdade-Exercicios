package secao06;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
     // variaveis
		int num1, num2, num3, num4, q1, q2, q3, q4;
		Scanner teclado = new Scanner(System.in);
		//entradas
		
		System.out.println("informe o numero 1: ");
		num1 = teclado.nextInt();
		
		System.out.println("informe o numero 2: ");
		num2 = teclado.nextInt();
		
		System.out.println("informe o numero 3: ");
		num3 = teclado.nextInt();
		
		System.out.println("informe o numero 4: ");
		num4 = teclado.nextInt();
		
		//processamento
        q1 = num1 * num1;
        q2 = num2 * num2;
        q3 = num3 * num3;
        q4 = num4 * num4;
        
        if(q3 >= 1000) {
        	System.out.println(q3);
        }else {
        	System.out.printf("num1: %d quadrado: %d\n", num1, q1);
        	System.out.printf("num2: %d quadrado: %d\n", num2, q2);
        	System.out.printf("num3: %d quadrado: %d\n", num3, q3);
        	System.out.printf("num4: %d quadrado: %d\n", num4, q4);
        }
       teclado.close();
	}

}
