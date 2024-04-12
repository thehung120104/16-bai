package bai14_chuong4;

import java.util.Scanner;

public class HoaDon  extends BenhNhan{
    private String maHoaDon;
    private String ngayNhapVien;
    private String ngayRaVien;
    private String chuanDoanBenh;
    private String bacSyDieuTri;
    private double soTienThanhToan;

    public HoaDon() {
    }

    public HoaDon(String hoTen, int tuoi, String gioiTinh, String diaChi, String soCMT, String maHoaDon, String ngayNhapVien, String ngayRaVien, String chuanDoanBenh, String bacSyDieuTri, double soTienThanhToan) {
        super(hoTen, tuoi, gioiTinh, diaChi, soCMT);
        this.maHoaDon = maHoaDon;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayRaVien = ngayRaVien;
        this.chuanDoanBenh = chuanDoanBenh;
        this.bacSyDieuTri = bacSyDieuTri;
        this.soTienThanhToan = soTienThanhToan;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getNgayNhapVien() {
        return ngayNhapVien;
    }

    public void setNgayNhapVien(String ngayNhapVien) {
        this.ngayNhapVien = ngayNhapVien;
    }

    public String getNgayRaVien() {
        return ngayRaVien;
    }

    public void setNgayRaVien(String ngayRaVien) {
        this.ngayRaVien = ngayRaVien;
    }

    public String getChuanDoanBenh() {
        return chuanDoanBenh;
    }

    public void setChuanDoanBenh(String chuanDoanBenh) {
        this.chuanDoanBenh = chuanDoanBenh;
    }

    public String getBacSyDieuTri() {
        return bacSyDieuTri;
    }

    public void setBacSyDieuTri(String bacSyDieuTri) {
        this.bacSyDieuTri = bacSyDieuTri;
    }

    public double getSoTienThanhToan() {
        return soTienThanhToan;
    }

    public void setSoTienThanhToan(double soTienThanhToan) {
        this.soTienThanhToan = soTienThanhToan;
    }

    @Override
    public void inPut() {
        super.inPut();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã hoá đơn: ");
        maHoaDon = scanner.nextLine();
        System.out.print("Nhập ngày nhập viện: ");
        ngayNhapVien = scanner.nextLine();
        System.out.print("Nhập ngày ra viện: ");
        ngayRaVien = scanner.nextLine();
        System.out.print("Nhập chuẩn đoán bệnh: ");
        chuanDoanBenh = scanner.nextLine();
        System.out.print("Nhập bác sỹ điều trị: ");
        bacSyDieuTri = scanner.nextLine();
        System.out.print("Nhập số tiền thanh toán: ");
        soTienThanhToan = scanner.nextDouble();
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("Mã hoá đơn: " + maHoaDon);
        System.out.println("Ngày nhập viện: " + ngayNhapVien);
        System.out.println("Ngày ra viện: " + ngayRaVien);
        System.out.println("Chuẩn đoán bệnh: " + chuanDoanBenh);
        System.out.println("Bác sỹ điều trị: " + bacSyDieuTri);
        System.out.println("Số tiền thanh toán: " + soTienThanhToan);
    }
}

