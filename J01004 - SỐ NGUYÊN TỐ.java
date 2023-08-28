package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.util.Scanner;

public class JavaApplication2 {
    public static Scanner nhap = new Scanner(System.in);
    
    public static boolean nt(int n){
        if (n < 2){
            return false;
        }
        for(int i = 2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }return true;
    }
       
    public static void main(String[] args) {
        int t = nhap.nextInt();
        while (t -- > 0){
            int n = nhap.nextInt();
            if (nt(n)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}