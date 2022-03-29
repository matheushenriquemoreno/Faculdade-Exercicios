package Exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu numero de identifica��o: ");
		int codigo = entrada.nextInt();
		
		System.out.println("Digite sua nota: ");
		double nota1 = vefificaNotaValida(entrada.nextDouble());
		
		System.out.println("Digite sua nota: ");
		double nota2 = vefificaNotaValida(entrada.nextDouble());
		
		System.out.println("Digite sua nota: ");
		double nota3 = vefificaNotaValida(entrada.nextDouble());
		
		System.out.println("Digite a media dos exercicios ");
		double mediaExercicio = vefificaNotaValida(entrada.nextDouble());
		
		double media = (nota1 + nota2 * 2 + nota2 * 3 + mediaExercicio) / 7.0;
		
		String conceitoAluno = retornaConceito(media);
		
		System.out.println("N�mero: " + codigo 
						+ " \nNota 1: " + nota1  
						+ " \nNota 2: " + nota2 
						+ " \nNota 3: " + nota3 
						+ " \nMedia exercicio:  " + mediaExercicio 
						+ " \nM�dia de aproveitamento = " + String.format("%.02f", media));
		
		
			if(conceitoAluno == "A" || conceitoAluno == "B" || conceitoAluno == "C") {
				System.out.print("Conceito " + conceitoAluno + " APROVADO");
			}
			else {
				System.out.print("Reprovado");
			}
		
	}
	
	public static String retornaConceito(double media) {
		
		if(media >= 9.0 && media <= 10.0) {
			return "A";
		}
		else if(media >= 7.5 && media < 9) {
			return "B";
		}
		else if(media >= 6.0 && media < 7.5) {
			return "C";
		}
		else if(media >= 4.0 && media < 6.0) {
			return "D";	
		}
		return "E";
	}
	
	public static double vefificaNotaValida(double nota) {
		
		Scanner entrada = new Scanner(System.in);
		
		while(nota < 0 || nota > 10) {
			System.out.print("nota invalida Digite novamente: ");
			nota =  entrada.nextDouble();
		}
		
		return nota;
	}
}