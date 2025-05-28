public class SavingsAccountAdapter implements Account {
    private SavingsTransaction savings;

    public SavingsAccountAdapter(SavingsTransaction savings) {
        this.savings = savings;
    }

    @Override
    public void withdraw(double amount) {
        savings.executeWithdrawal(amount);
    }

    public double getBalance() {
        return savings.getBalance();
    }
}