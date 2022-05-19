package Lista1;

public class Exercicio01 {

	public static void main(String[] args) {
	
		int [] vetorVendas = new int[] {10,200,0,1000,100};
		
		for(int i = 0; i < vetorVendas.length; i++) {
			System.out.println("O funcionario " + i + " teve um total de vendas Brutas de: " + vetorVendas[i]
					+ ", E seu salário e: " + retornaVendasBrutas(vetorVendas[i]));
		}
	}
	
	public static double retornaVendasBrutas(double vendas) {
		return 200 + (vendas * 0.08);
	}
}
