package bai7_chuong4;

import java.util.Scanner;

public class SanPhamCaoCap extends SanPham{
    private String loaiSanPham;
    private double phuPhi;

    // Constructor
    public SanPhamCaoCap() {
    }

    public SanPhamCaoCap(String maSanPham, String tenSanPham, String ngaySanXuat, String hanSuDung, String soLo, String toSanXuat, String loaiSanPham, double phuPhi) {
        super(maSanPham, tenSanPham, ngaySanXuat, hanSuDung, soLo, toSanXuat);
        this.loaiSanPham = loaiSanPham;
        this.phuPhi = phuPhi;
    }

    // Get/set cho các thuộc tính bổ sung
    public String getLoaiSanPham() {
        return loaiSanPham;
    }

    public void setLoaiSanPham(String loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }

    public double getPhuPhi() {
        return phuPhi;
    }

    public void setPhuPhi(double phuPhi) {
        this.phuPhi = phuPhi;
    }

    // Override phương thức nhập thông tin sản phẩm cao cấp
    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap loai san pham: ");
        loaiSanPham = scanner.nextLine();
        System.out.print("Nhap phu phi: ");
        phuPhi = scanner.nextDouble();
    }

    // Override phương thức hiển thị thông tin sản phẩm cao cấp
    @Override
    public void output() {
        super.output();
        System.out.println("Loai san pham: " + loaiSanPham);
        System.out.println("Phu phi: " + phuPhi);
    }
}

