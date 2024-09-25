// array reverse example.

import java.util.Scanner;

public class arrayReverse {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int [] array = new int[5];
         
         Scanner sc= new Scanner(System.in);
         
         System.out.println("Enter the array elements:");
         
         for(int i=0;i<5;i++) {
        	 array[i]=sc.nextInt();
          }
         
         System.out.println("Array in reverse order: ");  
         //Loop through the array in reverse order  
         for (int i = array.length-1; i >= 0; i--) {  
             System.out.print(array[i] + " ");  
         }
         
         System.out.println("----------------------");
         
         
     }
}
