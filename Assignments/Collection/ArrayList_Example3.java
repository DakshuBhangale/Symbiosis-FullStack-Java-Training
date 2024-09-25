package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Example3 {
    	public static void main(String[] args) {
		// TODO Auto-generated method stub
    		 Scanner sc = new Scanner(System.in);
    	        
    	        // Create a list to store integers
    	        ArrayList<Integer> num = new ArrayList<>();
    	        
    	        System.out.print("Enter the number of elements: ");
    	        int count = sc.nextInt();
    	        
    	        // Accept integers from the user
    	        System.out.println("Enter " + count + " integers:");
    	        for (int i = 0; i < count; i++) {
    	            num.add(sc.nextInt());
    	        }
    	        
    	        // Print only the odd numbers from the list
    	        System.out.println("Odd numbers from the list:");
    	        for (int number : num) {
    	            if (number % 2 != 0) {
    	                System.out.println(number);
    	            }
    	        }	        
	}

}
