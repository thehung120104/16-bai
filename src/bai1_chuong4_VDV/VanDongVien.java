package bai1_chuong4_VDV;

import java.util.Scanner;

public class VanDongVien {

        private String maVanDongVien;
        private String hoTen;
        private int tuoi;
        private String gioiTinh;

        // Constructor có tham số.

        public VanDongVien(String maVanDongVien, String hoTen, int tuoi, String gioiTinh) {
            this.maVanDongVien = maVanDongVien;
            this.hoTen = hoTen;
            this.tuoi = tuoi;
            this.gioiTinh = gioiTinh;
        }

        // Constructor ko có tham số.
        public VanDongVien() {

        }

        public String getMaVanDongVien() {
            return maVanDongVien;
        }

        public void setMaVanDongVien(String maVanDongVien) {
            this.maVanDongVien = maVanDongVien;
        }

        public String getHoTen() {
            return hoTen;
        }

        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }

        public int getTuoi() {
            return tuoi;
        }

        public void setTuoi(int tuoi) {
            this.tuoi = tuoi;
        }

        public String getGioiTinh() {
            return gioiTinh;
        }

        public void setGioiTinh(String gioiTinh) {
            this.gioiTinh = gioiTinh;
        }

        public void inPut() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập mã vận động viên: ");
            maVanDongVien = sc.nextLine();
            System.out.println("Nhập họ tên");
            hoTen = sc.nextLine();
            System.out.println("Nhập tuổi: ");
            tuoi = sc.nextInt();
            System.out.println("Nhập giới tính: ");
            gioiTinh = sc.nextLine();
            sc.nextLine();
        }

        public void outPut() {
            System.out.println("Mã vận động viên:" + maVanDongVien);
            System.out.println("Họ và  tên : " + hoTen);
            System.out.println("Tuổi : " + tuoi);
            System.out.println("Giới tính : " + gioiTinh);
        }

        @Override
        public String toString() {
            return "VanDongVien [maVanDongVien=" + maVanDongVien + ", hoTen=" + hoTen + ", tuoi=" + tuoi + ", gioiTinh="
                    + gioiTinh + "]";
        }

    }


