// Example of Array of object.

public class Employee {
    
	int empCode;
	String empName, address;
	
	public Employee(int empCode, String empName,String address) {
		  this.empCode = empCode;
		  this.empName = empName;
		  this.address = address;
	}
	
	public void show() {
		 System.out.println("Employee Code :"+empCode);
		 System.out.println("Employee Name :"+empName);
		 System.out.println("Employee Address :"+address);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
           Employee[] empList = new Employee[2];
           empList[0] = new Employee(1, "Ram", "India");
           empList[1] = new Employee(2, "Sham", "UK");
           empList[0].show();
           empList[1].show();
           
      }

}
