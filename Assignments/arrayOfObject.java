// create of array of an object and show the data using for loop.

import java.util.Scanner;

public class arrayOfObject {
    
	int studid;
	String studname, address;
	 
    public arrayOfObject(int studid, String studname,String address) {
		this.studid = studid;
		this.studname = studname;
		this.address = address;
		//this.variable_name = Parameter_name.  
	}
	
	public void show() {
		System.out.println("Id : "+studid);
		System.out.println("Name :"+studname);
		System.out.println("Address :"+address);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int studid;
        String studname, address;
        
        Scanner sc= new Scanner(System.in);
        
        arrayOfObject[] List = new arrayOfObject[2];
        
        for(int i=0;i<List.length;i++) {
        	System.out.println("Enter Student Id:");
        	studid = sc.nextInt();
        	
        	System.out.println("Enter Student Name:");
        	studname = sc.next();
        	
        	System.out.println("Enter Student Address:");
        	address = sc.next();
        	
        	List[i] = new arrayOfObject(studid, studname, address) ;
        }
        
        for(int i=0;i<List.length;i++) {
        	List[i].show();
        }
	}

}
