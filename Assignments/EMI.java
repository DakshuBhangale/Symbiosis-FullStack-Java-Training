// Calculate the EMI of loan taken

import java.util.Scanner;

public class EMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        double principle_value, time, rate;
		double EMI;
        
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the priciple amount:");
        principle_value = sc.nextDouble();
        
        System.out.println("Enter the time :");
        time = sc.nextDouble();
        
        System.out.println("Enter the rate:");
        rate = sc.nextDouble();
        
        EMI = (principle_value * rate * Math.pow((1+rate),time)) / Math.pow((1+rate),time)-1;
        
        System.out.println("EMI is :"+EMI);   
	}

}
