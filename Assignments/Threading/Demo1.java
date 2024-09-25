package Threading;

public class Demo1 extends Thread {
    @Override
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				System.out.println("I : "+i);
				Thread.sleep(10000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Thread t = new Demo1();
        t.start();
        Demo1 d = new Demo1();
        d.start();
	}

}
