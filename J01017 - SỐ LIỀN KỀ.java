package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.util.Scanner;

public class JavaApplication2 {
    public static Scanner nhap = new Scanner(System.in);
    
    public static boolean check(char a,char b){
        int x = a - '0';
        int y = b - '0';
        return Math.abs(x-y) == 1;
    }
    
    public static void test(){
        String s = nhap.next();
        for(int i = 1;i<s.length();i++){
            if (!check(s.charAt(i),s.charAt(i-1))){
                System.out.println("NO");
                return;
            }
        }System.out.println("YES");
    }
    
    public static void main(String[] args) {
        int t = nhap.nextInt();
        while(t-- >0){
            test();
        }
    }
}