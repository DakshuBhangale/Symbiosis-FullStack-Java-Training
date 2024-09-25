//find out the area of an equilateral triangle.

package codeshef_litcode;

import java.util.Scanner;

public class areaEquilateralTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         double side, area;
         
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter the value of side:");
         side = sc.nextDouble();
         
         area = (Math.sqrt(3)/4) * (side * side);
         
         System.out.println("Area of an Equilateral Triangle is :"+area);
	}

}
