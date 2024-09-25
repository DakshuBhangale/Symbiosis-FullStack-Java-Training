package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/*class userException extends Exception{
	public userException(String a) {
		//super(a);
		System.out.println("UserException Raised");
	}
}*/

class invalidCountryException extends Exception{
     public invalidCountryException(String a) {
	super(a);
	}	
}

public class userDefineException {
    String countryName;
    public void registerUser(String countryName) throws invalidCountryException{
    	if(!countryName.equals("India")) {
    		throw new invalidCountryException("NRI is not allowed");
    	}
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		userDefineException ude = new userDefineException();
		try {
			ude.registerUser("Test");
		 
		}
		catch(invalidCountryException e) {
			System.out.println(e.getMessage());
		}
		
     /* int age;
      Scanner sc = new Scanner(System.in);
      try {
    	     age = sc.nextInt();
    	     if(age<0) {
    	    	 throw new userException("User Exception");
    	      }
    	     else {
    	    	 throw new ArithmeticException();
    	     }
      }
      catch(InputMismatchException e) { System.out.println("Wrong data entry");}
      catch(userException e) {System.out.println(e.getMessage());}
      catch(Exception e1) {System.out.println(e1.getMessage());}*/
	}

}
