package ExceptionHandling;

public class Example3 {
	 public static void method2() {
	    	try {
	    		int a=10;
	    		int b = 100/a;
	    		System.out.println("B : "+b);
	    		int c[]= {1,2,3,4,5};
	    		c[15]=15;
	    		System.out.println("c[15]"+c[15]);
	    	}
	    	//Nested catch example
	    	catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
	    		System.out.println(e.getMessage());
	    	}
	    	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        method2();
	}

}
