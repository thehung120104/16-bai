package bai4_chuong4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào số lượng khách hàng thân thiết
        System.out.print("Nhap so luong khach hang than thiet: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        // Khai báo mảng chứa thông tin các khách hàng thân thiết
        KhachHangThanThiet[] khachHangThanThiets = new KhachHangThanThiet[n];

        // Nhập thông tin cho từng khách hàng thân thiết
        System.out.println("Nhap thong tin khach hang than thiet:");
        for (int i = 0; i < n; i++) {
            khachHangThanThiets[i] = new KhachHangThanThiet();
            System.out.println("Nhap thong tin khach hang than thiet thu " + (i + 1) + ":");
            khachHangThanThiets[i].input();
        }

        // In danh sách các khách hàng thân thiết vừa nhập ra màn hình
        System.out.println("\nDanh sach khac hang than thiet thu:");
        for (int i = 0; i < n; i++) {
            System.out.println("Thong tin khach hang than thiet thu " + (i + 1) + ":");
            khachHangThanThiets[i].output();
            System.out.println();
        }

        // Tìm kiếm khách hàng thân thiết có mức khuyến mại cao nhất
        double maxKhuyenMai = khachHangThanThiets[0].getKhuyenMai();
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (khachHangThanThiets[i].getKhuyenMai() > maxKhuyenMai) {
                maxKhuyenMai = khachHangThanThiets[i].getKhuyenMai();
                maxIndex = i;
            }
        }
        System.out.println("\nKhach hang than thiet cac muc khuyen mai cao nhat:");
        khachHangThanThiets[maxIndex].output();

        // Đếm số khách hàng thân thiết thuộc loại khách hàng kim cương
        int countKimCuong = 0;
        for (int i = 0; i < n; i++) {
            if (khachHangThanThiets[i].getLoaiKhachHang().equalsIgnoreCase("Kim cuong")) {
                countKimCuong++;
            }
        }
        System.out.println("\nSo khach hang than thiet thuoc loai khach hang kim cuong: " + countKimCuong);
    }
}
