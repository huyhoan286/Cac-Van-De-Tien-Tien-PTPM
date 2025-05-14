public class SavingsAccount implements Account {
    private double balance;

    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Không thể rút. Số dư sau rút phải lớn hơn hoặc bằng 100.");
        } else {
            balance -= amount;
            System.out.println("Rút thành công. Số dư còn lại: " + balance);
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
