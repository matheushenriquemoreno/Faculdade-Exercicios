package Exercicios;


public class Exercicio25 {

	public static void main(String[] args) {
		
		System.out.println("Popule o primeiro vetor.");
		Double[] vetor1 = retornaVetorPopuladoDouble(10);
	
		System.out.println("Popule o segundo vetor.");
		Double[] vetor2 = retornaVetorPopuladoDouble(10);
	
		Character[] vetorCaracter = retornaVetorPopuladoChar(10);

		System.out.println("Primeiro vetor:");
		UtilExercicios.printaVetor(vetor1);
		System.out.println("Segundo vetor:");
		UtilExercicios.printaVetor(vetor2);
		System.out.println("Vetor de Caracter digitado:");
		UtilExercicios.printaVetor(vetorCaracter);
		
		mostraResultado(vetor1,vetor2,vetorCaracter);
	}
	
	public static void mostraResultado(Double[] vetor1, Double[] vetor2,Character[] caracter) {
		
		int tamanho = vetor1.length == vetor2.length && vetor1.length ==  caracter.length ? vetor1.length: 0;
		
		Double[] resultado = new Double[tamanho];
 		
		for(int i = 0; i < resultado.length; i++) {
			if(caracter[i] == '+') {
				resultado[i] = vetor1[i] + vetor2[i];
			}
			if(caracter[i] == '*') {
				resultado[i] = vetor1[i] * vetor2[i];
			}
			if(caracter[i] == '/') {
				resultado[i] = vetor1[i] / vetor2[i];
			}
			if(caracter[i] == '-') {
				resultado[i] = vetor1[i] - vetor2[i];
			}
		}
		System.out.println("Resultado:");
		UtilExercicios.printaVetor(resultado);
	}
	
	
	public static Double[] retornaVetorPopuladoDouble(int tamanho) {
		Double [] vetor = new Double [tamanho];
		
		for(int i = 0; i < vetor.length; i ++) {
			System.out.println("posicao [" + (i + 1) + "]:");
			vetor[i]= UtilExercicios.entrada.nextDouble();
		}
		return vetor;
	}
	
	public static Character[] retornaVetorPopuladoChar(int tamanho) {
	
		Character [] vetor = new Character [tamanho];
		
		for(int i = 0; i < vetor.length; i ++) {
			System.out.println("Popule o vetor com os seguinte caracter + - * / [" + (i + 1) +"]: ");
			vetor[i]= UtilExercicios.entrada.next().charAt(0);
			
			while(vetor[i] != '+' && vetor[i] != '-' && vetor[i] != '*' && vetor[i] != '/') {
				System.out.println("Caracter Invalido! permitidos: + - * /.");
				System.out.println("Digite novamente: ");
				vetor[i]= UtilExercicios.entrada.next().charAt(0);
			}
			
		}
		return vetor;
	}
}
