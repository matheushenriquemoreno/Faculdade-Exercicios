package Exercicio3;

import Utils.UtilExercicio;
import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = entrada.next();
		
		System.out.println("digite sua matrícula: ");
		String matricula =  entrada.next();
		
		System.out.println("Digite sua primeira nota: ");
		double nota1 = UtilExercicio.verificaNota(entrada.nextDouble());
		System.out.println("Digite sua segunda nota: ");
		double nota2 = UtilExercicio.verificaNota(entrada.nextDouble());
		System.out.println("Digite sua nota do trabalho: ");
		double notaTrabalho = UtilExercicio.verificaNota(entrada.nextDouble());
		
		Aluno aluno = new Aluno(matricula,nome, nota1, nota2, notaTrabalho);
		
		System.out.println(aluno);
		
		System.out.println("Media = " + String.format("%.2f", aluno.media()) + " final = " + aluno.finall());	
	}
}
