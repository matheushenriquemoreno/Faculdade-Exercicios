package classs_principal;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String [] arg) {
		Locale.setDefault(Locale.US);
		Scanner sc = new  Scanner(System.in);
		
		Product p = new Product();
		
		System.out.println("Enter product data: ");
		
		System.out.print("Name:");
		String name = sc.nextLine();
		
		System.out.print("price: ");
		Double price = sc.nextDouble();
		
		//System.out.print("Quantity in stock: ");
		//int quantity = sc.nextInt();
		
		Product product = new Product(name, price); //  o construtor serve pra proteger que o programador crie um produto sem dados.
	
		// aula Emcapsulamento
		
		product.setName("computador");
		System.out.println("Updated name: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Upadated price: " + product.getPrice());
		
		
	
	
		System.out.println("\nProduct data: " + product);
		
		System.out.print("\nEnter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity); // atualizando a aquantidade dentro do objeto
	
		System.out.println("\nUpdated data: " + product);
	
		System.out.print("\nEnter the number of products to be removed form stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("\nUpdated data: " + product);
		
		sc.close();
	}
}
