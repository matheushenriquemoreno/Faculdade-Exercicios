package Lista1;

import java.util.ArrayList;
import java.util.Scanner;

public class UtilExercicios {
	
	public static Scanner entrada = new Scanner(System.in);
	
	public static <T> void printaVetor2 (T [] vetor) {
		for(T item : vetor) {
			System.out.print(item + " | ");
		}
		System.out.println();
	}
	
	public static <T> void printaArrayList(ArrayList<T> vetor) {
		for(T item : vetor) {
			System.out.print(item + " | ");
		}
		System.out.println();
	}
}
