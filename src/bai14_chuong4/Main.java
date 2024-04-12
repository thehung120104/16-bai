package bai14_chuong4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng hoá đơn: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Clear the input buffer

        HoaDon[] danhSachHoaDon = new HoaDon[n];

        // Nhập thông tin cho danh sách hoá đơn
        for (int i = 0; i < n; i++) {
            danhSachHoaDon[i] = new HoaDon();
            System.out.println("Nhập thông tin cho hoá đơn thứ " + (i + 1) + ":");
            try {
                danhSachHoaDon[i].inPut();
                if (!kiemTraNgay(danhSachHoaDon[i].getNgayNhapVien(), danhSachHoaDon[i].getNgayRaVien()))
                    throw new LoiNgay("Ngày ra viện không hợp lệ!");
            } catch (LoiNgay e) {
                System.out.println("Lỗi: " + e.getMessage());
                i--; // Re-enter information for this bill
            }
        }

        // Xuất thông tin danh sách hoá đơn
        System.out.println("Danh sách hoá đơn:");
        for (int i = 0; i < n; i++) {
            System.out.println("Hoá đơn thứ " + (i + 1) + ":");
            danhSachHoaDon[i].outPut();
            System.out.println();
        }

        // Tìm kiếm hoá đơn theo số chứng minh thư
        scanner.nextLine(); // Clear the input buffer
        System.out.print("Nhập số chứng minh thư cần tìm: ");
        String soCMTTimKiem = scanner.nextLine();
        boolean timThay = false;
        for (HoaDon hoaDon : danhSachHoaDon) {
            if (hoaDon.getSoCMT().equals(soCMTTimKiem)) {
                hoaDon.outPut();
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Không tìm thấy hoá đơn cho khách hàng có số CMT: " + soCMTTimKiem);
        }
    }

    // Kiểm tra ngày nhập viện và ngày ra viện có hợp lệ hay không
    public static boolean kiemTraNgay(String ngayNhapVien, String ngayRaVien) {
        String[] ngayNhap = ngayNhapVien.split("/");
        String[] ngayRa = ngayRaVien.split("/");

        int ngayNhapInt = Integer.parseInt(ngayNhap[0]);
        int thangNhapInt = Integer.parseInt(ngayNhap[1]);
        int namNhapInt = Integer.parseInt(ngayNhap[2]);

        int ngayRaInt = Integer.parseInt(ngayRa[0]);
        int thangRaInt = Integer.parseInt(ngayRa[1]);
        int namRaInt = Integer.parseInt(ngayRa[2]);

        if (namNhapInt > namRaInt) return false;
        if (namNhapInt == namRaInt && thangNhapInt > thangRaInt) return false;
        if (namNhapInt == namRaInt && thangNhapInt == thangRaInt && ngayNhapInt > ngayRaInt) return false;

        return true;
    }
}

