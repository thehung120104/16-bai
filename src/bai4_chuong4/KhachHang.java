package bai4_chuong4;

import java.util.Scanner;

public class KhachHang {
    // Các thuộc tính
    protected String maKhachHang;
    protected String hoTen;
    protected String diaChi;
    protected String soDienThoai;

    // Constructor
    public KhachHang() {
    }

    public KhachHang(String maKhachHang, String hoTen, String diaChi, String soDienThoai) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    // Get/set cho các thuộc tính
    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    // Phương thức nhập thông tin khách hàng
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma khach hang: ");
        maKhachHang = scanner.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = scanner.nextLine();
        System.out.print("Nhap so dien thoai: ");
        soDienThoai = scanner.nextLine();
    }

    // Phương thức hiển thị thông tin khách hàng
    public void output() {
        System.out.println("Ma khach hang: " + maKhachHang);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Đia chi: " + diaChi);
        System.out.println("So dien thoai: " + soDienThoai);
    }
}

