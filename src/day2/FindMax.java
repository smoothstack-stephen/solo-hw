package day2;

import java.util.Arrays;

public class FindMax {
	
	// The 2D array and its dimensions
	private static final int dim_i = 5;
	private static final int dim_j = 5;
	private static int[][] vals = new int[dim_i][dim_j];
	
	// Populates a 2D array with random integers ranging from 0 - 100
	public void populate() {
		for(int i=0; i<dim_i; i++) {
			for(int j=0; j<dim_j; j++) {
				vals[i][j] = (int) (Math.random() * 100);
			}
		}		
	}

	// Prints a 2D array row-by-row
	public void printArray() {
		System.out.println("Array:");
		for(int[] i : vals) {
			System.out.println(Arrays.toString(i));
		}
		System.out.println();
	}

	// Finds and prints the maximum value and its position in a 2D array
	public void printMax() {
		int max_i = 0;
		int max_j = 0;
		int max = vals[0][0];

		for(int i=0; i<dim_i; i++) {
			for(int j=0; j<dim_j; j++) {
				int val = vals[i][j];
				if (val > max) {
					max = val;
					max_i = i;
					max_j = j;
				}
			}
		}
		
		System.out.println("Max value = " + max);
		System.out.printf("Position: (%d, %d)\n", max_i, max_j);
	}
	
	public static void main(String[] args) {	
		FindMax f = new FindMax();
		f.populate();
		f.printArray();
		f.printMax();
	}

}
