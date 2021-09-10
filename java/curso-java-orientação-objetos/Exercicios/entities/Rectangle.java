package entities;

public class Rectangle {
	public double whidth;
	public double heigh;
	
	
	public double area() {
		return this.heigh * this.whidth;
	}
	
	public double perimeter() {
		return (this.heigh + this.heigh) + (this.whidth + this.whidth);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(this.heigh, 2) + Math.pow(this.whidth, 2));		
	}
	
}
