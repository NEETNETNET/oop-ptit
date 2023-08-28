package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.util.Scanner;

public class JavaApplication2 {
    public static Scanner nhap = new Scanner(System.in);
    
    public static void main(String[] args){
        int t = nhap.nextInt();
        while(t-- >0){
            int n = nhap.nextInt();
            int k = (int) Math.sqrt(n);
            if (k*k==n) System.out.println("YES");
            else System.out.println("NO");
                    
        }
        
        
    }
}