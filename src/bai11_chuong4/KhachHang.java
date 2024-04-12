package bai11_chuong4;

import java.util.Scanner;

public class KhachHang {
    protected String maKhachHang;
    protected String hoTenChuHo;
    protected int soNha;
    protected String maSoCongTo;

    public KhachHang() {
    }

    public KhachHang(String maKhachHang, String hoTenChuHo, int soNha, String maSoCongTo) {
        this.maKhachHang = maKhachHang;
        this.hoTenChuHo = hoTenChuHo;
        this.soNha = soNha;
        this.maSoCongTo = maSoCongTo;
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

    public String getMaSoCongTo() {
        return maSoCongTo;
    }

    public void setMaSoCongTo(String maSoCongTo) {
        this.maSoCongTo = maSoCongTo;
    }

    public void inPut() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã khách hàng: ");
        maKhachHang = scanner.nextLine();
        System.out.print("Nhập họ tên chủ hộ: ");
        hoTenChuHo = scanner.nextLine();
        System.out.print("Nhập số nhà: ");
        soNha = scanner.nextInt();
        scanner.nextLine(); // Clear the input buffer
        System.out.print("Nhập mã số công tơ: ");
        maSoCongTo = scanner.nextLine();
    }

    public void outPut() {
        System.out.println("Mã khách hàng: " + maKhachHang);
        System.out.println("Họ tên chủ hộ: " + hoTenChuHo);
        System.out.println("Số nhà: " + soNha);
        System.out.println("Mã số công tơ: " + maSoCongTo);
    }
}

