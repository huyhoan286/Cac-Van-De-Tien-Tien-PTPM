public class SavingsTransaction {
    private double balance;

    public SavingsTransaction(double initialBalance) {
        if (initialBalance < 0) throw new IllegalArgumentException("Số dư ban đầu không thể âm");
        this.balance = initialBalance;
    }

    public void executeWithdrawal(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Số tiền rút không thể âm");
        double newBalance = balance - amount;
        if (newBalance < 100) throw new IllegalArgumentException("Không thể rút tiền, số dư sẽ nhỏ hơn 100");
        balance = newBalance;
    }

    public double getBalance() {
        return balance;
    }
}