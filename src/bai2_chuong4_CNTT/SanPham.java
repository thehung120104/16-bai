package bai2_chuong4_CNTT;

import java.util.Scanner;

 class SanPham {
    protected   String MaSanPham;
    protected String TenSanPham;
    protected Float SoLuong;
    protected int NamNhap;

    public  SanPham(){}

     public SanPham(String maSanPham, String tenSanPham, Float soLuong, int namNhap) {
         MaSanPham = maSanPham;
         TenSanPham = tenSanPham;
         SoLuong = soLuong;
         NamNhap = namNhap;
     }

     public String getMaSanPham() {
         return MaSanPham;
     }

     public void setMaSanPham(String maSanPham) {
         MaSanPham = maSanPham;
     }

     public String getTenSanPham() {
         return TenSanPham;
     }

     public void setTenSanPham(String tenSanPham) {
         TenSanPham = tenSanPham;
     }

     public Float getSoLuong() {
         return SoLuong;
     }

     public void setSoLuong(Float soLuong) {
         SoLuong = soLuong;
     }

     public int getNamNhap() {
         return NamNhap;
     }

     public void setNamNhap(int namNhap) {
         NamNhap = namNhap;
     }

     public void Input(){
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Nhap ma san pham: ");
        MaSanPham = scanner.nextLine();
        System.out.println("Nhap ten san pham: ");
        TenSanPham = scanner.nextLine();
        System.out.println("Nhap so luong: ");
        SoLuong = scanner.nextFloat();
        System.out.println("Nhap nam nhap: ");
        NamNhap = scanner.nextInt();
    }
    public void Output(){
        System.out.println("ma san pham: "+MaSanPham);
        System.out.println("ten san pham: "+TenSanPham);
        System.out.println("so luong: "+SoLuong);
        System.out.println("nam nhap: "+NamNhap);

    }
}
