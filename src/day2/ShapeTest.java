package day2;

public class ShapeTest {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int rad = 6;
		
		Shape rect = new Rectangle(a, b);
		Circle cir = new Circle(rad);
		Triangle tri = new Triangle(a, b);
	
		
		rect.display();
		cir.display();
		tri.display();
	}

}