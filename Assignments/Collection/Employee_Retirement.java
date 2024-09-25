package Collection;

import java.util.Calendar;
import java.util.Scanner;

public class Employee_Retirement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      
	      System.out.println("Enter your joining Year :");
	      int joiningYear = sc.nextInt();
	      
	      System.out.println("Enter your joining Month :");
	      int joiningMonth = sc.nextInt();
	      
	      System.out.println("Enter your joining Date :");
	      int joiningDay = sc.nextInt();
	      
	      int retirementAge = 58;
	      Calendar joiningDate = Calendar.getInstance();
	      joiningDate.set(joiningYear, joiningMonth-1,joiningDay);
	      joiningDate.add(Calendar.YEAR,retirementAge);
	      
	      int retirementYear = joiningDate.get(Calendar.YEAR);
	      int retirementMonth = joiningDate.get(Calendar.MONTH)+1;
	      int retirementDay = joiningDate.get(Calendar.DAY_OF_MONTH);
	      
	      System.out.println("The employee retirement date is : "+retirementYear+" - "+String.format("%2d", retirementMonth)+" - "+String.format("%2d", retirementDay));
	      
	}

}
