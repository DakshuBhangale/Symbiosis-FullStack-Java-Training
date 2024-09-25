// find out the ASCII value of character.

import java.util.Scanner;

public class characterAsciiValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          char ch;
          
          Scanner sc=new Scanner(System.in);
          
          System.out.println("Enter a character:");
          ch = sc.next().charAt(0);
          
          int ascii = ch;
          
          System.out.println("The ASCII value of " + ch + " is: " + ascii);  
	}

}
