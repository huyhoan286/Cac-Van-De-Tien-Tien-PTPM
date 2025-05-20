package TaiKhoan;

public class Main {
    public static void main(String[] args) {
        // Factory trong nước
        AccountFactory domesticFactory = new DomesticAccountFactory();
        SavingsAccount savings1 = domesticFactory.createSavingsAccount();
        ConsumerAccount consumer1 = domesticFactory.createConsumerAccount();

        System.out.println("== Tài khoản tiết kiệm trong nước ==");
        savings1.withdraw(300);  // Hợp lệ
        savings1.withdraw(200);  // Không hợp lệ

        System.out.println("\n== Tài khoản tiêu dùng trong nước ==");
        consumer1.withdraw(200);  // Hợp lệ
        consumer1.withdraw(400);  // Không đủ

        // Factory quốc tế
        AccountFactory internationalFactory = new InternationalAccountFactory();
        SavingsAccount savings2 = internationalFactory.createSavingsAccount();
        ConsumerAccount consumer2 = internationalFactory.createConsumerAccount();

        System.out.println("\n== Tài khoản tiết kiệm quốc tế ==");
        savings2.withdraw(500);  // Hợp lệ
        savings2.withdraw(600);  // Không hợp lệ

        System.out.println("\n== Tài khoản tiêu dùng quốc tế ==");
        consumer2.withdraw(900);  // Hợp lệ (gồm phí)
        consumer2.withdraw(200);  // Không đủ
    }
}
