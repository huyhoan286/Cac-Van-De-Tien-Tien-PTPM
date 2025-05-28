public class Main {
    public static void performWithdrawal(Account account, double amount) {
        try {
            account.withdraw(amount);
            System.out.println("Rút tiền thành công. Số dư mới: " + getBalance(account));
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    public static double getBalance(Account account) {
        if (account instanceof SavingsAccountAdapter) {
            return ((SavingsAccountAdapter) account).getBalance();
        } else if (account instanceof ConsumerAccountAdapter) {
            return ((ConsumerAccountAdapter) account).getBalance();
        }
        return 0;
    }

    public static void main(String[] args) {
        // Tạo tài khoản tiết kiệm với số dư ban đầu 500
        SavingsTransaction savingsTransaction = new SavingsTransaction(500);
        Account savingsAccount = new SavingsAccountAdapter(savingsTransaction);

        // Thử rút 300
        performWithdrawal(savingsAccount, 300); // In: Rút tiền thành công. Số dư mới: 200.0

        // Thử rút 300 lần nữa
        performWithdrawal(savingsAccount, 300); // In: Lỗi: Không thể rút tiền, số dư sẽ nhỏ hơn 100

        // In số dư cuối cùng
        System.out.println("Số dư cuối cùng: " + getBalance(savingsAccount)); // In: Số dư cuối cùng: 200.0
    }
}