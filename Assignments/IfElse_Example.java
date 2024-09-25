//Example of IF_ELSE (Control Flow)

import java.util.Scanner;

public class IfElse_Example {

	public static void method1() {
		 int num1;
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter a number:");
		 num1 = sc.nextInt();
		 
		 if(num1 % 2 == 0) {
			 System.out.println("Number is Even");
		 }
		 else {
			 System.out.println("Number is odd"); 
		 }
	}
	
	public static void method2() {
		 String username, password;
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter a username:");
		 username = sc.next();
		 
		 System.out.println("Enter a password:");
		 password = sc.next();
		 
		 if(username.equals("admin") && password.equals("admin")) {
			 System.out.println("Login Successfully");
		 }
		 else {
			 System.out.println("Unsuccessfully Login"); 
		 }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        method1();
        method2();
        }

}
