package bai15_chuong4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng hóa đơn:");
        int n = scanner.nextInt();
        HoaDon[] danhSachHoaDon = new HoaDon[n];

        // Nhập danh sách hóa đơn
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho hóa đơn thứ " + (i + 1));
            danhSachHoaDon[i] = new HoaDon();
            danhSachHoaDon[i].input();
        }

        // Hiển thị thông tin các hóa đơn đã nhập
        System.out.println("Thông tin các hóa đơn:");
        for (int i = 0; i < n; i++) {
            System.out.println("Hóa đơn thứ " + (i + 1));
            danhSachHoaDon[i].output();
            System.out.println("Tiền nước phải trả: " + danhSachHoaDon[i].tinhTien() + " VND");
        }

        // Tìm kiếm biên lai cho khách hàng với mã khách hàng được nhập từ bàn phím
        scanner.nextLine(); // consume newline
        System.out.println("Nhập mã khách hàng cần tìm:");
        String maKhachHangCanTim = scanner.nextLine();
        for (int i = 0; i < n; i++) {
            if (danhSachHoaDon[i].getMaKhachHang().equals(maKhachHangCanTim)) {
                System.out.println("Thông tin hóa đơn cho khách hàng có mã " + maKhachHangCanTim + ":");
                danhSachHoaDon[i].output();
                System.out.println("Tiền nước phải trả: " + danhSachHoaDon[i].tinhTien() + " VND");
                break;
            }
        }
    }
}

