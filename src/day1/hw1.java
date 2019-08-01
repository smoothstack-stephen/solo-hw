package day1;

public class hw1 {

	class Pattern {
		
		public Pattern() {
			printPattern(0);
		}
		
		public Pattern(int n) {
			printPattern(n);
		}
		
		public void printPattern(int n) {
			if(n>0 && n<5) System.out.printf("<< Pattern %d >>\n", n);
			switch(n) {
				case 1: // right triangle
					for(int i=1; i<5; i++) {
						star(i);
						System.out.println();
					}
				case 2: // upside-down right triangle
					for(int i=4; i>0; i--) {
						star(i);
						System.out.println();
					}
				case 3: // equilateral triangle
					for(int i=1; i<5; i++) {
						space(4-i);
						star(2*i-1);
						System.out.println();
					}
				case 4: // upside-down equilateral triangle
					for(int i=4; i>0; i--) {
						space(4-i);
						star(2*i-1);
						System.out.println();
					}
				default:
					System.out.println("Please specify a pattern 1 through 4.");
			}
			System.out.println();
		}
		
		public void star(int n) {
			if (n > 0) {
				System.out.print("*");
				star(n-1);
			}
		}
		
		public void space(int n) {
			if (n > 0) {
				System.out.print(" ");
				space(n-1);
			}
		}
	}
	
	public static void main(String[] args) {
		
		hw1 outer = new hw1();
		
		Pattern one = outer.new Pattern(1);
		Pattern two = outer.new Pattern(2);
		Pattern three = outer.new Pattern(3);
		Pattern four = outer.new Pattern(4);
		// Pattern edgeTest = new Pattern(5);
	}
}