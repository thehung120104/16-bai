package bai8_chuong4;

import java.util.Scanner;

public class MayChu extends ThietBi{
    // Các thuộc tính bổ sung
    private String loaiMayChu;
    private String chucNang;

    // Constructor
    public MayChu() {
    }

    public MayChu(String maMay, String tenMay, int soLuong, int namSuDung, int namKiemKe, String loaiMayChu, String chucNang) {
        super(maMay, tenMay, soLuong, namSuDung, namKiemKe);
        this.loaiMayChu = loaiMayChu;
        this.chucNang = chucNang;
    }

    // Get/set cho các thuộc tính bổ sung
    public String getLoaiMayChu() {
        return loaiMayChu;
    }

    public void setLoaiMayChu(String loaiMayChu) {
        this.loaiMayChu = loaiMayChu;
    }

    public String getChucNang() {
        return chucNang;
    }

    public void setChucNang(String chucNang) {
        this.chucNang = chucNang;
    }

    // Override phương thức nhập thông tin máy chủ
    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap loai may chu: ");
        loaiMayChu = scanner.nextLine();
        System.out.print("Nhap chuc nang: ");
        chucNang = scanner.nextLine();
    }

    // Override phương thức hiển thị thông tin máy chủ
    @Override
    public void output() {
        super.output();
        System.out.println("Loai may chu: " + loaiMayChu);
        System.out.println("Chuc nang: " + chucNang);
    }
}

