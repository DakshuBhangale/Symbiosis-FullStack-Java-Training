package InterfaceExample;

public class Account {
     private int acc_no;
     private String custName;
     private double balance;
     private Bank bank; // Has a relationship(Bank has a accounts)
     
	public Account(int acc_no, String custName, double balance, Bank bank) {
		super();
		this.acc_no = acc_no;
		this.custName = custName;
		this.balance = balance;
		this.bank = bank;
	}

	public int getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	@Override
	public String toString() {
		return "Account [acc_no=" + acc_no + ", custName=" + custName + ", balance=" + balance + ", bank=" + bank + "]";
	}
     
    public void deposite(double amount) {
    	bank.deposite(this, amount);
    }  
    
    public void withdraw(double amount) {
    	bank.withdraw(this, amount);
    }  
    
    
}
