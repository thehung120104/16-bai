package bai3_chuong4_QLNV;

import java.util.Scanner;

public class canBoQuanLy extends nhanVien{
    private String chucVu;
    private Float phuCap;

    public canBoQuanLy(String maNhanvien, String hoTen, String phongBan, Integer SDT, String diaChi, Float heSoLuong, String chucVu, Float phuCap) {
        super(maNhanvien, hoTen, phongBan, SDT, diaChi, heSoLuong);
        this.chucVu = chucVu;
        this.phuCap = phuCap;
    }
    public canBoQuanLy(){

    }




    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public Float getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(Float phuCap) {
        this.phuCap = phuCap;
    }

    @Override
    public void inPut() {
        super.inPut();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap chuc vu: ");
        chucVu = scanner.nextLine();
        System.out.println("nhap phu cap: ");
        phuCap = scanner.nextFloat();
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("chuc vu: " + chucVu);
        System.out.println(" phu cap: " + phuCap);
    }
}
