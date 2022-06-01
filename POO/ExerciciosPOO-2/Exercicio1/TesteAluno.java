package Exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		
		for(int i = 0; i <= 3; i++) {
			
			System.out.println();
			int matricula = entrada.nextInt();	
			
			System.out.println();
			String nome = entrada.next();
			
			System.out.println();
			double nota1 = entrada.nextDouble();
			
			System.out.println();
			double nota2 = entrada.nextDouble();
			
			alunos.add(new Aluno(matricula, nome, nota1, nota2));
		}
		
		for(Aluno aluno : alunos) {
			
			if(aluno.calculaMediaEntreAsNotas() >= 6.00) {
				System.out.println("o aluno "+ aluno.getNome() + " foi Aprovado com media = " + aluno.calculaMediaEntreAsNotas());
			}else {
				System.out.println("o aluno "+ aluno.getNome() + " foi Aprovado com media = " + aluno.calculaMediaEntreAsNotas());
			}
		}
		
	}

}
