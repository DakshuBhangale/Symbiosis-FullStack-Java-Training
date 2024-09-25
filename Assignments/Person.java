// Array of object for person information.

import java.util.Scanner;

public class Person {
 
	 int id,age;
	 String name;
	 
	public Person(int id, String name,int age) {
		this.id = id;
		this.name = name;
		this.age = age;
		//this.variable_name = Parameter_name.  
	}
	
	public void show() {
		System.out.println("Id : "+id);
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int id,age;
        String name;
        
        Scanner sc= new Scanner(System.in);
        
        Person[] team = new Person[5];
        
        for(int i=0;i<team.length;i++) {
        	System.out.println("Enter Id:");
        	id = sc.nextInt();
        	
        	System.out.println("Enter Name:");
        	name = sc.next();
        	
        	System.out.println("Enter Age:");
        	age = sc.nextInt();
        	
        	team[i] = new Person(id, name, age) ;
        	
        }
        
        for(int i=0;i<team.length;i++) {
        	team[i].show();
        }
        
        for(Person p : team) {
        System.out.println(p);
         }

   }
}
