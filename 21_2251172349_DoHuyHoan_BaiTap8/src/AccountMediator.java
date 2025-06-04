public class AccountMediator implements Mediator {
    private AccountComponent account;
    private WithdrawComponent withdraw;

    public void setAccount(AccountComponent account) {
        this.account = account;
    }

    public void setWithdraw(WithdrawComponent withdraw) {
        this.withdraw = withdraw;
    }

    @Override
    public void notify(String event, double amount) {
        if (event.equals("withdraw")) {
            reactOnWithdraw(amount);
        }
    }

    private void reactOnWithdraw(double amount) {
        double currentBalance = account.getBalance();
        if (currentBalance - amount >= 100) {
            account.updateBalance(-amount);
            System.out.println("Số dư hiện tại: " + account.getBalance());
        } else {
            System.out.println("Không thể rút, số dư phải >= 100 sau khi rút.");
        }
    }
}
