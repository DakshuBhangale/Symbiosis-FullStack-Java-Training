package InterfaceExample1;

public interface Bank {
    double maxBalance = 2000;
    double limit = 10000;
    
    void deposite(Person p1,double amount);
    void withdraw(Person p1,double amount);
}
