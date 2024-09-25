package Generic;

class GerericConstructor {
    private double v;
    //Generic Constructor
    public <T extends Number>GerericConstructor(T t){
    	v = t.doubleValue();
    }
    
    void show() {
    	System.out.println("Value of v in doublr type is : "+v);
    }
}

public class genericConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Number to Double conversion.");
		
		GerericConstructor obj = new GerericConstructor(10);
		obj.show();
		
		GerericConstructor obj1 = new GerericConstructor(136.5F);
		obj1.show();
		
		//GerericConstructor obj2 = new GerericConstructor("Hello");
		//obj2.show();
	}

}
