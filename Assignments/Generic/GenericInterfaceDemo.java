package Generic;

interface MinMax<T extends Comparable<T>>{
	T min();
	T max();
}

class MinMaxImpl<T extends Comparable<T>> implements MinMax<T>{

	T[] values;
	//Generic constructor
	MinMaxImpl(T[] obj) {
		values = obj;
	}
	
	//Generic method
	@Override
	public T min() {
		// TODO Auto-generated method stub
		T o1 = values[0];
		for(int i=0;i<values.length;i++)
			if(values[i].compareTo(o1) < 0)
				o1 = values[i];
		return o1;
	}

	@Override
	public T max() {
		// TODO Auto-generated method stub
		T o1 = values[0];
		for(int i=0;i<values.length;i++)
			if(values[i].compareTo(o1) > 0)
				o1 = values[i];
		return o1;
	}
	
}

class Person implements Comparable<Person>{
    private String name;
    private String city;
    private int age;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + ", age=" + age + "]";
	}
	
	public Person(String name, String city, int age) {
		super();
		this.name = name;
		this.city = city;
		this.age = age;
	}
	
	public Person() {
		super();
	}
	
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		if(age==o.age)
		    return 0;
		else if(age>o.age)
		    return 1;
		else
			return -1;	
	}
} 

public class GenericInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("------Float-------");
       Float arr[]= {3.11f,5.3f,22.8f,6.0f,88.9f};
       MinMaxImpl<Float> objOne = new MinMaxImpl<Float>(arr);
       //retrieving Minimum and Maximum element from float array
       System.out.println("Minimum value is : "+objOne.min());
       System.out.println("Maximum value is : "+objOne.max());
       
       System.out.println("------String-------");
       String arrTwo[]= {"Ankit","Pooja","Neha","Sakshi","Amol"};
       MinMaxImpl<String> objTwo = new MinMaxImpl<String>(arrTwo);
       //retrieving Minimum and Maximum element from String array
       System.out.println("Minimum value is : "+objTwo.min());
       System.out.println("Maximum value is : "+objTwo.max());
       
       System.out.println("------Person-------");
       Person p[] = new Person[] {
    		   new Person("Nitin","Pune",333),
    		   new Person("Manoj","Mumbai",23),
    		   new Person("Mayur","Delhi",578),
       };
       MinMaxImpl<Person> objThree = new MinMaxImpl<Person>(p);
       //retrieving Minimum and Maximum element from array of person object
       System.out.println("Minimum value is : "+objThree.min());
       System.out.println("Maximum value is : "+objThree.max());
	}

}
