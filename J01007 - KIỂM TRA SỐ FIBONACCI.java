package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.util.Scanner;

public class JavaApplication2 {
    public static Scanner nhap = new Scanner(System.in);
    
    public static long[] fb = new long[100];
    
    public static void fibo(){
        fb[0] = 0l;
        fb[1] = 1l;
        for(int i = 2;i<93;i++){
            fb[i] = fb[i-1] + fb[i-2];
        }
    }
    
    public static boolean check(long n){
        for(long x : fb){
            if (x == n){
                return true;
            }else if (x > n){
                return false;
            }
        }return false;
    }
    public static void main(String[] args) {
        fibo();
        int t = nhap.nextInt();
        while (t -- > 0){
            long n = nhap.nextLong();
            if (check(n)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}