package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.util.Scanner;

public class JavaApplication2 {
    public static Scanner nhap = new Scanner(System.in);
       
    public static void main(String[] args) {
        int t = nhap.nextInt();
        while (t -- > 0){
            int n = nhap.nextInt();
            int h = nhap.nextInt();
            for (double i = 1d; i < n; i++) {
                System.out.printf("%.6f ", Math.sqrt(i / n) * h);
            }
            System.out.println();
        }
    }
}