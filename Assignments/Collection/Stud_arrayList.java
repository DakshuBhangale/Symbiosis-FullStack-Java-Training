package Collection;

import java.util.ArrayList;

class Student1 {
    String name;
    int id;
    int age;

    // Constructor
    public Student1(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    // Override toString() for easy printing
    @Override
    public String toString() {
        return "Student{name='" + name + "', id=" + id + ", age=" + age + "}";
    }
}

public class Stud_arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an ArrayList of Student objects
        ArrayList<Student1> students = new ArrayList<>();

        // Add 5 students to the list
        students.add(new Student1("Alice", 101, 20));
        students.add(new Student1("Bob", 102, 22));
        students.add(new Student1("Charlie", 103, 19));
        students.add(new Student1("Diana", 104, 21));
        students.add(new Student1("Eve", 105, 20));

        // Print out the students
        for (Student1 student : students) {
            System.out.println(student);
        }
	}

}
