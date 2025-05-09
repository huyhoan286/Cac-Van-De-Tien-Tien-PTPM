package hethong;

public class MayTinh {
    private String ten;
    private BoNho boNho;

    public MayTinh(String ten, BoNho boNho) {
        this.ten = ten;
        this.boNho = boNho;
    }

    public void hienThiThongTin() {
        System.out.println("Tên máy tính: " + ten);
        System.out.println("Thông tin bộ nhớ:\n" +  boNho.toString());
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Máy tính \"" + ten + "\" bị xóa. Bộ nhớ cũng sẽ được xóa.");
        boNho = null; // Dọn dẹp
        super.finalize();
    }
}