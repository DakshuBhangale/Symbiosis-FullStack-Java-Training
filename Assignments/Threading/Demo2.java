package Threading;

class A extends Thread {
	public void run() {
		System.out.println("Thread A");
		System.out.println("i in Thread A");
		for(int i=1;i<=5;i++) {
			System.out.println("I = "+i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread A is Finished");
	}
}

class B extends Thread {
	 public void run() {
		 System.out.println("Thread A");
		 System.out.println("i in Thread B");
		 for(int i=1;i<=5;i++) {
				System.out.println("I = "+i);
		 }
		 System.out.println("Thread B is Finished");
	 }
}

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         A threadA = new A();
         B threadB = new B();
         
         //Both the above threads are in runnable state.
         //running state of thread A and B.
         threadA.start();
         
         //Move control to another thread.
         threadA.yield();
         
         //Blocked state of Thread B.
         try {
        	 threadA.sleep(1000);
         }
         catch(InterruptedException e) {
        	 e.printStackTrace();
         }
         
         threadB.start();
         
         System.out.println("Main Thread Finished");
	}

}
