package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

class invalidAge extends Exception{
	public invalidAge(String a) {
		super(a);
		//System.out.println("UserException Raised");
	}
}

class invalidLocation extends Exception{
	public invalidLocation(String a) { 
		super(a); 
		//System.out.println("UserException Raised");
}
}

public class Employee {
	
  public static void main(String[] args) {
		// TODO Auto-generated method stub
	  String emp_name;
	  String address;
	  int age;
	  String location;
	  
	  Scanner sc = new Scanner(System.in);
	  try {
		    System.out.println("Enter Employee Name:");
		    emp_name = sc.next();
		    System.out.println("Enter Employee Address:");
		    address = sc.next();
		    System.out.println("Enter Employee Age:");
		    age = sc.nextInt();
		    System.out.println("Enter Employee Location:");
		    location = sc.next();
		    if(age<18 || age>68) {
		    	 throw new invalidAge("Invalid Age");
		     }
		    if(location != "Pune" || location != "Mumbai" || location !="Banglore"){
		    	throw  new invalidLocation("Invalid Location");
		    }
		    else {
		    	throw new InputMismatchException();
		    }
		  }
	  catch(InputMismatchException e) {System.out.println("Wrong Data entry");}
	  catch(invalidAge e1){System.out.println(e1.getMessage());}
	  catch(Exception e2) {System.out.println(e2.getMessage());}
	  
	  }
	}


