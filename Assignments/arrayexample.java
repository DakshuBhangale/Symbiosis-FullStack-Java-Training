// Example of Array.

import java.util.Scanner;

public class arrayexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array =new int[5];
       
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the elements:");
       
       for(int i=0;i<5;i++) {
    	   array[i] = sc.nextInt();
    	 }
       
       System.out.println("Array elements are:");
       
       for(int i=0;i<5;i++) {
    	   System.out.println(array[i]);
       }
       
       System.out.println("-------------------");
       
       System.out.println("Array elements are:");
       for(int i : array) {
    	   System.out.println(i);
       }
            
	}

}
