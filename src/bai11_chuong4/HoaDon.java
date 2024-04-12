package bai11_chuong4;

import java.util.Scanner;

public class HoaDon  extends KhachHang{
    private int chiSoMoi;
    private int chiSoCu;
    private int thangSuDung;

    public HoaDon() {
    }

    public HoaDon(String maKhachHang, String hoTenChuHo, int soNha, String maSoCongTo, int chiSoMoi, int chiSoCu, int thangSuDung) {
        super(maKhachHang, hoTenChuHo, soNha, maSoCongTo);
        this.chiSoMoi = chiSoMoi;
        this.chiSoCu = chiSoCu;
        this.thangSuDung = thangSuDung;
    }

    public int getChiSoMoi() {
        return chiSoMoi;
    }

    public void setChiSoMoi(int chiSoMoi) {
        this.chiSoMoi = chiSoMoi;
    }

    public int getChiSoCu() {
        return chiSoCu;
    }

    public void setChiSoCu(int chiSoCu) {
        this.chiSoCu = chiSoCu;
    }

    public int getThangSuDung() {
        return thangSuDung;
    }

    public void setThangSuDung(int thangSuDung) {
        this.thangSuDung = thangSuDung;
    }

    @Override
    public void inPut() {
        super.inPut();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chỉ số mới: ");
        chiSoMoi = scanner.nextInt();
        scanner.nextLine(); // Clear the input buffer
        System.out.print("Nhập chỉ số cũ: ");
        chiSoCu = scanner.nextInt();
        scanner.nextLine(); // Clear the input buffer
        System.out.print("Nhập tháng sử dụng: ");
        thangSuDung = scanner.nextInt();
        scanner.nextLine(); // Clear the input buffer
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("Chỉ số mới: " + chiSoMoi);
        System.out.println("Chỉ số cũ: " + chiSoCu);
        System.out.println("Tháng sử dụng: " + thangSuDung);
        System.out.println("Số tiền phải trả: " + tinhTienDien());
    }

    public double tinhTienDien() {
        return (chiSoMoi - chiSoCu) * 850;
    }
}

