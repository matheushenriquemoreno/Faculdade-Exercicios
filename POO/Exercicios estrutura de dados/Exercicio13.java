package Lista1;

import java.util.LinkedList;

public class Exercicio13 {

	public static void main(String[] args) {
		
		LinkedList<Integer> listaEncadeada = new LinkedList<Integer>();
		LinkedList<Integer> listaEncadeada2 = new LinkedList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			listaEncadeada.add(i);
			listaEncadeada2.add(i+10);
		}
		
		String mensagem = verificaDuasListasEncadeadasSaoIguais(listaEncadeada, listaEncadeada2) ? "possui valor igual!!": "não possue valor igual";
		
		System.out.println(mensagem);
		
	}
	
	public static boolean verificaDuasListasEncadeadasSaoIguais(LinkedList<Integer> lista1, LinkedList<Integer> lista2) {
		
		for(Integer valor : lista1) {
			for(Integer valorLista2 : lista2) {
				if(valor.equals(valorLista2)) {
					return true;
				}
			}
		}	
		return false;
	}
}
