package bai16_chuong4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GiaoDich {
    private String maGiaoDich;
    private Date ngayGiaoDich;
    private double donGia;
    private double dienTich;

    // Constructor không tham số
    public GiaoDich() {}

    // Constructor đầy đủ tham số
    public GiaoDich(String maGiaoDich, Date ngayGiaoDich, double donGia, double dienTich) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    // Getter và setter cho các thuộc tính
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

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    // Phương thức nhập thông tin
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã giao dịch:");
        maGiaoDich = scanner.nextLine();

        System.out.println("Nhập ngày giao dịch (dd/MM/yyyy):");
        String strNgayGiaoDich = scanner.nextLine();
        try {
            ngayGiaoDich = new SimpleDateFormat("dd/MM/yyyy").parse(strNgayGiaoDich);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Nhập đơn giá:");
        donGia = scanner.nextDouble();

        System.out.println("Nhập diện tích:");
        dienTich = scanner.nextDouble();
    }

    // Phương thức xuất thông tin
    public void output() {
        System.out.println("Mã giao dịch: " + maGiaoDich);
        System.out.println("Ngày giao dịch: " + new SimpleDateFormat("dd/MM/yyyy").format(ngayGiaoDich));
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Diện tích: " + dienTich);
    }
}

