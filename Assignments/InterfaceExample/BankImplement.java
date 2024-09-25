package InterfaceExample;

public class BankImplement implements Bank {

	@Override
	public void deposite(Account account, double amount) {
		// TODO Auto-generated method stub
		if(amount > depositeLimit) {
			System.out.println("Deposite limit exceed.");
		}
		else {
			account.setBalance(account.getBalance()+amount);
			System.out.println("Deposite " + amount + " into Account " + account.getAcc_no());
		}
	}

	@Override
	public void withdraw(Account account, double amount) {
		// TODO Auto-generated method stub
		if(account.getBalance() - amount >= minBalancs) {
			account.setBalance(account.getBalance() - amount);
			System.out.println("Withdraw : " + amount + " from Account " + account.getAcc_no());
		}
		else
			System.out.println("Insufficient balance in Account : " + account.getAcc_no());
	}
      
}
