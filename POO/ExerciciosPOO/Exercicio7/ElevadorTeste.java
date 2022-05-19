package Exercicio7;

public class ElevadorTeste {

	public static void main(String[] args) {
		
		Elevador elevador = new Elevador(10, 5);

		elevador.entra();
		elevador.entra();
		elevador.entra();
		elevador.entra();
		elevador.entra();
		elevador.entra();
		elevador.entra();
		
		System.out.println("Dados do elevador. \n" + elevador);
		
		elevador.sobe();
		elevador.sobe();
		elevador.sobe();
		elevador.sobe();
		
		System.out.println("\nDados do elevador. \n" + elevador);
		
		elevador.desce();
		elevador.desce();
		elevador.desce();
		elevador.desce();
		elevador.desce();
		elevador.desce();
		
		System.out.println("\nDados do elevador. \n" + elevador);
		
		elevador.sai();
		elevador.sai();
		elevador.sai();
		elevador.sai();
		elevador.sai();
		
		System.out.println("\nDados do elevador. \n" + elevador);
	}

}
