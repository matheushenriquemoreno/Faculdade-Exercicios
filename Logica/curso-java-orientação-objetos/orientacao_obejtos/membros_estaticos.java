package orientacao_obejtos;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculator;

public class membros_estaticos {

	//public static final double PI = 3.14159; // a palavra final serve para falar que o valor atribuido não pode ser mudado mais
	
	public static void main(String []arg) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	
		System.out.print("Enter radius: ");
		Double radius = sc.nextDouble();
		
		double c = Calculator.circuFerence(radius);
		double v = Calculator.volume(radius);
		
		System.out.printf("Circuference: %.2f\n", c);
		System.out.printf("Volume: %.2f\n",v);
		System.out.printf("PI value:  %.2f\n", Calculator.PI);
	}
}
