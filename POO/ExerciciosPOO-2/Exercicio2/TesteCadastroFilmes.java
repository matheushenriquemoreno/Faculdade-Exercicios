package Exercicio2;

public class TesteCadastroFilmes {

	public static void main(String[] args) {
		
		CadastroFilme filmes = new CadastroFilme();
		
		System.out.println("Filmes cadastrados");
		System.out.println("--------------------------");
		filmes.mostraFilmes();
		
		Ator carlos = new Ator("Carlos", 35);
		Ator ana = new Ator("ana", 28, 2);
		Diretor sergio = new Diretor("Sergio", false);
		Filme filme = new Filme("Senhor dos aneis", sergio, carlos, ana);
		
		System.out.println("--------------------------");
		if(filmes.insereFilme(filme)) {
			System.out.println("\n\nFilme Inserido com sucesso.\n\n");
		}else {
			System.out.println("\n\nFilme não foi inserido.\n\n");
		}
		System.out.println("--------------------------");
		
		System.out.println("Filme Buscado: ");
		filmes.buscaFilme("Senhor dos aneis");
		System.out.println("--------------------------");
		
		System.out.println("\n\nFilmes Com diretores vencedores de oscar.\n");
		filmes.buscaDiretoresVencedoresDeoscars();
		
	}

}
