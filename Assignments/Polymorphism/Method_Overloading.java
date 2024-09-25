package Polymorphism;

public class Method_Overloading {

	public void calculateAllowances(double basicSalary) {
        double da = basicSalary * 0.10; // 10% of basic salary
        double na = basicSalary * 0.05; // 5% of basic salary
        double ha = basicSalary * 0.20; // 20% of basic salary
        
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Dearness Allowance (DA): " + da);
        System.out.println("National Allowance (NA): " + na);
        System.out.println("House Rent Allowance (HA): " + ha);
    }
    
    // Overloaded method to calculate DA, NA, and HA based on total salary including allowances
    public void calculateAllowances(double basicSalary, double daPercentage, double naPercentage, double haPercentage) {
        double da = basicSalary * daPercentage / 100; // DA based on provided percentage
        double na = basicSalary * naPercentage / 100; // NA based on provided percentage
        double ha = basicSalary * haPercentage / 100; // HA based on provided percentage
        
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Dearness Allowance (DA): " + da);
        System.out.println("National Allowance (NA): " + na);
        System.out.println("House Rent Allowance (HA): " + ha);
    }


public static void main(String[] args) {
	Method_Overloading m = new Method_Overloading();
    
    // Calculate allowances using default percentages
    System.out.println("Using default percentages:");
    m.calculateAllowances(50000); // Basic salary only
    
    System.out.println();
    
    // Calculate allowances using custom percentages
    System.out.println("Using custom percentages:");
    m.calculateAllowances(50000, 12, 6, 25); // Basic salary, DA%, NA%, HA%
}
}

/* import java.util.Scanner;

public class SalaryCalculator {

    public static void calculateSalary(double salary) {
        double DA = salary * 0.1; // Assuming 10% DA
        double NA = salary * 0.05; // Assuming 5% NA
        double HA = salary * 0.03; // Assuming 3% HA

        System.out.println("DA: " + DA);
        System.out.println("NA: " + NA);
        System.out.println("HA: " + HA);
    }

    public static void calculateSalary(double salary, double DA, double NA, double HA) {
        double totalSalary = salary + DA + NA + HA;
        System.out.println("Total Salary: " + totalSalary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the salary: ");
        double salary = scanner.nextDouble();

        calculateSalary(salary);

        System.out.print("Enter DA percentage: ");
        double DA = scanner.nextDouble();

        System.out.print("Enter NA percentage: ");
        double NA = scanner.nextDouble();

        System.out.print("Enter HA percentage: ");
        double HA = scanner.nextDouble();

        calculateSalary(salary, DA, NA, HA);

        scanner.close();
    }
}*/

