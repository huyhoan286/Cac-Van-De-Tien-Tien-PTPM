package TaiKhoan;

public interface AccountFactory {
    SavingsAccount createSavingsAccount();
    ConsumerAccount createConsumerAccount();
}

