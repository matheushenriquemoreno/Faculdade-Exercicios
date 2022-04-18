package secao06;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
	  //variaveis
		float p, m;
		String e = "excesso";
		Scanner teclado = new Scanner(System.in);
		
		
		//entradas
		System.out.println("informe o peso dos peixes: ");
		p = teclado.nextFloat();
		
	  // processamento
		if(p > 50)   {
			m = (float)(p - 50) * (float)4.00;
			System.out.printf("Você deverá pagar R$ %.2f em multas", m);		
		}else {
			m = 0;
			e = "0";
			System.out.println("multas: " + m);
			System.out.println("exesso: " + e);
		}
		
		
	}

}
