package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.util.Scanner;

public class JavaApplication2 {
    static Scanner nhap = new Scanner(System.in);
    
    static void test(){
        int n = nhap.nextInt();
        int[] a = new int[n];
        int tong = 0;
        for (int i = 0;i < n;i++){
            a[i] = nhap.nextInt();
            tong += a[i];
        }int tong1 = 0;
        for (int i = 0;i<n-1;i++){
            tong1 += a[i];
            if (tong - tong1 - a[i+1] == tong1 && (i+1) != n-1){
                System.out.println(i+2);
                return ;
            }
        }System.out.println(-1);
    }
    
    public static void main(String[] args){
        int t = nhap.nextInt();
        while (t-- >0){
            test();
        }
        
        
        
    }    
    
}