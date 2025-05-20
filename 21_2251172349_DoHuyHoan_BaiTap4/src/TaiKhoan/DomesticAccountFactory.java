package TaiKhoan;

public class DomesticAccountFactory implements AccountFactory {

    @Override
    public SavingsAccount createSavingsAccount() {
        return new ShortTermSavingsAccount(500);
    }

    @Override
    public ConsumerAccount createConsumerAccount() {
        return new StandardConsumerAccount(500);
    }
}
