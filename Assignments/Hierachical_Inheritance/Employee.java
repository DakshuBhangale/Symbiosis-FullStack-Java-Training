package Hierachical_Inheritance;

public class Employee extends Person {
	private int id;
	  private String dept;
	  
	  public Employee() {
		  
		  this.id = 1;
		  this.dept = "Testing";
	  }
	  
	public Employee(int id, String dept, String name, String city) {
		super(name,city);
		this.id = id;
		this.dept = dept;
	}
	
	 public int getId() {
			return id;
		    }

   public void setId(int id) {
			this.id = id;
		    }

	 public String getDept() {
			return dept;
		   }

	 public void setDept(String dept) {
			this.dept = dept;
		   }

	@Override
	public String toString() {
		return "Employee id=" + id + ", dept=" + dept ;
	}
	 
	 
	 }
