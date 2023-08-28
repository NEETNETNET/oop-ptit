package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.util.Scanner;

public class JavaApplication2 {
    public static Scanner nhap = new Scanner(System.in);
    
    public static long gcd(long a,long b){
        if (b==0) return a;
        return gcd(b,a%b);
    }
    
    public static long lcm(long a,long b){
        return a*b/gcd(a,b);
    }
    
    public static void main(String[] args){
        int t = nhap.nextInt();
        while(t-- >0){
            long a = nhap.nextLong();
            long b = nhap.nextLong();
            System.out.println(lcm(a, b) + " " + gcd(a, b));
        }
        
        
    }
}