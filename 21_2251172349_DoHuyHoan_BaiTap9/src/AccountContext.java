
public class AccountContext {
    private Strategy strategy;
    private double balance;

    public AccountContext(double initialBalance) {
        this.balance = initialBalance;
        this.strategy = null;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void withdraw(double amount) {
        if (strategy != null && strategy.withdraw(amount)) {
            balance -= amount;
            System.out.println("Rút " + amount + " lần 1:");
            System.out.println("Số dư hiện tại: " + balance);
        } else {
            System.out.println("Rút " + amount + " lần 2:");
            System.out.println("Không thể rút, số dư phải >= 100 sau khi rút.");
            System.out.println("Số dư cuối cùng: " + balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}