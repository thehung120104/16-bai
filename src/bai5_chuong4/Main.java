package bai5_chuong4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào số lượng sách chuyên khảo
        System.out.print("Nhap so luong sach chuyen khao: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        // Khai báo mảng chứa thông tin các sách chuyên khảo
        SachChuyenKhoa[] sachChuyenKhaos = new SachChuyenKhoa[n];

        // Nhập thông tin cho từng sách chuyên khảo
        System.out.println("Nhap thong tin sach chuyen khao:");
        for (int i = 0; i < n; i++) {
            sachChuyenKhaos[i] = new SachChuyenKhoa();
            System.out.println("Nhap thong tin sach thu: " + (i + 1) + ":");
            sachChuyenKhaos[i].input();
        }

        // In danh sách các sách chuyên khảo vừa nhập ra màn hình
        System.out.println("\nDanh sach cac sach chuyen khao:");
        for (int i = 0; i < n; i++) {
            System.out.println("Thong tin sach thu: " + (i + 1) + ":");
            sachChuyenKhaos[i].output();
            System.out.println();
        }

        // In ra màn hình sách chuyên khảo thuộc thể loại công nghệ thông tin
        System.out.println("\nCac sach chuyen khao thuoc the loai cong nghe thong tin:");
        for (int i = 0; i < n; i++) {
            if (sachChuyenKhaos[i].getTheLoai().equalsIgnoreCase("Cong nghe thong tin")) {
                sachChuyenKhaos[i].output();
                System.out.println();
            }
        }

        // Tìm kiếm sách chuyên khảo có tên sách là "Lập trình hướng đối tượng với Java"
        System.out.println("\nTim kiem sach chuyen khao co ten sach la \"Lap trinh huong doi tuong voi Java\":");
        for (int i = 0; i < n; i++) {
            if (sachChuyenKhaos[i].getTenSach().equalsIgnoreCase("Lap trinh huong doi tuong voi Java")) {
                sachChuyenKhaos[i].output();
                break;
            }
        }
    }
}

