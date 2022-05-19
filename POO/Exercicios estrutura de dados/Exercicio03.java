package Lista1;

public class Exercicio03 {

	public static void main(String[] args) {
		
		
		System.out.println("Plano A: cobra um valor fixo mensal de R$ 140,00 e R$ 20,00 por consulta num certo período.");
		System.out.println("Plano B: cobra um valor fixo mensal de R$ 110,00 e R$ 25,00 por consulta num certo período.");
		
		System.out.println("Digite a quantidade de consulta que ira fazer para te informar o plano que melhor te atende: ");
		int quantidadeConsulta = UtilExercicios.entrada.nextInt();
		
		
		double valorPlanoA = calculaValorPlano(140.00, 20.00,quantidadeConsulta);
		double valorPlanoB = calculaValorPlano(110.00, 25.00,quantidadeConsulta);
		
		if(valorPlanoA < valorPlanoB) {
			System.out.println("o plano que melhor te atende e o plano A, com a quantidade de consultas informado o valor a pagar seria de: " + valorPlanoA
					+" \nContra o valor do plano B de " + valorPlanoB);
		}
		else {
			System.out.println("o plano que melhor te atende e o plano B, com a quantidade de consultas informado o valor a pagar seria de: " + valorPlanoB
					+" \nContra o valor do plano A de " + valorPlanoA);
		}
	}
	
	public static double calculaValorPlano(double valorFixoMensal,double valorConsulta,int quantidadeConsulta) {
		return valorFixoMensal + (valorConsulta * quantidadeConsulta);
	}
}