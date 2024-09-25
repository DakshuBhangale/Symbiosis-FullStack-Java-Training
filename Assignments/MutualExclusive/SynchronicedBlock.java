package MutualExclusive;

class MyClassSynchronized{
	private static int count=0;
	public void add(int value) {
		synchronized (this) {
			this.count += value;
			System.out.println("\n"+count);
		}
	}
}

public class SynchronicedBlock extends Thread {
	
	MyClassSynchronized obj = new MyClassSynchronized();
	
	public void run() {
		obj.add(10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SynchronicedBlock obj1 = new SynchronicedBlock();
		SynchronicedBlock obj2 = new SynchronicedBlock();
		obj1.start();
		obj2.start();
	}

}
