public class SavingsAccountFactory extends AccountFactory {
    @Override
    public Account createAccount() {
        return new SavingsAccount(500); // Tạo tài khoản tiết kiệm với số dư 500
    }
}
