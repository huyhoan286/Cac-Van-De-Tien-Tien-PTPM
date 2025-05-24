public class AccountDirector {
    private AccountBuilder builder;

    public AccountDirector(AccountBuilder builder) {
        this.builder = builder;
    }

    public void changeBuilder(AccountBuilder builder) {
        this.builder = builder;
    }

    public void makeAccount(String type) {
        builder.reset();
        builder.buildBalance();
        builder.buildType();
        builder.buildMinBalance();
    }
}
