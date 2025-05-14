public abstract class AccountFactory {
    public abstract Account createAccount();

    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
    }
}
