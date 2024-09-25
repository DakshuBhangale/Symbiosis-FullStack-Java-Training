package hasAInheritance;

import java.util.Scanner;

class department{
	private int dept_id;
	 String dept_name;
	
    public department() {
    	System.out.println("Department ID and Department Name:");
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter department ID : ");
    	dept_id = sc.nextInt();
    	
    	System.out.println("Enter department name : ");
    	dept_name = sc.next();
	
    }

	@Override
	public String toString() {
		return dept_name +"[dept_id=" + dept_id + ", dept_name=" + dept_name + "]";
	}
}

class employee {
	private department dept = new department();
	private int emp_id;
	private String emp_name;
	
	public employee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id : ");
		emp_id = sc.nextInt();
		
		System.out.println("Enter Employee Name : ");
		emp_name = sc.next();
	}
	
	
	@Override
	public String toString() {
		return "employee [dept=" + dept + ", emp_id=" + emp_id + ", emp_name=" + emp_name + "]";
	}
}

public class Aggrigation_Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	  employee emp = new employee();
      System.out.println(emp);
	}

}
