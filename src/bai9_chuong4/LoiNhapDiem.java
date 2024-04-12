package bai9_chuong4;

import java.util.Scanner;

public class LoiNhapDiem extends Exception {
    public static double nhapDiem() throws LoiNhapDiem {
        Scanner scanner = new Scanner(System.in);
        double diem = scanner.nextDouble();
        if (diem < 0 || diem > 10) {
            throw new LoiNhapDiem("Diem trung binh phai nam trong khoang tu 0 den 10!");
        }
        return diem;
    }

    public LoiNhapDiem(String message) {
        super(message);
    }
}



