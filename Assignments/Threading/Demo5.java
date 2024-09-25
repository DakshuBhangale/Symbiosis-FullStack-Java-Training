package Threading;

import java.util.Scanner;

class Even_Odd implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		/*int num;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
			if(num % 2 == 0) {
				System.out.println(num+" is a even number.");
			}
			else {
				System.out.println(num+" is a odd number.");
			}*/
			 
		 for(int i=0;i<20;i++){
		     if(i % 2 == 0) {
				System.out.println(i+" : Even ");
			}
			else {
				System.out.println(i+" : Odd ");
			
		 }
		 
		}
	}
}

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Even_Odd o = new Even_Odd();
        Thread t = new Thread(o);
        t.start();
	}

}
