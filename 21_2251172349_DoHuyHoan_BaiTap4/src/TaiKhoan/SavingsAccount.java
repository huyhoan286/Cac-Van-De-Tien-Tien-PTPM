package TaiKhoan;

public abstract class SavingsAccount extends Account {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public abstract void withdraw(double amount);
}
