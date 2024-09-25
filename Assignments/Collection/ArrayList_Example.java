package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* generic Collection:single data type
 * non generic collection : any data type
 */
class emp {
	String name;
	int id;
	public emp(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "emp [name=" + name + ", id=" + id + "]";
	}
	
	
}
public class ArrayList_Example {
    public static void method1() {
    	ArrayList a1 = new ArrayList();
    	a1.add("abc");
    	a1.add('a');
    	a1.add(123);
    	a1.add(123.321);
    	System.out.println(a1.isEmpty());
    	System.out.println(a1.get(2));
    	System.out.println(a1.getFirst());
    	System.out.println(a1.contains("abc"));
    	int s= a1.size();
    	System.out.println("Size " +s);
    	for(int i=0;i<s;i++) {
    		System.out.println(i);
    	}
    	for(Object o : a1) {
    		System.out.println(o);
    	}
    	System.out.println(a1.removeLast());
    	System.out.println("Size " +s);
    	
    	a1.add(new emp("Dakshu",1));
    	System.out.println(a1);
    	
    	// if we want to create Generic Collection.
    	ArrayList<String> a2 = new ArrayList<String>();
    	a2.add("123");
    	a2.add("abc");
    	//if write like that a2.add(123); then it will display error because we specify the data type as STRING.
    	//also display error a1.add(new emp("Dakshu",1));
    	
    	//iterator and list iterator work same as a for or foreach loop.
    	// it use with generic or non generic collection
    	System.out.println("----------------");
    	Iterator i = a1.iterator();
    	while(i.hasNext()) {
    		System.out.println(i.next());
    	}
    	
    	System.out.println("----------------");
    	ListIterator li = a1.listIterator();
    	while(li.hasNext()) {
    		System.out.println(li.next());
    	}
    	
    	System.out.println("-------Pervious-------");
    	while(li.hasPrevious()) {
    		System.out.println(li.previous());
    	}
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        method1();
	}

}
