package Exercicios;

public class Exercicio05 {

	public static void main(String[] args) {
		
		System.out.println("Digite seu numero de identificação: ");
		int codigo = UtilExercicios.entrada.nextInt();
		
		System.out.println("Digite sua primeira nota: ");
		double nota1 = UtilExercicios.verificaNota(UtilExercicios.entrada.nextDouble());
		
		System.out.println("Digite sua segunda nota: ");
		double nota2 = UtilExercicios.verificaNota(UtilExercicios.entrada.nextDouble());
		
		System.out.println("Digite sua terceira nota: ");
		double nota3 = UtilExercicios.verificaNota(UtilExercicios.entrada.nextDouble());
		
		System.out.println("Digite a media dos exercicios ");
		double mediaExercicio = UtilExercicios.verificaNota(UtilExercicios.entrada.nextDouble());
		
		double media = (nota1 + nota2 * 2 + nota2 * 3 + mediaExercicio) / 7.0;
		
		String conceitoAluno = retornaConceito(media);
		
		System.out.println("Número: " + codigo 
						+ " \nNota 1: " + nota1  
						+ " \nNota 2: " + nota2 
						+ " \nNota 3: " + nota3 
						+ " \nMedia exercicio:  " + mediaExercicio 
						+ " \nMédia de aproveitamento = " + String.format("%.02f", media));
		
		
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
}
