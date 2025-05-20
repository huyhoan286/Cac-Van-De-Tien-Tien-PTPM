package TaiKhoan;

public class InternationalConsumerAccount extends ConsumerAccount {
    public InternationalConsumerAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        double fee = 5.0; // phí rút tiền quốc tế
        double total = amount + fee;

        if (total > getBalance()) {
            System.out.println("Không đủ tiền (bao gồm phí).");
            return;
        }

        setBalance(getBalance() - total);
        System.out.println("Đã rút " + amount + " (+phí 5). Số dư: " + getBalance());
    }
}
