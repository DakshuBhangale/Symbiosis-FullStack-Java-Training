// area and perimeter of rectangle.

import java.util.Scanner;

public class rectangleAreaPerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double length, width;
        double area, perimeter;
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the length:");
        length = sc.nextDouble();
        
        System.out.println("Enter the width:");
        width = sc.nextDouble();
        
        area = length * width;
        
        perimeter = 2 * (length + width);
        
        System.out.println("Area of rectangale :"+area);
        System.out.println("----------------------");
        System.out.println("Perimeter of rectangale :"+perimeter);
        
	}

}
