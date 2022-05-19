package Exercicio6;

public class ExercicioTeste {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		
		agenda.armazenaPessoa("Matheus Henrique", 1.75, 22);
		agenda.armazenaPessoa("Adrielly Betania", 1.60, 18);
		agenda.armazenaPessoa("Carlos Eduardo", 1.80, 23);
		
		System.out.println("Imprimindo pessoas: ");
		agenda.imprimeAgenda();
		
		int indexPessoaBuscada  = agenda.buscaPessoa("Adrielly Betania");
	
		System.out.println("\nIndex da pessoa buscada: " + indexPessoaBuscada);
	
		agenda.removePessoa("Carlos Eduardo");
		
		
		System.out.println("\nAgenda apos remover pessoa: ");
		agenda.imprimeAgenda();
		
		System.out.println("\nImprimindo pessoa do indice 1");
		agenda.ImprimePessoa(1);
		
		
		
	}

}
