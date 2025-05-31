public class ConsumerAccount implements AccountType {
    private double balance;

    public ConsumerAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Không đủ tiền để rút.");
            return false;
        }
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}
