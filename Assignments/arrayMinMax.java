// find put the minimum and maximum number from the array.

import java.util.Scanner;

public class arrayMinMax {

	  public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc =new Scanner(System.in);
        
		int [] array =new int[5];
		int max=0,min=0;
		
		System.out.printf("Enter the elements :");
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		
		max=array[0];
		min=array[0];
		
		for(int i=0;i<array.length;i++)
		{
			if(max<array[i])
				max=array[i];
			if(min>array[i])
				min=array[i];
		}
		System.out.println("Maximum Element of Array : "+max);
		System.out.println("Minimum Element of Array : "+min);
		 
	}

}
