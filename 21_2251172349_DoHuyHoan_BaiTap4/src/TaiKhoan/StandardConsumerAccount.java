package TaiKhoan;

public class StandardConsumerAccount extends ConsumerAccount {
    public StandardConsumerAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > getBalance()) {
            System.out.println("Không đủ tiền.");
            return;
        }
        setBalance(getBalance() - amount);
        System.out.println("Đã rút " + amount + ". Số dư: " + getBalance());
    }
}
