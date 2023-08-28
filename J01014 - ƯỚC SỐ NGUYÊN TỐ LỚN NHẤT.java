package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.util.Scanner;

public class JavaApplication2 {
    public static Scanner nhap = new Scanner(System.in);
    
    public static boolean nt(long n){
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }return n > 1;
    }
    public static void test(){
        long n = nhap.nextLong();
        int res = 0;
        for (int i = 1;i <= Math.sqrt(n);i++){
            if (n%i==0){
                if(nt(n/i)){
                    System.out.println(n/i);
                    return;
                }if (nt(i)) res = i;
            }
        }System.out.println(res);
    }
    public static void main(String[] args){
        int t = nhap.nextInt();
        while(t-- >0){
            test();
        }
        
        
    }
}