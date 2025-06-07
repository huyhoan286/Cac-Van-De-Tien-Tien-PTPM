
public class Main {
    public static void main(String[] args) {
        AccountContext context = new AccountContext(500.0);
        Strategy basic = new BasicWithdrawalStrategy(context);
        Strategy savings = new SavingsWithdrawalStrategy(context);

        System.out.println("So du ban dau: " + context.getBalance());

        // Rút 300 lần 1 với BasicWithdrawalStrategy
        context.setStrategy(basic);
        context.withdraw(300.0);
        System.out.println("So du sau rut 300 voi Basic: " + context.getBalance());

        // Rút 300 lần 2 với SavingsWithdrawalStrategy
        context.setStrategy(savings);
        context.withdraw(300.0);
        System.out.println("So du sau rut 300 voi Savings: " + context.getBalance());
    }
}