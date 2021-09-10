package claass_principal;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class principal_rectangle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.heigh = sc.nextDouble();
		rectangle.whidth = sc.nextDouble();
		
		System.out.printf("area = %.2f\n", rectangle.area());
		System.out.printf("Perimeter = %.2f\n", rectangle.perimeter());
		System.out.printf("Diagonal = %.2f\n", rectangle.diagonal());	
	}
}
