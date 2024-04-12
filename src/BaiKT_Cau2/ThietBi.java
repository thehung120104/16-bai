package BaiKT_Cau2;

import java.util.Scanner;

public class ThietBi {
    private String MaMay;
    private String TenMay;
    private String TenHangSanXuat;
    private Integer SoLuong;
    private Integer NamDuaVaoSuDung;
    private Integer NamKiemKe;

    public ThietBi(String maMay, String tenMay, String tenHangSanXuat, Integer soLuong, Integer namDuaVaoSuDung, Integer namKiemKe) {
        MaMay = maMay;
        TenMay = tenMay;
        TenHangSanXuat = tenHangSanXuat;
        SoLuong = soLuong;
        NamDuaVaoSuDung = namDuaVaoSuDung;
        NamKiemKe = namKiemKe;
    }

    public ThietBi() {
    }

    public String getMaMay() {
        return MaMay;
    }

    public void setMaMay(String maMay) {
        MaMay = maMay;
    }

    public String getTenMay() {
        return TenMay;
    }

    public void setTenMay(String tenMay) {
        TenMay = tenMay;
    }

    public String getTenHangSanXuat() {
        return TenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        TenHangSanXuat = tenHangSanXuat;
    }

    public Integer getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(Integer soLuong) {
        SoLuong = soLuong;
    }

    public Integer getNamDuaVaoSuDung() {
        return NamDuaVaoSuDung;
    }

    public void setNamDuaVaoSuDung(Integer namDuaVaoSuDung) {
        NamDuaVaoSuDung = namDuaVaoSuDung;
    }

    public Integer getNamKiemKe() {
        return NamKiemKe;
    }

    public void setNamKiemKe(Integer namKiemKe) {
        NamKiemKe = namKiemKe;
    }
    public void inPut() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap ma may: ");
        MaMay = scanner.nextLine();
        System.out.println(" nhap ten may: ");
        TenMay = scanner.nextLine();
        System.out.println(" nhap ten hang san xuat: ");
        TenHangSanXuat = scanner.nextLine();
        System.out.println(" nhap so luong: ");
        SoLuong = scanner.nextInt();
        System.out.println(" nhap nam dua vao su dung: ");
        NamDuaVaoSuDung = scanner.nextInt();
        System.out.println("Nhập  Năm Kiểm Kê:");
        NamKiemKe=new Scanner(System.in).nextInt();
        while(true) {
            try {
                if(NamKiemKe<NamDuaVaoSuDung||NamKiemKe>2024) {
                    throw new LoiNgoaiLe("Năm Kiểm kê lớn hơn năm đưa vào sử dụng");
                }
                break;
            }
            catch (LoiNgoaiLe e){
                System.out.println(e.getMessage());
                System.out.println("Nhập lại Năm Kiểm Kê:");
                NamKiemKe=new Scanner(System.in).nextInt();
            }
        }
    }

    public void outPut(MayChu s){
        System.out.printf("|%15s|%15s|%15s|%15s|%15s|%15s|",s.getMaMay(),s.getTenMay(),s.getTenHangSanXuat(),s.getSoLuong(),s.getNamDuaVaoSuDung(),s.getNamKiemKe());

    }
}




