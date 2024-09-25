package Book_Application;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Book book = new Book("My Book on Java");
        
        Book_Reader readerA = new Book_Reader(book);
        Book_Reader readerB = new Book_Reader(book);
        
        Thread Athread = new Thread(readerA, "Ankit");
        Thread Bthread = new Thread(readerA, "Diksha");
        
        Athread.start();
        Bthread.start();
        
        try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
        
        BookWrite writer = new BookWrite(book);
        Thread bookwriterthread = new Thread(writer);
        bookwriterthread.start();
	}

}
