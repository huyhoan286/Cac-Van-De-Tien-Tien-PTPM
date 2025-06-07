
public class BasicWithdrawalStrategy implements Strategy {
    private AccountContext context;

    public BasicWithdrawalStrategy(AccountContext context) {
        this.context = context;
    }

    @Override
    public boolean withdraw(double amount) {
        double balance = context.getBalance();
        return amount >= 0 && balance - amount >= 0;
    }
}