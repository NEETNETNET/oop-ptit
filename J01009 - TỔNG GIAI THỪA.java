package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.util.Scanner;

public class JavaApplication2 {
    public static Scanner nhap = new Scanner(System.in);
    
    public static long gt(int n){
        long res = 1l;
        for(int i = 2;i<=n;i++){
            res *= i;
        }return res;
    }
    public static void main(String[] args) {
        int n = nhap.nextInt();
        long ans = 0l;
        for(int i = 1;i<=n;i++){
            ans += gt(i);
        }System.out.println(ans);
        
    }
}