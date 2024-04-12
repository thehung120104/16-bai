package BaiKT_Cau1;

import java.util.Scanner;

public class TinhToan {
    public  static boolean TinhToan (int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n (n > 0 va n <= 10000): ");
        int n = scanner.nextInt();

        System.out.println("Cac so nguyen to nho hon " + n + " la:");
        for (int i = 2; i < n; i++) {
            if (TinhToan(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

