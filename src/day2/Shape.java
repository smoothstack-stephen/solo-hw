package day2;

public interface Shape {
	
	public double calculateArea();
	default public void display() {
		System.out.printf("Area of %s %f\n", this.getClass() + " = ", calculateArea());
	}
	
}