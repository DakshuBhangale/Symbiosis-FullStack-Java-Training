// accept the state and city name from user for string array.

import java.util.Scanner;

public class array2DStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String[][] cities = new String[2][2];
		String[][] state = new String[2][2];
		 
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.println("Enter the State names");
		 for (int i = 0; i < state.length; i++) {
	            for (int j = 0; j < state.length; j++) {
	               // System.out.print("Enter element at position:");
	                state[i][j] = sc.next();
	            }
	        }
		 
		 System.out.println("Enter the City names:" );
		 for (int i = 0; i < cities.length; i++) {
	            for (int j = 0; j < cities.length; j++) {
	               // System.out.print("Enter element at position:");
	                cities[i][j] = sc.next();
	            }
	        }
		 
		 System.out.println("The 2D array of cities is:");
	        for (int i = 0; i < cities.length; i++) {
	            for (int j = 0; j < cities.length; j++) {
	                System.out.print(cities[i][j] + " ");
	            }
	            System.out.println(); 
	        }
	        
	        System.out.println("---------------------");
	        
	     System.out.println("The 2D array of state is:");
	        for (int i = 0; i < state.length; i++) {
	            for (int j = 0; j < state.length; j++) {
	                System.out.print(state[i][j] + " ");
	            }
	            System.out.println(); 
	        }

	}

}
