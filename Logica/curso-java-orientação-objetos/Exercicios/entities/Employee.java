package entities;

public class Employee {
	public String name;
	public double croosSalary;
	public double tax;
	
	
	public double netSalary() {
	return this.croosSalary - this.tax;
	}
	
	public void increaseSalary(double percentage) {
		double newSalary = (this.croosSalary * (percentage / 100.00)) + netSalary();
		System.out.println("\nupdate data: "+ name +", $ "+ String.format("%.2f", newSalary));
	}
	
	
}
