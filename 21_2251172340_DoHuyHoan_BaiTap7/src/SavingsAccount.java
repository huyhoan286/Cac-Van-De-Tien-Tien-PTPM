public class SavingsAccount implements AccountType {
    private double balance;

    public SavingsAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance - amount >= 100) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Không thể rút, số dư phải >= 100 sau khi rút.");
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
