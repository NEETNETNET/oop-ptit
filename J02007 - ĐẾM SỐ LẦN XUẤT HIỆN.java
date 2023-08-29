package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.util.Scanner;
import java.util.Arrays;

public class JavaApplication2 {
    public static Scanner nhap = new Scanner(System.in);
    
    public static void test(int t){
        int n = nhap.nextInt();
        int[] a = new int[n];
        int[] cnt = new int[100005];
        for(int i = 0;i<n;i++) {
            a[i] = nhap.nextInt();
            cnt[a[i]]++;
        }System.out.println("Test "+ t+":");
        for(int i = 0;i<n;i++){
            if (cnt[a[i]] > 0){
                System.out.println(a[i] + " xuat hien " + cnt[a[i]] + " lan");
                cnt[a[i]] = 0;
            }
            
        }
    }
    
    public static void main(String[] args){
        int t = nhap.nextInt();
        for(int i = 1;i<=t;i++){
            test(i);
        }
    }    
    
}