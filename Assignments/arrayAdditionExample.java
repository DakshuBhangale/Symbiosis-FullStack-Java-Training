// Addition of single Dimention array.

import java.util.Scanner;

public class arrayAdditionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array =new int[5];
		int sum=0;
	       
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Enter the elements:");
	       
	       for(int i=0;i<5;i++) {
	    	   array[i] = sc.nextInt();
	    	 }
	       
	       for(int i=0;i<5;i++) {
	    	   sum = sum + array[i];
	       }
	       
	       System.out.println("The sum of Array elements:"+sum);

	}

}
