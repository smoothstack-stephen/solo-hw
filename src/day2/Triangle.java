package day2;

public class Triangle implements Shape {
	
	public double base, height;
	
	public Triangle(double b, double h) {
		this.base = b;
		this.height = h;
	}

	@Override
	public double calculateArea() {
		return 0.5 * base * height;
	}

}
