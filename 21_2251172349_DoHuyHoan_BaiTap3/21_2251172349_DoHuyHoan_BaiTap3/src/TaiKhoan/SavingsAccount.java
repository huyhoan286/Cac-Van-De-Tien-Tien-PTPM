package TaiKhoan;

public class SavingsAccount extends Account {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Số tiền rút phải là số dương.");
        }
        if (balance - amount < 100) {
            throw new IllegalArgumentException("Rút tiền không thành công, số dư phải còn ít nhất 100.");
        }
        balance -= amount;
    }
}
