package Hierachical_Inheritance;

public class Student extends Person {
	private int marks;
	   private String div;
	   
	   public Student() {
		   
	    	  this.div = "class 1";
	    	  this.marks = 89;
	   }
	   
	   public Student(String div, int marks, String name, String city) {
	    	 super(name,city);
		      this.div = div;
	    	  this.marks = marks;
	   }
	   
	   public String getDiv() {
	    	  return div;
	      }
	      
	      public void setName(String div) {
	    	  this.div = div;
	      }
	      
	      public int getMarks() {
	    	  return marks;
	      }
	   
	      public void setCity(int marks) {
	    	  this.marks = marks;
	      }
	      
	      public String toString() {
	    	  return "Division:" + div + ", Marks:" + marks;
	      }
}
