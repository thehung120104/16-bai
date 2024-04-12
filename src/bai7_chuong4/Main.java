package bai7_chuong4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập vào số lượng sản phẩm cao cấp
        System.out.print("Nhập số lượng sản phẩm cao cấp: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        // Khai báo mảng chứa thông tin các sản phẩm cao cấp
        SanPhamCaoCap[] sanPhamCaoCaps = new SanPhamCaoCap[n];

        // Nhập thông tin cho từng sản phẩm cao cấp
        System.out.println("Nhap thong tin cac san pham cao cap:");
        for (int i = 0; i < n; i++) {
            sanPhamCaoCaps[i] = new SanPhamCaoCap();
            System.out.println("Nhap thong tin san pham cao cap thu " + (i + 1) + ":");
            sanPhamCaoCaps[i].input();
        }

        // In danh sách các sản phẩm cao cấp vừa nhập ra màn hình
        System.out.println("\nDanh sach cac san pham cao cap  :");
        for (int i = 0; i < n; i++) {
            System.out.println("Thong tin san pham cao cap thu " + (i + 1) + ":");
            sanPhamCaoCaps[i].output();
            System.out.println();
        }

        // Tìm kiếm sản phẩm cao cấp có loại sản phẩm là "đặc biệt"
        System.out.println("\nSan pham cao cap co loai dac biet la \"dac biet\":");
        for (int i = 0; i < n; i++) {
            if (sanPhamCaoCaps[i].getLoaiSanPham().equalsIgnoreCase("dac biet")) {
                sanPhamCaoCaps[i].output();
                break;
            }
        }

        // Sắp xếp các sản phẩm cao cấp theo thứ tự giảm dần của phụ phí
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (sanPhamCaoCaps[i].getPhuPhi() < sanPhamCaoCaps[j].getPhuPhi()) {
                    SanPhamCaoCap temp = sanPhamCaoCaps[i];
                    sanPhamCaoCaps[i] = sanPhamCaoCaps[j];
                    sanPhamCaoCaps[j] = temp;
                }
            }
        }

        // In danh sách các sản phẩm cao cấp sau khi sắp xếp
        System.out.println("\nDanh sách các sản phẩm cao cấp sau khi sắp xếp:");
        for (int i = 0; i < n; i++) {
            System.out.println("Thông tin sản phẩm cao cấp thứ " + (i + 1) + ":");
            sanPhamCaoCaps[i].output();
            System.out.println();
        }
    }
}

