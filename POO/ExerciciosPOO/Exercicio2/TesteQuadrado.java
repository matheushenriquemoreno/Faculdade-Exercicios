package Exercicio2;

public class TesteQuadrado {

	public static void main(String[] args) {
		Quadrado q1 = new Quadrado(2);
		Quadrado q2 = new Quadrado(4);
		Quadrado q3 = new Quadrado(5);
		
		System.out.println("�rea Q1 = " + q1.area() + " Per�metro Q1 = " + q1.perimetro());
		System.out.println("�rea Q2 = " + q2.area() + " Per�metro Q2 = " + q2.perimetro());
		System.out.println("�rea Q3 = " + q3.area() + " Per�metro Q3 = " + q3.perimetro());
	}
}
