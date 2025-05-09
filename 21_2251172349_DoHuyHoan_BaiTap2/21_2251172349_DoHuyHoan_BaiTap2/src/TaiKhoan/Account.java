package TaiKhoan;

public class Account {
    private double balance;  // Thuộc tính số dư tài khoản

    // Constructor để khởi tạo số dư
    public Account(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Số dư không thể là số âm.");
        }
        this.balance = balance;
    }

    // Phương thức rút tiền, đảm bảo balance không âm
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Số tiền rút phải là số dương.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Số dư không đủ để rút.");
        }
        balance -= amount;
    }

    // Getter để lấy số dư
    public double getBalance() {
        return balance;
    }
}
