package bai8_chuong4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào số lượng máy chủ
        System.out.print("Nhap so luong may chu: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        // Khai báo mảng chứa thông tin các máy chủ
        MayChu[] mayChus = new MayChu[n];

        // Nhập thông tin cho từng máy chủ
        System.out.println("Nhap thong tin cac may chu:");
        for (int i = 0; i < n; i++) {
            mayChus[i] = new MayChu();
            System.out.println("Nhap thong tin may chu thu " + (i + 1) + ":");
            mayChus[i].input();
        }

        // In danh sách các máy chủ vừa nhập ra màn hình
        System.out.println("\nDanh sach cac may chu:");
        for (int i = 0; i < n; i++) {
            System.out.println("Thong tin may chu thu " + (i + 1) + ":");
            mayChus[i].output();
            System.out.println();
        }

        // Tìm kiếm máy chủ có chức năng là "Application Servers"
        System.out.println("\nMay chu co chuc nang  la \"Application Servers\":");
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (mayChus[i].getChucNang().equalsIgnoreCase("Application Servers")) {
                mayChus[i].output();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay may chu co chuc nang la \"Application Servers\"");
        }

        // Sắp xếp các máy chủ giảm dần theo số lượng
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (mayChus[i].getSoLuong() < mayChus[j].getSoLuong()) {
                    MayChu temp = mayChus[i];
                    mayChus[i] = mayChus[j];
                    mayChus[j] = temp;
                }
            }
        }

        // In danh sách các máy chủ sau khi sắp xếp
        System.out.println("\nDanh sach cac may chu sau khi sap xep giam dan theo so luong:");
        for (int i = 0; i < n; i++) {
            System.out.println("Thong tin may chu thu " + (i + 1) + ":");
            mayChus[i].output();
            System.out.println();
        }
    }
}

