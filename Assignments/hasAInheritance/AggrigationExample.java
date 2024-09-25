//has A  Aggrigation relationship inheritance.

package hasAInheritance;

class calculation{
	 int calArea(int l, int b) {
		 return l*b;
	 }
}

class rectangle{
	calculation cal; //use aggrigation while creating object of one class in other
	String name;
	int area(int l, int b) {
		cal = new calculation();
		int rectArea = cal.calArea(l, b);
		return rectArea;
	}
}

public class AggrigationExample {
    public static void main(String[] args) {
    	rectangle rect = new rectangle();
    	int area = rect.area(20, 30);
    	System.out.println("Area of Rectangle is : "+area);
    }
}
