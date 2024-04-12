package BaiKT_Cau2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChuongTrinhCau2 {
    ArrayList<MayChu> ds=new ArrayList<>();
    public void nhapTT(){
        System.out.print("Nhập n Máy Tính:");
        int n=new Scanner(System.in).nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Nhập THông tin Máy thứ:"+(i+1));
            MayChu m=new MayChu("","","",0,0,0,"","");
            m.inPut();
            ds.add(m);
        }
    }
    public void xuatTT(){
        System.out.println("Danh Sách Máy Tính Vừa Nhập là:");
        System.out.println("_______________________________________________________________________________________________________________________________");
        System.out.println("|      Mã MÁY   "+"|"+"    TÊN MÁY    "+"|"+" HÃNG SẢN XUẤT "+"|"+"    SỐ LƯỢNG   "+"|"+"NĂM ĐƯA VÀO SD "+"|"+"  NĂM KIỂM KÊ  "+"|"+"  LOẠI MÁY CHỦ "+"|"+"   CHỨC NĂNG   "+"|");
        System.out.println("|______________________________________________________________________________________________________________________________|");
        for(MayChu vt:ds){
            vt.outPut(vt);
            System.out.println("\n|_______________________________________________________________________________________________________________________________|");
        }

    }
    public void inDSHang(){
        int found=0;
        System.out.println("Nhập hãng máy cần in:");
        String n=new Scanner(System.in).nextLine();
        System.out.println("Danh Sách Máy Tính cần in  là:");
        System.out.println("_______________________________________________________________________________________________________________________________");
        System.out.println("|      Mã MÁY   "+"|"+"    TÊN MÁY    "+"|"+" HÃNG SẢN XUẤT "+"|"+"    SỐ LƯỢNG   "+"|"+"NĂM ĐƯA VÀO SD "+"|"+"  NĂM KIỂM KÊ  "+"|"+"  LOẠI MÁY CHỦ "+"|"+"   CHỨC NĂNG   "+"|");
        System.out.println("|______________________________________________________________________________________________________________________________|");
        for (MayChu pt:ds){
            if((pt.getTenHangSanXuat().equalsIgnoreCase(n) )&& (pt.getNamKiemKe()-pt.getNamDuaVaoSuDung()>5)){
                pt.outPut(pt);
                found=1;
                System.out.println("\n|______________________________________________________________________________________________________________________________|");
            }
        }
        if(found==0){
            System.out.println("|        0      "+"|"+"        0      "+"|"+"        0      "+"|"+"        0      "+"|"+"        0      "+"|"+"        0      "+"|"+"        0      "+"|"+"        0     "+"|");
            System.out.println("\n|______________________________________________________________________________________________________________________________|");
        }
    }
    public void thongKe(){
        for (MayChu pt:ds){
            System.out.println("hãng sản xuất:"+pt.getTenHangSanXuat());
            System.out.println("Số lượng:"+pt.getSoLuong());
        }

    }
    public void lietKeNamKiemKe(){
        int found=0;
        System.out.println("Danh Sách Máy Tính cần in  là:");
        System.out.println("_______________________________________________________________________________________________________________________________");
        System.out.println("|      Mã MÁY   "+"|"+"    TÊN MÁY    "+"|"+" HÃNG SẢN XUẤT "+"|"+"    SỐ LƯỢNG   "+"|"+"NĂM ĐƯA VÀO SD "+"|"+"  NĂM KIỂM KÊ  "+"|"+" LOẠI MÁY CHỦ "+"|"+"   CHỨC NĂNG   "+"|");
        System.out.println("|______________________________________________________________________________________________________________________________|");
        for (MayChu pt:ds){
            if(pt.getNamKiemKe()==2023){
                found=1;
                pt.outPut(pt);
                System.out.println("\n|______________________________________________________________________________________________________________________________|");
            }
        }
        if(found==0){
            System.out.println("|        0      "+"|"+"        0      "+"|"+"        0      "+"|"+"        0      "+"|"+"        0      "+"|"+"        0      "+"|"+"        0      "+"|"+"        0     "+"|");
            System.out.println("\n|______________________________________________________________________________________________________________________________|");
        }
    }
    public void thoatCT(){
        System.exit(0);
    }

}