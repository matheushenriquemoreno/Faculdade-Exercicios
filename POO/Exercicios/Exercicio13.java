package Exercicios;

public class Exercicio13 {

	public static void main(String[] args) {
		 
		System.out.println("digite sua senha: ");
		int senhaAtual = UtilExercicios.entrada.nextInt();
		
		System.out.println("digite a senha informada: ");
		int senhaDigitada = UtilExercicios.entrada.nextInt();
		while(senhaAtual != senhaDigitada) {
			System.out.println("Senha incorreta, tente novamente");
			System.out.println("digite a senha informada: ");
			senhaDigitada = UtilExercicios.entrada.nextInt();
		} 

		System.out.println("Senha correta! Bem-vindo ao sistema");
	}
}