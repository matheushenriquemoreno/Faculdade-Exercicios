package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	public Product() { // contrutor padrao.
	}
	
	public Product(String name, double price, int quantity) { // construtor 
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) { // Sobrecarga � diponibilizar mais de 1 versao da mesma operacao.
		this.name = name;
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) { // set alterar get mostrar 
		this.price = price;
	}
	
	
	public int getQuantity() {
		return quantity;
	}
	
	
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;     //this e uma palavra reservada que siginifica uma auto referencia ao ao objetos
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name + ", $" + String.format("%.2f", price) +", " + quantity + " unitis, Total: $ " +
			   String.format("%.2f", totalValueInStock());	
	}
}
