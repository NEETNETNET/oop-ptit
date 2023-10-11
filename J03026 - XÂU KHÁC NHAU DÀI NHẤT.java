package javaapplication2;

/**
 *
 * @author Tran Khanh
 */


import java.util.*;

public class JavaApplication2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t --> 0){
            String s1 = sc.next();
            String s2 = sc.next();
            if (s1.equals(s2)) System.out.println(-1);
            else System.out.println(Math.max(s1.length(),s2.length() ));
            
        }
            
                    
            
                
        
        
    }    
    
}