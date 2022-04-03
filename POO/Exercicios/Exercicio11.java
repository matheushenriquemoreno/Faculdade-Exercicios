package Exercicios;

public class Exercicio11 {

	public static void main(String[] args) {
		
		
		System.out.println("Valor do divisor: ");
		int divisor = UtilExercicios.entrada.nextInt();
		System.out.println("Inicio do Intervalo: ");
		int inicioIntervalo = UtilExercicios.entrada.nextInt();
		System.out.println("Fim do Intervalo: ");
		int finalIntervalo = UtilExercicios.entrada.nextInt();
		
		System.out.print("Números divisíveis por "+ divisor +" no intervalo de " + inicioIntervalo + " a " + finalIntervalo +": ");
		printaNumeroDivisiveisEmUmIntervalo(divisor,inicioIntervalo,finalIntervalo);

	} 
	
	public static void printaNumeroDivisiveisEmUmIntervalo(int divisor, int inicioDoIntervalo, int finalDoIntervalo) {
		
		for(int i = inicioDoIntervalo; i <= finalDoIntervalo; i++) {
			if(i % divisor == 0)
				System.out.print(i + ", ");
		}
	}
}
