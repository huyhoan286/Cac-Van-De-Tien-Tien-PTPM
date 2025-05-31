public class Account {
    private AccountType accountType;
    private double balance;

    public Account(AccountType accountType, double balance) {
        this.accountType = accountType;
        this.balance = balance;
    }

    public boolean withdraw(double amount) {
        if (accountType.withdraw(amount)) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public double checkBalance() {
        return accountType.checkBalance();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            accountType.deposit(amount);
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }
}
