import java.util.Locale;

public class saida_de_dados {

	public static void main(String[] args) {
		System.out.print("Ola mundo!");
		System.out.println("ola mundo");
	
		double x = 10.3574;
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US); // mostrar numeros reais com ponto inves da virgula
		System.out.printf("%.4f%n", x);
		
		
		System.out.println("resultado =" + x + " METROS");
		System.out.printf("Resultado = %.2f Metros\n", x);
		
		String nome = "Maria";
		int idade = 31;
		double salario = 4000.0;
		System.out.printf("%s tem %d anos e ganha %.2f reais\n", nome, idade, salario);
	}

}
