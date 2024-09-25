//check the character is vowel or consonents.

import java.util.Scanner;

public class vowel_or_consonents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char alpha;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter a character");
		alpha = sc.nextLine().charAt(0);
		
		/*if(alpha == 'a')
		{
			System.out.println("Alphabet is Vowel");
	    }
		else if(alpha == 'e') {
			System.out.println("Alphabet is Vowel");
		}
		else if(alpha == 'i') {
			System.out.println("Alphabet is Vowel");
		}
		else if(alpha == 'o') {
			System.out.println("Alphabet is Vowel");
		}
		else if(alpha == 'u') {
			System.out.println("Alphabet is Vowel");
		}
		else {
			System.out.println("Alphabet is Consonent");
		}*/
    
		if(alpha == 'a' || alpha == 'e'|| alpha == 'i'|| alpha == 'o'|| alpha == 'u' ) {
			System.out.println("Alphabet is Vowel");
		}
		else {
			System.out.println("Alphabet is Consonent");
		}
	}

}
