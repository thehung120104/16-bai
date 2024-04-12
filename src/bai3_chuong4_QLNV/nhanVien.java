package bai3_chuong4_QLNV;

import java.util.Scanner;

public class nhanVien {
    private  String maNhanvien;
    private String hoTen;
    private String phongBan;
    private Integer SDT;
    private String diaChi;
    private Float heSoLuong;

    public nhanVien(String maNhanvien, String hoTen, String phongBan, Integer SDT, String diaChi, Float heSoLuong) {
        this.maNhanvien = maNhanvien;
        this.hoTen = hoTen;
        this.phongBan = phongBan;
        this.SDT = SDT;
        this.diaChi = diaChi;
        this.heSoLuong = heSoLuong;
    }

    public nhanVien() {
    }

    public String getMaNhanvien() {
        return maNhanvien;
    }

    public void setMaNhanvien(String maNhanvien) {
        this.maNhanvien = maNhanvien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public Integer getSDT() {
        return SDT;
    }

    public void setSDT(Integer SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(Float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    public void inPut(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap  ma nhan vien: ");
        maNhanvien = scanner.nextLine();
        System.out.println("nhap ho ten: ");
        hoTen = scanner.nextLine();
        System.out.println("nhap phong ban: ");
        phongBan = scanner.nextLine();
        System.out.println("nhap so dien thoai: ");
        SDT = scanner.nextInt();
        System.out.println("nhap dia chi: ");
        diaChi = scanner.nextLine();
        System.out.println("nhap he so luong: ");
        heSoLuong = scanner.nextFloat();
    }
    public void outPut(){
        System.out.println(" ma nhan vien: " + maNhanvien);
        System.out.println(" ho ten: " + hoTen);
        System.out.println(" phong ban: " + phongBan);
        System.out.println("so dien thoai: " + SDT);
        System.out.println("dia chi: " + diaChi);
        System.out.println(" he so luong: " + heSoLuong);
    }

}
