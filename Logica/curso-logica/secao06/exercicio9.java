package secao06;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float indice;
		
		
		System.out.println("informe o indice de polui��o: ");
		indice = teclado.nextFloat();
		
		
		
		if(indice >= 0.3 && indice < 0.4) {
		 System.out.println(" aten��o: industrias do primeiro grupo devem suspender as atividades.");
		}else if(indice >= 0.4 && indice < 0.5) {
			System.out.println("Aten��o; industrias do primeiro e segundo grupo devem suspender as atividades.");
		}else if(indice >= 0.5) {
			System.out.println(" Aten��o: todos os grupos devem suspender as atividades.");
		}
		teclado.close();
	}

}
