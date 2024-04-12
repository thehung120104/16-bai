package bai10_chuong4;

import java.util.Scanner;

public class TheMuon extends SinhVien{
    private int soPhieuMuon;
    private String soHieuSach;
    private String ngayMuon;
    private String hanTra;

    // Constructor không tham số
    public TheMuon() {}

    // Constructor có tham số
    public TheMuon(int soPhieuMuon, String soHieuSach, String ngayMuon, String hanTra) {
        this.soPhieuMuon = soPhieuMuon;
        this.soHieuSach = soHieuSach;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
    }

    // Getter và setter
    public int getSoPhieuMuon() {
        return soPhieuMuon;
    }

    public void setSoPhieuMuon(int soPhieuMuon) {
        this.soPhieuMuon = soPhieuMuon;
    }

    public String getSoHieuSach() {
        return soHieuSach;
    }

    public void setSoHieuSach(String soHieuSach) {
        this.soHieuSach = soHieuSach;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getHanTra() {
        return hanTra;
    }

    public void setHanTra(String hanTra) {
        this.hanTra = hanTra;
    }

    // Phương thức nhập thông tin thẻ mượn
    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phieu muon: ");
        soPhieuMuon = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap so hieu sach: ");
        soHieuSach = scanner.nextLine();
        System.out.print("Nhap ngay muon: ");
        ngayMuon = scanner.nextLine();
        System.out.print("Nhap ngay tra: ");
        hanTra = scanner.nextLine();
    }

    // Phương thức xuất thông tin thẻ mượn
    @Override
    public void output() {
        super.output();
        System.out.println("So phieu muon: " + soPhieuMuon);
        System.out.println("So hieu sach: " + soHieuSach);
        System.out.println("Ngay muon: " + ngayMuon);
        System.out.println("Han tra: " + hanTra);
    }
}

