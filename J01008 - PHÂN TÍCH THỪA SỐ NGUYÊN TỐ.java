package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.util.Scanner;

public class JavaApplication2 {
    public static Scanner nhap = new Scanner(System.in);
    
    public static void test(int t){
        int m = nhap.nextInt();
        int n = m;
        System.out.printf("Test %d: ", t);
        for(int i = 2;i<=Math.sqrt(m);i++){
            int cnt = 0;
            while (n%i == 0){
                cnt++;
                n /= i;
            }if (cnt != 0){
                System.out.printf("%d(%d) ",i,cnt);
            }
        }if (n != 1){
            System.out.printf("%d(1) ",n);
        }System.out.println();
    }
    public static void main(String[] args) {
        int t = nhap.nextInt();
        for(int i = 1;i<=t;i++){
            test(i);
        }
    }
}