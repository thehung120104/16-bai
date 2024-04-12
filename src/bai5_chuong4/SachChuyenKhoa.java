package bai5_chuong4;

import java.util.Scanner;

public class SachChuyenKhoa extends Sach{
    private String theLoai;
    private String ngonNgu;

    // Constructor
    public SachChuyenKhoa() {
    }

    public SachChuyenKhoa(String maSach, String tenSach, String tacGia, int namXuatBan, int soLuong, double donGia, String theLoai, String ngonNgu) {
        super(maSach, tenSach, tacGia, namXuatBan, soLuong, donGia);
        this.theLoai = theLoai;
        this.ngonNgu = ngonNgu;
    }

    // Get/set cho các thuộc tính bổ sung
    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getNgonNgu() {
        return ngonNgu;
    }

    public void setNgonNgu(String ngonNgu) {
        this.ngonNgu = ngonNgu;
    }

    // Override phương thức nhập thông tin sách
    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap the loai: ");
        theLoai = scanner.nextLine();
        System.out.print("Nhap ngon ngu: ");
        ngonNgu = scanner.nextLine();
    }

    // Override phương thức hiển thị thông tin sách
    @Override
    public void output() {
        super.output();
        System.out.println("The loai: " + theLoai);
        System.out.println("Ngon ngu: " + ngonNgu);
    }
}

