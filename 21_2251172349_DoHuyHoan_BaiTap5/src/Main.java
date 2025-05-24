public class Main {
    public static void main(String[] args) {
        SavingsAccountBuilder sab = new SavingsAccountBuilder();
        AccountDirector director = new AccountDirector(sab);
        director.makeAccount("savings");

        SavingsAccount acc = sab.getResult();
        System.out.println("Balance: " + acc.getBalance());
        System.out.println("Withdraw 300: " + (acc.withdraw(300) ? "Success" : "Fail"));
        System.out.println("Withdraw 300: " + (acc.withdraw(300) ? "Success" : "Fail"));
        System.out.println("Final Balance: " + acc.getBalance());
    }
}
