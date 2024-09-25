//Perform all arithmetic operations.

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num1, num2, addition, substract, multiply, division, reminder;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		num1 = sc.nextInt();
		
		System.out.println("Enter second number:");
		num2 = sc.nextInt();
		
		addition = num1 + num2;
		
		substract = num1 -num2;
		
		multiply = num1 * num2;
		
		division = num1 / num2;
		
		reminder = num1 % num2;
		
		System.out.println("Addition of two numbers:"+addition);
		System.out.println("Substraction of two numbers:"+substract);
		System.out.println("Multiplication of two numbers:"+multiply);
		System.out.println("Division of two numbers:"+division);
		System.out.println("Reminder of two numbers:"+reminder);
	}

}
