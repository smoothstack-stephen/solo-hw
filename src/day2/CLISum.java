package day2;

public class CLISum {
	
	public static double sum(String[] vals) {
		double sum = 0;
		
		for(String s : vals) {
			double d = Double.parseDouble(s);
			sum += d;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		if(args.length == 0)
			System.out.println("No command line values found");
		else
			System.out.println("Sum of command line values = " + sum(args));
	}
}
