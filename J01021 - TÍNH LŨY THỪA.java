package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.util.Scanner;

public class JavaApplication2 {
    static Scanner nhap = new Scanner(System.in);
    
    static int mod = (int)1e9 + 7;
    
    static long pow(long a,long b){
        if (b==0) return 1;
        if (b==1) return a%mod;
        long tmp = pow(a,b/2);
        if (b%2 == 0) return (tmp * tmp)%mod;
        return ((tmp*tmp)%mod *a) % mod; 
    }
    
    public static void main(String[] args){
        while(true){
            long a = nhap.nextLong();
            long b = nhap.nextLong();
            if (a==0 && b==0) return;
            System.out.println(pow(a,b));
        }
        
    }    
    
}