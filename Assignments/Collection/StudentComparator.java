package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student12{
	int id,age;
	String name;
	public Student12(int id, int age, String name) {
		
		this.id = id;
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student12 [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	
	
}

class AgeComparator implements Comparator<Student12>{

	@Override
	public int compare(Student12 s1, Student12 s2) {
		// TODO Auto-generated method stub
		if(s1.age == s2.age)
			return 0;
		else if(s1.age > s2.age)
			return 1;
		else
			return -1;
	}
}

class NameComparator implements Comparator<Student12>{

	@Override
	public int compare(Student12 s1, Student12 s2) {
		// TODO Auto-generated method stub
		return s1.name.compareTo(s2.name);
	}
}

public class StudentComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Student12> a1 = new ArrayList<Student12>();
       a1.add(new Student12(101, 25, "Rahul"));
       a1.add(new Student12(108, 23, "Abhi"));
       a1.add(new Student12(105, 22, "Jasmin"));
       
       System.out.println("Sorting by Name:");
       Collections.sort(a1, new NameComparator());
       
       for(Student12 s : a1) {
    	   System.out.println(s);
       }
       
       System.out.println("Sorting by Age:");
       Collections.sort(a1, new AgeComparator());
       
       for(Student12 s : a1) {
    	   System.out.println(s);
       }
	}

}


