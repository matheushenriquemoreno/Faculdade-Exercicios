package Utils;

import java.util.Scanner;

public class UtilExercicio {
	
	public static Scanner entrada = new Scanner(System.in);
		
	public static double verificaNota(double nota){
		while(nota < 0 || nota > 10) {
			System.out.println("Erro nota Invalida! Digite novamente: ");
			nota = entrada.nextDouble();
		}
		return nota;
	}
}