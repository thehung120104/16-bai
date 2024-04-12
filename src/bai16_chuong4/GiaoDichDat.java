package bai16_chuong4;

import java.util.Date;
import java.util.Scanner;

public class GiaoDichDat extends GiaoDich {
    private String loaiDat;

    public GiaoDichDat() {}

    public GiaoDichDat(String maGiaoDich, Date ngayGiaoDich, double donGia, double dienTich, String loaiDat) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiDat = loaiDat;
    }

    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

        public void inPut() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập loại đất (A, B, C): ");
        this.loaiDat = scanner.nextLine();
    }


    public void outPut() {
        super.output();
        System.out.println("Loại đất: " + loaiDat);
    }

    public double thanhTien() {
        if (loaiDat.equals("A")) {
            return getDienTich() * getDonGia() * 1.5;
        } else {
            return getDienTich() * getDonGia();
        }
    }
}


