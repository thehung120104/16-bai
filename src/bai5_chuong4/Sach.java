package bai5_chuong4;

import java.util.Scanner;

public class Sach {
    protected String maSach;
    protected String tenSach;
    protected String tacGia;
    protected int namXuatBan;
    protected int soLuong;
    protected double donGia;

    // Constructor
    public Sach() {
    }

    public Sach(String maSach, String tenSach, String tacGia, int namXuatBan, int soLuong, double donGia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    // Get/set cho các thuộc tính
    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    // Phương thức nhập thông tin sách
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma sach: ");
        maSach = scanner.nextLine();
        System.out.print("Nhap ten sach: ");
        tenSach = scanner.nextLine();
        System.out.print("Nhap ten tac gia: ");
        tacGia = scanner.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        namXuatBan = scanner.nextInt();
        System.out.print("Nhap so luong: ");
        soLuong = scanner.nextInt();
        System.out.print("Nhap don gia: ");
        donGia = scanner.nextDouble();
    }

    // Phương thức hiển thị thông tin sách
    public void output() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("So luong: " + soLuong);
        System.out.println("Don gia: " + donGia);
    }
}




// Class chính


