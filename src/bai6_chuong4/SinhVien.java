package bai6_chuong4;

import java.util.Scanner;

public class SinhVien {
    // Các thuộc tính
    protected String maSV;
    protected String hoTen;
    protected String lop;
    protected String chuyenNganh;
    protected String diaChi;
    protected String soDienThoai;

    // Constructor
    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, String lop, String chuyenNganh, String diaChi, String soDienThoai) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.chuyenNganh = chuyenNganh;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    // Get/set cho các thuộc tính
    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
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

    // Phương thức nhập thông tin sinh viên
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        maSV = scanner.nextLine();
        System.out.print("Nhap ho ten sinh vien: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhap lop: ");
        lop = scanner.nextLine();
        System.out.print("Nhap chuyen nganh: ");
        chuyenNganh = scanner.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = scanner.nextLine();
        System.out.print("Nhap so dien thoai: ");
        soDienThoai = scanner.nextLine();
    }

    // Phương thức hiển thị thông tin sinh viên
    public void output() {
        System.out.println("Ma sinh vien: " + maSV);
        System.out.println("Ho ten sinh vien: " + hoTen);
        System.out.println("Lop: " + lop);
        System.out.println("Chuyen nganh: " + chuyenNganh);
        System.out.println("Đia chi: " + diaChi);
        System.out.println("So dien thoai: " + soDienThoai);
    }
}

