
import java.util.Scanner;

public class customerInfo {
    
	private static int custid;
	
	static {
		custid = 100;
	}
	
	static void display( ) {
		String username;
        String password;
        String result;
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Do you want to enter data:");
        result = sc.next();
        
         System.out.println("Enter a username:");
        username = sc.next();
        
        System.out.println("Enter a password:");
        password = sc.next();
        
        if(username.equals("username") && password.equals("password")) {
        	 custid++;
        	 System.out.println("Welcome to System : your cust id"+custid);
         }
        else {
        	System.out.println("Exit.");
        }
	}
	 
	//customerInfo() {
		//  custid++;
	//}
	
	//public String toString() {
		//return "Welcome to System : your cust id"+custid;
	//}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        customerInfo c1 = new customerInfo();
        System.out.println(c1);
        customerInfo.display();
	}

}
