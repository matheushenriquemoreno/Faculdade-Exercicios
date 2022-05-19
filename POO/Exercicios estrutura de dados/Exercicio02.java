package Lista1;

public class Exercicio02 {
	
	public static final double valorVisita = 40;
	public static final double valorHora = 5;

	public static void main(String[] args) {
		
		System.out.println("Digite seu nome: ");
		String nome = UtilExercicios.entrada.next();
		
		
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		int horasTrabalhadas = UtilExercicios.entrada.nextInt();
		
		System.out.println("O orçamento do técnico " +nome+" ficara: " + calculaOrcamento(horasTrabalhadas));
	}
	
	public static double calculaOrcamento(int horas) {
		return valorVisita + (valorHora * horas);
	}

}
