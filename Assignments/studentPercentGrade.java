//find out the total and percent and grade them.

import java.util.Scanner;

public class studentPercentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float AOS, ML, DAA, Python, AI; 
	    double t_marks, percent;
	    
	    Scanner sc =new Scanner(System.in);
	    
	    // Take marks as input of 5 subjects from the user 
	    System.out.println("Input the marks of five subjects \n");
	    System.out.print("Enter marks of AOS:");
	    AOS = sc.nextFloat();
	    System.out.print("Enter marks of ML:");
	    ML = sc.nextFloat();
	    System.out.print("Enter marks of DAA:");
	    DAA = sc.nextFloat();
	    System.out.print("Enter marks of Python:");
	    Python = sc.nextFloat();
	    System.out.print("Enter marks of AI:");
	    AI = sc.nextFloat();
	    
	    // Calculation of total marks and percentage obtained in 5 subjects
	    t_marks = AOS + ML + DAA + Python + AI;
	    percent = (t_marks / 500.0) * 100;
	    // display the results 

        System.out.println("Total marks obtained in 5 different subjects ="+t_marks);    
	    System.out.println("Percentage obtained in these 5 subjects = "+percent);
	    
	    if(percent>=80){
	         System.out.println("Grade is 'A'");
	      }else if(percent>=60 && percent<80){
	    	  System.out.println("Grade is 'B'");
	      }
	      else if(percent>=40 && percent<60){
	    	  System.out.println("Grade is 'C'");
	      }
	      else {
	    	  System.out.println("Grade is 'D'");
	      }
	 }
}
