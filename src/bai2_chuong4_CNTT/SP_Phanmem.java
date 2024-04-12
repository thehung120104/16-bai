package bai2_chuong4_CNTT;

import java.util.Scanner;

public class SP_Phanmem  extends SanPham{
    protected String NganhUngDung;
    protected Float MaKey;


    public  SP_Phanmem(){}

    public SP_Phanmem(String nganhUngDung, Float maKey) {
        NganhUngDung = nganhUngDung;
        MaKey = maKey;
    }

    public SP_Phanmem(String maSanPham, String tenSanPham, Float soLuong, Integer namNhap, String nganhUngDung, Float maKey) {
        super(maSanPham, tenSanPham, soLuong, namNhap);
        NganhUngDung = nganhUngDung;
        MaKey = maKey;
    }


    public String getNganhUngDung() {
        return NganhUngDung;
    }

    public void setNganhUngDung(String nganhUngDung) {
        NganhUngDung = nganhUngDung;
    }

    public Float getMaKey() {
        return MaKey;
    }

    public void setMaKey(Float maKey) {
        MaKey = maKey;
    }

    @Override
    public void Input() {
        super.Input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nganh ung dung la: ");
        NganhUngDung = scanner.nextLine();
        System.out.println("ma key: ");
        MaKey = scanner.nextFloat();
    }

    @Override
    public void Output() {
        super.Output();
        System.out.println("nganh ung dung: " + NganhUngDung);
        System.out.println("ma key: " + MaKey);
    }
}
