package Threading;

public class Demo4 extends Thread {
	public Demo4() {}
    public void run() {
    	System.out.println("My thread is in running state.");
    	display();
    	try {
    		for(int i=0;i<2;i++) {
    			System.out.println("Printing the count : "+i);
    			Thread.sleep(1000);
    		}
    	}
    	catch(InterruptedException e) {
    		System.out.println("My Thread Interrupted.");
    		System.out.println("My Thread is running over.");
    	}
    }
    
    public static void display() {
    	System.out.println("Inside Display.");
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Demo4 obj = new Demo4();
         obj.start();
         obj.setName("Object");
         System.out.println(obj.getName());
         obj.setPriority(4);
         //obj.display();
         
         Demo4 obj1 = new Demo4();
         obj1.start();
         obj1.setName("Object 2");
         System.out.println(obj.getName());
         obj1.setPriority(3);
         //obj.stop();
         System.out.println("Thread Object 2 is alive or not : "+obj1.isAlive());
         
         Demo4 cnt = new Demo4();
         try {
        	 while(cnt.isAlive()) {
        		 System.out.println("Main thread will be alive till the child thread is live.");
        		 Thread.sleep(1000);
        	 }
         }
         catch (InterruptedException e) {
        	 System.out.println("Main thread interrupted");
         }
         System.out.println("Main thread running is over");
	}

}
