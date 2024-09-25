// Example of single inheritance

class Emp12{
       public Emp12() {
    	   System.out.println("Default Constructor : Employee");
       }
       
       public Emp12(int a) {
    	   System.out.println("Constructor with parameter : Employee");
       }
}

class Manager extends Emp12{
	 public Manager() {
		 System.out.println("Default Contructor : Manager");
	 }
	 
	 public Manager(int a, int b) {
		 System.out.println("Constructoe with parameter : Manager");
	 }
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Emp12 e1 = new Emp12();
         System.out.println("-----------------");
         Emp12 e2 = new Emp12(10);
         System.out.println("-----------------");
         Manager m1 = new Manager();
         System.out.println("-----------------");
         Manager m2 = new Manager(20,30);
         System.out.println("-----------------");
         
	}

}
