package Exercicios;

public class Exercicio15 {

	public static void main(String[] args) {
		
		double saldo = 0.0, valor;
		char opc;

		do {
			System.out.println("Op��es");
			System.out.println("(a) Consulta Saldo");
			System.out.println("(b) Saque");
			System.out.println("(c) Dep�sito");
			System.out.println("(d) Sair");
			System.out.print("Digite a op��o desejada: ");
			opc = UtilExercicios.entrada.next().charAt(0);
			
			switch (opc) {
			case 'a':
			case 'A':
				System.out.println("Saldo: R$ " + saldo);
				break;
			case 'b':
			case 'B':
				System.out.print("Informe o valor de Saque: ");
				valor = verificaValor(UtilExercicios.entrada.nextDouble());
				saldo -= valor;
				System.out.println("Novo Saldo: R$ " + saldo);
				break;
			case 'c':
			case 'C':
				System.out.print("Informe o valor de Dep�sito: ");
				valor = verificaValor(UtilExercicios.entrada.nextDouble());
				saldo += valor;
				System.out.println("Novo Saldo: R$ " + saldo);
				break;
			case 'd':
			case 'D':
				System.out.println("Fim do programa... saindo...");
				break;

			default:
				System.out.println("Op��o inv�lida!");
			}

		} while (opc != 'd' && opc != 'D');

	}
	
	public static double verificaValor(double valor) {
		while (valor < 0) {
			System.out.println("Valor de saque inv�lido, digite apenas valores positivos: ");
			valor = UtilExercicios.entrada.nextDouble();
		}
		return valor;
	}


}
