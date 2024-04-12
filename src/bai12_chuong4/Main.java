package bai12_chuong4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng thẻ thuê: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Clear the input buffer

        TheThue[] danhSachTheThue = new TheThue[n];

        // Nhập thông tin cho danh sách thẻ thuê
        for (int i = 0; i < n; i++) {
            danhSachTheThue[i] = new TheThue();
            System.out.println("Nhập thông tin cho thẻ thuê thứ " + (i + 1) + ":");
            try {
                danhSachTheThue[i].inPut();
                if (!kiemTraNgay(danhSachTheThue[i].getNgayThue(), danhSachTheThue[i].getHanTra()))
                    throw new LoiNgay("Hạn trả không hợp lệ!");
            } catch (LoiNgay e) {
                System.out.println("Lỗi: " + e.getMessage());
                i--;
            }
        }

        // Xuất thông tin danh sách thẻ thuê
        System.out.println("Danh sách thẻ thuê:");
        for (int i = 0; i < n; i++) {
            System.out.println("Thẻ thuê thứ " + (i + 1) + ":");
            danhSachTheThue[i].outPut();
            System.out.println();
        }

        // Tính trung bình tiền thuê của các phiếu thuê
        double tongTienThue = 0;
        for (TheThue theThue : danhSachTheThue) {
            tongTienThue += theThue.getSoTienThue();
        }
        double trungBinhTienThue = tongTienThue / n;
        System.out.println("Trung bình tiền thuê của các phiếu thuê: " + trungBinhTienThue);
    }


    public static boolean kiemTraNgay(String ngayThue, String hanTra) {

        return true;
    }
}

