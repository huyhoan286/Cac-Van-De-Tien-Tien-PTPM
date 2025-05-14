public class Main {
    public static void main(String[] args) {
        // Tài khoản tiết kiệm
        AccountFactory savingsFactory = new SavingsAccountFactory();
        Account savings = savingsFactory.createAccount();

        System.out.println("--- Tài khoản tiết kiệm ---");
        savingsFactory.withdraw(savings, 300);
        savingsFactory.withdraw(savings, 300);
        System.out.println("Số dư cuối cùng: " + savings.getBalance());

        // Tài khoản tiêu dùng
        AccountFactory consumerFactory = new ConsumerAccountFactory();
        Account consumer = consumerFactory.createAccount();

        System.out.println("\n--- Tài khoản tiêu dùng ---");
        consumerFactory.withdraw(consumer, 300);
        consumerFactory.withdraw(consumer, 300);
        System.out.println("Số dư cuối cùng: " + consumer.getBalance());
    }
}
