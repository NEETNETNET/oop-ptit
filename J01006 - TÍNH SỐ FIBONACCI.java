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
        fb[1] = fb[2] = 1l;
        for(int i = 3;i<93;i++){
            fb[i] = fb[i-1] + fb[i-2];
        }
    }
    
    public static void main(String[] args) {
        fibo();
        int t = nhap.nextInt();
        while (t -- > 0){
            int n = nhap.nextInt();
            System.out.println(fb[n]);
        }
    }
}