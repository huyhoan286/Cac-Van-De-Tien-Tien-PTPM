package hethong;

public class BoNho {
    private String loai;
    private int dungLuong;

    public BoNho(String loai, int dungLuong) {
        this.loai = loai;
        this.dungLuong = dungLuong;
    }

    public String getLoai() {
        return loai;
    }

    public int getDungLuong() {
        return dungLuong;
    }

    @Override
    public String toString() {
        return "Loại bộ nhớ: " + loai + "\n" +
                "Dung lượng: " + dungLuong + "GB";
    }
}