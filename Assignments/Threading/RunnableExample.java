package Threading;

public class RunnableExample implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			try {
				System.out.println("I : "+i);
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         RunnableExample robj = new RunnableExample();
         Thread t1 = new Thread(robj);
         t1.start();
	}

	
}
