package secao03;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		int metros, centimetros;
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("vamo fazer um processo de transformação de metros para centimetros, por favor coloque o tamanho em mentros que deseja transformar: ");
		metros = teclado.nextInt();
		
		centimetros = metros * 100;
		
		System.out.println(metros +" metros em centimetros é  " + centimetros);
		
		teclado.close();
		
			

	}

}
