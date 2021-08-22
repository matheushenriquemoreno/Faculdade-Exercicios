import java.util.Scanner;

public class exercicio_for_07 {

	public static void main(String [] arg) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int quebra = 0, resultado = 0;
		
		for(int i = 1; i <= 5; i++) {
			quebra ++; // quebra = quebra + 1;
			if(quebra == i) {
			System.out.print(i);
			resultado = i * i;
			System.out.print(" " + resultado);
			resultado = (int)Math.pow(i,3);
			System.out.println(" " + resultado);
			}
		}
	}
}
