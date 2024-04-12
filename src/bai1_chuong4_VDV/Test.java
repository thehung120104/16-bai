package bai1_chuong4_VDV;
import java.util.Scanner;
public class Test {
public static void main(String[] args) {
    ChuongTrinh_1 test = new ChuongTrinh_1();
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhập số lượng VDV : ");
    int n = sc.nextInt();
    test.nhapVDV(n);
    test.inVDV();
    test.sxVDV();
    System.out.println("Danh sách VDV sau khi đã sx là :");
    test.sxVDV();
    test.inVDV();
    System.out.println("VDV lớn tuổi nhất là:");
    test.VDVNhieuTuoi();
}
}

