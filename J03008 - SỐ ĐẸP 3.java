package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.util.Scanner;

public class JavaApplication2 {
    static Scanner nhap = new Scanner(System.in);
    
    static boolean nt(char n){
        if (n == '2' || n == '3' || n == '5' || n == '7') return true;
        return false;
    }
    static void test(){
        String s = nhap.next();
        int l = 0;
        int r = s.length()-1;
        while(l<r){
            if (s.charAt(l) != s.charAt(r) || nt(s.charAt(l)) == false){
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