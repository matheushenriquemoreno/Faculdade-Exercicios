package Exercicios;

public class Exercicio06 {

	public static void main(String[] args) {


		System.out.println("Digite o codigo do produto: ");
		int codigo = UtilExercicios.entrada.nextInt();

		VerificaEinformaProduto(codigo);
	}

	public static void VerificaEinformaProduto(int codigo) {
		switch (codigo) {
		case 1:
			System.out.println("Alimento não-perecível");
			break;
		case 2, 3, 4:
			System.out.println("Alimento perecível");
			break;
		case 5, 6:
			System.out.println("Vestuário");
			break;
		case 7:
			System.out.println("Higiene pessoal");
			break;
		case 8, 9, 10, 11, 12, 13, 14, 15:
			System.out.println("Limpeza e utensílios domésticos");
			break;
		default:
			System.out.println("Inválido");
			break;
		}
	}
}
