package Hierarchical_Inheritance_Example2;

public class Vehical {
   private String v_type,v_type1;
   
private String v_number;
   
   public Vehical() {
	   this.v_type = "2 wheeler";
	   this.v_type1 = "4 wheeler";
	   this.v_number = "Mh15JE2367";
   }
   
   public Vehical(String v_type, String v_number) {
     	this.v_type = v_type;
	    this.v_number = v_number;
  }

public String getV_type() {
	return v_type;
}

public void setV_type(String v_type) {
	this.v_type = v_type;
}

public String getV_number() {
	return v_number;
}

public void setV_number(String v_number) {
	this.v_number = v_number;
}

public String getV_type1() {
	return v_type1;
}

public void setV_type1(String v_type1) {
	this.v_type1 = v_type1;
}
   
public String toString() {
	return "Vehical type :" + v_type + "\nVehical NUmber:" + v_number;
} 

}
