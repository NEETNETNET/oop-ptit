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
        if (s.charAt(s.length()-1) != '8' || s.charAt(0) != '8') {
            System.out.println("NO");
            return;
        }
        int l = 0;
        int r = s.length()-1;
        while(l<r){
            if (s.charAt(l) != s.charAt(r)){
                System.out.println("NO");
                return;
            }l++;r--;
        }
        int tong = 0;
        for (int i =0;i<s.length();i++) tong += s.charAt(i) - '0';
        if (tong % 10 != 0) System.out.println("NO");
        else System.out.println("YES");
    }
    
    public static void main(String[] args) {
        int t = nhap.nextInt();
        while(t-- >0){
            test();
        }
    }    
    
}