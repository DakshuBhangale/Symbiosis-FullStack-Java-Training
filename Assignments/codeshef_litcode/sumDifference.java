//write a java program to take two number from user as a input and print their difference if num1>num2 then print their sum.

package codeshef_litcode;

import java.util.Scanner;

public class sumDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int num1, num2;
         int difference, sum;
         
         Scanner sc = new Scanner(System.in);
         
         for(int i=0;i<2;i++) {
         
         System.out.println("Enter first number:");
         num1 = sc.nextInt();
         
         System.out.println("Enter second number:");
         num2 = sc.nextInt(); 
         
         difference = num1 - num2;
         
         System.out.println("The difference of two number is:"+difference);
         
         System.out.println("--------------------------------");

         if(num1>num2) {
        	 sum = num1 + num2;
        	 System.out.println("Sum of numbers is:"+sum);
         }
         else {
        	 System.out.println("sum is not possible.");
         }
         System.out.println();
       }
	}

}
