package javaapplication2;

/**
 *
 * @author Tran Khanh
 */

import java.util.*;

public class JavaApplication2 {
    public static Scanner sc = new Scanner(System.in);
    
    public static String check(String s){
        if (s.charAt(0) == '0') return "INVALID";
        int odd = 0,even = 0;              
        for(int i = 0;i<s.length();i++){
            if (!Character.isDigit(s.charAt(i))) return "INVALID";
            if ((s.charAt(i) - '0') % 2 == 0) even++;
            else odd++;
        }if ((s.length()%2 == 0 && even > odd) || (s.length() % 2 == 1 && even < odd)) return "YES";
        return "NO";
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            System.out.println(check(s));
            
            
            
                    
            
                
        }
        
    }    
    
}