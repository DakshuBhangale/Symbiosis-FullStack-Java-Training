// Average of elements using array.

import java.util.Scanner;

public class averageofNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] array = new int[5];
        int sum =0, average;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the array elements:");
        
        for(int i=0;i<array.length;i++) {
            array[i] = sc.nextInt();
        }
        
        for(int i=0;i<array.length;i++) {
            sum = sum + array[i];
        }
        
        System.out.println("Addition of array elements :"+sum);
        
        System.out.println("--------------------");
        
        average = sum / array.length;
        
        System.out.println("Average of elements:"+average);
	}

}
