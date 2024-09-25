package ExceptionHandling;

public class Example4 {

	public static void method1() {
		try {
			int a = 10, b = 0;
			int c= a/b;
			System.out.println(" C :" +c);
		}
		catch(Exception e) {System.out.println(e.getMessage());}
		//without a finally catch can exist
		//without a catch finally can exist
		finally { System.out.println("This is finally block.");}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
    }
}
