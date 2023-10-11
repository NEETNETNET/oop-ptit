package javaapplication2;

/**
 *
 * @author Tran Khanh
 */


import java.math.BigInteger;
import java.util.*;
class PhanSo {
    private long mau;
    private long tu;

    public PhanSo(long mau, long tu) {
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
    
    public String toString(){
        long g = gcd(mau, tu);
        return mau/g + "/" + tu/g;
    }
    
}
public class JavaApplication2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo p = new PhanSo(sc.nextLong(),sc.nextLong());
        System.out.println(p);
        
    }
        
            
                    
            
                
        
        
        
    
}