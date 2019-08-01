package day2;

public class Rectangle implements Shape {
	
	public double width, length;
	
	public Rectangle(double w, double l) {
		this.width = w;
		this.length = l;
	}

	@Override
	public double calculateArea() {
		return this.width * this.length;
	}

}

