package javaapplication2;

/**
 *
 * @author Tran Khanh
 */
import java.util.Scanner;

public class JavaApplication2 {
    public static Scanner sc = new Scanner(System.in);
    
    public static String normalize(String s){
        if (s.length() == 1) return s.toUpperCase();
        return s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
    }
    
    public static void test(){
        String s = sc.nextLine().trim();
        String[] a = s.split("\\s+");
        for (int i = 0; i< a.length; i++) a[i] = normalize(a[i]);
        System.out.println(String.join(" ", a));
    }
    
    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0) test();
        
    }    
    
}