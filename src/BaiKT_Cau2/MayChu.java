package BaiKT_Cau2;

import java.util.Scanner;

public class MayChu extends ThietBi {
    private String LoaiMayChu;
    private String ChucNang;

    public MayChu(String maMay, String tenMay, String tenHangSanXuat, Integer soLuong, Integer namDuaVaoSuDung, Integer namKiemKe, String loaiMayChu, String chucNang) {
        super(maMay, tenMay, tenHangSanXuat, soLuong, namDuaVaoSuDung, namKiemKe);
        LoaiMayChu = loaiMayChu;
        ChucNang = chucNang;

    }

    public MayChu() {

    }

    public String getLoaiMayChu() {
        return LoaiMayChu;
    }

    public void setLoaiMayChu(String loaiMayChu) {
        LoaiMayChu = loaiMayChu;
    }

    public String getChucNang() {
        return ChucNang;
    }

    public void setChucNang(String chucNang) {
        ChucNang = chucNang;
    }

    @Override
    public void inPut() {
        super.inPut();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap loai may chu: ");
        LoaiMayChu = scanner.nextLine();
        System.out.println("nhap chuc nang: ");
        ChucNang = scanner.nextLine();



            }

        }


