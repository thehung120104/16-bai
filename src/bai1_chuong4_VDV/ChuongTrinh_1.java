package bai1_chuong4_VDV;

import java.util.ArrayList;
import java.util.Collections;

public class ChuongTrinh_1 {

        // luu các đối tượng trong một danh sách
        private ArrayList<VDVDienKinh> vdvDienKinhs;

        // một constructor
//	để khởi tạo một đối tượng mới của lớp
        public ChuongTrinh_1() {
            this.vdvDienKinhs = new ArrayList<VDVDienKinh>();
        }

        public void nhapVDV(int n) {
            for (int i = 1; i <= n; i++) {
                System.out.println("Nhập VDV thứ :" + i);
                VDVDienKinh vdvDienKinh = new VDVDienKinh();
                vdvDienKinh.inPut();
                vdvDienKinhs.add(vdvDienKinh);
            }
        }

        public void inVDV() {
            for (VDVDienKinh vdvDienKinh : vdvDienKinhs) {
                vdvDienKinh.outPut();
            }
        }

        public void sxVDV() {
            for (int i = 0; i < vdvDienKinhs.size() - 1; i++) {
                for (int j = i + 1; j < vdvDienKinhs.size(); j++) {
                    if (vdvDienKinhs.get(i).getCuLyChay() > vdvDienKinhs.get(j).getCuLyChay()) {
                        Collections.swap(vdvDienKinhs, i, j);
                    }
                }
            }
        }

        public int tuoiLonNhat() {
            int max = vdvDienKinhs.get(0).getTuoi();
            for (int i = 1; i < vdvDienKinhs.size(); i++) {
                if (max < vdvDienKinhs.get(i).getTuoi()) {
                    max = vdvDienKinhs.get(i).getTuoi();
                }
            }
            return max;
        }

        public void VDVNhieuTuoi() {
            int tuoiMax = tuoiLonNhat();
            for (int i = 0; i < vdvDienKinhs.size(); i++) {
                if (tuoiMax == vdvDienKinhs.get(i).getTuoi()) {
                    System.out.println(vdvDienKinhs);
                }
            }
        }
    }


