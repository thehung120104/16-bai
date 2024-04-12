package bai15_chuong4;

import java.util.Scanner;

public class KhachHang {
    private String maKhachHang;
    private String hoTenChuHo;
    private int soNha;
    private String maCongTo;

    public KhachHang() {}

    public KhachHang(String maKhachHang, String hoTenChuHo, int soNha, String maCongTo) {
        this.maKhachHang = maKhachHang;
        this.hoTenChuHo = hoTenChuHo;
        this.soNha = soNha;
        this.maCongTo = maCongTo;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getHoTenChuHo() {
        return hoTenChuHo;
    }

    public void setHoTenChuHo(String hoTenChuHo) {
        this.hoTenChuHo = hoTenChuHo;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public String getMaCongTo() {
        return maCongTo;
    }

    public void setMaCongTo(String maCongTo) {
        this.maCongTo = maCongTo;
    }

    public void inPut() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã khách hàng: ");
        this.maKhachHang = scanner.nextLine();
        System.out.print("Nhập họ tên chủ hộ: ");
        this.hoTenChuHo = scanner.nextLine();
        System.out.print("Nhập số nhà: ");
        this.soNha = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập mã số công tơ: ");
        this.maCongTo = scanner.nextLine();
    }

    public void outPut() {
        System.out.println("Mã khách hàng: " + maKhachHang);
        System.out.println("Họ tên chủ hộ: " + hoTenChuHo);
        System.out.println("Số nhà: " + soNha);
        System.out.println("Mã số công tơ: " + maCongTo);
    }
}


