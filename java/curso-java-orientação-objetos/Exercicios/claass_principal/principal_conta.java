package claass_principal;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class principal_conta {

	public static void main(String []args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int conta;
		String nome;
		char validacao;
		double valor, saque, deposito;
		 
		Conta c;
		
		System.out.print("Enter account nuber: ");
		conta = sc.nextInt();
		System.out.print("Enter Account holder: ");
		sc.nextLine();
		nome = sc.nextLine();
		System.out.print("Is there na initial deposit (Y/N)? ");
		validacao = sc.next().charAt(0);
		
		if(validacao == 'y') {
			System.out.print("Enter initial deposit value: ");
			valor = sc.nextDouble();
			c = new Conta(conta, nome, valor);
		}else {
			c = new Conta(conta, nome);
		}
		System.out.println("\nAccount data");
		System.out.println(c);
		
		System.out.print("\nEnter a deposit value: ");
		deposito = sc.nextDouble();
		c.addSaldo(deposito);
		
		System.out.println("Updated account data: ");
		System.out.println(c);
		
		System.out.print("\nEnter a withdraw value: ");
		saque = sc.nextDouble();
		c.saque(saque);
		
		System.out.println("Updated account data: ");
		System.out.println(c);
		
		sc.close();
	}
	
}
