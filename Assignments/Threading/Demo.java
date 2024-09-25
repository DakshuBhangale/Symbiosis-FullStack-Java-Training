package Threading;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Thread t = new Thread();
      t.start();
      System.out.println("Method 1 "+t.getName());
      t.setName("MyThread");
      System.out.println("Method 1 "+t.getName());
      System.out.println("Method 2 "+t.getPriority());
      t.setPriority(10);
      System.out.println("Method 2 "+t.getPriority());
      System.out.println("Method 2 "+t.activeCount());
      
      System.out.println("-----------------------");
       
      Thread t1 = new Thread();
      System.out.println("Method 1 "+t1.getName());
      t1.setName("My_Thread");
      System.out.println("Method 1 "+t1.getName());
      System.out.println("Method 2 "+t1.getPriority());
      t1.setPriority(7);
      System.out.println("Method 2 "+t1.getPriority());
      System.out.println("Method 2 "+t1.activeCount());
	}

}
