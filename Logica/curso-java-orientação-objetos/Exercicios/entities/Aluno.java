package entities;

public class Aluno {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public void verificaPassou() {
		double media = nota1 + nota2 + nota3;
		if(media <= 100.00 && media >= 60.00) {
			System.out.print("FINAL GRADE = "+ String.format("%.2f", media));
			System.out.print("\nPASS");
		}else {
			System.out.print("FINAL GRADE = 52.00");
			System.out.print("\nFAILED");
			media = 60 - media;
			System.out.printf("\nMISSING %.2f POINTS", media);
		}	
	}	
}