package bai10_chuong4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Phương thức để kiểm tra hạn trả nhỏ hơn ngày mượn
    public static void kiemTraNgay(String ngayMuon, String hanTra) throws LoiNgay {
        if (hanTra.compareTo(ngayMuon) < 0) {
            throw new LoiNgay("Han tra khong the nho hon ngay muon.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TheMuon> danhSachMuon = new ArrayList<>();

        System.out.print("Nhap so luong the muon: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        // Nhập danh sách thẻ mượn
        for (int i = 0; i < n; i++) {
            TheMuon theMuon = new TheMuon();
            System.out.println("Nhap thong tin the muon thu " + (i + 1) + ":");
            theMuon.input();
            try {
                kiemTraNgay(theMuon.getNgayMuon(), theMuon.getHanTra());
                danhSachMuon.add(theMuon);
            } catch (LoiNgay e) {
                System.out.println("Loi: " + e.getMessage());
                System.out.println("Nhap lai thong tin the muon " + (i + 1) + ":");
                theMuon.input();
            }
        }

        // Xuất danh sách thẻ mượn
        System.out.println("\nDanh sach the muon:");
        for (TheMuon theMuon : danhSachMuon) {
            theMuon.output();
            System.out.println();
        }

        // Đếm tổng số phiếu mượn
        int tongSoPhieuMuon = danhSachMuon.size();
        System.out.println("\nTong so phieu muon tai thu vien: " + tongSoPhieuMuon);
    }
}
