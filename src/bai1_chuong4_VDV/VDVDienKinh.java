package bai1_chuong4_VDV;


import java.util.Scanner;

public class VDVDienKinh extends VanDongVien {
        private float cuLyChay;
        private float tocDoChay;

        public VDVDienKinh(String maVanDongVien, String hoTen, int tuoi, String gioiTinh, float cuLyChay, float tocDoChay) {
            super(maVanDongVien, hoTen, tuoi, gioiTinh);
            this.cuLyChay = cuLyChay;
            this.tocDoChay = tocDoChay;
        }

        public VDVDienKinh() {
            super();
        }

        public float getCuLyChay() {
            return cuLyChay;
        }

        public void setCuLyChay(float cuLyChay) {
            this.cuLyChay = cuLyChay;
        }

        public float getTocDoChay() {
            return tocDoChay;
        }

        public void setTocDoChay(float tocDoChay) {
            this.tocDoChay = tocDoChay;
        }

        @Override
        public void inPut() {
            Scanner sc = new Scanner(System.in);
            // TODO Auto-generated method stub
            super.inPut();
            System.out.println("Nhập cự ly chạy : ");
            cuLyChay = sc.nextFloat();
            System.out.println("Nhập tốc độ chạy : ");
            tocDoChay = sc.nextFloat();
        }

        @Override
        public void outPut() {
            // TODO Auto-generated method stub
            super.outPut();
            System.out.println("Cự ly chạy : " + cuLyChay);
            System.out.println("Tốc độ chạy : " + tocDoChay);
        }


    }


