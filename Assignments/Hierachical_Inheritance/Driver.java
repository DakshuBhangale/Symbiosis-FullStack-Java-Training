package Hierachical_Inheritance;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Person p1 =  new Person();
       System.out.println("Person Details :");
       System.out.println(p1);
       //Dynamic allocation of the memory from parent to the child.
       Person p;
       p = new Person("Dakshata","Nashik");
       if(p instanceof Person) {
    	   System.out.println("Person Details : "+p);
       }
       
       p = new Employee(1,"IT","Dakshata","Nashik");
       if(p instanceof Employee) {
    	   System.out.println("Employee Dtails :"+p); 
       }
       
       p = new Student("class2", 80, "Dakshata","Nashik ");
       if(p instanceof Student) {
    	   System.out.println("Student Details :"+p);
       }
	}

}
