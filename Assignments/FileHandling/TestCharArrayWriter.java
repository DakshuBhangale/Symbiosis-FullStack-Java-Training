package FileHandling;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestCharArrayWriter {
	 static String filename = "G:\\Symboisis_Java_FullStack\\Demo\\src\\FileHandling\\test.txt";
	
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
    	   CharArrayWriter out = new CharArrayWriter();
    	   out.write("My name is Dakshata Bhangale.");
    	   
    	   FileWriter f1 = new FileWriter(filename);
    	   
    	   out.writeTo(f1);
    	   
    	   f1.close();
       }
       catch(IOException e) {}
      
	}

}
