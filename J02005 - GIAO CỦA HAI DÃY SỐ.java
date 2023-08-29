package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.util.Scanner;
import java.util.Arrays;

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
            cnt[a[i]] = 1;
        }for(int i = 0;i<m;i++) {
            b[i] = nhap.nextInt();
        }Arrays.sort(b);
        for(int i = 0;i<m;i++){
            if (cnt[b[i]] == 1){
                System.out.printf(b[i]+" ");
                cnt[b[i]] = 0; 
            }
        }
        
        
    }    
    
}