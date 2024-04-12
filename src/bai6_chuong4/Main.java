package bai6_chuong4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào số lượng học viên
        System.out.print("Nhap so luong hoc vien: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        // Khai báo mảng chứa thông tin các học viên
        HọcVien[] hocViens = new HọcVien[n];

        // Nhập thông tin cho từng học viên
        System.out.println("Nhap thong tin cac hoc vien:");
        for (int i = 0; i < n; i++) {
            hocViens[i] = new HọcVien();
            System.out.println("Nhap thong tin hoc vien thu " + (i + 1) + ":");
            hocViens[i].input();
        }

        // In danh sách các học viên vừa nhập ra màn hình
        System.out.println("\nDanh sach cac hoc vien:");
        for (int i = 0; i < n; i++) {
            System.out.println("Thong tin hoc vien thu " + (i + 1) + ":");
            hocViens[i].output();
            System.out.println();
        }

        // Đếm số học viên có trình độ ngoại ngữ B1
        int countB1 = 0;
        for (int i = 0; i < n; i++) {
            if (hocViens[i].getTrinhDoNgoaiNgu().equalsIgnoreCase("B1")) {
                countB1++;
            }
        }
        System.out.println("\nSo hoc vien co trinh do ngoai ngu B1: " + countB1);


    }
}

