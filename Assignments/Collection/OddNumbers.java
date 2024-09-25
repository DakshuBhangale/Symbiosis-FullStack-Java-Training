package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Scanner object for input
        Scanner sc = new Scanner(System.in);
        
        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Ask the user for the number of integers they want to enter
        System.out.print("Enter the number of integers: ");
        int n = sc.nextInt();

        // Accept user input to populate the ArrayList
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            numbers.add(number);
        }

        // Display only the odd numbers from the list
        System.out.println("Odd numbers in the list are:");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
	}

}
