package Exercicio4;

import java.util.ArrayList;
import java.util.Random;

public class Teste {

	public static Random randon = new Random();
	public static ArrayList<String> vencedores = new ArrayList<String>();
	public static ArrayList<Pessoa> jogadores = new ArrayList<Pessoa>();

	public static void main(String[] args) {

		criaJogadores();
		mostraJogadores();

		System.out.println("Rodada 1: ");
		Jogar(jogadores.get(0), jogadores.get(1));

		System.out.println("\nRodada 2: ");
		Jogar(jogadores.get(2), jogadores.get(3));

		System.out.println("\nRodada 3: ");
		Jogar(jogadores.get(4), jogadores.get(5));

		mostraVencedores();

	}

	public static void mostraVencedores() {
		System.out.println("\nNomes dos vencedores.");
		for (String nomeVencedor : vencedores) {
			System.out.println(nomeVencedor);
		}
	}

	public static void mostraJogadores() {
		System.out.println("jogadores: ");
		for (Pessoa jogador : jogadores) {
			System.out.println(jogador);
			System.out.println("--------------------------------------------");
		}
	}

	public static void Jogar(Pessoa jogador1, Pessoa jogador2) {

		int contadorJogador1 = 0, contadorJogador2 = 0;

		for (int i = 1; i <= 7; i++) {

			double resultadoJogador1 = retornaResultadoJogadaDoisDados(jogador1);
			double resultadoJogador2 = retornaResultadoJogadaDoisDados(jogador2);

			if (resultadoJogador1 > resultadoJogador2) {
				
				System.out.println("jogador " + jogador1.getNome() + " Venceu a rodada " + i + " Com "
						+ resultadoJogador1 + " Pontos");
				contadorJogador1++;
				
			} else if (resultadoJogador1 == resultadoJogador2) {
				
				System.out.println("ouve um empate entre os Jogadores " + jogador1.getNome() + " e " + jogador2.getNome());
				
			} else {
				
				System.out.println("jogador " + jogador2.getNome() + "Venceu a rodada " + i + " Com "
						+ resultadoJogador2 + " Pontos");
				contadorJogador2++;
				
			}
		}

		vencedores.add(contadorJogador1 > contadorJogador2 ? jogador1.getNome() : jogador2.getNome());
	}

	public static double retornaResultadoJogadaDoisDados(Pessoa jogador) {
		return (jogador.jogarDadoDe6Faces() + jogador.jogarDadoDe8Faces());
	}

	public static void criaJogadores() {
		jogadores.add(new Pessoa("Matheus", 'M', new Data("21", "11", "1999"), criaEndereco()));
		jogadores.add(new Pessoa("Carlos", 'M', new Data("17", "10", "1980"), criaEndereco()));
		jogadores.add(new Pessoa("Adrielly", 'F', new Data("19", "07", "2001"), criaEndereco()));
		jogadores.add(new Pessoa("Geovana", 'F', new Data("09", "01", "2003"), criaEndereco()));
		jogadores.add(new Pessoa("Sergio", 'M', new Data("15", "03", "1993"), criaEndereco()));
		jogadores.add(new Pessoa("Adriana", 'F', new Data("03", "06", "1997"), criaEndereco()));
	}

	public static Endereco criaEndereco() {
		return new Endereco("avenida v " + randon.nextInt(100), randon.nextInt(25), "Aparecida de goiania",
				"" + (randon.nextInt(999) + 1000), "Cidade vera cruz");
	}
}