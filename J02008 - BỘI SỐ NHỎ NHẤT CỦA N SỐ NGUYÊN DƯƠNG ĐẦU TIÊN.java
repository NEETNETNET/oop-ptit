package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.util.Scanner;

public class JavaApplication2 {
    public static Scanner nhap = new Scanner(System.in);
    
    static long gcd(long a, long b){
        if (b == 0) return a;
        return gcd(b,a%b);
    }
    
    static long lcm(long a,long b){
        return a*b/gcd(a,b);
    }
    public static void main(String[] args){
        int t = nhap.nextInt();
        while (t-- >0){
            long n = nhap.nextLong();
            long ans = 1l;
            for(long i = 2;i<=n;i++) ans = lcm(ans,i);
            System.out.println(ans);
        }
        
        
    }    
    
}