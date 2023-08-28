package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.util.Scanner;

public class JavaApplication2 {
    public static Scanner nhap = new Scanner(System.in);
    
    public static long change(String s){
        long n = 0;
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            switch (c){
                case '0':
                case '8':
                case '9':
                    n = n * 10;
                    break;
                case '1':
                    n = n * 10 + 1;
                    break;
                default:
                    return 0;
            }
        }return n;
    }
    
    public static void test(){
        String s = nhap.next();
        if (change(s)==0) System.out.println("INVALID");
        else System.out.println(change(s));
    }
    
    public static void main(String[] args){
        int t = nhap.nextInt();
        while(t-- >0){
            test();
        }
        
        
    }
}