import java.util.Locale;
import java.util.Scanner;

public class estrutura_doWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char r;
		
		do {
		System.out.println("Digite a temperadura em celcius: ");
		double c = sc.nextDouble();
		double f = 9.0 * c / 5.0 + 32.0;
		System.out.printf("Temperatura equivalente em Fahrenheit: %.1f\n", f);
		System.out.println("Deseja repetir (S/N)?");
		r = sc.next().charAt(0);
		} while(r != 'n');

	}

}
