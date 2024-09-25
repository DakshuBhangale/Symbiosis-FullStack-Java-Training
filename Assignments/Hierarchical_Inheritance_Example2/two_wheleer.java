package Hierarchical_Inheritance_Example2;

public class two_wheleer extends Vehical {
   private String name;
   private String mode;

   public two_wheleer() {
	   this.name = "Jupiter";
	   this.mode = "pertol";
   }
   
   public two_wheleer(String name, String mode) {
	this.name = name;
	this.mode = mode;
   }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getMode() {
	return mode;
}

public void setMode(String mode) {
	this.mode = mode;
}
   
public String toString() {
	return "Name of 2 Wheleer:" + name + "\nmode :" + mode + "[Vehical Type:" + getV_type() + ", Vehical number:" + getV_number() + "]";
}
    
}
