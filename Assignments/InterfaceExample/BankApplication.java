package InterfaceExample;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Bank bank = new BankImplement();//dynamic allocation of parent to the child.
        Account account = new Account(1234567, "DAKSHU", 30000, bank);
        account.deposite(1000);  
        System.out.println(account);
        System.out.println("After Withdraw");
        account.withdraw(200);
        System.out.println(account);
        
	}

}
