// Area and circumference of circle.

import java.util.Scanner;

public class circleAreaCircum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int radius;
        double pi = 3.14, area, circumference;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter radius:");
        radius = sc.nextInt();
        
        area = pi * (radius) * (radius);
        
        circumference = 2 * pi * radius;
        
        System.out.println("Area of circle is :"+area);
        
        System.out.println("--------------------");
        
        System.out.println("Circuference of circle is :"+circumference);
   }

}
