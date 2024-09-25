package ExceptionHandling;

public class Example1 {

	public static void main(String[] args) {
		int a = 100, b = 0;
		try {
			int c= a/b;
			System.out.println(" C :" +c);
		}
		catch(Exception e) {
			System.out.println("Divided by zero is not possible.");
			System.out.println(e.getMessage());
		}
		//if we take d and e outside try block then it can return the 
	    //value of the d , e 
		//and
		//if we take d and e in try block then it cannot return the 
		//value of the d , e  
		int d = a + b;
		System.out.println(" D :" +d);
		
		int e = a - b;
		System.out.println(" E :" +e);
				
	}

}
