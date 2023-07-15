package javaprojectForloops;

public class Bubblesort {

	public static void main(String[] args) {
		// input 3, 6, 4, 9, 7
		
		// output : 3, 4, 6, 7, 9
		/**
		 *  step 1 : 3, 6, 4, 9, 7
		 *  step 2 : 3, 4, 6, 9, 7
		 *  step 3 : 3, 4, 6, 9, 7
		 *  step 4 : 3, 4, 6, 7, 9
		 */
		
		// input : 9, 7, 5, 3, 1
		/**
		 * Iteration 1
		 * step 1 : 7,9,5,3,1
		 * step 2 : 7,5,9,3,1
		 * step 3 : 7,3,5,9,1
		 * step 4 : 7,5,3,1,9
		 * 
		 * Iteration 2
		 * step 1 : 5,7,3,1,9
		 * step 2 : 5,3,7,1,9
		 * step 3 : 5,3,1,7,9
		 * 
		 * Iteration 3
		 * step 1 : 3,5,1,7,9
		 * step 2 : 3,1,5,7,9
		 * 
		 * Iteration 4
		 * step 1 : 1,3,5,7,9
		 * 
		 */
		int[] a = { 9,7,5,3,1 };
		int temp;
		for(int j=0; j<a. length-1; j++) {
		for(int i=0; i< a.length-j; i++); {
			int i;
			if(a[i] > a[i+1]) {
				temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			
	}
			printArray(a);
			System.out.println("");
		}

	public static void printArray(int[] a) {
		for(int i=0; i< a. length; i++) {
			System.out.println(a[i]); {
}
		}
	}
		}
	