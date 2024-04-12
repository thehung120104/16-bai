package caulenhswitch;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập số b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập phép tính (+, -, *, /): ");
        char phepTinh = scanner.next().charAt(0);

        double ketQua = 0;

        switch (phepTinh) {
            case '+':
                ketQua = a + b;
                break;
            case '-':
                ketQua = a - b;
                break;
            case '*':
                ketQua = a * b;
                break;
            case '/':
                if (b != 0) {
                    ketQua = a / b;
                } else {
                    System.out.println("Lỗi: Số b không thể là 0 trong phép chia.");
                    return;
                }
                break;
            default:
                System.out.println("Lỗi: Phép tính không hợp lệ.");
                return;
        }

        System.out.println("Kết quả: " + ketQua);
    }
}

