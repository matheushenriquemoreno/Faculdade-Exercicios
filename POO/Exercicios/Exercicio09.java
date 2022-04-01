package Exercicios;

public class Exercicio09 {

	public static void main(String[] args) {

		System.out.println("digite a base para a potenciação: ");
		int x = UtilExercicios.entrada.nextInt();

		System.out.println("Digite o expoente: ");
		int y = UtilExercicios.entrada.nextInt();
		
		System.out.println(x + " Elevado a "+ y + " = "+calculaPotenciacao(x,y));
		
	}
	
	public static int calculaPotenciacao(int base, int expoente) {
		
		int resultado = base;
		
		for (int i = 1; i < expoente; i++) {
			resultado *= base;
		}
		
		return resultado;
	}

}
