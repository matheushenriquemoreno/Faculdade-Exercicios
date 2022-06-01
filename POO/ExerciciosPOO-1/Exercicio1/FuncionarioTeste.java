package Exercicio1;

import java.util.Scanner;

public class FuncionarioTeste {

	public static void main(String[] args) {
			
		Scanner entrada = new Scanner(System.in);
		
		Funcionario teste = new Funcionario("teste");
		
		System.out.println("Digite o Valor de Vendas para obter o valor do salario: ");
		double valorVendas = entrada.nextDouble();
		
		System.out.println("valor do salario do funcionario " + teste.getNome() + " = " + teste.calculaSalario(valorVendas));
	}

}
