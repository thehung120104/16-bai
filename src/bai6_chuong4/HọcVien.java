package bai6_chuong4;

import java.util.Scanner;

public class HọcVien extends SinhVien {
    private String hinhThucDaoTao;
    private String trinhDoNgoaiNgu;

    // Constructor
    public HọcVien() {
    }

    public HọcVien(String maSV, String hoTen, String lop, String chuyenNganh, String diaChi, String soDienThoai, String hinhThucDaoTao, String trinhDoNgoaiNgu) {
        super(maSV, hoTen, lop, chuyenNganh, diaChi, soDienThoai);
        this.hinhThucDaoTao = hinhThucDaoTao;
        this.trinhDoNgoaiNgu = trinhDoNgoaiNgu;
    }

    // Get/set cho các thuộc tính bổ sung
    public String getHinhThucDaoTao() {
        return hinhThucDaoTao;
    }

    public void setHinhThucDaoTao(String hinhThucDaoTao) {
        this.hinhThucDaoTao = hinhThucDaoTao;
    }

    public String getTrinhDoNgoaiNgu() {
        return trinhDoNgoaiNgu;
    }

    public void setTrinhDoNgoaiNgu(String trinhDoNgoaiNgu) {
        this.trinhDoNgoaiNgu = trinhDoNgoaiNgu;
    }

    // Override phương thức nhập thông tin học viên
    @Override
    public void input() {
        super.input(); // Gọi phương thức input() của lớp cha
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap hinh thuc dao tao: ");
        hinhThucDaoTao = scanner.nextLine();
        System.out.print("Nhap trinh do ngoai ngu: ");
        trinhDoNgoaiNgu = scanner.nextLine();
    }

    // Override phương thức hiển thị thông tin học viên
    @Override
    public void output() {
        super.output(); // Gọi phương thức output() của lớp cha
        System.out.println("Hinh thuc dao tao: " + hinhThucDaoTao);
        System.out.println("Trinh do ngoai ngu: " + trinhDoNgoaiNgu);
    }
}

