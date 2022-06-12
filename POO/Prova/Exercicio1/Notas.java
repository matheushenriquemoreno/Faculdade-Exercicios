package Exercicio1;

public class Notas {
	private double nota1;
	private double nota2;
	private double nota3;
	
	public Notas() {}
	
	public Notas(double nota1, double nota2, double nota3) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
	public double getMedia() {
		return (nota1 + nota2 + nota3) / 3;
	}

	@Override
	public String toString() {
		return "Notas nota 1 = " + nota1 + ", nota 2 = " + nota2 + ", nota 3 = " + nota3;
	}
}