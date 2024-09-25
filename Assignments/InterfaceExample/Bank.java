package InterfaceExample;

public interface Bank {
        double minBalancs = 1000;
        double rateofinterest = 7.5;
        double depositeLimit = 25000;
        
        void deposite(Account account, double amount);
        void withdraw(Account account, double amount);
        
        
}
