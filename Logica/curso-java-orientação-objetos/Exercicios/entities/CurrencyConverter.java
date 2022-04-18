package entities;

public class CurrencyConverter {

	public static final double iof = 0.06;

	public static double resultado(double cotacao_m, double valor_p) {
	 return cotacao_m * valor_p * (1.0 + iof); // 3.10 * 200 * 1.06 = 657.
	}
	
}