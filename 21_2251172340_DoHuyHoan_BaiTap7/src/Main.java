public class Main {
    public static void main(String[] args) {
        // Tạo tài khoản tiết kiệm với số dư ban đầu 500
        SavingsAccount savings = new SavingsAccount(500);
        Account account = new Account(savings, 500);

        System.out.println("Rút 300 lần 1:");
        account.withdraw(300); // thành công

        System.out.println("Số dư hiện tại: " + account.checkBalance());

        System.out.println("Rút 300 lần 2:");
        account.withdraw(300); // thất bại do vi phạm quy tắc >= 100

        System.out.println("Số dư cuối cùng: " + account.checkBalance());
    }
}
