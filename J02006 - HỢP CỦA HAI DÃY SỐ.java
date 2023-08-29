package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.util.Scanner;


public class JavaApplication2 {
    public static Scanner nhap = new Scanner(System.in);
    
    public static void main(String[] args){
        int n = nhap.nextInt();
        int m = nhap.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] cnt = new int[1005];
        for(int i = 0;i<n;i++) {
            a[i] = nhap.nextInt();
            cnt[a[i]]++;
        }for(int i = 0;i<m;i++) {
            b[i] = nhap.nextInt();
            cnt[b[i]]++;
        }for(int i = 1;i<1000;i++){
            if (cnt[i] > 0){
                System.out.printf(i+" ");
            }
        }
        
        
    }    
    
}