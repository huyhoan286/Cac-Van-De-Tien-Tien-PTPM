package TaiKhoan;

public abstract class ConsumerAccount extends Account {
    public ConsumerAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public abstract void withdraw(double amount);
}
