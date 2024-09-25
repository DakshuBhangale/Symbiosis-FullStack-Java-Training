// Static Block.

public class StaticBlock {

	private int section;//non static instance variable
	private static int srNo;//static or class variable
	
	//static block
	static {
		System.out.println("-------Within Static Block--------");
		srNo = 1000;
	}
	
	//static method
	static void display() {
		//System.out.println("Section:"+section);//cannot access
		System.out.println("Serial No.:"+srNo);
	}
	
	//default constructor
	StaticBlock() {
		System.out.println("-----Within default Constructor-------");
		srNo++;
		section++;
	}
	
	public String toString() {
		return "MyClass [Serial No "+srNo+",Section="+section+"]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StaticBlock o1 = new StaticBlock();
        System.out.println(o1);
        //static method with class name
        StaticBlock.display();
        
        StaticBlock o2 = new StaticBlock();
        System.out.println(o2);
        StaticBlock.display();
        
        StaticBlock o3 = new StaticBlock();
        System.out.println(o3);
        StaticBlock.display();
        
    }

}
