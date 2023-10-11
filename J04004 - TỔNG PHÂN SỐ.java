package javaapplication2;

/**
 *
 * @author Tran Khanh
 */


import java.util.*;
class PhanSo {
    private long mau;
    private long tu;

    public PhanSo(long tu, long mau) {
        this.mau = mau;
        this.tu = tu;
    }

    
    public long getMau() {
        return mau;
    }

    public void setMau(long mau) {
        this.mau = mau;
    }

    public long getTu() {
        return tu;
    }

    public void setTu(long tu) {
        this.tu = tu;
    }
    
    private long gcd(long x, long y) {
        if (y == 0) return x;
        return gcd(y, x%y);
    }
    
    public void rut(){
        long g = gcd(mau, tu);
        mau /= g;
        tu /= g;
    }
    
    public void cong(PhanSo p){
        long a = p.mau * mau;
        long b = p.tu * mau + p.mau * tu;
        mau = a;
        tu = b;
        rut();
    }
    
}
public class JavaApplication2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo p1 = new PhanSo(sc.nextLong(),sc.nextLong());
        PhanSo p2 = new PhanSo(sc.nextLong(),sc.nextLong());
        p1.cong(p2);
        System.out.println(p1.getTu() + "/" + p1.getMau());
        
    }
        
            
                    
            
                
        
        
        
    
}