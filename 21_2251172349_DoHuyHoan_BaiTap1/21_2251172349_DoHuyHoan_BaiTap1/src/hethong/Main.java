package hethong;

public class Main {
    public static void main(String[] args) {
        MayTinh mayTinh1 = new MayTinh("HP EliteBook", "DDR4", 16);
        mayTinh1.hienThiThongTin();

        // Kiểm tra xóa
        mayTinh1 = null;
        System.gc(); // Gợi ý cho JVM gọi finalize()
    }
}
