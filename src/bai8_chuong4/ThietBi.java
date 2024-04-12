package bai8_chuong4;

import java.util.Scanner;

public class ThietBi {
    // Các thuộc tính
    protected String maMay;
    protected String tenMay;
    protected int soLuong;
    protected int namSuDung;
    protected int namKiemKe;

    // Constructor
    public ThietBi() {
    }

    public ThietBi(String maMay, String tenMay, int soLuong, int namSuDung, int namKiemKe) {
        this.maMay = maMay;
        this.tenMay = tenMay;
        this.soLuong = soLuong;
        this.namSuDung = namSuDung;
        this.namKiemKe = namKiemKe;
    }

    // Get/set cho các thuộc tính
    public String getMaMay() {
        return maMay;
    }

    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public String getTenMay() {
        return tenMay;
    }

    public void setTenMay(String tenMay) {
        this.tenMay = tenMay;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getNamSuDung() {
        return namSuDung;
    }

    public void setNamSuDung(int namSuDung) {
        this.namSuDung = namSuDung;
    }

    public int getNamKiemKe() {
        return namKiemKe;
    }

    public void setNamKiemKe(int namKiemKe) {
        this.namKiemKe = namKiemKe;
    }

    // Phương thức nhập thông tin thiết bị
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma may: ");
        maMay = scanner.nextLine();
        System.out.print("Nhap ten may: ");
        tenMay = scanner.nextLine();
        System.out.print("Nhap so luong: ");
        soLuong = scanner.nextInt();
        System.out.print("Nhap nam dua vao su dung: ");
        namSuDung = scanner.nextInt();
        System.out.print("Nhap nam kiem ke: ");
        namKiemKe = scanner.nextInt();
    }

    // Phương thức hiển thị thông tin thiết bị
    public void output() {
        System.out.println("Ma may: " + maMay);
        System.out.println("Ten may: " + tenMay);
        System.out.println("So luong: " + soLuong);
        System.out.println("Nam dua vao su dung: " + namSuDung);
        System.out.println("Nam kiem ke: " + namKiemKe);
    }
}

