package TaiKhoan;

public abstract class Account {
    protected double balance;

    public Account(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Số dư không thể âm.");
        }
        this.balance = balance;
    }

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}
