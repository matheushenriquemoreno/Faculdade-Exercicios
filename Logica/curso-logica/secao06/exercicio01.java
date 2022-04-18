package secao06;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
	//ler uma variavel numerica N e imprimi-la somente se a mesma for maior que 100
	//caso contrario imprimi-la com o valor zero.
	
		int n;
		Scanner teclado = new Scanner(System.in);
		//entradas
		System.out.println("informe um numero");
		n = teclado.nextInt();
		
		//processamento
		
		if(n >= 100) {
			System.out.println(n);
		}else {
			n = 0;
			System.out.println(n);
		}
       teclado.close();
	}

}
