package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.util.*;

class GiaoVien{
    private String ma,ten;
    private int coBan,bacLuong,phuCap;

    public GiaoVien(String ma, String ten, int coBan) {
        this.ma = ma;
        this.ten = ten;
        this.coBan = coBan;
        
        this.bacLuong = Integer.parseInt(ma.substring(2));
        if (ma.substring(0,2).equals("HT")) this.phuCap = 2000000;
        else if (ma.substring(0,2).equals("HP")) this.phuCap = 900000;
        else if (ma.substring(0,2).equals("GV")) this.phuCap = 500000;
        
    }
    
    public int thuNhap(){
        return coBan*bacLuong + phuCap;
    }
    
    public String toString(){
        return ma + " " + ten + " " + bacLuong + " " + phuCap + " " + thuNhap();
    }
    
}
public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GiaoVien a = new GiaoVien(sc.nextLine(),sc.nextLine(),sc.nextInt());
        System.out.println(a);
    }
    
}

