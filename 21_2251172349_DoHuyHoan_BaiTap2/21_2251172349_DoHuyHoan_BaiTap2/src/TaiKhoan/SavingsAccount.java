package TaiKhoan;

public class SavingsAccount extends Account {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < 100) {
            throw new IllegalArgumentException("Rút tiền không thành công, số dư phải không dưới 100.");
        }
        super.withdraw(amount);
    }
}
