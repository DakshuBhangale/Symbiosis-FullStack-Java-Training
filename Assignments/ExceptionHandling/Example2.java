package ExceptionHandling;

public class Example2 {
    public static void method1() {
    	
    }
    
    public static void method2() {
    	//multi catch exapmle
    	try {
    		int a=10;
    		int b = 100/a;
    		System.out.println("B : "+b); 
    		int c[]= {1,2,3,4,5};
    		c[15]=15;
    		System.out.println("c[15]"+c[15]);
    	}
    	//if there is no array index 15 because array size is 5 and 0 is not
    	//divided by any number thats why msg display.
    	// if we replace the value of a then it will give value of b and print
    	//msg array index is our of length.
    	//if there is no issue it will run properly.
    	catch(ArithmeticException e) {System.out.println(e.getMessage());}
    	catch(ArrayIndexOutOfBoundsException e1) {System.out.println(e1.getMessage());}
    	catch(Exception e2) {System.out.println(e2.getMessage());}
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         method2();
	}

}
