package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.util.*;

public class JavaApplication2 {
    public static Scanner nhap = new Scanner(System.in);
    public static int n,k,cnt = 0;
    public static void Try(String s,int j){
        if (s.length() == k) {
            System.out.println(s);
            cnt++;
        }
        for(int i = j;i<=n;i++) 
            Try(s+Integer.toString(i)+ " ",i+1);
    
    }
    
    public static void main(String[] args){
        n = nhap.nextInt();
        k = nhap.nextInt();
        k *=2;
        Try("",1);
        System.out.println("Tong cong co " + cnt + " to hop");
    }    
    
}