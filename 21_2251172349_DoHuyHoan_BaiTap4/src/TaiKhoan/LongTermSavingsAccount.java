package TaiKhoan;

public class LongTermSavingsAccount extends SavingsAccount {
    public LongTermSavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < 100) {
            System.out.println("Không thể rút. Số dư sau rút phải >= 100.");
            return;
        }
        setBalance(getBalance() - amount);
        System.out.println("Rút thành công. Số dư còn lại: " + getBalance());
    }
}
