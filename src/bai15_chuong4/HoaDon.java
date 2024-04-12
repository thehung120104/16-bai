package bai15_chuong4;

import java.util.Scanner;

public class HoaDon extends KhachHang{
    private int chiSoMoi;
    private int chiSoCu;
    private int thangSuDung;

    // Constructors
    public HoaDon() {}

    public HoaDon(String maKhachHang, String hoTenChuHo, int soNha, String maCongTo,
                  int chiSoMoi, int chiSoCu, int thangSuDung) {
        super(maKhachHang, hoTenChuHo, soNha, maCongTo);
        this.chiSoMoi = chiSoMoi;
        this.chiSoCu = chiSoCu;
        this.thangSuDung = thangSuDung;
    }

    // Getter and Setter methods
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

    // Input and Output methods (override)

    public void input() {
        super.inPut();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chỉ số mới:");
        chiSoMoi = scanner.nextInt();
        System.out.println("Nhập chỉ số cũ:");
        chiSoCu = scanner.nextInt();
        if (chiSoMoi < chiSoCu) {
            try {
                throw new  LoiCongTo("Chỉ số mới nhỏ hơn chỉ số cũ.");
            } catch (LoiCongTo e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Nhập tháng sử dụng:");
        thangSuDung = scanner.nextInt();
    }


    public void output() {
        super.outPut();
        System.out.println("Chỉ số mới: " + chiSoMoi);
        System.out.println("Chỉ số cũ: " + chiSoCu);
        System.out.println("Tháng sử dụng: " + thangSuDung);
    }

    // Method to calculate water bill
    public double tinhTien() {
        return (chiSoMoi - chiSoCu) * 8000;
    }
}

