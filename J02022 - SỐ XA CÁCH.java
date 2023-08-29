package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.util.Scanner;

public class JavaApplication2 {
    public static Scanner nhap = new Scanner(System.in);
    
    static int n;
    
    static boolean check(String s){
        for(int i = 1;i<s.length();i++){
            if (Math.abs(s.charAt(i)-s.charAt(i-1))==1) return false; 
        }return true;
    }
    
    static void Try(String s,boolean[] ok){
        if (s.length()==n){
            if (check(s)) System.out.println(s);
        }for(int i = 1;i<=n;i++){
            if (!ok[i]){
                ok[i] = true;
                Try(s+Integer.toString(i),ok);
                ok[i] = false;
            }
        }
    }
    
    public static void main(String[] args){
        int t = nhap.nextInt();
        while (t-- >0){
            n = nhap.nextInt();
            Try("",new boolean[n+5]);
        }
        
        
    }    
    
}