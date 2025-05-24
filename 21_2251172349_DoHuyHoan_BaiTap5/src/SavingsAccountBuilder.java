public class SavingsAccountBuilder implements AccountBuilder {
    private SavingsAccount account;

    @Override
    public void reset() {
        account = new SavingsAccount();
    }

    @Override
    public void buildBalance() {
        account.setBalance(500.0); // Ví dụ số dư khởi tạo
    }

    @Override
    public void buildType() {
        // Không có thuộc tính type nên bỏ trống
    }

    @Override
    public void buildMinBalance() {
        // Logic kiểm tra đã nằm trong phương thức withdraw
    }

    public SavingsAccount getResult() {
        return account;
    }
}
