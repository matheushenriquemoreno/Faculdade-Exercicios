package Exercicios;


public class Exercicio12 {

	public static void main(String[] args) {
		
		String continuar; 
		
		do {
		System.out.println("Digite seu Nome: ");
		String nome = UtilExercicios.entrada.next();
		 
		System.out.println("Digite sua nota Grau A: ");
		double nota1 = UtilExercicios.entrada.nextDouble();
		 while(nota1 > 10 || nota1 < 0) {
			 System.out.println("Erro nota Invalida! Digite novamente a nota.");
				System.out.println("Digite sua nota Grau A: ");
				nota1 = UtilExercicios.entrada.nextDouble();
		 }
		
		System.out.println("Digite sua nota Grau B: ");
		double nota2 = UtilExercicios.entrada.nextDouble();
		 while(nota2 > 10 || nota2 < 0) {
			 System.out.println("Erro nota Invalida! Digite novamente a nota.");
				System.out.println("Digite sua nota Grau B: ");
				nota2 = UtilExercicios.entrada.nextDouble();
		 }
		 
		 double media = (nota1 + nota2) / 2;
		 
		 System.out.println("o aluno " + nome + " tem a media = " + media);
		 
		 System.out.println("Deseja continuar(sim,nao)? ");
		 continuar = UtilExercicios.entrada.next();
	
		} while (continuar == "sim");

	}
	
	
}
