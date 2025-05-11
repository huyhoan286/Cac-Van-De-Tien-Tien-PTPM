package TaiKhoan;

public class SavingsAccount extends Account {

    // Constructor kế thừa từ lớp Account
    public SavingsAccount(double balance) {
        super(balance);  // Gọi constructor của lớp cha
    }

    @Override
    public void withdraw(double amount) {
        // Kiểm tra điều kiện: số dư sau khi rút không được dưới 100
        if (getBalance() - amount < 100) {
            throw new IllegalArgumentException("Rút tiền không thành công, số dư phải không dưới 100.");
        }
        super.withdraw(amount);  // Gọi phương thức withdraw của lớp cha để rút tiền
    }
}
