package Collection;

import java.util.Hashtable;
import java.util.Scanner;

//Student class to store student information
class Student2 {
 private String name;
 private String dateOfBirth;
 private String stream;

 public Student2(String name, String dateOfBirth, String stream) {
     this.name = name;
     this.dateOfBirth = dateOfBirth;
     this.stream = stream;
 }

 // Override toString() to display student details
 @Override
 public String toString() {
     return "Name: " + name + ", Date of Birth: " + dateOfBirth + ", Stream: " + stream;
 }
}
 
public class Student_Hashtable {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Hashtable with Integer as key (roll number) and Student as value
        Hashtable<Integer, Student2> studentTable = new Hashtable<>();
        Scanner sc = new Scanner(System.in);

        // Add sample student data
        studentTable.put(101, new Student2("Alice", "1999-05-10", "Computer Science"));
        studentTable.put(102, new Student2("Bob", "1998-11-21", "Mathematics"));
        studentTable.put(103, new Student2("Charlie", "2000-02-14", "Physics"));

        // Display all student data
        System.out.println("Student Records:");
        for (Integer rollNo : studentTable.keySet()) {
            System.out.println("Roll No: " + rollNo + " - " + studentTable.get(rollNo));
        }

        // Option to search a student by roll number
        System.out.print("\nEnter a roll number to search for a student: ");
        int rollNo = sc.nextInt();
        if (studentTable.containsKey(rollNo)) {
            System.out.println("Student Details: " + studentTable.get(rollNo));
        } else {
            System.out.println("Student with roll number " + rollNo + " not found.");
        }


	}

}
