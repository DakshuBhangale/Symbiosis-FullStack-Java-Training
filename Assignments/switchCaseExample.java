// Switch Case Example.

import java.util.Scanner;

public class switchCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       char alpha;
       
       Scanner sc= new Scanner(System.in);
       
       System.out.println("Enter a Character:");
       alpha = sc.next().charAt(0);
        
       System.out.println("Char At:"+alpha);
       
       switch(alpha) {
       case 'a':
    	    System.out.println("Alphabet is vowel");
    	    break; 
    	    
       case 'e':
   	    System.out.println("Alphabet is vowel");
   	        break; 
   	 
       case 'i':
   	    System.out.println("Alphabet is vowel"); 
   	        break; 
   	    
       case 'o':
   	    System.out.println("Alphabet is vowel");
   	        break; 
   	        
       case 'u':
   	    System.out.println("Alphabet is vowel");
   	       break;
   	       	
   	   default:
   		   System.out.println("Alphabet is not");
   		   break; 
       }
      
	}

}
