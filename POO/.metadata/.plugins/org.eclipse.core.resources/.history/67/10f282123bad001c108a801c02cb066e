package Exercicios;

import java.util.Scanner;

class Exercicio4 {

	public static final double salarioMinimo = 788.00;
	public static final double ValorHoraExtra = 10.00;

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite sua matrícula: ");
		int matricula = entrada.nextInt();

		System.out.println("Digite a quantidade de horas-extras trabalhadas.  ");
		int horasExtras = entrada.nextInt();

		double salarioLiquido = calculaSalario(horasExtras);

		System.out.println("Funcionario com a mátricula " + matricula + " teve " + horasExtras
				+ "horas-extras, seu salario = " + salarioLiquido);

		entrada.close();

	}

	public static Double calculaSalario(int horaExtra) {

		double deducoes = 0;

		double salarioHoraExtra = ValorHoraExtra * horaExtra;

		double salarioBruto = 3 * salarioMinimo + salarioHoraExtra;

		if (salarioBruto > 1500.00)
			deducoes = descontoInss(salarioBruto);

		if (salarioBruto > 2000.00)
			deducoes = salarioBruto = DescontoImpostoDeRenda(salarioBruto);

		return salarioBruto - deducoes;
	}

	public static double DescontoImpostoDeRenda(double salarioBruto) {
		return salarioBruto * 0.12;
	}

	public static double descontoInss(double salarioBruto) {
		return salarioBruto * 0.2;
	}

}
