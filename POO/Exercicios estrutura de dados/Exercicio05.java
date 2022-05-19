package Lista1;

import java.util.ArrayList;

public class Exercicio05 {

	private static final ArrayList<Integer> bilhetesAereos = new ArrayList<Integer>();

	public static void main(String[] args) {

		while (menu()) {
			menu();
		}

	}

	public static boolean menu() {
		System.out.println("digite o que deseja:");
		System.out.println("1 - Reserva bilhete. ");
		System.out.println("2 - Cancelamento De bilhete");
		System.out.println("3 - verificar se o Bilhete ja esta reservado.");
		System.out.println("4 - exibição de bilhetes");
		System.out.println("5 - Sair.");
		System.out.print("opção: ");
		int opcao = UtilExercicios.entrada.nextInt();

		switch (opcao) {
		case 1:
			AdicionaBilhete();
			return true;
		case 2:
			cancelaBilhete();
			return true;
		case 3:
			verificaBilheteReservado();
			return true;
		case 4:
			listaBilhetes();
			return true;
		case 5:
			return false;
		}
		if (opcao > 5 || opcao < 0) {
			System.out.println("opção invalida.");
			return true;
		}

		return false;
	}

	public static void AdicionaBilhete() {

		System.out.println("Digite o numero do bilhete: ");
		int bilhete = UtilExercicios.entrada.nextInt();

		while (verificaSeBilheteExiste(bilhete)) {
			System.out.println("Bilhete ja existe Digite outro");
			bilhete = UtilExercicios.entrada.nextInt();
		}

		bilhetesAereos.add(bilhete);
		System.out.println("Valor inserido com sucesso");
	}

	public static void cancelaBilhete() {
		if (listaBilhetes()) {
			System.out.println("Digite o numero do bilhete que deseja cancelar: ");
			int bilhete = UtilExercicios.entrada.nextInt();

			if (verificaSeBilheteExiste(bilhete)) {
				int indiceExclusao = bilhetesAereos.indexOf(bilhete);

				bilhetesAereos.remove(indiceExclusao);
				System.out.println("Cancelado Com sucesso");
			} else {
				System.out.println("Bilhete não existe!");
			}
		}

	}

	public static boolean listaBilhetes() {
		if (bilhetesAereos.size() > 0) {
			System.out.println("bilhetes ja reservados: ");
			for (int bilhete : bilhetesAereos) {
				System.out.println(bilhete);
			}
			return true;
		} else {
			System.out.println("não há valores ainda adicionados!");
			return false;
		}
	}

	public static void verificaBilheteReservado() {
		System.out.println("Digite o numero do bilhete: ");
		int bilhete = UtilExercicios.entrada.nextInt();

		if (verificaSeBilheteExiste(bilhete)) {
			System.out.println("Bilhete existente!");
		} else {
			System.out.println("bilhete não encontrado!");
		}
	}

	public static boolean verificaSeBilheteExiste(int bilhete) {
		for (int valor : bilhetesAereos) {
			if (valor == bilhete) {
				return true;
			}
		}
		return false;
	}
}
