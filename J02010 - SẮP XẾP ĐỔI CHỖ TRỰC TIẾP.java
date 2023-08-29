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
        int[] a = new int[n];
        for(int i = 0;i<n;i++) a[i] = nhap.nextInt();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }System.out.printf("Buoc %d: ", i + 1);
            for (int j = 0; j < n; j++) System.out.print(a[j] + " ");
            System.out.println();
        }
    }    
    
}