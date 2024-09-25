// Factorial of a number.

import java.util.Scanner;

public class factorialNumber {

	 public static int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
		 }   
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i, fact = 1, fact1 = 1; 
		int number;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		number = sc.nextInt();
		
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		 
	   System.out.println("Factorial of "+number+" is: "+fact);
	   
	   System.out.println("------------------------");
	   
	   fact1 = factorial(number); 
	   System.out.println("Factorial of "+number+" is: "+fact1);
	}

}
