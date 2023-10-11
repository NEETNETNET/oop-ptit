package javaapplication2;

/**
 *
 * @author Tran Khanh
 */


import java.util.*;

public class JavaApplication2 {
    public static Scanner sc = new Scanner(System.in);
    
    public static String check(String s){
        int l = 0,r = s.length() - 1,cnt = 0;        
        while(l<r){
            if(s.charAt(l) != s.charAt(r)) cnt++;
            l++;r--;
        }if (cnt == 1 && s.length()%2 == 0 || cnt <= 1 && s.length()%2 != 0 ) return "YES";
        return "NO";
                
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t --> 0){
            String s = sc.next();
            System.out.println(check(s));
        }
            
                    
            
                
        
        
    }    
    
}