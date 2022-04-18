package secao06;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
	  //tendo como dados de entrada a altura e sexo de uma pessoa, construa um algoritimo que calcule seu peso ideal,
	  //utilizando as seguintes formulas: para homens: (72.7 * altura) - 58
	  //para mulheres: (62.1 * altura) - 44.7
       // variaveis
		float altura, peso_ideal;
		char sexo;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.println("informe sua altura: ");
		altura = teclado.nextFloat();
		
		System.out.println("informe seu sexo m/f: ");
		sexo = teclado.next().charAt(0);// em java qual coisa com aspas duplas (") e uma string ja em aspas simples (') e um caracter 
		
		//processamento
		if(sexo == 'm') {
			peso_ideal = (float)(72.7 * altura) - 58;
			System.out.printf("seu peso ideal é %.2f" ,peso_ideal);
		}else if(sexo == 'f') {
			peso_ideal = (float)(62.1 * altura) - (float)44.7;
			System.out.printf("seu peso ideal é %.2f" ,peso_ideal);
		}else if(sexo != 'm' && sexo != 'f') {
			System.out.println("sexo não reconhecido.");
			peso_ideal = 0;
		}
		teclado.close();
		
	}

}
