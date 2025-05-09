package hethong;

public class Main {
    public static void main(String[] args) {
        BoNho boNho1 = new BoNho("DDR4", 16);
        MayTinh mayTinh1 = new MayTinh("HP EliteBook", boNho1);

        mayTinh1.hienThiThongTin();

        // Kiểm tra xóa
        mayTinh1 = null;
        System.gc(); // Gợi ý cho JVM gọi finalize()
    }
}