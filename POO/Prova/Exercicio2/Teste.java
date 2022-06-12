package Exercicio2;

import java.util.Scanner;

public class Teste {

	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
	
	opcoes();

	}
	
	public static void opcoes() {
		
		System.out.println("qual Figura geometrica deseja criar? (Circulo, Quadrado, Retangulo)");
		String figura = entrada.nextLine();
		
		if(figura.equalsIgnoreCase("Circulo")) {
			exibeDados(retornaCirculo());
		}
		else if(figura.equalsIgnoreCase("Quadrado")) {
			exibeDados(retornaQuadrado());
		}
		else if(figura.equalsIgnoreCase("Retangulo")) {
			exibeDados(retornaRetangulo());
		}else {
			System.out.println("Figura não existente");
		}
		
		entrada.nextLine();
		opcoes();
		
	}
	
	private static Circulo retornaCirculo() {
		System.out.println("Digite o valor do raio do circulo: ");
		double raio = entrada.nextDouble();
		
		return new Circulo(raio);
	}
	
	private static Quadrado retornaQuadrado() {
		
		System.out.println("Digite o valor do Lado do quadrado:");
		double lado = entrada.nextDouble();
		
		return new Quadrado(lado);
	}
	
	private static Retangulo retornaRetangulo() {
		
		System.out.println("Digite o valor da base do retangulo: ");
		double base = entrada.nextDouble();
		
		System.out.println("Agora o valor da Altura: ");
		double altura = entrada.nextDouble();
		
		return new Retangulo(base, altura);
	}
		
	public static void exibeDados(FiguraGeometrica figura) {
	  figura.exibirDados();
	}
}