package bai3_chuong4_QLNV;

import java.util.*;

public class chuongTrinh4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap danh sach n can bo quan ly: ");
        int n = scanner.nextInt();
        List<canBoQuanLy> dsCanBoQuanLy = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            canBoQuanLy xd = new canBoQuanLy();
            System.out.println(" nhap danh sach can bo quan ly thu :  " + (i + 1) + ":");
            xd.inPut();
            dsCanBoQuanLy.add(xd);
            System.out.println("danh sach can bo quan ly : ");
            for (canBoQuanLy x : dsCanBoQuanLy) {
                xd.outPut();
            }
            System.out.println(" \n can bo quan ly co chuc vu la giam doc: ");
            for (canBoQuanLy x : dsCanBoQuanLy) {
                if (xd.getChucVu().equalsIgnoreCase("giam doc")) {
                    xd.outPut();


                }


            }
            System.out.println(" sap xep can bo quan ly theo muc phu cap giam dan: ");
            Collections.sort(dsCanBoQuanLy, new Comparator<canBoQuanLy>() {
                @Override
                public int compare(canBoQuanLy canBoQuanLy, canBoQuanLy t1) {
                    return 0;
                }
            });
            for (canBoQuanLy x : dsCanBoQuanLy) {
                xd.outPut();

            }
        }
    }
}

