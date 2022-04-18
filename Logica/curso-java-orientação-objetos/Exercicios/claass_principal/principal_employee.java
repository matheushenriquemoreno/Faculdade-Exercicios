package claass_principal;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class principal_employee {
	
	public static void main(String [] arg) {
		Employee funcionario = new Employee();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Name: ");
		funcionario.name = sc.nextLine();
		System.out.print("Croos salary: ");
		funcionario.croosSalary = sc.nextDouble();
		System.out.print("Tax: ");
		funcionario.tax = sc.nextDouble();
		
	
		System.out.print("\nEployee: "+ funcionario.name +", $ " + String.format("%.2f", funcionario.netSalary()));
		
		System.out.println();
		System.out.print("\nWhich percentage to increase salary? ");
		double porcentagem = sc.nextDouble();
		
		funcionario.increaseSalary(porcentagem);
		
	}
}
