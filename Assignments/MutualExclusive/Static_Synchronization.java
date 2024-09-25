package MutualExclusive;

class myTable{
	public synchronized static void testtable() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			}
			catch(InterruptedException e) {}
		}
	}
}

class thread1 extends Thread{
	@Override
	public void run() {
		myTable.testtable();
	}
}

class thread2 extends Thread{
	@Override
	public void run() {
		myTable.testtable();
	}
}

public class Static_Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      thread1 t1 = new thread1();
      thread2 t2 = new thread2();
      t1.start();
      t2.start();
	}

}
