package secao07;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		// fa�a um programa que leia um nome de usuario e sua senha e n�o aceite a senha igual ao nome do usuario, mostrando uma menssagem de erro
		// e voltando a pedir as inform��es;
		String nome, senha;
	    Scanner teclado = new Scanner(System.in);
	   
	    
	    System.out.println("informe o seu nome: ");
	    nome = teclado.next();
	    System.out.println("informe a sua senha");
	    senha = teclado.next();
	    
	    while(nome.equals(senha)) {
	    	System.out.println("erro o nome de usuario e senha deve ser diferentes!!");
	    	
	    	System.out.println("informe o seu nome: ");
		    nome = teclado.next();
		    System.out.println("informe a sua senha");
		    senha = teclado.next();
	    }
	    teclado.close();
	} 

}
