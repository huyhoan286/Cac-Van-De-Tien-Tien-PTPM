public interface AccountType {
    boolean withdraw(double amount);
    void deposit(double amount);
    double checkBalance();
}
