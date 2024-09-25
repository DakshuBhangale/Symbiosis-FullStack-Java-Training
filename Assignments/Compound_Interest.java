//Calculate a compound interest.

import java.util.Scanner;

public class Compound_Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principle_value, time, rate;
		double amount;
        double compound_interest;
        
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the priciple amount:");
        principle_value = sc.nextDouble();
        
        System.out.println("Enter the time :");
        time = sc.nextDouble();
        
        System.out.println("Enter the rate:");
        rate = sc.nextDouble();
        
        amount = principle_value * (Math.pow((1 + rate/100),time));
        
        compound_interest = amount - principle_value ;
        
        System.out.println("Compound Interest:"+compound_interest);
	}

}
