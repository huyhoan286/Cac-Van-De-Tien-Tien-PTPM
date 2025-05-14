public class ConsumerAccountFactory extends AccountFactory {
    @Override
    public Account createAccount() {
        return new ConsumerAccount(500); // Tạo tài khoản tiêu dùng với số dư 500
    }
}
