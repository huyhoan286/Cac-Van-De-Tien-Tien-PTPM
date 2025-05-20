package TaiKhoan;

public class InternationalAccountFactory implements AccountFactory {

    @Override
    public SavingsAccount createSavingsAccount() {
        return new LongTermSavingsAccount(1000);
    }

    @Override
    public ConsumerAccount createConsumerAccount() {
        return new InternationalConsumerAccount(1000);
    }
}
