package Exercicio2;

public class TesteQuadrado {

	public static void main(String[] args) {
		Quadrado q1 = new Quadrado(2);
		Quadrado q2 = new Quadrado(4);
		Quadrado q3 = new Quadrado(5);
		
		System.out.println("Área Q1 = " + q1.area() + " Perímetro Q1 = " + q1.perimetro());
		System.out.println("Área Q2 = " + q2.area() + " Perímetro Q2 = " + q2.perimetro());
		System.out.println("Área Q3 = " + q3.area() + " Perímetro Q3 = " + q3.perimetro());
	}
}
