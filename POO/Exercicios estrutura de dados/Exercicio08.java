package Lista1;

public class Exercicio08 {

	public static void main(String[] args) {
		
		try {
		ListaVetor lista = new ListaVetor();
		int numeros = 10;
		
		System.out.println("Adicionando 5 elementos na lista:");
		for(int i = 0; i < 5; i++) {
			lista.adicionar(numeros);
			numeros += 10;
		}
		printaListaVetor(lista);
		System.out.println("Adicionando um elemento no início da lista: ");
		lista.adicionar(0, 7);
		printaListaVetor(lista);
		
		System.out.println("Adicionando um elemento no meio da lista: ");
		lista.adicionar(lista.tamanho() / 2, 8);
		printaListaVetor(lista);
		
		System.out.println("Adicionando um elemento no final da lista: ");
		lista.adicionar(lista.tamanho(), 9);
		printaListaVetor(lista);
		
		System.out.println("tamanho da lista: " + lista.tamanho());
		System.out.println("Elemento na posição 3: " + lista.pegar(3));
		System.out.println("Indice do número 30: " + lista.indiceDe(30));
		System.out.println("Contem o número 30: " + lista.contem(30));
		
		System.out.println("Removendo no início da lista: ");
		lista.remover(0);
		printaListaVetor(lista);
		
		System.out.println("Removendo no meio da lista: ");
		lista.remover(lista.tamanho() / 2);
		printaListaVetor(lista);
		
		System.out.println("Removendo no fim da lista: ");
		lista.remover(lista.tamanho());
		printaListaVetor(lista);
		
		System.out.println("Removendo todos os elementos da lista: \nLista vazia!");
		lista.removerTodos();
		
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void printaListaVetor(ListaVetor lista) {
		for (int i = 0; i < lista.tamanho(); i++) {
			System.out.print(lista.pegar(i) + " ");
		}
		System.out.println();
	}

	public static class ListaVetor {
		private int[] arrayInteiros;
		private int totalInseridos = 0;
		private int capacidadeMaxima = 5;

		public void mostrarTodos() {
			if (totalInseridos == 0) {
				System.out.print("Lista vazia");
			}
			for (int i = 0; i < totalInseridos; i++) {
				System.out.print(arrayInteiros[i] + " ");
			}
			System.out.println();
		}

		public void adicionar(int numero) {
			garantirInicio();
			arrayInteiros[totalInseridos] = numero;
			totalInseridos++;
			garantirEspaco();
		}
		public void adicionar(int indice, int numero) {
			int proximo = 0;
			int atual = 0;
			garantirInicio();
			totalInseridos++;
			garantirEspaco();
			
			for(int i = indice; i < arrayInteiros.length; i++) {
			    
				if(indice == i) {
					proximo = arrayInteiros[i];
					arrayInteiros[i] = numero;
					continue;
				}
				
				atual = proximo;
				proximo = arrayInteiros[i];
				
				arrayInteiros[i] = atual;
			}
		}
		
		private void garantirInicio() {
			if (arrayInteiros == null) {
				arrayInteiros = new int[capacidadeMaxima];
			}
		}

		private void garantirEspaco() {
			if (totalInseridos == capacidadeMaxima) {
				capacidadeMaxima = capacidadeMaxima * 2;
				int[] arrayNovo = new int[capacidadeMaxima];
				for (int i = 0; i < totalInseridos; i++) {
					arrayNovo[i] = arrayInteiros[i];
				}
				arrayInteiros = arrayNovo;
			}
		}

		public int tamanho() {
			return totalInseridos;
		}

		public int pegar(int indice) {
			garantirIndice(indice);
			return arrayInteiros[indice];
		}

		private void garantirIndice(int indice) {
			if (indice < 0 || indice > totalInseridos) {
				throw new IndexOutOfBoundsException("indice Invalido " + indice);
			}
		}

		public int indiceDe(int numero) {
			for (int i = 0; i < totalInseridos; i++) {
				if (numero == arrayInteiros[i]) {
					return i;
				}
			}
			return -1;
		}

		public boolean contem(int numero) {
			int indice = indiceDe(numero);
			if (indice == -1) {
				return false;
			} else {
				return true;
			}
		}
		
		public boolean remover(int indice) {
			garantirInicio();
			garantirIndice(indice);
			
			int proximo = 0;
			
			if(indice == totalInseridos) {
				totalInseridos--;
				System.out.println("O elemento na posição "+ indice +" foi removido com sucesso");
				return true;
			}
			
			for(int i = indice; i < totalInseridos; i++) {
			
					arrayInteiros[i] = arrayInteiros[i+1];
			}
			
			totalInseridos--;
			System.out.println("O elemento na posição "+ indice +" foi removido com sucesso");
			return true;
		}
		
		public void removerTodos() {
			totalInseridos = 0;
			capacidadeMaxima = 5;
			arrayInteiros = null;
		}
	}
}
