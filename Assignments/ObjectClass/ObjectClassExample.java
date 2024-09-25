package ObjectClass;

import java.lang.reflect.Constructor;

//cloneExample using cloneable
class cloneExample implements Cloneable{
	String name;
	int age;
	
	public static void testClone() {
    try {
    		cloneExample obj1 = new cloneExample();
            obj1.name = "Dakshu";
            obj1.age = 14;
    		// create a clone of obj1
            
            cloneExample obj2;
    		obj2 = (cloneExample)obj1.clone();   
    		
    		// print the variables using obj2
    		System.out.println(obj2.name); 
    		System.out.println(obj2.age); 
    		
    		//changing values of name
    		//using obj2
    		obj2.name = "Radha";
    		System.out.println(obj2.name);
    		
    		//check if value associated
    		//with obj1 is changed
    		System.out.println(obj1.name);
    		System.out.println(obj1.getClass());
    	}
    	catch(CloneNotSupportedException e) {
    		e.printStackTrace();
    	}
    }
}
public class ObjectClassExample {
    String str="Hello";
    
    public static void method1() {
    	ObjectClassExample obj = new ObjectClassExample();
    	System.out.println(obj.str);
    }
    
    public static void method2() {
    	try {
    		ObjectClassExample obj = ObjectClassExample.class.newInstance();
    	    System.out.println(obj.str);
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}	
    }
    
    public static void method3() {
    	try {
    		Constructor<ObjectClassExample> obj = ObjectClassExample.class.getConstructor();
    		ObjectClassExample obj1 = obj.newInstance();
    	    System.out.println(obj1.str);
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    
    public static void equalsMethod() {
    	String uname = "admin", password = "admin";
    	if(uname.equals("admin")) {
    		System.out.println("User name is admin.");
    	}
    }
    
    public static void objectMethod() {
    	ObjectClassExample obj1 = new ObjectClassExample();
    	ObjectClassExample obj2 = new ObjectClassExample();
    	ObjectClassExample obj3 = new ObjectClassExample();
    	
    	System.out.println("Object 1 "+obj1.hashCode());
    	System.out.println("Object 2 "+obj2.hashCode());
    	System.out.println("Object 3 "+obj3.hashCode());
    	
    	System.out.println(obj1.equals(obj2));
    	System.out.println(obj1.equals(obj3));
    	System.out.println(obj2.equals(obj2));
    	System.out.println(obj2.equals(obj3));
    	
    	String str1= "Dakshu", str2= " Bhangale";
    	System.out.println(str1.equals(str2));
    	System.out.println("str1. hashcode : "+str1.hashCode());
    	System.out.println("str2. hashcode : "+str2.hashCode());
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       method1();
       method2();
       method3();
       equalsMethod();
       objectMethod();
       cloneExample cobj = new cloneExample();
       cobj.testClone();
	}

}
