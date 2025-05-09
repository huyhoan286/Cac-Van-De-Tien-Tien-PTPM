package TaiKhoan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Số dư ban đầu cố định
        SavingsAccount savingsAccount = new SavingsAccount(500);
        System.out.println("Số dư ban đầu: 500");

        // Lần rút 1
        System.out.print("Nhập số tiền muốn rút: ");
        double soTien1 = scanner.nextDouble();
        try {
            savingsAccount.withdraw(soTien1);
            System.out.println("Rút tiền thành công. Số dư còn lại: " + savingsAccount.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Lần rút 2
        System.out.print("Nhập số tiền muốn rút: ");
        double soTien2 = scanner.nextDouble();
        try {
            savingsAccount.withdraw(soTien2);
            System.out.println("Rút tiền thành công. Số dư còn lại: " + savingsAccount.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // In số dư cuối cùng
        System.out.println("Số dư cuối cùng: " + savingsAccount.getBalance());

        scanner.close();
    }
}
