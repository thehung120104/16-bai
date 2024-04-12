package bai13_chuong4;

import java.util.Date;
import java.util.Scanner;

public class GiaoDich {
    protected String maGiaoDich;
    protected Date ngayGiaoDich;
    protected double soLuong;
    protected double donGia;

    public GiaoDich() {}

    public GiaoDich(String maGiaoDich, Date ngayGiaoDich, double soLuong, double donGia) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public Date getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(Date ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void inPut() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã giao dịch: ");
        maGiaoDich = scanner.nextLine();
        System.out.print("Nhập ngày giao dịch (dd/mm/yyyy): ");
        String dateString = scanner.nextLine();

        System.out.print("Nhập số lượng: ");
        soLuong = scanner.nextDouble();
        System.out.print("Nhập đơn giá: ");
        donGia = scanner.nextDouble();
    }

    public void outPut() {
        System.out.println("Mã giao dịch: " + maGiaoDich);
        System.out.println("Ngày giao dịch: " + ngayGiaoDich);
        System.out.println("Số lượng: " + soLuong);
        System.out.println("Đơn giá: " + donGia);
    }
}

