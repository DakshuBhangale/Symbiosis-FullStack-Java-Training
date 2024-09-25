package Generic;

public class TestGenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//generic class with string type of data member
       GenericClass<String> stringObj = new GenericClass<String>();
       stringObj.set("Hello");
       System.out.println(stringObj.get());
       
     //generic class with string type of data member
       GenericClass<Integer> intObj = new GenericClass<Integer>();
       intObj.set(10);
       System.out.println(intObj.get());
       
     //generic class with person object of data member
       //GenericClass<Integer> personObj = new GenericClass<Integer>();
      // personObj.set(new Person("Ajay","Chennai"));
      // System.out.println(stringObj.get());
	}

}
