package TaiKhoan;

public abstract class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Số dư không hợp lệ.");
        }
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double newBalance) {
        if (newBalance < 0) {
            throw new IllegalArgumentException("Số dư không hợp lệ.");
        }
        this.balance = newBalance;
    }

    public abstract void withdraw(double amount);
}

