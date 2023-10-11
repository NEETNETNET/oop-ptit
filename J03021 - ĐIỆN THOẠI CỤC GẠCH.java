package javaapplication2;

/**
 *
 * @author Tran Khanh
 */

import java.math.BigInteger;
import java.util.*;

public class JavaApplication2 {
    public static Scanner sc = new Scanner(System.in);
    
    public static String change(Character c){
        if (c <= 'c')
            return "2";
        else if (c <= 'f')
            return "3";
        else if (c <= 'i')
            return "4";
        else if (c <= 'l')
            return "5";
        else if (c <= 'o')
            return "6";
        else if (c <= 's')
            return "7";
        else if (c <= 'v')
            return "8";
        return "9";
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t --> 0){
            String s = sc.next().toLowerCase();
            String d = "";
            for(int i = 0;i<s.length();i++) d += change(s.charAt(i));
            String r = new StringBuilder(d).reverse().toString();
            if (r.equals(d))
                System.out.println("YES");
            else 
                System.out.println("NO");
        }
            
                    
            
                
        
        
    }    
    
}