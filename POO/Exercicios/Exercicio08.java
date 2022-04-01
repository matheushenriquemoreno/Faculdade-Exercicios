package Exercicios;

public class Exercicio08 {

	public static void main(String[] args) {
		
		System.out.println("Digite para operação a operação matematica: ");
		int codigo = UtilExercicios.entrada.nextInt();
		
		System.out.println("Digite o valor de X: ");
		double x = UtilExercicios.entrada.nextDouble();
		
		System.out.println("Digite o valor de Y: ");
		double y = verificaNumero(UtilExercicios.entrada.nextDouble());
		
		switch(codigo) { 
		case 1:
			System.out.println("Resultado = " + funcaoEquacao1(x, y));
			break;
		case 2:
			x = verificaNumero(x); // como qualquer numero vezes 0 e zero verifico se os dois não são zero.
			System.out.println("Resultado = " + funcaoEquacao2(x, y));
			break;
		case 3:
			System.out.println("Resultado = " + funcaoEquacao3(x, y));
			break;
		case 4:
			System.out.println("Resultado = " + funcaoEquacao4(x, y));
			break;
		default:
			System.out.println("Codigo Invalido!!");
			break;
		}
		
	}
	
	public static double verificaNumero(double numero) {
		while(numero == 0) {
			System.out.println("Operação com 0 invalida Digite novamente: ");
			numero = UtilExercicios.entrada.nextDouble();
		}
		return numero;
	}
	
	public static double funcaoEquacao1(double x ,double y) {
		return Math.sqrt((Math.pow(x, 3) + (x * (2*y-x)) / Math.pow(y, 2)));
	}
	
	public static double funcaoEquacao2(double x ,double y) {
		return Math.sqrt((Math.pow(x, 3) + Math.pow(y, 3))  + (Math.pow(x, 3) - Math.pow(y, 3))) / x * y;
	}
	
	public static double funcaoEquacao3(double x ,double y) {
		return  2 * x + Math.sqrt(x * y);
	}
	
	public static double funcaoEquacao4(double x ,double y) {
		return Math.sin(x) + Math.cos(y);
	}
}
