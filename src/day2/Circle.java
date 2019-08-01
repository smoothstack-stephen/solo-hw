package day2;

public class Circle implements Shape {
	
	double radius;
	
	public Circle(double r) {
		this.radius = r;
	}

	@Override
	public double calculateArea() {
		return radius * radius * Math.PI;
	}

}

