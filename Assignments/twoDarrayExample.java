// two dimentional array example

import java.util.Scanner;

public class twoDarrayExample {
	
	static int rows;
	static int columns;
	static Scanner sc = new Scanner(System.in);
	
	public static void string_array() {
		String[][] array1 = { {"a","b"},{"c","d"}};
		
		for(int i = 0; i < rows; i++){
	        for(int j = 0; j < columns; j++){
	            System.out.println(array1[i][j] + " ");
	        }
	        System.out.println(); 
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.out.print("Enter the number of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        columns = sc.nextInt();
 
        int[][] array = new int[rows][columns];
 
        System.out.println("Enter the elements of the array:");
 
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
               // System.out.print("Enter element at position:");
                array[i][j] = sc.nextInt();
            }
        }
 
        // Output the array
        System.out.println("The entered 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); 
        }
        
        System.out.println("----------------------");
        
        string_array();
   }

}
