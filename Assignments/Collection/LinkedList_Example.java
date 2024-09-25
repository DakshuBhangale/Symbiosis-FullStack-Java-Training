package Collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.*;

public class LinkedList_Example {
    public static void method() {
    	String choice;
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Do you want to continue:");
        choice = sc.nextLine();
        if(choice.equals("yes")) {
        	System.out.println("1.Sort Elements.");
        	System.out.println("2.Search Elements.");
        	System.out.println("3.Insert Elements at first postion.");
        	System.out.println("4.Insert Elements at last position.");
        	int choice1;
        	System.out.println("Enter your choice:");
        	choice1 = sc.nextInt();
        	
            LinkedList<Integer> ll = new LinkedList<Integer>();
             ll.add(1);
             ll.add(5);
             ll.add(2);
             ll.add(10);
             ll.add(6);
             	
        	switch(choice1) {
        	case 1 : //sort element
        		Collections.sort(ll);
        		break;
        	
        	case 2://search element
        		int res=5;
        		Collections.binarySearch(ll, res);
        		System.out.println("5 is found "+res);
        		break;
        		
        	case 3://insert at first position
        		ll.add(0, 7);
        		break;
        		
        	case 4://insert at first position
        		ll.add(-1, 8);
        		break;
        		
        	default :
        		System.out.println("Exit the program");
        		break; 
        	}
        }
        else if(choice.equals("No")){
        	System.out.println("Exit");
        }
   }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      method();
	}

}
