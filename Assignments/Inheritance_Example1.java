//Inheritance Example

import java.util.Scanner;

class Person2 {
    String name;
    String address;
    int age;

    // Method to accept personal details
    public void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Address: ");
        address = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextInt();
    }

    // Method to display personal details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
    }
}

// Derived class Student
class Student2 extends Person2 {
	int marathi,hindi,math,english,science;
    double total,percentage;
    char grade;

    // Method to accept marks for 5 subjects
    public void acceptMarks() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a marks of 5 subjects : ");
		System.out.println("Marathi :");
        marathi = sc.nextInt();
        
        System.out.println("Marathi :");
        hindi = sc.nextInt();
        
        System.out.println("Marathi :");
        english = sc.nextInt();
        
        System.out.println("Marathi :");
        math = sc.nextInt();
        
        System.out.println("Marathi :");
        science = sc.nextInt();
        
        // Accepting student number
        System.out.print("Enter Student Number: ");
        double studentNumber = sc.nextInt();
    }

    // Method to calculate percentage and grade
    public void calculatePercentageAndGrade() {
    	total = marathi + hindi + english + math + science;
		percentage = (total/500)*100;
		
		 if (percentage >= 90) {
	            grade = 'A';
	        } else if (percentage >= 75) {
	            grade = 'B';
	        } else if (percentage >= 50) {
	            grade = 'C';
	        } else {
	            grade = 'D';
	        }
    }

    // Method to display marks, percentage, and grade
     public void displayGrade() {
	    System.out.println("Total Marks :"+total);
        System.out.println("Total Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }

    // Method to update student number
      public void updateStudentNumber() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Do you want to update the student number?: ");
            String choice = sc.next();

            if (choice.equals("yes")) {
                   System.out.print("Enter Student new Number: ");
                   double studentNumber1 = sc.nextDouble();
                   System.out.println("Student Number updated successfully.");
            } 
            else {
                   System.out.println("Exiting program.");
                }
       }
}

public class Inheritance_Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an object of Student
        Student2 stud = new Student2();

        // Accept personal details
        stud.acceptDetails();

        // Accept marks
        stud.acceptMarks();

        // Calculate percentage and grade
        stud.calculatePercentageAndGrade();

        // Display personal details
        System.out.println("\n--- Personal Details ---");
        stud.displayDetails();

        // Display marks, percentage, and grade
        System.out.println("\n---Grade ---");
        stud.displayGrade();
        
        stud.updateStudentNumber();
    
	}

}
