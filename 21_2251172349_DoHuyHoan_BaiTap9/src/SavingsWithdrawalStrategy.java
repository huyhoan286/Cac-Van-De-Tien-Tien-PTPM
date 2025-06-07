
public class SavingsWithdrawalStrategy implements Strategy {
    private AccountContext context;

    public SavingsWithdrawalStrategy(AccountContext context) {
        this.context = context;
    }

    @Override
    public boolean withdraw(double amount) {
        double balance = context.getBalance();
        return amount >= 0 && balance - amount >= 100;
    }
}