package Collection;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
     String name;
	 int id;
	 int age;
	public Student(String name, int id, int age) {
		
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		if(age == s.age)
			return 0;
		else if(age > s.age)
			return 1;
		else
			return -1; 
		 
	}

}

public class Student_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("Ram ",1 , 22));
		students.add(new Student("Rahul ",2 , 23));
		students.add(new Student("Radha ",3 , 20));
		students.add(new Student("John ",4 , 24));
		students.add(new Student("Kailas ",5 , 19));
		
    	for(Student stud : students) {
    		System.out.println(stud);
    		
    	Collections.sort(students);
    	
    	System.out.println("After Sorting");
    	for(Student s : students) {
    		System.out.println(s);
    	}
    	
    	}
	} 

}
