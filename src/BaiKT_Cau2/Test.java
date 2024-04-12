package BaiKT_Cau2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
    ChuongTrinhCau2 m =new ChuongTrinhCau2();
        m.nhapTT();
        while (true) {
            System.out.println("Bạn muốn làm gì?\n" +
                    "0.Xuất thông tin danh sách\n" +
                    "1.In danh sách các máy của hãng đã sử dụng>5 năm\n" +
                    "2.Thống kê các máy theo :tên hãng và số lượng\n" +
                    "3.Liệt kê các máy đã kiểm kê năm 2023\n" +
                    "4.thoát chương trình.");
            int n=new Scanner(System.in).nextInt();
            switch (n) {
                case 0:
                    m.xuatTT();
                    break;
                case 1:
                    m.inDSHang();
                    break;
                case 2:
                    m.thongKe();
                    break;
                case 3:
                    m.lietKeNamKiemKe();
                    break;
                default:
                    m.thoatCT();
                    break;
            }
        }
    }
}