public class ConsumerAccountAdapter implements Account {
    private ConsumerTransaction consumer;

    public ConsumerAccountAdapter(ConsumerTransaction consumer) {
        this.consumer = consumer;
    }

    @Override
    public void withdraw(double amount) {
        consumer.executeWithdrawal(amount);
    }

    public double getBalance() {
        return consumer.getBalance();
    }
}