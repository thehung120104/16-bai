package bai4_chuong4;

import java.util.Scanner;

public class KhachHangThanThiet extends KhachHang{
    // Các thuộc tính bổ sung
    private String loaiKhachHang;
    private double khuyenMai;

    // Constructor
    public KhachHangThanThiet() {
    }

    public KhachHangThanThiet(String maKhachHang, String hoTen, String diaChi, String soDienThoai, String loaiKhachHang, double khuyenMai) {
        super(maKhachHang, hoTen, diaChi, soDienThoai);
        this.loaiKhachHang = loaiKhachHang;
        this.khuyenMai = khuyenMai;
    }

    // Get/set cho các thuộc tính bổ sung
    public String getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public void setLoaiKhachHang(String loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
    }

    public double getKhuyenMai() {
        return khuyenMai;
    }

    public void setKhuyenMai(double khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    // Override phương thức nhập thông tin khách hàng thân thiết
    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap loai khach hang: ");
        loaiKhachHang = scanner.nextLine();
        System.out.print("Nhap muc khuyen mai: ");
        khuyenMai = scanner.nextDouble();
    }

    // Override phương thức hiển thị thông tin khách hàng thân thiết
    @Override
    public void output() {
        super.output();
        System.out.println("Loai khach hang: " + loaiKhachHang);
        System.out.println("Muc khuyen mai: " + khuyenMai);
    }
}

