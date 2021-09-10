package claass_principal;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class principal_aluno {

	public static void main(String[] args) {
		Aluno al = new Aluno();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		al.name =  sc.nextLine();
		al.nota1 = sc.nextDouble();
		al.nota2 = sc.nextDouble();
		al.nota3 = sc.nextDouble();
		
		al.verificaPassou();

	}

}
