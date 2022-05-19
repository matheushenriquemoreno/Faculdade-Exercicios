package Lista1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Exercicio11E12 {

	public static void main(String[] args) {
		LinkedList<Integer> listaEncadeada = new LinkedList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			listaEncadeada.add(i);	
		}
		
		UtilExercicios.printaVetor2(retornaArrayCopiadoDeLindkList(listaEncadeada));
		UtilExercicios.printaArrayList(retornaArrayListCopiadoDeLindkList(listaEncadeada));
	}
	
	public static Integer[] retornaArrayCopiadoDeLindkList(LinkedList<Integer> lista) {
		Integer [] array = new Integer[lista.size()];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = lista.get(i);
		}
		return array;
	}
	
	public static ArrayList<Integer> retornaArrayListCopiadoDeLindkList(LinkedList<Integer> lista) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for (int i = 0; i < arrayList.size(); i++) {
			arrayList.add(lista.get(i));
		}
		return arrayList;
	}
}
