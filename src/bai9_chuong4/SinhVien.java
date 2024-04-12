package bai9_chuong4;

import java.util.Scanner;

public class SinhVien  extends  Nguoi{
    private String maSinhVien;
    private String lop;
    private double diemTrungBinh;

    public SinhVien() {
    }

    public SinhVien(String hoTen, String gioiTinh, String ngaySinh, String maSinhVien, String lop, double diemTrungBinh) {
        super(hoTen, gioiTinh, ngaySinh);
        this.maSinhVien = maSinhVien;
        this.lop = lop;
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    @Override
    public void inPut() {
        super.inPut();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        maSinhVien = scanner.nextLine();
        System.out.print("Nhap lop: ");
        lop = scanner.nextLine();
        System.out.print("Nhap diem trung binh: ");
        diemTrungBinh = scanner.nextDouble();
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("Ma sinh vien: " + maSinhVien);
        System.out.println("Lop: " + lop);
        System.out.println("Điem trung binh: " + diemTrungBinh);
    }
}
