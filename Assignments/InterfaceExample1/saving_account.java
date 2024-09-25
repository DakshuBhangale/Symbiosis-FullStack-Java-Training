package InterfaceExample1;

public class saving_account extends Person implements Bank {
   
	private int acc_no;
	private double balance;
	
	
	public saving_account(String name, String city, int acc_no, double balance) {
		super(name, city);
		this.acc_no = acc_no;
		this.balance = balance;
	}

	public int getAcc_no() {
		return acc_no;
	}    

	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public void deposite(Person p1, double amount) {
		// TODO Auto-generated method stub
		System.out.println("Deposite.");
	}

	@Override
	public void withdraw(Person p1, double amount) {
		// TODO Auto-generated method stub
		System.out.println("withdraw.");
	}

	@Override
	public String toString() {
		return "saving_account [acc_no=" + acc_no + ", balance=" + balance + ", toString()=" + super.toString() + "]";
	}
    
	
  }
