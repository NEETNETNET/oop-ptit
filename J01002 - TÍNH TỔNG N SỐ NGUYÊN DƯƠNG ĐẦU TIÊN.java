package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.util.Scanner;

public class JavaApplication2 {
    public static Scanner nhap = new Scanner(System.in);
    
    public static void test(){
        long n = nhap.nextLong();
        long s = (n+1) * n / 2;
        System.out.println(s);
    }
       
    public static void main(String[] args) {
        int t = nhap.nextInt();
        while (t -- > 0){
            test();
        }
    }
}