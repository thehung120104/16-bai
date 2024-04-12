package bai9_chuong4;

import java.util.Scanner;

public class Nguoi {
    protected String hoTen;
    protected String gioiTinh;
    protected String ngaySinh;

    public Nguoi() {
    }

    public Nguoi(String hoTen, String gioiTinh, String ngaySinh) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void inPut() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhap gioi tinh: ");
        gioiTinh = scanner.nextLine();
        System.out.print("Nhap ngay sinh: ");
        ngaySinh = scanner.nextLine();
    }

    public void outPut() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("Ngay sinh: " + ngaySinh);
    }
}

