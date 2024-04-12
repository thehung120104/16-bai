package bai10_chuong4;

import java.util.Scanner;

public class SinhVien {
    private String hoTen;
    private int namSinh;
    private String lop;

    // Constructor không tham số
    public SinhVien() {}

    // Constructor có tham số
    public SinhVien(String hoTen, int namSinh, String lop) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.lop = lop;
    }

    // Getter và setter
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    // Phương thức nhập thông tin sinh viên
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhap nam sinh: ");
        namSinh = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap lop: ");
        lop = scanner.nextLine();
    }

    // Phương thức xuất thông tin sinh viên
    public void output() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Nam sinh: " + namSinh);
        System.out.println("Lop: " + lop);
    }
}


