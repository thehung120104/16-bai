package bai13_chuong4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng giao dịch
        System.out.print("Nhập số lượng giao dịch: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        // Khởi tạo mảng giao dịch
        GiaoDich[] danhSachGiaoDich = new GiaoDichTienTe[n];

        // Nhập thông tin giao dịch
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin giao dịch " + (i + 1) + ":");
            danhSachGiaoDich[i] = new GiaoDichTienTe();
            try {
                danhSachGiaoDich[i].inPut();
                if (danhSachGiaoDich[i].getSoLuong() <= 0) {
                    throw new LoiNhapTien("Số lượng phải lớn hơn 0");
                }
            } catch (LoiNhapTien e) {
                System.out.println(e.getMessage());
                i--;
            }
        }

        // Hiển thị thông tin giao dịch đã nhập
        System.out.println("Thông tin các giao dịch:");
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            giaoDich.outPut();
            System.out.println();
        }

        // Tính tổng thành tiền của các giao dịch tiền tệ
        double tongThanhTien = 0;
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich instanceof GiaoDichTienTe) {
                tongThanhTien += ((GiaoDichTienTe) giaoDich).tinhThanhTien();
            }
        }
        System.out.println("Tổng thành tiền của các giao dịch tiền tệ: " + tongThanhTien);
    }
}

