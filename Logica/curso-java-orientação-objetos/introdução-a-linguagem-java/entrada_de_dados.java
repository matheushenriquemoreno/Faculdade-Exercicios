import java.util.Locale;
import java.util.Scanner;

public class entrada_de_dados {

	public static void main(String [] arg) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next(); // ler uma palavra
		System.out.println("voce digitou " + x);
		
		int x1 ;
		x1 = sc.nextInt(); // ler um numero inteiro 
		System.out.println("voce digitou " + x1);
		
		double x2;
		x2 = sc.nextDouble(); // ler um numero double
		System.out.printf("voce digitou %.2f\n", x2);
		
		char x3;
		x3 = sc.next().charAt(0); // charAt(0); pega o primeiro caractere digitado.
		System.out.println(x3);
		
		
		
		// dados na mesma linha separado por espaço
		
		String a;
		int b;
		double c;
		
		a = sc.next();
		b = sc.nextInt();
		c = sc.nextDouble();
		
		System.out.printf("String = %s  int = %d double = %.2f", a , b , c);
		
		
		
		sc.close();
	}
	
	
}
