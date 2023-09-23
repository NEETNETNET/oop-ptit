package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.util.Scanner;

public class JavaApplication2 {
    static Scanner nhap = new Scanner(System.in);
    
    static void test(){
        String s = nhap.next();
        int l = 0;
        int r = s.length()-1;
        while(l<r){
            if (s.charAt(l) != s.charAt(r) || (s.charAt(l) - '0')%2 != 0){
                System.out.println("NO");
                return;
            }l++;r--;
        }System.out.println("YES");
    }
    
    public static void main(String[] args) {
        int t = nhap.nextInt();
        while(t-- >0){
            test();
        }
    }    
    
}