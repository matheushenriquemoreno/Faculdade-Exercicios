package entities; // pacote da classe

public class Triangle { // Nome da classe
	/*
	 * O Prefixo "public" indica que o atributo ou método pode ser usado em outros arquivos.
	 */
	
	public double a;//
	public double b;// Atributos da classe
	public double c;//
	
	public double area() { 
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * ( p-c));
		
	}
}
