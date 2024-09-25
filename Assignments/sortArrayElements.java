// Sort the array elements.

import java.util.Scanner;

public class sortArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] array = new int[5];
        int temp=0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter array elements");
        for (int i = 0; i < array.length; i++) {     
            array[i] = sc.nextInt();  
        }
        
        //Displaying elements of original array    
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < array.length; i++) {     
            System.out.print(array[i] + " ");    
        }  
        
      //Sort the array in ascending order    
        for (int i = 0; i < array.length; i++) {     
            for (int j = i+1; j < array.length; j++) {     
               if(array[i] > array[j]) {    
                   temp = array[i];    
                   array[i] = array[j];    
                   array[j] = temp;    
               }     
            }     
        }
        
        //Displaying elements of array after sorting    
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < array.length; i++) {     
            System.out.print(array[i] + " ");    
        }    
        
        
    }
}
