public class AccountComponent {
    private Mediator mediator;
    private double balance;

    public AccountComponent(double initialBalance) {
        this.balance = initialBalance;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void updateBalance(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
