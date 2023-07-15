package javaprojectForloops;

public class Factorial {

	public static void main(String[] args) {
		 int number = 9;
	        long factorial = 1;
	        int i=1;
	        
	        while (i <= number)
	        {
	            factorial = factorial * i;
	            i++;
	        }
	        System.out.println("Factorial of " + number + " is: " + factorial);
	    }

	}


