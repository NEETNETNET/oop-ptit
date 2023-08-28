package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.util.Scanner;

public class JavaApplication2 {
    public static Scanner nhap = new Scanner(System.in);
    
    public static void test(){
        int n = nhap.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++) a[i] = nhap.nextInt();
        int l = 0;
        int r = n-1;
        while (l<r){
            if (a[l] != a[r]){
                System.out.println("NO");
                return;
            }l++;
            r--;
        }System.out.println("YES");
    }
    public static void main(String[] args){
        int t = nhap.nextInt();
        while(t-- >0){
            test();
        }
        
        
    }
}