package MutualExclusive;

//Synchronized method.

class person{
	synchronized
	public void displayName(String name) {
		for(int i=0;i<3;i++) {
			System.out.println(name);
		}
	}
}

class student extends Thread{
	person p;
	String name;
	
	public student(person p1, String Myname) {
		this.p = p1;
		this.name = Myname;
	}
	
	public void run() {
		p.displayName(name);
	}	
}

public class Syncronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      person p = new person();
      student s = new student(p, "Ram");
      student s1 = new student(p, "Sham");
      
      s.start();
      s1.start();
	}

}
