package Exercicios;

public class Exercicio01 {

	public static void main(String[] args) {

		System.out.println("Digite um numero: ");
		int a = UtilExercicios.entrada.nextInt();

		System.out.println("Digite outro numero: ");
		int b = UtilExercicios.entrada.nextInt();

		if (a % b == 0) {
			System.out.println(a + " e Divisivel por " + b);
		} else {
			System.out.println(a + " não e Divisivel por " + b);
		}
		
	}
}
