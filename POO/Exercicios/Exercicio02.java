package Exercicios;


public class Exercicio02 {

	public static void main(String[] args) {

		System.out.println("Digite sua idade: ");
		int idade = UtilExercicios.entrada.nextInt();

		if (idade > 65) {
			System.out.println("dispensado");
		} else if (idade <= 65 && idade >= 18) {
			System.out.println("obrigatório");
		} else if (idade == 16 || idade == 17) {
			System.out.println("facultativo");
		} else {
			System.out.println("não vota.");
		}
	}
}
