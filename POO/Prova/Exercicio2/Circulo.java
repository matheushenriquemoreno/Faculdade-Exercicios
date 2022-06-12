package Exercicio2;

public class Circulo implements FiguraGeometrica {

	
	public double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	public double getArea() {
		return (Math.PI * Math.pow(raio, 2));
	}
	
	public double getPerimetro() {
		return (2 * Math.PI * raio);
	}

	public void exibirDados() {
		System.out.println("Valor do Raio do circulo: " + raio);
		System.out.println("Valor da Area calculada: " + String.format("%.2f",getArea()));
		System.out.println("Valor do Perimetro calculado: " + String.format("%.2f",getPerimetro()));
	}	
}