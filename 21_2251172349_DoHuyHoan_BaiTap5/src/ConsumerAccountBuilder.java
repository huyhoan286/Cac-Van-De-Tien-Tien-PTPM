public class ConsumerAccountBuilder implements AccountBuilder {
    private ConsumerAccount account;

    @Override
    public void reset() {
        account = new ConsumerAccount();
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
        // Không cần thiết
    }

    public ConsumerAccount getResult() {
        return account;
    }
}
