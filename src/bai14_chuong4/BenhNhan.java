package bai14_chuong4;

import java.util.Scanner;

public class BenhNhan {
    protected String hoTen;
    protected int tuoi;
    protected String gioiTinh;
    protected String diaChi;
    protected String soCMT;

    public BenhNhan() {
    }

    public BenhNhan(String hoTen, int tuoi, String gioiTinh, String diaChi, String soCMT) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.soCMT = soCMT;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoCMT() {
        return soCMT;
    }

    public void setSoCMT(String soCMT) {
        this.soCMT = soCMT;
    }

    public void inPut() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi = scanner.nextInt();
        scanner.nextLine(); // Clear the input buffer
        System.out.print("Nhập giới tính: ");
        gioiTinh = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        diaChi = scanner.nextLine();
        System.out.print("Nhập số chứng minh thư: ");
        soCMT = scanner.nextLine();
    }

    public void outPut() {
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Số chứng minh thư: " + soCMT);
    }
}

