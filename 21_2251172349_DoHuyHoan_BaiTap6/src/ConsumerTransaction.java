public class ConsumerTransaction {
    private double balance;

    public ConsumerTransaction(double initialBalance) {
        if (initialBalance < 0) throw new IllegalArgumentException("Số dư ban đầu không thể âm");
        this.balance = initialBalance;
    }

    public void executeWithdrawal(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Số tiền rút không thể âm");
        if (amount > balance) throw new IllegalArgumentException("Số dư không đủ");
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}