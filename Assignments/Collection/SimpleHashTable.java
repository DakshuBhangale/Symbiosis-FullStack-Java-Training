package Collection;

import java.util.Enumeration;
import java.util.Hashtable;

public class SimpleHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Hashtable<String, String> hashtable = new Hashtable<String, String>();
      hashtable.put("1", "First");
      hashtable.put("2", "Second");
      hashtable.put("3", "Third");
      hashtable.put("4", "Fourth");
      hashtable.put("5", "Fifth");
      
      System.out.println("Size of HashTable: "+hashtable.size());
      System.out.println("Hashtable in empty: "+hashtable.isEmpty());
      System.out.println("Elements of Hashtable: ");
      Enumeration value = hashtable.elements();
      while(value.hasMoreElements()) {
    	  System.out.println(value.nextElement());
      }
	}

}
