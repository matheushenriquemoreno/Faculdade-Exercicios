package Exercicios;


public class Exercicio07 {

	public static void main(String[] args) {

		System.out.println("Digite o codigo correspondente ao seu cargo: ");
		int codigo = UtilExercicios.entrada.nextInt();

		System.out.println("Digite seu salario: ");
		double salario = UtilExercicios.entrada.nextDouble();

		switch (codigo) {
			case 1:
				System.out.println("Seu cargo e Escriturário, com salario de " + salario + " e tem um aumento de 50%");
				salario += (salario * 0.5);
				System.out.println("salario = " + salario);
				break;
			case 2:
				System.out.println("Seu cargo e secretário, com salario de " + salario + " e tem um aumento de 35%");
				salario *= 0.35;
				System.out.println("salario = " + salario);
				break;
			case 3:
				System.out.println("Seu cargo e caixa, com salario de " + salario + " e tem um aumento de 20%");
				salario *= 0.20;
				System.out.println("salario = " + salario);
				break;
			case 4:
				System.out.println("Seu cargo e Gerente, com salario de " + salario + " e tem um aumento de 10%");
				salario *= 0.10;
				System.out.println("salario = " + salario);
				break;
			case 5:
				System.out.println("Seu cargo e Diretor, com salario de " + salario);
				break;
			default:
				System.out.println("Codigo Invalido.");
				break;
		}
	}
}
