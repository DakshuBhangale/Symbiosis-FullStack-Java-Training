//Calculate a simple interest

import java.util.Scanner;

public class Simple_Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int principle_value, time;
         double rate,interest;
         
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter the priciple amount:");
         principle_value = sc.nextInt();
         
         System.out.println("Enter the time :");
         time = sc.nextInt();
         
         System.out.println("Enter the rate:");
         rate = sc.nextDouble();
         
         interest = (principle_value * time * rate)/100;
         
         System.out.println("Interest is :"+interest);
	}

}
