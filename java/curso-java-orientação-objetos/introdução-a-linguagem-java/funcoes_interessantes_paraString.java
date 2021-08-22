import java.util.Scanner;

public class funcoes_interessantes_paraString {
	
	public static void main(String [] arg) {
		Scanner sc = new Scanner(System.in);
		String original = "abcd FGHIJ abcd JASAÇ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim(); // elimina espaços
		String s04 = original.substring(2); // mostrar caracter apos o numero delimitado 
		String s05 = original.substring(2,9);
		String s06 = original.replace('a', '9');
		String s07 = original.replace("abc", "xy");
		
		
		System.out.println(s01);
		System.out.println(s02);
		System.out.println(s03);
		System.out.println(s04);
		System.out.println(s05);
		System.out.println(s06);
		System.out.println(s07);
		System.out.println("-----------");
		
		String[] vetor = sc.nextLine().split(" ");
		String parte1 = vetor [0];
		String parte2 = vetor [1];
		String parte3 = vetor [2];
		
		System.out.printf("%s , %s , %s", parte1, parte2, parte3);
		
		
	}
}
