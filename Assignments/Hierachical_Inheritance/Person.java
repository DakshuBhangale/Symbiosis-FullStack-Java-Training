package Hierachical_Inheritance;

class Person {
      private String name;
      private String city;
      
      public Person() {
    	 
    	  this.name = "Dakshata";
    	  this.city = "Nashik" ;
      }
      
      public Person(String name, String city) {
    	  this.name = name;
    	  this.city = city;
      }
      
      public String getName() {
    	  return name;
      }
      
      public void setName(String name) {
    	  this.name = name;
      }
      
      public String getCity() {
    	  return city;
      }
   
      public void setCity(String city) {
    	  this.city = city;
      }
      
      public String toString() {
    	  return "Name:" + name + ", City:" + city;
      }
}




