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
            boolean ok = true;
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    ok = false;
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
            if (ok) {
                return;
            }
            System.out.printf("Buoc %d: ", i + 1);
            for (int j = 0; j < n; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }    
    
}