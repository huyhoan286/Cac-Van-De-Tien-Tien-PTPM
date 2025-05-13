package TaiKhoan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sử dụng Factory Method để tạo tài khoản tiết kiệm
        AccountCreator creator = new SavingsAccountCreator();
        Account savingsAccount = creator.createAccount(500);

        System.out.println("Số dư ban đầu: " + savingsAccount.getBalance());

        // Lần rút 1
        System.out.print("Nhập số tiền muốn rút: ");
        double amount1 = scanner.nextDouble();
        try {
            savingsAccount.withdraw(amount1);
            System.out.println("Rút tiền thành công. Số dư còn lại: " + savingsAccount.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Lần rút 2
        System.out.print("Nhập số tiền muốn rút: ");
        double amount2 = scanner.nextDouble();
        try {
            savingsAccount.withdraw(amount2);
            System.out.println("Rút tiền thành công. Số dư còn lại: " + savingsAccount.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // In số dư cuối cùng
        System.out.println("Số dư cuối cùng: " + savingsAccount.getBalance());

        scanner.close();
    }
}
