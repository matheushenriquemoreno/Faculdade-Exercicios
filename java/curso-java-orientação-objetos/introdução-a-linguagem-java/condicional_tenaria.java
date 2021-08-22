
public class condicional_tenaria {
	
	public static void main(String [] arg) {
		
		double preco = 300;
		double desconto;
		
		
		if(preco < 20) {
			desconto = preco * 0.1;
			System.out.println(desconto);
		}else {
			desconto = preco * 0.05;
			System.out.println(desconto);
		}
		
		desconto = (preco < 20) ? preco * 0.1: preco * 0.05;
		
		System.out.println(desconto);
	}
	
}
