package secao06;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		//elabore um algoritmo que leia as variaveis 'c' e 'n', respectivamente código e númere de horas trabalhadas de um operario. calcule o salário sabendo-se que
		//ele ganha R$ 10,00 por hora. quando o número de horas exeder a 50 calcule o excesso de pagamento armazenado-o na variavel 'e'. caso contrario zerar tal variavel.
		// a hora excedente de trabalho vale R$ 20,00. no final do processamento imprimir o salario excedente.
		int c;
		float n, e = 0, salario, valor_hora = (float) 10.00;
		Scanner teclado = new Scanner(System.in);
		
		// entradas
		System.out.println("informe o codigo: ");
		c = teclado.nextInt();
		System.out.println("informe a quantidade de horas trabalhadas: ");
		n = teclado.nextFloat();
		
		
		//processamento
		if(n > 50) {
			e = (float) (n - 50) * (float)20.00;
			salario = (50 * valor_hora) + e;
			System.out.printf("Salario total R$ %.2f\n", salario);
			System.out.printf("Salario exedente R$ %.2f\n", e);
			
		}else {
			salario = n * valor_hora;
			System.out.printf("Salario total R$ %.2f\n", salario);
			System.out.printf("Salario exedente R$ %.2f\n", e);
		}
		
		
		teclado.close();		
	}

}
