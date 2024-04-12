package bai2_chuong4_CNTT;

import java.util.ArrayList;
import java.util.Scanner;

public class ChuongTrinh_2 {
    public  static void main (String[] arg) {
        ArrayList<SP_Phanmem> lSp_PhanMems = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong san pham :");
            int n = scanner.nextInt();
            for (int i = 0; i <= n; i++) {
                System.out.println("nhap so luong san pham thu: " + i);
                SP_Phanmem so = new SP_Phanmem();
                so.Input();
                lSp_PhanMems.add(so);
            }
            for (SP_Phanmem sp_PhanMem : lSp_PhanMems) {
                sp_PhanMem.Output();
            }


        }
    }

