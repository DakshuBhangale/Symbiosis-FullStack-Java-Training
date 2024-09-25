//addition of 2D array elements.

import java.util.Scanner;

public class array2DElementsAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		Scanner sc = new Scanner(System.in);
		int r1,c1,sum=0;
		
	    System.out.print("Enter the number of rows: ");
        r1 = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        c1 = sc.nextInt();
	    
        int array[][] = new int [r1][c1];
        
        System.out.println("Enter all the elements of first matrix:");
        for (int i = 0; i < r1; i++) 
        {
            for (int j = 0; j < c1; j++) 
            {
                array[i][j] = sc.nextInt();
            }
        }
	       
	       System.out.println("print 2D array");
	       
	       for(int i=0;i<r1;i++) {
	    	   for(int j=0;j<c1;j++) {
	   		       System.out.print(array[i][j]+" ");
	    	   } 
	    	  System.out.println();
	        }
	       
	       System.out.println("--------------------");
	       
	       for (int i = 0; i < r1; i++) 
	        {
	            for (int j = 0; j < c1; j++) 
	            {
	                
	                    sum = sum + array[i][j];
	                
	            }
	        }
	       
	       System.out.println("Sum ="+sum);
	}

}
