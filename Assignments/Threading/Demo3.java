package Threading;

class MyThread extends Thread{
	MyThread() {
		super();
	}
	
	MyThread(String name){
		super(name);
	}
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(getName()+" - i : "+i);
		}
	}
	
}

public class Demo3 {

	public static void main(String[] args) {
		MyThread mt1 = new MyThread();
		MyThread mt2 = new MyThread("Child 2");
		
		System.out.println("mt1 thread initial name and priority");
		System.out.println("mt1 Name : "+mt1.getName());
		System.out.println("mt1 Priority : "+mt1.getPriority());
        System.out.println();
        System.out.println("mt2 thread initial name and priority");
		System.out.println("mt2 Name : "+mt2.getName());
		System.out.println("mt2 Priority : "+mt2.getPriority());
		mt1.setName("Child 1");
		mt1.setPriority(6);
		mt2.setPriority(9);
		System.out.println("mt1 thread initial name and priority");
		System.out.println("mt1 Name : "+mt1.getName());
		System.out.println("mt1 Priority : "+mt1.getPriority());
        System.out.println();
        System.out.println("mt2 thread initial name and priority");
		System.out.println("mt2 Name : "+mt2.getName());
		System.out.println("mt2 Priority : "+mt2.getPriority());
		mt1.start();
		mt2.start();
		System.out.println();
		for(int i=0;i<5;i++) {
			System.out.println("Main i : "+i);
		}
		System.out.println( );
	}

}
