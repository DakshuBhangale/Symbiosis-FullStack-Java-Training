package Hierarchical_Inheritance_Example2;

public class four_wheleer extends Vehical{
    public String name;
    public String colour;
    
    public four_wheleer() {
    	this.name= "BMW";
    	this.colour="Black";
    }
    
	public four_wheleer(String name, String colour) {
		this.name = name;
		this.colour = colour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
 
	public String toString() {
		return "Name of 4 Wheleer:" + name + "\nColour :" + colour + "[Vehical Type:" + getV_type1() + ", Vehical number:" + getV_number() + "]";
	}
}
