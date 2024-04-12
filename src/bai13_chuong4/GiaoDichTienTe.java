package bai13_chuong4;

import java.util.Date;
import java.util.Scanner;

public class GiaoDichTienTe extends GiaoDich{
    private double tiGia;
    private String loaiTienTe;

    public GiaoDichTienTe() {}

    public GiaoDichTienTe(String maGiaoDich, Date ngayGiaoDich, double soLuong, double donGia, double tiGia, String loaiTienTe) {
        super(maGiaoDich, ngayGiaoDich, soLuong, donGia);
        this.tiGia = tiGia;
        this.loaiTienTe = loaiTienTe;
    }

    public double getTiGia() {
        return tiGia;
    }

    public void setTiGia(double tiGia) {
        this.tiGia = tiGia;
    }

    public String getLoaiTienTe() {
        return loaiTienTe;
    }

    public void setLoaiTienTe(String loaiTienTe) {
        this.loaiTienTe = loaiTienTe;
    }

    @Override
    public void inPut() {
        super.inPut();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tỉ giá: ");
        tiGia = scanner.nextDouble();
        System.out.print("Nhập loại tiền tệ: ");
        loaiTienTe = scanner.next();
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("Tỉ giá: " + tiGia);
        System.out.println("Loại tiền tệ: " + loaiTienTe);
        System.out.println("Thành tiền: " + tinhThanhTien());
    }

    public double tinhThanhTien() {
        if (loaiTienTe.equalsIgnoreCase("USD") || loaiTienTe.equalsIgnoreCase("Euro")) {
            return soLuong * donGia * tiGia;
        } else { // Tiền VND
            return soLuong * donGia;
        }
    }
}

