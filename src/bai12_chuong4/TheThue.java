package bai12_chuong4;

import java.util.Scanner;

public class TheThue  extends  KhachThue {

    private int soPhieuThue;
    private String soHieuTruyen;
    private String ngayThue;
    private String hanTra;
    private double soTienThue;

    public TheThue() {
    }

    public TheThue(String hoTen, String diaChi, String soDienThoai, int soPhieuThue, String soHieuTruyen, String ngayThue, String hanTra, double soTienThue) {
        super(hoTen, diaChi, soDienThoai);
        this.soPhieuThue = soPhieuThue;
        this.soHieuTruyen = soHieuTruyen;
        this.ngayThue = ngayThue;
        this.hanTra = hanTra;
        this.soTienThue = soTienThue;
    }

    public int getSoPhieuThue() {
        return soPhieuThue;
    }

    public void setSoPhieuThue(int soPhieuThue) {
        this.soPhieuThue = soPhieuThue;
    }

    public String getSoHieuTruyen() {
        return soHieuTruyen;
    }

    public void setSoHieuTruyen(String soHieuTruyen) {
        this.soHieuTruyen = soHieuTruyen;
    }

    public String getNgayThue() {
        return ngayThue;
    }

    public void setNgayThue(String ngayThue) {
        this.ngayThue = ngayThue;
    }

    public String getHanTra() {
        return hanTra;
    }

    public void setHanTra(String hanTra) {
        this.hanTra = hanTra;
    }

    public double getSoTienThue() {
        return soTienThue;
    }

    public void setSoTienThue(double soTienThue) {
        this.soTienThue = soTienThue;
    }

    @Override
    public void inPut() {
        super.inPut();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phiếu thuê: ");
        soPhieuThue = scanner.nextInt();
        scanner.nextLine(); // Clear the input buffer
        System.out.print("Nhập số hiệu truyện: ");
        soHieuTruyen = scanner.nextLine();
        System.out.print("Nhập ngày thuê: ");
        ngayThue = scanner.nextLine();
        System.out.print("Nhập hạn trả: ");
        hanTra = scanner.nextLine();
        System.out.print("Nhập số tiền thuê: ");
        soTienThue = scanner.nextDouble();
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("Số phiếu thuê: " + soPhieuThue);
        System.out.println("Số hiệu truyện: " + soHieuTruyen);
        System.out.println("Ngày thuê: " + ngayThue);
        System.out.println("Hạn trả: " + hanTra);
        System.out.println("Số tiền thuê: " + soTienThue);
    }
}

