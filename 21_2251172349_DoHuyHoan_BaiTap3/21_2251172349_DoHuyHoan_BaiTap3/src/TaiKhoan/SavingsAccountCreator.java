package TaiKhoan;

public class SavingsAccountCreator extends AccountCreator {
    @Override
    public Account createAccount(double initialBalance) {
        return new SavingsAccount(initialBalance);
    }
}
