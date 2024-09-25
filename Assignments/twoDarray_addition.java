//Addition of two diementional array.

import java.util.Scanner;

public class twoDarray_addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row, column, rows, columns;
		
		
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of rows in first matrix:");
        row = sc.nextInt();
        System.out.print("Enter number of columns in first matrix:");
        column = sc.nextInt();
        
        System.out.print("Enter number of rows in second matrix:");
        rows = sc.nextInt();
        System.out.print("Enter number of columns in second matrix:");
        columns = sc.nextInt();
        
        int[][] array = new int[row][column];
        int[][] array1 = new int[rows][columns];
        int[][] array2 = new int[rows][columns];
        
        System.out.println("Enter all the elements of first matrix:");
        for (int i = 0; i < row; i++) 
        {
            for (int j = 0; j < column; j++) 
            {
                array[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter all the elements of second matrix:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                array1[i][j] = sc.nextInt();
            }
        }
        

        for (int i = 0; i < row; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                    array2[i][j] = array[i][j] + array1[i][j];
            }
        }
        
        System.out.println("Matrix after addition:");
        for (int i = 0; i < row; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                System.out.print(array2[i][j]+" ");
            }
            System.out.println("");
        }
	}

}
