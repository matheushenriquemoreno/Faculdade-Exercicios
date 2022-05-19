package Lista1;

public class Exercicio04 {

	public static void main(String[] args) {
		
		double populacao = 50;
		int ano = 1991;
		boolean jaMostrouInformacao = false;
		
		while(populacao <= 100) {
			ano++;
			populacao += populacao * 0.02;
			
			if(ano == 1992 || ano == 1994) {
				System.out.println("Populacao do ano " + ano + " e igual a: " + populacao);
			}
			
			if(populacao > 61 && !jaMostrouInformacao) {
				System.out.println("Apartir do " + ano + " a popula��o ultrapassou os 60 milh�es de habitantes");
				jaMostrouInformacao = true;
			}
		}
		
		System.out.println("A popula��o chegou aos 100 milh�es de habitantes em " + ano);
	
	}

}
