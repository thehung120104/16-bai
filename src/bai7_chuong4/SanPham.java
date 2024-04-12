package bai7_chuong4;

import java.util.Scanner;

public class SanPham {
    protected String maSanPham;
    protected String tenSanPham;
    protected String ngaySanXuat;
    protected String hanSuDung;
    protected String soLo;
    protected String toSanXuat;

    // Constructor
    public SanPham() {
    }

    public SanPham(String maSanPham, String tenSanPham, String ngaySanXuat, String hanSuDung, String soLo, String toSanXuat) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.ngaySanXuat = ngaySanXuat;
        this.hanSuDung = hanSuDung;
        this.soLo = soLo;
        this.toSanXuat = toSanXuat;
    }

    // Get/set cho các thuộc tính
    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(String ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public String getHanSuDung() {
        return hanSuDung;
    }

    public void setHanSuDung(String hanSuDung) {
        this.hanSuDung = hanSuDung;
    }

    public String getSoLo() {
        return soLo;
    }

    public void setSoLo(String soLo) {
        this.soLo = soLo;
    }

    public String getToSanXuat() {
        return toSanXuat;
    }

    public void setToSanXuat(String toSanXuat) {
        this.toSanXuat = toSanXuat;
    }

    // Phương thức nhập thông tin sản phẩm
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma san pham: ");
        maSanPham = scanner.nextLine();
        System.out.print("Nhap ten san pham: ");
        tenSanPham = scanner.nextLine();
        System.out.print("Nhap ngay san xuat: ");
        ngaySanXuat = scanner.nextLine();
        System.out.print("Nhap han su dung: ");
        hanSuDung = scanner.nextLine();
        System.out.print("Nhap so lo: ");
        soLo = scanner.nextLine();
        System.out.print("Nhap to san xuat: ");
        toSanXuat = scanner.nextLine();
    }

    // Phương thức hiển thị thông tin sản phẩm
    public void output() {
        System.out.println("Ma san pham: " + maSanPham);
        System.out.println("Ten san pham: " + tenSanPham);
        System.out.println("Ngay san xuat: " + ngaySanXuat);
        System.out.println("Han su dung: " + hanSuDung);
        System.out.println("So lo: " + soLo);
        System.out.println("To san xuat: " + toSanXuat);
    }
}

