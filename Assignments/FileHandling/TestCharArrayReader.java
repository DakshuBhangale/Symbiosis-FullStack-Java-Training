package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class TestCharArrayReader {

	static String filename = "G:\\\\Symboisis_Java_FullStack\\\\Demo\\\\src\\\\FileHandling\\\\test.txt";
	static String filename2 = "G:\\Symboisis_Java_FullStack\\Demo\\src\\FileHandling\\a.txt";
	
	public static void method1() {
		char[] array = new char[50];
		try(InputStreamReader input = new InputStreamReader(new FileInputStream(filename))) {
			input.read(array);
			System.out.println(array);
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
	
	public static void method2() {
		try {
			FileOutputStream fout = new FileOutputStream(filename2);
			String str = "Java is OOP";
			byte [] barr =str.getBytes();
			fout.write(barr);
			fout.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public static void method3() {
		try {
			FileOutputStream fout = new FileOutputStream(filename2);
			PrintStream pout = new PrintStream(fout);
			pout.println(1234);
			pout.println("CMCS");
			pout.println("Welcome You!");
			pout.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //method1();
	  //method2();
		method3();
	}

}
