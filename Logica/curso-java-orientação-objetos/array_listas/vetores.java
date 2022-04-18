package array_listas;

import java.util.Locale;
import java.util.Scanner;

public class vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		double soma = 0.0;
		for(int i = 0; i < n; i++) {
			vetor[i] = sc.nextDouble();
			soma += vetor[i];
		}
		
		double media = soma / n;
		System.out.println("AVERAGE HEIGHT = " + String.format("%.2f",media));
		
		sc.close();
	}

}
