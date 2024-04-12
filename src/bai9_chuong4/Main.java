package bai9_chuong4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào số lượng sinh viên
        System.out.print("Nhap so luong sinh vien: ");
        int n = scanner.nextInt();

        // Tạo mảng để lưu thông tin của sinh viên
        SinhVien[] danhSachSinhVien = new SinhVien[n];

        // Nhập thông tin cho từng sinh viên
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cho sinh vien thu " + (i + 1) + ":");
            danhSachSinhVien[i] = new SinhVien();
            danhSachSinhVien[i].inPut();
        }

        // Xuất thông tin của các sinh viên
        System.out.println("\nThong tin cua cac sinh vien:");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien thu " + (i + 1) + ":");
            danhSachSinhVien[i].outPut();
            System.out.println();
        }

        // Đưa ra bảng điểm của một lớp bất kỳ
        System.out.print("Nhap ten lop can tim: ");
        String lopCanTim = scanner.next();
        System.out.println("\nDanh sach sinh vien cua lop " + lopCanTim + ":");
        for (SinhVien sv : danhSachSinhVien) {
            if (sv.getLop().equalsIgnoreCase(lopCanTim)) {
                sv.outPut();
                System.out.println();
            }
        }
    }
}

