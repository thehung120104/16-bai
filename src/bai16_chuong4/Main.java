package bai16_chuong4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng giao dịch: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ArrayList<GiaoDichDat> danhSachGiaoDich = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            GiaoDichDat giaoDich = new GiaoDichDat();
            System.out.println("Nhập thông tin giao dịch thứ " + (i+1) + ":");
            try {
                giaoDich.inPut();
                if (giaoDich.getDonGia() <= 0) {
                    throw new LoiNhapGia("Đơn giá không hợp lệ.");
                }
            } catch (LoiNhapGia e) {
                System.out.println("Lỗi: " + e.getMessage());
                i--;
                continue;
            }
            danhSachGiaoDich.add(giaoDich);
        }

        System.out.println("\nThông tin về các giao dịch đã nhập:");
        for (GiaoDichDat giaoDich : danhSachGiaoDich) {
            giaoDich.outPut();
            System.out.println("Thành tiền: " + giaoDich.thanhTien());
        }

        System.out.println("\nCác giao dịch có giá trị hơn 2 tỷ:");
        for (GiaoDichDat giaoDich : danhSachGiaoDich) {
            if (giaoDich.thanhTien() > 2000000000) {
                giaoDich.outPut();
                System.out.println("Thành tiền: " + giaoDich.thanhTien());
            }
        }
    }
}

