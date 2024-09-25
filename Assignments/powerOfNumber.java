// find out the power of the number.

import java.util.Scanner;

public class powerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        double base ;
		double exponent ;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter value for base:");
		base = sc.nextDouble();
        
		System.out.println("Enter value for exponent:");
		exponent = sc.nextDouble();
        
        double result = Math.pow(base, exponent);
        
        System.out.println("Result: " + result);
	}

}
