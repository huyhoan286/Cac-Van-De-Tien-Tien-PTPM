public class ConsumerAccount implements Account {
    private double balance;

    public ConsumerAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Rút thành công. Số dư còn lại: " + balance);
        } else {
            System.out.println("Không đủ tiền để rút.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
