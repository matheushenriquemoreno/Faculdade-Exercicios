package Exercicio2;

public class Retangulo implements FiguraGeometrica {

	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double getArea() {
		return base * altura;
	}

	public double getPerimetro() {
		return (2 * base) + (2 * altura);
	}

	public void exibirDados() {
		System.out.println("Retangulo: valor da Base: " + base + " Altura: " + altura);
		System.out.println("Valor da Area calculada: " + String.format("%.2f",getArea()));
		System.out.println("Valor do Perimetro calculado: " + String.format("%.2f",getPerimetro()));
	}
}