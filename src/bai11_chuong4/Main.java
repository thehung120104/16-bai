package bai11_chuong4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng hóa đơn: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        HoaDon[] danhSachHoaDon = new HoaDon[n];

        // Nhập thông tin cho danh sách hóa đơn
        for (int i = 0; i < n; i++) {
            danhSachHoaDon[i] = new HoaDon();
            System.out.println("Nhập thông tin cho hóa đơn thứ " + (i + 1) + ":");
            try {
                danhSachHoaDon[i].inPut();
                if (danhSachHoaDon[i].getChiSoMoi() < danhSachHoaDon[i].getChiSoCu())
                    throw new LoiCongTo("Chỉ số mới phải lớn hơn chỉ số cũ!");
            } catch (LoiCongTo e) {
                System.out.println("Lỗi: " + e.getMessage());
                i--;
            }
        }

        // Xuất thông tin danh sách hóa đơn
        System.out.println("Danh sách hóa đơn:");
        for (int i = 0; i < n; i++) {
            System.out.println("Hóa đơn thứ " + (i + 1) + ":");
            danhSachHoaDon[i].outPut();
            System.out.println();
        }

        // Tìm kiếm hóa đơn cho khách hàng với mã khách hàng nhập từ bàn phím
        scanner.nextLine();
        System.out.print("Nhập mã khách hàng cần tìm: ");
        String maKhachHangCanTim = scanner.nextLine();
        boolean timThay = false;
        for (HoaDon hoaDon : danhSachHoaDon) {
            if (hoaDon.getMaKhachHang().equals(maKhachHangCanTim)) {
                System.out.println("Hóa đơn cho khách hàng " + maKhachHangCanTim + " là:");
                hoaDon.outPut();
                timThay = true;
                break;
            }
        }
        if (!timThay) {
            System.out.println("Không tìm thấy hóa đơn cho khách hàng có mã " + maKhachHangCanTim);
        }
    }
}

