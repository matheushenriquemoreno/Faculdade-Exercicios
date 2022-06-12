package Exercicio2;

public class Quadrado implements FiguraGeometrica {
	
	public double lado;

	public Quadrado(double lado) {
		this.lado = lado;
	}

	public double getArea() {
		return lado * lado;
	}

	public double getPerimetro() {
		return lado * 4;
	}

	public void exibirDados() {
		System.out.println("Valor do lado do Quadrado: " + lado);
		System.out.println("Valor da Area calculada: " + String.format("%.2f", getArea()));
		System.out.println("Valor do Perimetro calculado: " + String.format("%.2f", getPerimetro()));
	}
}