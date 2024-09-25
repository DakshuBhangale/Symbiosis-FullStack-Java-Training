package Book_Application;

public class Book_Reader implements Runnable {
    Book book;
    
	public Book_Reader(Book book) {
		super();
		this.book   = book;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (book) {
			System.out.println(Thread.currentThread().getName());
			try {
				book.wait();
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println("book Redaing over "+Thread.currentThread().getName());
		}
			
	}
}


