//write a java program to create two array one contain vowel and second contain consonants, take string as a input from user
//find out how any consonants and how many consonants in the string.

package codeshef_litcode;

import java.util.Scanner;

public class VowelConsonentCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input;
		 char[] vowels = {'a', 'e', 'i', 'o', 'u'};
	     char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};

	     Scanner sc = new Scanner(System.in);

	     System.out.println("Enter a string:");
	     input = sc.next();
	     
	     int vowelCount = 0;
	     int consonantCount = 0;
	     
	     for(int i=0;i<input.length();i++) {
	    	 if(input.charAt(i)=='a' || input.charAt(i)=='e' || input.charAt(i)=='i' || input.charAt(i)=='o' || input.charAt(i)=='u') {
	    		 vowelCount++;
	    	 }
	    	 else {
	    		 consonantCount++;
	    	 }
	      }
	     
	     System.out.println("Number of Vowels:"+vowelCount);
	     System.out.println("Number of Consonants:"+consonantCount);
     }
}
